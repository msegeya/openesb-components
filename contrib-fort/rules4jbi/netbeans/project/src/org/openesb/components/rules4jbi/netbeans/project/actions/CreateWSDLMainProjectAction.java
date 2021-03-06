/*
 * @(#)CreateWSDLMainProjectAction.java        $Revision: 1.1 $ $Date: 2008/10/25 22:02:57 $
 * 
 * Copyright (c) 2008 Milan Fort (http://www.milanfort.com/). All rights reserved.
 * 
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License (the "License"). You may not use this file except
 * in compliance with the License.
 * 
 * You can obtain a copy of the license at http://www.sun.com/cddl/cddl.html.
 * See the License for the specific language governing permissions and limitations
 * under the License.
 */

package org.openesb.components.rules4jbi.netbeans.project.actions;

import java.io.IOException;
import java.util.logging.Logger;

import javax.wsdl.WSDLException;

import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle;

import org.openesb.components.rules4jbi.netbeans.project.directory.DirectoryManager;
import org.openesb.components.rules4jbi.netbeans.wsdl.wizard.CreateWSDLActionHandler;

/**
 * An action for WSDL creation for the current main project.
 *
 * @author Milan Fort (http://www.milanfort.com/)
 * @version $Revision: 1.1 $ $Date: 2008/10/25 22:02:57 $
 * 
 * @see AbstractMainProjectAction
 * @since 0.1
 */
public final class CreateWSDLMainProjectAction extends AbstractMainProjectAction {
    
    private static final long serialVersionUID = -2449366228226639442L;

    private static final Logger logger = Logger.getLogger(CreateWSDLMainProjectAction.class.getName());
    
    @Override
    protected void performAction(final DirectoryManager directoryManager) {
        logger.fine("Creating WSDL for the main project "
                + FileUtil.getFileDisplayName(directoryManager.getProjectDirectory()));

        try {
            CreateWSDLActionHandler.getInstance().handleWSDLCreation(directoryManager);
            
        } catch (WSDLException e) {
            logger.severe("Failed to create the WSDL: " + e.getMessage());
            
            NotifyDescriptor descriptor = new NotifyDescriptor.Message(
                    NbBundle.getMessage(CreateWSDLMainProjectAction.class, "wsdl.creation.failed.error.message"),
                    NotifyDescriptor.ERROR_MESSAGE);

            DialogDisplayer.getDefault().notify(descriptor);
            
        } catch (IOException e) {
            logger.severe("Failed to create the WSDL: " + e.getMessage());

            NotifyDescriptor descriptor = new NotifyDescriptor.Message(
                    NbBundle.getMessage(CreateWSDLMainProjectAction.class, "wsdl.creation.failed.error.message"),
                    NotifyDescriptor.ERROR_MESSAGE);

            DialogDisplayer.getDefault().notify(descriptor);
        }
    }

    @Override
    public String getName() {
        return NbBundle.getMessage(CreateWSDLMainProjectAction.class, "create.wsdl.action.name");
    }

    @Override
    protected String iconResource() {
        return "org/openesb/components/rules4jbi/netbeans/resources/createWSDL.png";
    }
}
