/*
 * 
 * =======================================================================
 * Copyright (c) 2002-2006 Axion Development Team.  All rights reserved.
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

package org.axiondb.engine.commands;

import java.util.List;

import org.axiondb.AxionException;
import org.axiondb.Database;

/**
 * A <code>DROP DATABASE LINK</code> command.
 * 
 * @version  
 * @author Ahimanikya Satapathy
 */
public class DropDatabaseLinkCommand extends DropCommand {

    public DropDatabaseLinkCommand(String serverName, boolean exists, boolean cascade) {
        setObjectName(serverName);
        setIfExists(exists);
        setCascade(cascade);
    }

    public boolean execute(Database db) throws AxionException {
        assertNotReadOnly(db);
        if (!isIfExists() || db.hasDatabaseLink(getObjectName())) {
            dropDependentTables(db);
            db.dropDatabaseLink(getObjectName());
        }
        return false;
    }

    private void dropDependentTables(Database db) throws AxionException {
        List tables = db.getDependentExternalDBTable(getObjectName());
        if (tables.size() > 0) {
            if (isCascade()) {
                db.dropDependentExternalDBTable(tables);
            } else {
                throw new AxionException("Can't drop Database Link, one or more tables has reference to " + getObjectName());
            }
        }
    }
}
