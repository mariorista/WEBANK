
package betaservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acc_from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acc_to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transfer", propOrder = {
    "pass",
    "usr",
    "accFrom",
    "accTo",
    "amount"
})
public class Transfer {

    protected String pass;
    protected String usr;
    @XmlElement(name = "acc_from")
    protected String accFrom;
    @XmlElement(name = "acc_to")
    protected String accTo;
    protected double amount;

    /**
     * Gets the value of the pass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPass() {
        return pass;
    }

    /**
     * Sets the value of the pass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPass(String value) {
        this.pass = value;
    }

    /**
     * Gets the value of the usr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsr() {
        return usr;
    }

    /**
     * Sets the value of the usr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsr(String value) {
        this.usr = value;
    }

    /**
     * Gets the value of the accFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccFrom() {
        return accFrom;
    }

    /**
     * Sets the value of the accFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccFrom(String value) {
        this.accFrom = value;
    }

    /**
     * Gets the value of the accTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccTo() {
        return accTo;
    }

    /**
     * Sets the value of the accTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccTo(String value) {
        this.accTo = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

}
