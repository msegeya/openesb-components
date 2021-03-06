/*******************************************************************************
 *  Copyright (c) 2005, 2006, 2007 Imola Informatica.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the LGPL License v2.1
 *  which accompanies this distribution, and is available at
 *  http://www.gnu.org/licenses/lgpl.html
 *******************************************************************************/
package it.imolinfo.jbi4ejb.processor;

import javax.jbi.messaging.MessageExchange;

/**
 * The Interface ExchangeProcessor.
 * 
 * @author <a href="mailto:mpiraccini@imolinfo.it">Marco Piraccini</a>
 */
public interface ExchangeProcessor {

    /**
     * Process the message exchange.
     * 
     * @param exchange the message exchange
     */
    void process(MessageExchange exchange);
}
