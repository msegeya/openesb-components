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
 * @(#)EndpointConfigurationSUDescriptor.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.ftpbc.packaging;

import com.sun.jbi.ftpbc.Endpoint.EndpointType;
import com.sun.jbi.management.descriptor.EndpointIdentifier;
import com.sun.jbi.management.descriptor.SUDescriptorSupport;
import com.sun.jbi.management.descriptor.ConfigurationException;

import java.util.ArrayList;
import java.util.List;

/**
 * EndpointConfigurationSUDescriptor is a class to hold the consumes and
 * provides information from the jbi.xml su descriptor.
 * 
 */
public class EndpointConfigurationSUDescriptor implements EndpointConfiguration {
    private SUDescriptorSupport suDescriptor = null;
    
    private ArrayList services;
    
    /**
     * 
     * @param rootDir 
     * @throws com.sun.jbi.management.descriptor.ConfigurationException 
     */
    public EndpointConfigurationSUDescriptor (String rootDir) throws ConfigurationException {
        services = new ArrayList();
        suDescriptor = new SUDescriptorSupport(rootDir);
        addEndpoints (suDescriptor.getProvides());
        addEndpoints (suDescriptor.getConsumes());
    }

    private void addEndpoints (EndpointIdentifier [] endpoints) {
        for (int i=0; i < endpoints.length; i++) {
            EndpointIdentifier endpoint = endpoints[i];
            int direction = endpoint.isProvider()? 
                            EndpointType.OUTBOUND : EndpointType.INBOUND;
            
            addEndpoint (endpoint.getInterfaceName().toString(),
                         endpoint.getServiceName().toString(),
                         endpoint.getEndpointName(),
                         direction);
        }
    }
        
    public void addEndpoint(EndpointData p) {
        services.add(p);
    }
    
    public void addEndpoint(String interfaceName,
                            String service,
                            String endPoint,
                            int direction) {
        services.add(new EndpointDataImpl(interfaceName,
                                          service,
                                          endPoint,
                                          direction));
    }

    public List endpoints() {
        return services;
    }   
}
