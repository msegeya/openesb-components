/*
 * $Id: TestBaseConstraint.java,v 1.1 2007/11/28 10:01:22 jawed Exp $
 * =======================================================================
 * Copyright (c) 2002-2003 Axion Development Team.  All rights reserved.
 *  
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions 
 * are met:
 * 
 * 1. Redistributions of source code must retain the above 
 *    copyright notice, this list of conditions and the following 
 *    disclaimer. 
 *   
 * 2. Redistributions in binary form must reproduce the above copyright 
 *    notice, this list of conditions and the following disclaimer in 
 *    the documentation and/or other materials provided with the 
 *    distribution. 
 *   
 * 3. The names "Tigris", "Axion", nor the names of its contributors may 
 *    not be used to endorse or promote products derived from this 
 *    software without specific prior written permission. 
 *  
 * 4. Products derived from this software may not be called "Axion", nor 
 *    may "Tigris" or "Axion" appear in their names without specific prior
 *    written permission.
 *   
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT 
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY 
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT 
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE 
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * =======================================================================
 */

package org.axiondb.constraints;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.axiondb.AxionException;
import org.axiondb.Constraint;
import org.axiondb.RowDecorator;
import org.axiondb.RowIterator;
import org.axiondb.Table;
import org.axiondb.event.RowEvent;

/**
 * @version $Revision: 1.1 $ $Date: 2007/11/28 10:01:22 $
 * @author Rodney Waldhoff
 */
public class TestBaseConstraint extends TestCase {

    //------------------------------------------------------------ Conventional

    public TestBaseConstraint(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestBaseConstraint.class);
    }

    //--------------------------------------------------------------- Lifecycle

    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }

    //------------------------------------------------------------------- Tests

    public void testCantDeferNotDeferrable() throws Exception {
        Constraint c = new MockConstraint();
        c.setDeferrable(false);
        try {
            c.setDeferred(true);
            fail("Expected AxionException");
        } catch(AxionException e) {
            // expected
        }
    }
    
    public void testToArray() {
        MockConstraint c = new MockConstraint();
        assertEquals(0,c.toArray(null).length);
    }

    public void testResolve() throws AxionException {
        MockConstraint c = new MockConstraint();
        c.resolve(null,null);
    }

    //------------------------------------------------------------------- Inner
    
    private static class MockConstraint extends BaseConstraint {
        public MockConstraint() {
            super("mock","mock");
        }        
        
        public boolean evaluate(RowEvent event) throws AxionException {
            return true;
        }
        
        public boolean evaluate(RowEvent e, RowDecorator dec) { 
            return true;           
        }

        public boolean evaluate(RowIterator oldRows, RowIterator newRows, Table table) throws AxionException {
            return true;
        }
    }

}
