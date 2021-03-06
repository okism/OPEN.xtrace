//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.13 at 11:58:26 AM CET 
//


package org.spec.research.open.xtrace.adapters.dynatrace.model.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{}sourceType" minOccurs="0"/>
 *         &lt;element name="comparesource" type="{}sourceType" minOccurs="0"/>
 *         &lt;element name="suspensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="suspension" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="time_sum" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="time_avg" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="time_max" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="time_min" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="displaysource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "source",
    "comparesource",
    "suspensions"
})
@XmlRootElement(name = "runtimesuspensionsdashlet")
public class Runtimesuspensionsdashlet {

    protected SourceType source;
    protected SourceType comparesource;
    protected Runtimesuspensionsdashlet.Suspensions suspensions;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "displaysource", required = true)
    protected String displaysource;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the comparesource property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getComparesource() {
        return comparesource;
    }

    /**
     * Sets the value of the comparesource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setComparesource(SourceType value) {
        this.comparesource = value;
    }

    /**
     * Gets the value of the suspensions property.
     * 
     * @return
     *     possible object is
     *     {@link Runtimesuspensionsdashlet.Suspensions }
     *     
     */
    public Runtimesuspensionsdashlet.Suspensions getSuspensions() {
        return suspensions;
    }

    /**
     * Sets the value of the suspensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Runtimesuspensionsdashlet.Suspensions }
     *     
     */
    public void setSuspensions(Runtimesuspensionsdashlet.Suspensions value) {
        this.suspensions = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the displaysource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaysource() {
        return displaysource;
    }

    /**
     * Sets the value of the displaysource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaysource(String value) {
        this.displaysource = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="suspension" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="method" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="time_sum" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="time_avg" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="time_max" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="time_min" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "suspension"
    })
    public static class Suspensions {

        protected List<Runtimesuspensionsdashlet.Suspensions.Suspension> suspension;

        /**
         * Gets the value of the suspension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suspension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuspension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Runtimesuspensionsdashlet.Suspensions.Suspension }
         * 
         * 
         */
        public List<Runtimesuspensionsdashlet.Suspensions.Suspension> getSuspension() {
            if (suspension == null) {
                suspension = new ArrayList<Runtimesuspensionsdashlet.Suspensions.Suspension>();
            }
            return this.suspension;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="method" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="time_sum" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="time_avg" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="time_max" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="time_min" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Suspension {

            @XmlAttribute(name = "platform")
            protected String platform;
            @XmlAttribute(name = "method")
            protected String method;
            @XmlAttribute(name = "class")
            protected String clazz;
            @XmlAttribute(name = "count")
            protected BigInteger count;
            @XmlAttribute(name = "time_sum")
            protected Double timeSum;
            @XmlAttribute(name = "time_avg")
            protected Double timeAvg;
            @XmlAttribute(name = "time_max")
            protected Double timeMax;
            @XmlAttribute(name = "time_min")
            protected Double timeMin;
            @XmlAttribute(name = "reason")
            protected String reason;

            /**
             * Gets the value of the platform property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlatform() {
                return platform;
            }

            /**
             * Sets the value of the platform property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlatform(String value) {
                this.platform = value;
            }

            /**
             * Gets the value of the method property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMethod() {
                return method;
            }

            /**
             * Sets the value of the method property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMethod(String value) {
                this.method = value;
            }

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
            }

            /**
             * Gets the value of the count property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCount() {
                return count;
            }

            /**
             * Sets the value of the count property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCount(BigInteger value) {
                this.count = value;
            }

            /**
             * Gets the value of the timeSum property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTimeSum() {
                return timeSum;
            }

            /**
             * Sets the value of the timeSum property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTimeSum(Double value) {
                this.timeSum = value;
            }

            /**
             * Gets the value of the timeAvg property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTimeAvg() {
                return timeAvg;
            }

            /**
             * Sets the value of the timeAvg property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTimeAvg(Double value) {
                this.timeAvg = value;
            }

            /**
             * Gets the value of the timeMax property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTimeMax() {
                return timeMax;
            }

            /**
             * Sets the value of the timeMax property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTimeMax(Double value) {
                this.timeMax = value;
            }

            /**
             * Gets the value of the timeMin property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTimeMin() {
                return timeMin;
            }

            /**
             * Sets the value of the timeMin property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTimeMin(Double value) {
                this.timeMin = value;
            }

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
            }

        }

    }

}
