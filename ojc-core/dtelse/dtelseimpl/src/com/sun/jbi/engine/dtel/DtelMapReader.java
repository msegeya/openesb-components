/*
 * BEGIN_HEADER - DO NOT EDIT
 * 
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * https://open-jbi-components.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * https://open-jbi-components.dev.java.net/public/CDDLv1.0.html.
 * If applicable add the following below this CDDL HEADER,
 * with the fields enclosed by brackets "[]" replaced with
 * your own identifying information: Portions Copyright
 * [year] [name of copyright owner]
 */

/*
 * @(#)DtelMapReader.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.engine.dtel;

import java.io.File;
import java.util.Hashtable;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.wsdl.Definition;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

public class DtelMapReader {
    private static final String DTELMAP_TAG = "dtel";
    private static final String TYPE_TAG = "type";
    private static final String FILE_TAG = "file";
    private static final String PARTNERLINK_TAG = "partnerLink";
    private static final String PORTTYPE_TAG = "portType";
    private static final String OPERATION_TAG = "operation";
    private static final String REPLY_FILE_TAG = "replyFile";
    private static final String OUT_PARTNERLINK_TAG = "outPartnerLink";
    private static final String OUT_PORTTYPE_TAG = "outPortType";
    private static final String OUT_OPERATION_TAG = "outOperation";
    
    protected DtelMapReader() {
    }
    

    public static DtelMapEntryTable parse(File dtelmapfile, DtelMapEntryTable dtelMapEntryTable, String serviceUnitName,
                                          File deployDir, Hashtable wsdlMap)
        throws org.xml.sax.SAXException, 
               java.io.IOException,
               javax.xml.parsers.ParserConfigurationException 
    {
        assert dtelmapfile != null;
        assert dtelMapEntryTable != null;

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(dtelmapfile);
        Element elem = doc.getDocumentElement();
        NodeList portmaps = elem.getElementsByTagName(DTELMAP_TAG);
        for (int i = 0; i < portmaps.getLength(); i++) {
            NamedNodeMap values = portmaps.item(i).getAttributes();
            String type = values.getNamedItem(TYPE_TAG).getNodeValue();
            QName partnerLink = getQName(values.getNamedItem(PARTNERLINK_TAG).getNodeValue());
            QName portType = getQName(values.getNamedItem(PORTTYPE_TAG).getNodeValue());
            QName operation = getQName(values.getNamedItem(OPERATION_TAG).getNodeValue());
            String file = values.getNamedItem(FILE_TAG).getNodeValue();
            String fullFilePath = deployDir.getAbsolutePath() + File.separator + file;
            QName outPartnerLink = null;
            QName outPortType = null;
            QName outOperation = null;
            String replyFile = null;
            String fullReplyFilePath = null;
            DtelMapEntry entry = null;
            Definition wsdl = (Definition) wsdlMap.get(partnerLink.getNamespaceURI());
            if (DtelMapEntry.REQUEST_REPLY_SERVICE.equals(type)) {
                entry = DtelMapEntry.newRequestReplyService(serviceUnitName, partnerLink, portType, operation, fullFilePath, wsdl);
                dtelMapEntryTable.addEntry(entry);
                continue;
            }
            if (DtelMapEntry.FILTER_ONE_WAY.equals(type)) {
                outPartnerLink = getQName(values.getNamedItem(OUT_PARTNERLINK_TAG).getNodeValue());
                outPortType = getQName(values.getNamedItem(OUT_PORTTYPE_TAG).getNodeValue());
                outOperation = getQName(values.getNamedItem(OUT_OPERATION_TAG).getNodeValue());
                entry = DtelMapEntry.newFilterOneWay(serviceUnitName, partnerLink, portType, operation, fullFilePath, 
                    outPartnerLink, outPortType, outOperation, wsdl);
                dtelMapEntryTable.addEntry(entry);
                continue;
            }
            if (DtelMapEntry.FILTER_REQUEST_REPLY.equals(type)) {
                outPartnerLink = getQName(values.getNamedItem(OUT_PARTNERLINK_TAG).getNodeValue());
                outPortType = getQName(values.getNamedItem(OUT_PORTTYPE_TAG).getNodeValue());
                outOperation = getQName(values.getNamedItem(OUT_OPERATION_TAG).getNodeValue());
                replyFile = values.getNamedItem(REPLY_FILE_TAG).getNodeValue();
                fullReplyFilePath = deployDir.getAbsolutePath() + File.separator + replyFile;
                entry = DtelMapEntry.newFilterRequestReply(serviceUnitName, partnerLink, portType, operation, fullFilePath, 
                    outPartnerLink, outPortType, outOperation, fullReplyFilePath, wsdl);
                dtelMapEntryTable.addEntry(entry);
                continue;
            }
        }        
        return dtelMapEntryTable;
    }
    
    private static QName getQName(String qname) {
        return QName.valueOf(qname);
    }
}
