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
 * @(#)RuntimeConfigurationMBean.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.ldapbc;

import java.util.Collection;
import java.util.Map;
import javax.management.InvalidAttributeValueException;
import javax.management.MBeanException;
import javax.management.openmbean.CompositeData;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.TabularData;

import com.sun.jbi.ldapbc.configuration.ApplicationConfigurationField;

/**
 * MBean interface for run-time configuration
 *
 */
public interface RuntimeConfigurationMBean {


	public Integer getThreads();

    public void setThreads(Integer val) throws InvalidAttributeValueException, MBeanException;
    
	public Integer getRetryCount();
	
	public void setRetryCount(Integer val) throws InvalidAttributeValueException , MBeanException;
	
	public Integer getRetryInterval();
	
	public void setRetryInterval(Integer val) throws InvalidAttributeValueException , MBeanException;

	public String getRecoveryType();
	
	public void setRecoveryType(String name) throws InvalidAttributeValueException , MBeanException;
	
	Map<String, String[]> retrieveApplicationVariablesMap();
    
	Map<String, Collection<ApplicationConfigurationField>> retrieveApplicationConfigurationsMap();
    
	void updateApplicationVariablesMap(Map<String, String[]> map) throws MBeanException;
    
	int countVariables();
    
    public Boolean getAllowDynamicEndpoint();

    public void setAllowDynamicEndpoint(Boolean val) throws InvalidAttributeValueException, MBeanException;

	public Boolean getAllowConnectionPooling();
	
	public void setAllowConnectionPooling(Boolean connPool)throws InvalidAttributeValueException, MBeanException;

	public Integer getConnectionPoolPrefSize();
	
	public void setConnectionPoolPrefSize(Integer prefSize) throws InvalidAttributeValueException , MBeanException;

	public Integer getConnectionPoolMaxSize();
	
	public void setConnectionPoolMaxSize(Integer maxSize) throws InvalidAttributeValueException , MBeanException;

	public Integer getConnectionMaxIdleTimeout();
	
	public void setConnectionMaxIdleTimeout(Integer maxIdleTime) throws InvalidAttributeValueException , MBeanException;

	public String getConnectionProtocol();

	public void setConnectionProtocol(String protocol) throws InvalidAttributeValueException , MBeanException;

	public String getConnectionAuthentication();

	public void setConnectionAuthentication(String auth) throws InvalidAttributeValueException , MBeanException;	
	
	
	/**
     * 
     * @return 
     */
    /*---------------------------------------------------------------------------------*\
     *          Operations for Application Variables Management                        *
    \*---------------------------------------------------------------------------------*/
    
    /**
     * This operation adds a new applicationvariable. If a variable already exists with 
     * the same name as that specified then the operation fails.
     * 
     * @param name - name of the application variable
     * @param appVar - this is the application variable compoiste
     * @throws MBeanException if an error occurs in adding the application variables to the 
     *         component. 
     */
     public void addApplicationVariable(String name, CompositeData appVar) throws MBeanException;
     
    /**
     * This operation sets an application variable. If a variable does not exist with 
     * the same name, its an error.
     * 
     * @param name - name of the application variable
     * @param appVar - this is the application variable compoiste to be updated.
     * @throws MBeanException if one or more application variables cannot be deleted
     */
    public void setApplicationVariable(String name, CompositeData appVar) throws MBeanException; 
     
    /**
     * This operation deletes an application variable, if a variable with the specified name does
     * not exist, it's an error.
     *
     * @param name - name of the application variable
     * @throws MBeanException on errors.
     */
     public void deleteApplicationVariable(String name) throws MBeanException;
     
     /**
      * Get the Application Variable set for a component.
      *
      * @return  a TabularData which has all the applicationvariables set on the component. 
      */
     public TabularData getApplicationVariables();

    /*---------------------------------------------------------------------------------*\
     *            Operations for Application Configuration Management                  *
    \*---------------------------------------------------------------------------------*/
    
     /**
      * Get the CompositeType definition for the components application configuration 
      *
      * @return the CompositeType for the components application configuration.
      */
     public CompositeType queryApplicationConfigurationType();
     
     /**
      * Add an application configuration. The configuration name is a part of the CompositeData.
      * The itemName for the configuration name is "configurationName" and the type is SimpleType.STRING
      *
      * @param name - configuration name, must match the value of the field "name" in the namedConfig
      * @param appConfig - application configuration composite 
      * @throws MBeanException if the application configuration cannot be added.
      */
    public void addApplicationConfiguration(String name, CompositeData appConfig) throws MBeanException;
    
     /**
      * Delete an application configuration. 
      *
      * @param name - identification of the application configuration to be deleted
      * @throws MBeanException if the configuration cannot be deleted.
      */
    public void deleteApplicationConfiguration(String name) throws MBeanException;
     
     /**
      * Update a application configuration. The configuration name is a part of the CompositeData.
      * The itemName for the configuration name is "configurationName" and the type is SimpleType.STRING
      *
      * @param name - configuration name, must match the value of the field "configurationName" in the appConfig
      * @param appConfig - application configuration composite
      * @throws MBeanException if there are errors encountered when updating the configuration.
      */
    public void setApplicationConfiguration(String name, CompositeData appConfig) throws MBeanException;
    
    /**
     * Get a Map of all application configurations for the component.
     *
     * @return a TabularData of all the application configurations for a 
     *         component keyed by the configuration name. 
     */
	public TabularData getApplicationConfigurations(); 

	
}
