//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.10 at 01:36:48 PM IST 
//
package com.zaz.jbi.engine.screenscrapingse.scrconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for anonymous complex type.</p>
 *  <p>The following schema fragment specifies the expected content contained within this
 * class.<pre>&lt;complexType>  &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
 *         &lt;element ref="{}input"/>        &lt;element ref="{}output"/>      &lt;/sequence>
 *     &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "input", "output"
})
@XmlRootElement(name = "filterOneWay")
public class FilterOneWay {

    /**
     * DOCUMENT ME!
     */
    @XmlElement(required = true)
    protected Input input;
    /**
     * DOCUMENT ME!
     */
    @XmlElement(required = true)
    protected Output output;

    /**
     * Gets the value of the input property.
     *
     * @return possible object is {@link Input }
     */
    public Input getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     *
     * @param value allowed object is {@link Input }
     */
    public void setInput(Input value) {
        this.input = value;
    }

    /**
     * Gets the value of the output property.
     *
     * @return possible object is {@link Output }
     */
    public Output getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     *
     * @param value allowed object is {@link Output }
     */
    public void setOutput(Output value) {
        this.output = value;
    }
}
