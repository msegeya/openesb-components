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
 * @(#)InsertStreamMySql.java
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */
package com.sun.jbi.engine.iep.core.runtime.operator.impl.mysql;

import com.sun.jbi.engine.iep.core.runtime.operator.ColumnMetadata;
import com.sun.jbi.engine.iep.core.runtime.operator.Schema;
import com.sun.jbi.engine.iep.core.runtime.operator.impl.InsertStream;
import com.sun.jbi.engine.iep.core.runtime.operator.impl.InsertStreamDb;
import com.sun.jbi.engine.iep.core.runtime.util.Messages;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;

/**
 *
 * @author Bing Lu
 */
public class InsertStreamMySql implements InsertStreamDb {
    private static final Messages mMessages = Messages.getMessages(InsertStreamMySql.class);
    
    private MySqlSpecial mMySqlSpecial;
    
    public InsertStreamMySql(MySqlSpecial mySqlSpecial) {
        mMySqlSpecial = mySqlSpecial;
    }
    
    public void createStoredProcedures(Connection con) {
    }

    public void dropStoredProcedures(Connection con) {
    }
    
    public PreparedStatement[] createOperateStatements(Connection con, InsertStream op) throws Exception {
        String outputTableName = op.getQueueName();
        String inputTableName = op.getInputOperatorList().get(0).getQueueName();
        Schema inputSchema = op.getInputOperatorList().get(0).getOutputSchema();
        
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO ");
        sb.append(outputTableName + " (");
        for (int i = 0; i < inputSchema.getColumnCount(); i++) {
            ColumnMetadata cm = inputSchema.getColumnMetadata(i);
            sb.append(cm.getColumnName());
            sb.append(",");
        }
        sb.append(COL_TIMESTAMP);
        sb.append(") SELECT ");
        for (int i = 0, I = inputSchema.getColumnCount(); i < I; i++) {
            ColumnMetadata cm = inputSchema.getColumnMetadata(i);
            sb.append(cm.getColumnName());
            sb.append(",");
        }
        sb.append(COL_TIMESTAMP + " FROM ");
        sb.append(inputTableName);
        sb.append(" t WHERE t." + COL_TAG + " = '+' AND ? < t." + COL_TIMESTAMP + " AND t." + COL_TIMESTAMP + " <= ?");
        sb.append(" ORDER BY t." + COL_TIMESTAMP);
        String sqlStr = sb.toString();
        if (mMessages.isLoggable(Level.FINE)) {
            mMessages.log(Level.FINE, "Operator.operateStmt", new Object[]{op.getName(), sqlStr});
        }    
        return new PreparedStatement[]{con.prepareStatement(sqlStr)};
    }
}
