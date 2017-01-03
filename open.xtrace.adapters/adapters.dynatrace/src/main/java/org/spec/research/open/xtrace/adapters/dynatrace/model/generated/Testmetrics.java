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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="testmetric" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}testrun" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="testname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="violatedabove" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="violatedbelow" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="violationpercent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="package" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="failed" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="volatility" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="assignees" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="prevstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="lastrun" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="measure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="low" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="high" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="last" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="validruns" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="agent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="metricgroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="shorttestname" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "testmetric"
})
@XmlRootElement(name = "testmetrics")
public class Testmetrics {

    protected List<Testmetrics.Testmetric> testmetric;

    /**
     * Gets the value of the testmetric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testmetric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestmetric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Testmetrics.Testmetric }
     * 
     * 
     */
    public List<Testmetrics.Testmetric> getTestmetric() {
        if (testmetric == null) {
            testmetric = new ArrayList<Testmetrics.Testmetric>();
        }
        return this.testmetric;
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
     *         &lt;element ref="{}testrun" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="testname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="violatedabove" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="violatedbelow" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="violationpercent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="package" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="failed" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="volatility" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="assignees" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="prevstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="lastrun" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="platform" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="measure" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="low" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="high" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="last" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="validruns" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="agent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="metricgroup" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="shorttestname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "testrun"
    })
    public static class Testmetric {

        protected List<Testrun> testrun;
        @XmlAttribute(name = "testname")
        protected String testname;
        @XmlAttribute(name = "violatedabove")
        protected BigInteger violatedabove;
        @XmlAttribute(name = "violatedbelow")
        protected BigInteger violatedbelow;
        @XmlAttribute(name = "violationpercent")
        protected String violationpercent;
        @XmlAttribute(name = "package")
        protected String _package;
        @XmlAttribute(name = "failed")
        protected BigInteger failed;
        @XmlAttribute(name = "volatility")
        protected String volatility;
        @XmlAttribute(name = "assignees")
        protected String assignees;
        @XmlAttribute(name = "status")
        protected String status;
        @XmlAttribute(name = "prevstatus")
        protected String prevstatus;
        @XmlAttribute(name = "lastrun")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastrun;
        @XmlAttribute(name = "platform")
        protected String platform;
        @XmlAttribute(name = "measure")
        protected String measure;
        @XmlAttribute(name = "low")
        protected Double low;
        @XmlAttribute(name = "high")
        protected Double high;
        @XmlAttribute(name = "last")
        protected Double last;
        @XmlAttribute(name = "unit")
        protected String unit;
        @XmlAttribute(name = "host")
        protected String host;
        @XmlAttribute(name = "validruns")
        protected BigInteger validruns;
        @XmlAttribute(name = "color")
        protected String color;
        @XmlAttribute(name = "agent")
        protected String agent;
        @XmlAttribute(name = "collector")
        protected String collector;
        @XmlAttribute(name = "metricgroup")
        protected String metricgroup;
        @XmlAttribute(name = "shorttestname")
        protected String shorttestname;

        /**
         * Gets the value of the testrun property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the testrun property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTestrun().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Testrun }
         * 
         * 
         */
        public List<Testrun> getTestrun() {
            if (testrun == null) {
                testrun = new ArrayList<Testrun>();
            }
            return this.testrun;
        }

        /**
         * Gets the value of the testname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTestname() {
            return testname;
        }

        /**
         * Sets the value of the testname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTestname(String value) {
            this.testname = value;
        }

        /**
         * Gets the value of the violatedabove property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getViolatedabove() {
            return violatedabove;
        }

        /**
         * Sets the value of the violatedabove property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setViolatedabove(BigInteger value) {
            this.violatedabove = value;
        }

        /**
         * Gets the value of the violatedbelow property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getViolatedbelow() {
            return violatedbelow;
        }

        /**
         * Sets the value of the violatedbelow property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setViolatedbelow(BigInteger value) {
            this.violatedbelow = value;
        }

        /**
         * Gets the value of the violationpercent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getViolationpercent() {
            return violationpercent;
        }

        /**
         * Sets the value of the violationpercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setViolationpercent(String value) {
            this.violationpercent = value;
        }

        /**
         * Gets the value of the package property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackage() {
            return _package;
        }

        /**
         * Sets the value of the package property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackage(String value) {
            this._package = value;
        }

        /**
         * Gets the value of the failed property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFailed() {
            return failed;
        }

        /**
         * Sets the value of the failed property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFailed(BigInteger value) {
            this.failed = value;
        }

        /**
         * Gets the value of the volatility property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVolatility() {
            return volatility;
        }

        /**
         * Sets the value of the volatility property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVolatility(String value) {
            this.volatility = value;
        }

        /**
         * Gets the value of the assignees property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignees() {
            return assignees;
        }

        /**
         * Sets the value of the assignees property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignees(String value) {
            this.assignees = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the prevstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrevstatus() {
            return prevstatus;
        }

        /**
         * Sets the value of the prevstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrevstatus(String value) {
            this.prevstatus = value;
        }

        /**
         * Gets the value of the lastrun property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastrun() {
            return lastrun;
        }

        /**
         * Sets the value of the lastrun property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastrun(XMLGregorianCalendar value) {
            this.lastrun = value;
        }

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
         * Gets the value of the measure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeasure() {
            return measure;
        }

        /**
         * Sets the value of the measure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeasure(String value) {
            this.measure = value;
        }

        /**
         * Gets the value of the low property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getLow() {
            return low;
        }

        /**
         * Sets the value of the low property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLow(Double value) {
            this.low = value;
        }

        /**
         * Gets the value of the high property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getHigh() {
            return high;
        }

        /**
         * Sets the value of the high property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setHigh(Double value) {
            this.high = value;
        }

        /**
         * Gets the value of the last property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getLast() {
            return last;
        }

        /**
         * Sets the value of the last property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLast(Double value) {
            this.last = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

        /**
         * Gets the value of the host property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHost() {
            return host;
        }

        /**
         * Sets the value of the host property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHost(String value) {
            this.host = value;
        }

        /**
         * Gets the value of the validruns property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValidruns() {
            return validruns;
        }

        /**
         * Sets the value of the validruns property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValidruns(BigInteger value) {
            this.validruns = value;
        }

        /**
         * Gets the value of the color property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColor() {
            return color;
        }

        /**
         * Sets the value of the color property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColor(String value) {
            this.color = value;
        }

        /**
         * Gets the value of the agent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgent() {
            return agent;
        }

        /**
         * Sets the value of the agent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgent(String value) {
            this.agent = value;
        }

        /**
         * Gets the value of the collector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCollector() {
            return collector;
        }

        /**
         * Sets the value of the collector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCollector(String value) {
            this.collector = value;
        }

        /**
         * Gets the value of the metricgroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetricgroup() {
            return metricgroup;
        }

        /**
         * Sets the value of the metricgroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetricgroup(String value) {
            this.metricgroup = value;
        }

        /**
         * Gets the value of the shorttestname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShorttestname() {
            return shorttestname;
        }

        /**
         * Sets the value of the shorttestname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShorttestname(String value) {
            this.shorttestname = value;
        }

    }

}