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
 * @(#)DefaultImpl.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.bpel.model.extensions.impl;

import javax.xml.namespace.QName;

import com.sun.bpel.model.Copy;
import com.sun.bpel.model.extensions.Choose;
import com.sun.bpel.model.extensions.Default;
import com.sun.bpel.model.extensions.ForEach;
import com.sun.bpel.model.visitor.BPELVisitor;
import com.sun.bpel.xml.common.model.XMLDocument;
import com.sun.bpel.xml.common.model.XMLElement;
import com.sun.bpel.xml.common.visitor.Visitor;


/**
 * Implements the &lt;default&gt; element.
 *
 * @author Sun Microsystems
 * @version 
 */
public class DefaultImpl extends ExtnChildrenImpl implements Default {
    /** QName object for SeeBeyond Private extension line label */
    public static final QName DEFAULT_QNAME =
    	com.sun.bpel.xml.NamespaceUtility.getQName(
    				XMLElement.SBYNBPEL_RUNTIME_EXTN_NAMESPACE,
    				Default.TAG,
    				XMLElement.SBYNBPEL_RUNTIME_EXTN_PREFIX);	

    /** Creates a new instance of DefaultImpl */
    public DefaultImpl() {
        super();
        initDefault();
    }
    
    /** Creates a new instance of DefaultImpl.
     * @param   d   Owner document.
     */
    public DefaultImpl(XMLDocument d) {
        super(d);
        initDefault();
    }
    
    /** Initializes this class.
     */
    private void initDefault() {
        setLocalName(Default.TAG);
        setQualifiedName(DEFAULT_QNAME);
        childrenTags = new String[] {
            ForEach.TAG,
            Copy.TAG,
            Choose.TAG
        };
    }
    
    /** Accepts a visitor to perform some work on the element.
     * @param   w   The working visitor
     * @return  <tt>true</tt> if traversal is to continue.
     */
    public boolean accept(Visitor w) {
        BPELVisitor v = morphVisitor(w);
        if (traverseParentFirst(v)) {
            if (!v.visit(this)) {
                return false;
            }
        }

        if (!super.accept(v)) {
            return false;
        }

        if (traverseParentLast(v)) {
            if (!v.visit(this)) {
                return false;
            }
        }
        return true;
    }    
}
