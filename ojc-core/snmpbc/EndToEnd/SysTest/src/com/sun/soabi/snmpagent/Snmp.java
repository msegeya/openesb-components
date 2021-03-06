
//
// Generated by mibgen version 5.1 (05/20/05) when compiling RFC1213-MIB.
//

package com.sun.soabi.snmpagent;

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.management.snmp.SnmpString;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;

/**
 * The class is used for implementing the "Snmp" group.
 * The group is defined with the following oid: 1.3.6.1.2.1.11.
 */
public class Snmp implements SnmpMBean, Serializable {

    /**
     * Variable for storing the value of "SnmpEnableAuthenTraps".
     * The variable is identified by: "1.3.6.1.2.1.11.30".
     */
    protected EnumSnmpEnableAuthenTraps SnmpEnableAuthenTraps = new EnumSnmpEnableAuthenTraps();

    /**
     * Variable for storing the value of "SnmpInTraps".
     * The variable is identified by: "1.3.6.1.2.1.11.19".
     */
    protected Long SnmpInTraps = new Long(1);

    /**
     * Variable for storing the value of "SnmpInGetResponses".
     * The variable is identified by: "1.3.6.1.2.1.11.18".
     */
    protected Long SnmpInGetResponses = new Long(1);

    /**
     * Variable for storing the value of "SnmpInSetRequests".
     * The variable is identified by: "1.3.6.1.2.1.11.17".
     */
    protected Long SnmpInSetRequests = new Long(1);

    /**
     * Variable for storing the value of "SnmpInGetNexts".
     * The variable is identified by: "1.3.6.1.2.1.11.16".
     */
    protected Long SnmpInGetNexts = new Long(1);

    /**
     * Variable for storing the value of "SnmpInGetRequests".
     * The variable is identified by: "1.3.6.1.2.1.11.15".
     */
    protected Long SnmpInGetRequests = new Long(1);

    /**
     * Variable for storing the value of "SnmpInTotalSetVars".
     * The variable is identified by: "1.3.6.1.2.1.11.14".
     */
    protected Long SnmpInTotalSetVars = new Long(1);

    /**
     * Variable for storing the value of "SnmpInTotalReqVars".
     * The variable is identified by: "1.3.6.1.2.1.11.13".
     */
    protected Long SnmpInTotalReqVars = new Long(1);

    /**
     * Variable for storing the value of "SnmpInGenErrs".
     * The variable is identified by: "1.3.6.1.2.1.11.12".
     */
    protected Long SnmpInGenErrs = new Long(1);

    /**
     * Variable for storing the value of "SnmpInReadOnlys".
     * The variable is identified by: "1.3.6.1.2.1.11.11".
     */
    protected Long SnmpInReadOnlys = new Long(1);

    /**
     * Variable for storing the value of "SnmpInBadValues".
     * The variable is identified by: "1.3.6.1.2.1.11.10".
     */
    protected Long SnmpInBadValues = new Long(1);

    /**
     * Variable for storing the value of "SnmpInNoSuchNames".
     * The variable is identified by: "1.3.6.1.2.1.11.9".
     */
    protected Long SnmpInNoSuchNames = new Long(1);

    /**
     * Variable for storing the value of "SnmpInTooBigs".
     * The variable is identified by: "1.3.6.1.2.1.11.8".
     */
    protected Long SnmpInTooBigs = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutTraps".
     * The variable is identified by: "1.3.6.1.2.1.11.29".
     */
    protected Long SnmpOutTraps = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutGetResponses".
     * The variable is identified by: "1.3.6.1.2.1.11.28".
     */
    protected Long SnmpOutGetResponses = new Long(1);

    /**
     * Variable for storing the value of "SnmpInASNParseErrs".
     * The variable is identified by: "1.3.6.1.2.1.11.6".
     */
    protected Long SnmpInASNParseErrs = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutSetRequests".
     * The variable is identified by: "1.3.6.1.2.1.11.27".
     */
    protected Long SnmpOutSetRequests = new Long(1);

    /**
     * Variable for storing the value of "SnmpInBadCommunityUses".
     * The variable is identified by: "1.3.6.1.2.1.11.5".
     */
    protected Long SnmpInBadCommunityUses = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutGetNexts".
     * The variable is identified by: "1.3.6.1.2.1.11.26".
     */
    protected Long SnmpOutGetNexts = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutGetRequests".
     * The variable is identified by: "1.3.6.1.2.1.11.25".
     */
    protected Long SnmpOutGetRequests = new Long(1);

    /**
     * Variable for storing the value of "SnmpInBadCommunityNames".
     * The variable is identified by: "1.3.6.1.2.1.11.4".
     */
    protected Long SnmpInBadCommunityNames = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutGenErrs".
     * The variable is identified by: "1.3.6.1.2.1.11.24".
     */
    protected Long SnmpOutGenErrs = new Long(1);

    /**
     * Variable for storing the value of "SnmpInBadVersions".
     * The variable is identified by: "1.3.6.1.2.1.11.3".
     */
    protected Long SnmpInBadVersions = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutPkts".
     * The variable is identified by: "1.3.6.1.2.1.11.2".
     */
    protected Long SnmpOutPkts = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutBadValues".
     * The variable is identified by: "1.3.6.1.2.1.11.22".
     */
    protected Long SnmpOutBadValues = new Long(1);

    /**
     * Variable for storing the value of "SnmpInPkts".
     * The variable is identified by: "1.3.6.1.2.1.11.1".
     */
    protected Long SnmpInPkts = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutNoSuchNames".
     * The variable is identified by: "1.3.6.1.2.1.11.21".
     */
    protected Long SnmpOutNoSuchNames = new Long(1);

    /**
     * Variable for storing the value of "SnmpOutTooBigs".
     * The variable is identified by: "1.3.6.1.2.1.11.20".
     */
    protected Long SnmpOutTooBigs = new Long(1);


    /**
     * Constructor for the "Snmp" group.
     * If the group contains a table, the entries created through an SNMP SET will not be registered in Java DMK.
     */
    public Snmp(SnmpMib myMib) {
    }


    /**
     * Constructor for the "Snmp" group.
     * If the group contains a table, the entries created through an SNMP SET will be AUTOMATICALLY REGISTERED in Java DMK.
     */
    public Snmp(SnmpMib myMib, MBeanServer server) {
    }

    /**
     * Getter for the "SnmpEnableAuthenTraps" variable.
     */
    public EnumSnmpEnableAuthenTraps getSnmpEnableAuthenTraps() throws SnmpStatusException {
        return SnmpEnableAuthenTraps;
    }

    /**
     * Setter for the "SnmpEnableAuthenTraps" variable.
     */
    public void setSnmpEnableAuthenTraps(EnumSnmpEnableAuthenTraps x) throws SnmpStatusException {
        SnmpEnableAuthenTraps = x;
    }

    /**
     * Checker for the "SnmpEnableAuthenTraps" variable.
     */
    public void checkSnmpEnableAuthenTraps(EnumSnmpEnableAuthenTraps x) throws SnmpStatusException {
        //
        // Add your own checking policy.
        //
    }

    /**
     * Getter for the "SnmpInTraps" variable.
     */
    public Long getSnmpInTraps() throws SnmpStatusException {
        return SnmpInTraps;
    }

    /**
     * Getter for the "SnmpInGetResponses" variable.
     */
    public Long getSnmpInGetResponses() throws SnmpStatusException {
        return SnmpInGetResponses;
    }

    /**
     * Getter for the "SnmpInSetRequests" variable.
     */
    public Long getSnmpInSetRequests() throws SnmpStatusException {
        return SnmpInSetRequests;
    }

    /**
     * Getter for the "SnmpInGetNexts" variable.
     */
    public Long getSnmpInGetNexts() throws SnmpStatusException {
        return SnmpInGetNexts;
    }

    /**
     * Getter for the "SnmpInGetRequests" variable.
     */
    public Long getSnmpInGetRequests() throws SnmpStatusException {
        return SnmpInGetRequests;
    }

    /**
     * Getter for the "SnmpInTotalSetVars" variable.
     */
    public Long getSnmpInTotalSetVars() throws SnmpStatusException {
        return SnmpInTotalSetVars;
    }

    /**
     * Getter for the "SnmpInTotalReqVars" variable.
     */
    public Long getSnmpInTotalReqVars() throws SnmpStatusException {
        return SnmpInTotalReqVars;
    }

    /**
     * Getter for the "SnmpInGenErrs" variable.
     */
    public Long getSnmpInGenErrs() throws SnmpStatusException {
        return SnmpInGenErrs;
    }

    /**
     * Getter for the "SnmpInReadOnlys" variable.
     */
    public Long getSnmpInReadOnlys() throws SnmpStatusException {
        return SnmpInReadOnlys;
    }

    /**
     * Getter for the "SnmpInBadValues" variable.
     */
    public Long getSnmpInBadValues() throws SnmpStatusException {
        return SnmpInBadValues;
    }

    /**
     * Getter for the "SnmpInNoSuchNames" variable.
     */
    public Long getSnmpInNoSuchNames() throws SnmpStatusException {
        return SnmpInNoSuchNames;
    }

    /**
     * Getter for the "SnmpInTooBigs" variable.
     */
    public Long getSnmpInTooBigs() throws SnmpStatusException {
        return SnmpInTooBigs;
    }

    /**
     * Getter for the "SnmpOutTraps" variable.
     */
    public Long getSnmpOutTraps() throws SnmpStatusException {
        return SnmpOutTraps;
    }

    /**
     * Getter for the "SnmpOutGetResponses" variable.
     */
    public Long getSnmpOutGetResponses() throws SnmpStatusException {
        return SnmpOutGetResponses;
    }

    /**
     * Getter for the "SnmpInASNParseErrs" variable.
     */
    public Long getSnmpInASNParseErrs() throws SnmpStatusException {
        return SnmpInASNParseErrs;
    }

    /**
     * Getter for the "SnmpOutSetRequests" variable.
     */
    public Long getSnmpOutSetRequests() throws SnmpStatusException {
        return SnmpOutSetRequests;
    }

    /**
     * Getter for the "SnmpInBadCommunityUses" variable.
     */
    public Long getSnmpInBadCommunityUses() throws SnmpStatusException {
        return SnmpInBadCommunityUses;
    }

    /**
     * Getter for the "SnmpOutGetNexts" variable.
     */
    public Long getSnmpOutGetNexts() throws SnmpStatusException {
        return SnmpOutGetNexts;
    }

    /**
     * Getter for the "SnmpOutGetRequests" variable.
     */
    public Long getSnmpOutGetRequests() throws SnmpStatusException {
        return SnmpOutGetRequests;
    }

    /**
     * Getter for the "SnmpInBadCommunityNames" variable.
     */
    public Long getSnmpInBadCommunityNames() throws SnmpStatusException {
        return SnmpInBadCommunityNames;
    }

    /**
     * Getter for the "SnmpOutGenErrs" variable.
     */
    public Long getSnmpOutGenErrs() throws SnmpStatusException {
        return SnmpOutGenErrs;
    }

    /**
     * Getter for the "SnmpInBadVersions" variable.
     */
    public Long getSnmpInBadVersions() throws SnmpStatusException {
        return SnmpInBadVersions;
    }

    /**
     * Getter for the "SnmpOutPkts" variable.
     */
    public Long getSnmpOutPkts() throws SnmpStatusException {
        return SnmpOutPkts;
    }

    /**
     * Getter for the "SnmpOutBadValues" variable.
     */
    public Long getSnmpOutBadValues() throws SnmpStatusException {
        return SnmpOutBadValues;
    }

    /**
     * Getter for the "SnmpInPkts" variable.
     */
    public Long getSnmpInPkts() throws SnmpStatusException {
        return SnmpInPkts;
    }

    /**
     * Getter for the "SnmpOutNoSuchNames" variable.
     */
    public Long getSnmpOutNoSuchNames() throws SnmpStatusException {
        return SnmpOutNoSuchNames;
    }

    /**
     * Getter for the "SnmpOutTooBigs" variable.
     */
    public Long getSnmpOutTooBigs() throws SnmpStatusException {
        return SnmpOutTooBigs;
    }

}
