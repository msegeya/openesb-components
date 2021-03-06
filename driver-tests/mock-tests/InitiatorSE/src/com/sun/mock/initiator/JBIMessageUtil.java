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
 * @(#)JBIMessageUtil.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.mock.initiator;

import java.util.Map;
import java.util.Map.Entry;

import javax.wsdl.Message;
import javax.wsdl.Operation;
import javax.wsdl.Part;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sun.jbi.internationalization.Messages;
import com.sun.jbi.nms.wsdl11wrapper.HelperFactory;
import com.sun.jbi.nms.wsdl11wrapper.WrapperBuilder;
import com.sun.jbi.nms.wsdl11wrapper.WrapperProcessingException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class JBIMessageUtil {
    public static final Messages MESSAGES = Messages.getMessages(JBIMessageUtil.class);

    public static Element makeJBIMessage(Map<String, Element> partsMap, Operation operation)
            throws Exception {
        // TODO Auto-generated method stub
        WrapperBuilder wrapperBuilder = newWrapperBuilder();
        Document normalDoc = null;
        try {
            normalDoc = XmlUtil.createDocument(true);
            Message msg = operation.getOutput().getMessage();
            wrapperBuilder.initialize(normalDoc, msg, operation.getOutput().getName());
            for (Map.Entry<String, Element> entry : partsMap.entrySet()) {
                String partName = entry.getKey();
                Element partEl = entry.getValue();
                Part part = msg.getPart(partName);
                if (part != null) {
                    if (part.getElementName() != null) {
                        wrapperBuilder.addPart(part.getName(), partEl);
                    } else if (part.getTypeName() != null) {
                        wrapperBuilder.addPart(part.getName(), partEl.getChildNodes());
                    }
                }
    
            }
            normalDoc = wrapperBuilder.getResult();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new Exception("FailToCreateWrapperBuilder", e);
    
        }
        return normalDoc.getDocumentElement();
    }
    
    
    

    public static Element makeJBIMessageWithNodeList(Map<String, NodeList> partsMap, Operation operation)
            throws Exception {
        // TODO Auto-generated method stub
        WrapperBuilder wrapperBuilder = newWrapperBuilder();
        Document normalDoc = null;
        try {
            normalDoc = XmlUtil.createDocument(true);
            Message msg = operation.getInput().getMessage();
            wrapperBuilder.initialize(normalDoc, msg, operation.getInput().getName());
            for (Map.Entry<String, NodeList> entry : partsMap.entrySet()) {
                String partName = entry.getKey();
                NodeList partNodes = entry.getValue();
                Part part = msg.getPart(partName);
                if (part != null) {
                    wrapperBuilder.addPart(part.getName(), partNodes);
                }
    
            }
            normalDoc = wrapperBuilder.getResult();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new Exception("FailToCreateWrapperBuilder", e);
    
        }
        return normalDoc.getDocumentElement();
    }
    
    
    public static Element makeEmptyJBIMessage(Operation operation)
            throws Exception {
        // TODO Auto-generated method stub
        WrapperBuilder wrapperBuilder = newWrapperBuilder();
        Document normalDoc = null;
        try {
            normalDoc = XmlUtil.createDocument(true);
            Message msg = operation.getOutput().getMessage();
            wrapperBuilder.initialize(normalDoc, msg, operation.getOutput().getName());
            Map<String, Part> partsMap = msg.getParts();
            for (Map.Entry<String, Part> entry : partsMap.entrySet()) {
                String partName = entry.getKey();
                Part part = entry.getValue();
                if (part != null) {
                    Text empty = normalDoc.createTextNode("");
                    wrapperBuilder.addPart(part.getName(), XmlUtil.newSingleNodeList(empty));
                }
    
            }
            normalDoc = wrapperBuilder.getResult();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new Exception("FailToCreateWrapperBuilder",  e);
    
        }
        return normalDoc.getDocumentElement();
    }
    
    
    public static boolean isElement (Part part) {
        if (part.getElementName() != null) {
            return true;
        }
        return false;
    } 

    public static WrapperBuilder newWrapperBuilder() throws Exception {
            WrapperBuilder wrapperBuilder = null;
            try {
                    wrapperBuilder = HelperFactory.createBuilder();
            } catch (WrapperProcessingException ex) {
                    throw new Exception("error creating wrapperBuilder");
            }

            return wrapperBuilder;
    }
}
