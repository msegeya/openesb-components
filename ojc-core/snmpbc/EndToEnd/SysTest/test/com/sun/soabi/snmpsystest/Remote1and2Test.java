/*
 * Remote1and2Test.java
 * JUnit based test
 *
 * Created on April 3, 2007, 12:27 PM
 */

package com.sun.soabi.snmpsystest;

import com.sun.soabi.snmpmonitors.ProcEng1;
import com.sun.soabi.snmpmonitors.ProcEng2;
import com.sun.jbi.snmpengine.systest.TrapProducer;
import com.sun.jbi.snmpengine.SNMPEngineFactory;
import com.sun.jbi.snmpengine.SNMPRA;
import java.util.*;
import junit.framework.*;

/**
 *
 * @author fkieviet
 */
public class Remote1and2Test extends TestCase {
    private List<SNMPRA> mToDestroy = new ArrayList<SNMPRA>();
    private List<TrapProducer> mTrapProducersToClose = new ArrayList<TrapProducer>();
    
    public Remote1and2Test(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
        for (SNMPRA ra: mToDestroy) {
            ra.stop();
        }
        mToDestroy.clear();

        for (TrapProducer s: mTrapProducersToClose) {
            s.done();
        }
        mTrapProducersToClose.clear();
    }
    protected void destroyOnExit(SNMPRA ra) {
        mToDestroy.add(ra);
    }

    protected void closeOnExit(TrapProducer p) {
        mTrapProducersToClose.add(p);
    }
    
    private static final int NBUFFERS = 1000;
    private static final int NTRAPSPERBUFFER = 50;
    private static final int WAIT = 30000;
    
    
    /**
     * Sends V1 traps to the engine; forwards traps to a trap processor, so 
     * this includes JAXB creation. Also does JAXB decoding. 
     * Uses internal network loopback
     * 
     * @throws Throwable
     */
    public void testV1TrapWithMultipleQuerySyncPoint() throws Throwable {
        // LOGGER
        //setLogLevel(SNMPRAImpl.class.getName(), Level.FINE);
        
        final SNMPRA ra = new SNMPEngineFactory().create();
        
        // Start listening
        destroyOnExit(ra);
        ra.setPort(5541);
        ra.setBatchSize(1);
        ra.setMaxWait(0);
        ra.setNThreads(1);
        
        ProcEng1Thread thread1 = new ProcEng1Thread(ra);
        ProcEng2Thread thread2 = new ProcEng2Thread(ra);
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        
        // Done
        ra.stop();
    }
    
    class ProcEng1Thread extends Thread {
        private SNMPRA ra;
        
        public ProcEng1Thread(SNMPRA ra) {
            this.ra = ra;
        }
        
        public void run() {
            try {
                com.sun.soabi.snmpmonitor1.Stats before = ProcEng1.getStats();

                // Test with multiple sockets
                int nSockets = 100;
                TrapProducer p = new TrapProducer(NBUFFERS, NTRAPSPERBUFFER, nSockets, WAIT, ra, 10000, 2);
                p.sendWithSyncPacket();

                long t2 = -1;
                for (;;) {
                    Thread.sleep(1000);
                    com.sun.soabi.snmpmonitor1.Stats current =  ProcEng1.getStats();
                    System.out.println("ProEng1: Invokes=" + (current.getInvokes() - before.getInvokes()) + ", items=" + (current.getItems() - before.getItems()));
                    if (current.getItems() - before.getItems() >= p.getNK()) {
                        assertTrue(current.getItems() - before.getItems() == p.getNK());
                        t2 = current.getLast();
                        System.out.println("ProEng1: Invokes=" + (current.getInvokes() - before.getInvokes()) + ", items=" + (current.getItems() - before.getItems()));
                        break;
                    }
                }

                p.done();
                p.dump("ProEng1: injbi" + nSockets + "sockets", t2);
                    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    class ProcEng2Thread extends Thread {
        private SNMPRA ra;
        
        public ProcEng2Thread(SNMPRA ra) {
            this.ra = ra;
        }
        
        public void run() {
            try {
                com.sun.soabi.snmpmonitor2.Stats before = ProcEng2.getStats();

                // Test with multiple sockets
                int nSockets = 100;
                TrapProducer p = new TrapProducer(NBUFFERS, NTRAPSPERBUFFER, nSockets, WAIT, ra, 10001, 2);
                p.sendWithSyncPacket();

                long t2 = -1;
                for (;;) {
                    Thread.sleep(1000);
                    com.sun.soabi.snmpmonitor2.Stats current =  ProcEng2.getStats();
                    System.out.println("ProEng2: Invokes=" + (current.getInvokes() - before.getInvokes()) + ", items=" + (current.getItems() - before.getItems()));
                    if (current.getItems() - before.getItems() >= p.getNK()) {
                        assertTrue(current.getItems() - before.getItems() == p.getNK());
                        t2 = current.getLast();
                        System.out.println("ProEng2: Invokes=" + (current.getInvokes() - before.getInvokes()) + ", items=" + (current.getItems() - before.getItems()));
                        break;
                    }
                }

                p.done();
                p.dump("ProEng2: injbi" + nSockets + "sockets", t2);
                    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
