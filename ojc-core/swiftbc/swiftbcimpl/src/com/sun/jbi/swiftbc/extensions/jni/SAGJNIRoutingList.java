/************************************************************************************
*
*   Copyright � 2006 Sun Microsystems, Inc., 4150 Network Circle, Santa Clara, 
*   California 95054, U.S.A. All rights reserved. Sun Microsystems, Inc. has 
*   intellectual property rights relating to technology embodied in the product 
*   that is described in this document. In particular, and without limitation, 
*   these intellectual property rights may include one or more of the U.S. patents 
*   listed at http://www.sun.com/patents and one or more additional patents or 
*   pending patent applications in the U.S. and in other countries. THIS PRODUCT 
*   CONTAINS CONFIDENTIAL INFORMATION AND TRADE SECRETS OF SUN MICROSYSTEMS, INC. 
*   USE, DISCLOSURE OR REPRODUCTION IS PROHIBITED WITHOUT THE PRIOR EXPRESS WRITTEN 
*   PERMISSION OF SUN MICROSYSTEMS, INC.U.S. Government Rights - Commercial 
*   software.  Government users are subject to the Sun Microsystems, Inc. standard 
*   license agreement and applicable provisions of the FAR and its supplements.  
*   Use is subject to license terms.  This distribution may include materials 
*   developed by third parties. Sun, Sun Microsystems, the Sun logo, Java 
*   Composite Application Platform Suite,  SeeBeyond, eGate, eInsight, eVision, eTL,
*   eXchange, eView, eIndex, eBAM and  eWay are trademarks or registered trademarks of
*   Sun Microsystems, Inc. in the U.S. and other countries. All SPARC trademarks are 
*   used under license and are trademarks or registered trademarks of SPARC 
*   International, Inc. in the U.S. and other countries. Products bearing SPARC 
*   trademarks are based upon architecture developed by Sun Microsystems, Inc. 
*   UNIX is a registered trademark in the U.S. and other countries, exclusively 
*   licensed through X/Open Company, Ltd. This product is covered and controlled by 
*   U.S. Export Control laws and may be subject to the export or import laws in 
*   other countries.  Nuclear, missile, chemical biological weapons or nuclear 
*   maritime end uses or end users, whether direct or indirect, are strictly 
*   prohibited.  Export or reexport to countries subject to U.S. embargo or to 
*   entities identified on U.S. export exclusion lists, including, but not limited 
*   to, the denied persons and specially designated nationals lists is strictly 
*   prohibited.
*
*************************************************************************************/
package com.sun.jbi.swiftbc.extensions.jni;

import com.sun.jbi.swiftbc.extensions.SwiftRoutingStep;

/**
 * Wrapper class for SAG C++ SAGJNIRoutingList class
 * It is derived from sagappltypes.hpp.
 * 
 * 
 * 
 * @author Harry Liu (harry.liu@sun.com)
 * @version cvs revision: $Revision: 1.1 $   Last Modified: $Date: 2007/04/20 05:37:47 $
 * @deprecated 
 */
//newly-added for eway 51x for completeness although it's deprecated from native api
public class SAGJNIRoutingList {
    /** 
     * This member is used to store the address of its SAG C++ object.
     * Would like to declare it as private since it should never be
     * referenced on the Java side.  However, it is referenced
     * by other classes on the JNI C++ side and is therefore declared
     * as public. (Harry - It doesn't have to be public, declare it as private).
     */
    private long peer = 0;

    /**
     * 
     * Creates a new instance of SAGJNIRoutingList
     */
    public SAGJNIRoutingList() {
        this.peer = alloc();
    }

    public SAGJNIRoutingList(SAGJNIRoutingList orig) {
        this.peer = orig.peer;
    }

    /**
     * Method alloc.
     * @return long
     */
    private native long alloc();

    /**
     * Method free.
     */
    private native void free();

    /**
     * @see java.lang.Object#finalize()
     */
    protected void finalize() {
        free();
    }

    public native int getNumberOfStep();
    public native SwiftRoutingStep getRoutingStep(int iStep);
    public native void insert(int iStep,SwiftRoutingStep routingStep);
    public native void destroy(int iStep);

    static {
        System.loadLibrary("stcsagjni");
    }
    
}
