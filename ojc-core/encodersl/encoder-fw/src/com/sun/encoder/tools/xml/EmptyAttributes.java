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
 * @(#)EmptyAttributes.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.encoder.tools.xml;

import org.xml.sax.Attributes;

/**
 * Utility class that implements SAX Attributes interface, which represents
 * empty attribute collection.
 * 
 * @author Jun Xu
 * @version $Revision: 1.1 $
 */
public final class EmptyAttributes implements Attributes {

    public int getLength() {
        return 0;
    }

    public String getURI(int index) {
        return null;
    }

    public String getLocalName(int index) {
        return null;
    }

    public String getQName(int index) {
        return null;
    }

    public String getType(int index) {
        return null;
    }

    public String getValue(int index) {
        return null;
    }

    public int getIndex(String uri, String localName) {
        return -1;
    }

    public int getIndex(String qName) {
        return -1;
    }

    public String getType(String uri, String localName) {
        return null;
    }

    public String getType(String qName) {
        return null;
    }

    public String getValue(String uri, String localName) {
        return null;
    }

    public String getValue(String qName) {
        return null;
    }
}
