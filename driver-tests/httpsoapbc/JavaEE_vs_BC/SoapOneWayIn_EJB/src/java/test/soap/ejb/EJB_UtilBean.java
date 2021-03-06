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
 * @(#)EJB_UtilBean.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package test.soap.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author harry.liu (harry.liu@sun.com)
 */
@Stateless
public class EJB_UtilBean implements EJB_UtilLocal {
    private String traceMsg;
    
    /** Creates a new instance of EJB_UtilBean */
    public EJB_UtilBean() {
    }

    public String getTrace() {
        return this.traceMsg;
    }

    public void setTrace(String traceMsg) {
        this.traceMsg = traceMsg;
    }
    
}
