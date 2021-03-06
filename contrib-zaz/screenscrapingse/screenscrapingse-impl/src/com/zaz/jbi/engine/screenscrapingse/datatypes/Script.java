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
 * Copyright 2007-2008 ZAZ Consulting, Inc. All Rights Reserved.
 *
 * END_HEADER - DO NOT EDIT
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.03.28 at 08:23:26 PM IST 
//
package com.zaz.jbi.engine.screenscrapingse.datatypes;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>Java class for anonymous complex type.</p>
 *  <p>The following schema fragment specifies the expected content contained within this
 * class.<pre>&lt;complexType>  &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
 *         &lt;element name="scriptType">          &lt;complexType>            &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>                  &lt;element name="ScriptEngine">
 *                     &lt;complexType>                      &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="language" minOccurs="0">
 *                               &lt;complexType>                                &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="langVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>                            &lt;/element>
 *                             &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>                        &lt;/restriction>
 *                       &lt;/complexContent>                    &lt;/complexType>
 *                   &lt;/element>                &lt;/sequence>              &lt;/restriction>
 *             &lt;/complexContent>          &lt;/complexType>        &lt;/element>
 *         &lt;element name="scriptSource">          &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>                  &lt;element name="url" minOccurs="0">
 *                     &lt;complexType>                      &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="urlLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>                        &lt;/restriction>
 *                       &lt;/complexContent>                    &lt;/complexType>
 *                   &lt;/element>                  &lt;element name="file" minOccurs="0">
 *                     &lt;complexType>                      &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="preloaded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>                      &lt;/complexContent>
 *                     &lt;/complexType>                  &lt;/element>
 *                   &lt;element name="inlined" minOccurs="0">                    &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="scriptText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>                        &lt;/restriction>
 *                       &lt;/complexContent>                    &lt;/complexType>
 *                   &lt;/element>                &lt;/choice>              &lt;/restriction>
 *             &lt;/complexContent>          &lt;/complexType>        &lt;/element>
 *         &lt;element name="inputParameters">          &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="param" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>                      &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>                      &lt;/complexContent>
 *                     &lt;/complexType>                  &lt;/element>
 *                 &lt;/sequence>              &lt;/restriction>            &lt;/complexContent>
 *           &lt;/complexType>        &lt;/element>        &lt;element name="result">
 *           &lt;complexType>            &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>                  &lt;element name="fault">
 *                     &lt;complexType>                      &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="faultDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>                        &lt;/restriction>
 *                       &lt;/complexContent>                    &lt;/complexType>
 *                   &lt;/element>                  &lt;element name="resultdata">
 *                     &lt;complexType>                      &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>                            &lt;any/>
 *                           &lt;/sequence>                        &lt;/restriction>
 *                       &lt;/complexContent>                    &lt;/complexType>
 *                   &lt;/element>                &lt;/sequence>              &lt;/restriction>
 *             &lt;/complexContent>          &lt;/complexType>        &lt;/element>
 *       &lt;/sequence>    &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scriptType", "scriptSource", "inputParameters", "result"
})
@XmlRootElement(name = "script")
public class Script {

    /** DOCUMENT ME! */
    @XmlElement(required = true)
    protected Script.ScriptType scriptType;
    /** DOCUMENT ME! */
    @XmlElement(required = true)
    protected Script.ScriptSource scriptSource;
    /** DOCUMENT ME! */
    @XmlElement(required = true)
    protected Script.InputParameters inputParameters;
    /** DOCUMENT ME! */
    @XmlElement(required = true)
    protected Script.Result result;

    /**
     * Gets the value of the scriptType property.
     *
     * @return possible object is {@link Script.ScriptType }
     */
    public Script.ScriptType getScriptType() {
        return scriptType;
    }

    /**
     * Sets the value of the scriptType property.
     *
     * @param value allowed object is {@link Script.ScriptType }
     */
    public void setScriptType(Script.ScriptType value) {
        this.scriptType = value;
    }

    /**
     * Gets the value of the scriptSource property.
     *
     * @return possible object is {@link Script.ScriptSource }
     */
    public Script.ScriptSource getScriptSource() {
        return scriptSource;
    }

    /**
     * Sets the value of the scriptSource property.
     *
     * @param value allowed object is {@link Script.ScriptSource }
     */
    public void setScriptSource(Script.ScriptSource value) {
        this.scriptSource = value;
    }

    /**
     * Gets the value of the inputParameters property.
     *
     * @return possible object is {@link Script.InputParameters }
     */
    public Script.InputParameters getInputParameters() {
        return inputParameters;
    }

    /**
     * Sets the value of the inputParameters property.
     *
     * @param value allowed object is {@link Script.InputParameters }
     */
    public void setInputParameters(Script.InputParameters value) {
        this.inputParameters = value;
    }

    /**
     * Gets the value of the result property.
     *
     * @return possible object is {@link Script.Result }
     */
    public Script.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value allowed object is {@link Script.Result }
     */
    public void setResult(Script.Result value) {
        this.result = value;
    }

    /**
     * <p>Java class for anonymous complex type.</p>
     *  <p>The following schema fragment specifies the expected content contained within
     * this class.<pre>&lt;complexType>  &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
     *         &lt;element name="param" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>            &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>            &lt;/complexContent>          &lt;/complexType>
     *         &lt;/element>      &lt;/sequence>    &lt;/restriction>  &lt;/complexContent>
     * &lt;/complexType></pre></p>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "param"
    })
    public static class InputParameters {

        /** DOCUMENT ME! */
        protected List<Script.InputParameters.Param> param;

        /**
         * Gets the value of the param property.<p>This accessor method returns a
         * reference to the live list, not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the param property.</p>
         *  <p>For example, to add a new item, do as follows:<pre>   getParam().add(newItem);</pre></p>
         *  <p>Objects of the following type(s) are allowed in the list {@link
         * Script.InputParameters.Param }</p>
         *
         * @return DOCUMENT ME!
         */
        public List<Script.InputParameters.Param> getParam() {
            if (param == null) {
                param = new ArrayList<Script.InputParameters.Param>();
            }

            return this.param;
        }

        /**
         * <p>Java class for anonymous complex type.</p>
         *  <p>The following schema fragment specifies the expected content contained
         * within this class.<pre>&lt;complexType>  &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Param {

            /** DOCUMENT ME! */
            @XmlElement(required = true)
            protected Object value;
            /** DOCUMENT ME! */
            @XmlAttribute
            protected String name;

            /**
             * Gets the value of the value property.
             *
             * @return possible object is {@link Object }
             */
            public Object getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is {@link Object }
             */
            public void setValue(Object value) {
                this.value = value;
            }

            /**
             * Gets the value of the name property.
             *
             * @return possible object is {@link String }
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value allowed object is {@link String }
             */
            public void setName(String value) {
                this.name = value;
            }
        }
    }

    /**
     * <p>Java class for anonymous complex type.</p>
     *  <p>The following schema fragment specifies the expected content contained within
     * this class.<pre>&lt;complexType>  &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
     *         &lt;element name="fault">          &lt;complexType>            &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="faultDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>              &lt;/restriction>
     *             &lt;/complexContent>          &lt;/complexType>        &lt;/element>
     *         &lt;element name="resultdata">          &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>                  &lt;any/>                &lt;/sequence>
     *               &lt;/restriction>            &lt;/complexContent>          &lt;/complexType>
     *         &lt;/element>      &lt;/sequence>    &lt;/restriction>  &lt;/complexContent>
     * &lt;/complexType></pre></p>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fault", "resultdata"
    })
    public static class Result {

        /** DOCUMENT ME! */
        @XmlElement(required = true)
        protected Script.Result.Fault fault;
        /** DOCUMENT ME! */
        @XmlElement(required = true)
        protected Script.Result.Resultdata resultdata;

        /**
         * Gets the value of the fault property.
         *
         * @return possible object is {@link Script.Result.Fault }
         */
        public Script.Result.Fault getFault() {
            return fault;
        }

        /**
         * Sets the value of the fault property.
         *
         * @param value allowed object is {@link Script.Result.Fault }
         */
        public void setFault(Script.Result.Fault value) {
            this.fault = value;
        }

        /**
         * Gets the value of the resultdata property.
         *
         * @return possible object is {@link Script.Result.Resultdata }
         */
        public Script.Result.Resultdata getResultdata() {
            return resultdata;
        }

        /**
         * Sets the value of the resultdata property.
         *
         * @param value allowed object is {@link Script.Result.Resultdata }
         */
        public void setResultdata(Script.Result.Resultdata value) {
            this.resultdata = value;
        }

        /**
         * <p>Java class for anonymous complex type.</p>
         *  <p>The following schema fragment specifies the expected content contained
         * within this class.<pre>&lt;complexType>  &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
         *         &lt;element name="faultDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>    &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "faultDesc"
        })
        public static class Fault {

            /** DOCUMENT ME! */
            protected String faultDesc;

            /**
             * Gets the value of the faultDesc property.
             *
             * @return possible object is {@link String }
             */
            public String getFaultDesc() {
                return faultDesc;
            }

            /**
             * Sets the value of the faultDesc property.
             *
             * @param value allowed object is {@link String }
             */
            public void setFaultDesc(String value) {
                this.faultDesc = value;
            }
        }

        /**
         * <p>Java class for anonymous complex type.</p>
         *  <p>The following schema fragment specifies the expected content contained
         * within this class.<pre>&lt;complexType>  &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
         *         &lt;any/>      &lt;/sequence>    &lt;/restriction>  &lt;/complexContent>
         * &lt;/complexType></pre></p>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class Resultdata {

            /** DOCUMENT ME! */
            @XmlAnyElement(lax = true)
            protected Object any;

            /**
             * Gets the value of the any property.
             *
             * @return possible object is {@link Element }{@link Object }
             */
            public Object getAny() {
                return any;
            }

            /**
             * Sets the value of the any property.
             *
             * @param value allowed object is {@link Element }{@link Object }
             */
            public void setAny(Object value) {
                this.any = value;
            }
        }
    }

    /**
     * <p>Java class for anonymous complex type.</p>
     *  <p>The following schema fragment specifies the expected content contained within
     * this class.<pre>&lt;complexType>  &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;choice>
     *         &lt;element name="url" minOccurs="0">          &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="urlLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>              &lt;/restriction>
     *             &lt;/complexContent>          &lt;/complexType>        &lt;/element>
     *         &lt;element name="file" minOccurs="0">          &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="preloaded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>            &lt;/complexContent>          &lt;/complexType>
     *         &lt;/element>        &lt;element name="inlined" minOccurs="0">
     *           &lt;complexType>            &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="scriptText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>              &lt;/restriction>
     *             &lt;/complexContent>          &lt;/complexType>        &lt;/element>
     *       &lt;/choice>    &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "url", "file", "inlined"
    })
    public static class ScriptSource {

        /** DOCUMENT ME! */
        protected Script.ScriptSource.Url url;
        /** DOCUMENT ME! */
        protected Script.ScriptSource.File file;
        /** DOCUMENT ME! */
        protected Script.ScriptSource.Inlined inlined;

        /**
         * Gets the value of the url property.
         *
         * @return possible object is {@link Script.ScriptSource.Url }
         */
        public Script.ScriptSource.Url getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         *
         * @param value allowed object is {@link Script.ScriptSource.Url }
         */
        public void setUrl(Script.ScriptSource.Url value) {
            this.url = value;
        }

        /**
         * Gets the value of the file property.
         *
         * @return possible object is {@link Script.ScriptSource.File }
         */
        public Script.ScriptSource.File getFile() {
            return file;
        }

        /**
         * Sets the value of the file property.
         *
         * @param value allowed object is {@link Script.ScriptSource.File }
         */
        public void setFile(Script.ScriptSource.File value) {
            this.file = value;
        }

        /**
         * Gets the value of the inlined property.
         *
         * @return possible object is {@link Script.ScriptSource.Inlined }
         */
        public Script.ScriptSource.Inlined getInlined() {
            return inlined;
        }

        /**
         * Sets the value of the inlined property.
         *
         * @param value allowed object is {@link Script.ScriptSource.Inlined }
         */
        public void setInlined(Script.ScriptSource.Inlined value) {
            this.inlined = value;
        }

        /**
         * <p>Java class for anonymous complex type.</p>
         *  <p>The following schema fragment specifies the expected content contained
         * within this class.<pre>&lt;complexType>  &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
         *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="preloaded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "filePath"
        })
        public static class File {

            /** DOCUMENT ME! */
            @XmlElement(required = true)
            protected String filePath;
            /** DOCUMENT ME! */
            @XmlAttribute
            protected Boolean preloaded;

            /**
             * Gets the value of the filePath property.
             *
             * @return possible object is {@link String }
             */
            public String getFilePath() {
                return filePath;
            }

            /**
             * Sets the value of the filePath property.
             *
             * @param value allowed object is {@link String }
             */
            public void setFilePath(String value) {
                this.filePath = value;
            }

            /**
             * Gets the value of the preloaded property.
             *
             * @return possible object is {@link Boolean }
             */
            public Boolean isPreloaded() {
                return preloaded;
            }

            /**
             * Sets the value of the preloaded property.
             *
             * @param value allowed object is {@link Boolean }
             */
            public void setPreloaded(Boolean value) {
                this.preloaded = value;
            }
        }

        /**
         * <p>Java class for anonymous complex type.</p>
         *  <p>The following schema fragment specifies the expected content contained
         * within this class.<pre>&lt;complexType>  &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
         *         &lt;element name="scriptText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>    &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "scriptText"
        })
        public static class Inlined {

            /** DOCUMENT ME! */
            @XmlElement(required = true)
            protected String scriptText;

            /**
             * Gets the value of the scriptText property.
             *
             * @return possible object is {@link String }
             */
            public String getScriptText() {
                return scriptText;
            }

            /**
             * Sets the value of the scriptText property.
             *
             * @param value allowed object is {@link String }
             */
            public void setScriptText(String value) {
                this.scriptText = value;
            }
        }

        /**
         * <p>Java class for anonymous complex type.</p>
         *  <p>The following schema fragment specifies the expected content contained
         * within this class.<pre>&lt;complexType>  &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
         *         &lt;element name="urlLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>    &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "urlLocation"
        })
        public static class Url {

            /** DOCUMENT ME! */
            @XmlElement(required = true)
            protected String urlLocation;

            /**
             * Gets the value of the urlLocation property.
             *
             * @return possible object is {@link String }
             */
            public String getUrlLocation() {
                return urlLocation;
            }

            /**
             * Sets the value of the urlLocation property.
             *
             * @param value allowed object is {@link String }
             */
            public void setUrlLocation(String value) {
                this.urlLocation = value;
            }
        }
    }

    /**
     * <p>Java class for anonymous complex type.</p>
     *  <p>The following schema fragment specifies the expected content contained within
     * this class.<pre>&lt;complexType>  &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
     *         &lt;element name="ScriptEngine">          &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="language" minOccurs="0">
     *                     &lt;complexType>                      &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="langVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>                      &lt;/simpleContent>
     *                     &lt;/complexType>                  &lt;/element>
     *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>              &lt;/restriction>
     *             &lt;/complexContent>          &lt;/complexType>        &lt;/element>
     *       &lt;/sequence>    &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "scriptEngine"
    })
    public static class ScriptType {

        /** DOCUMENT ME! */
        @XmlElement(name = "ScriptEngine", required = true)
        protected Script.ScriptType.ScriptEngine scriptEngine;

        /**
         * Gets the value of the scriptEngine property.
         *
         * @return possible object is {@link Script.ScriptType.ScriptEngine }
         */
        public Script.ScriptType.ScriptEngine getScriptEngine() {
            return scriptEngine;
        }

        /**
         * Sets the value of the scriptEngine property.
         *
         * @param value allowed object is {@link Script.ScriptType.ScriptEngine }
         */
        public void setScriptEngine(Script.ScriptType.ScriptEngine value) {
            this.scriptEngine = value;
        }

        /**
         * <p>Java class for anonymous complex type.</p>
         *  <p>The following schema fragment specifies the expected content contained
         * within this class.<pre>&lt;complexType>  &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">      &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="language" minOccurs="0">          &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="langVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>            &lt;/simpleContent>          &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>    &lt;/restriction>  &lt;/complexContent>&lt;/complexType></pre></p>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name", "language", "version"
        })
        public static class ScriptEngine {

            /** DOCUMENT ME! */
            @XmlElement(required = true)
            protected String name;
            /** DOCUMENT ME! */
            protected Script.ScriptType.ScriptEngine.Language language;
            /** DOCUMENT ME! */
            protected String version;

            /**
             * Gets the value of the name property.
             *
             * @return possible object is {@link String }
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value allowed object is {@link String }
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the language property.
             *
             * @return possible object is {@link Script.ScriptType.ScriptEngine.Language }
             */
            public Script.ScriptType.ScriptEngine.Language getLanguage() {
                return language;
            }

            /**
             * Sets the value of the language property.
             *
             * @param value allowed object is {@link Script.ScriptType.ScriptEngine.Language }
             */
            public void setLanguage(
                    Script.ScriptType.ScriptEngine.Language value) {
                this.language = value;
            }

            /**
             * Gets the value of the version property.
             *
             * @return possible object is {@link String }
             */
            public String getVersion() {
                return version;
            }

            /**
             * Sets the value of the version property.
             *
             * @param value allowed object is {@link String }
             */
            public void setVersion(String value) {
                this.version = value;
            }

            /**
             * <p>Java class for anonymous complex type.</p>
             *  <p>The following schema fragment specifies the expected content
             * contained within this class.<pre>&lt;complexType>  &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="langVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>  &lt;/simpleContent>&lt;/complexType></pre></p>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Language {

                /** DOCUMENT ME! */
                @XmlValue
                protected String value;
                /** DOCUMENT ME! */
                @XmlAttribute
                protected String langVersion;

                /**
                 * Gets the value of the value property.
                 *
                 * @return possible object is {@link String }
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 *
                 * @param value allowed object is {@link String }
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the langVersion property.
                 *
                 * @return possible object is {@link String }
                 */
                public String getLangVersion() {
                    return langVersion;
                }

                /**
                 * Sets the value of the langVersion property.
                 *
                 * @param value allowed object is {@link String }
                 */
                public void setLangVersion(String value) {
                    this.langVersion = value;
                }
            }
        }
    }
}
