
package bank_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerBirthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerSortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newCustomerCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editCustomer", propOrder = {
    "originalAccountNumber",
    "newCustomerAccountNumber",
    "newCustomerName",
    "newCustomerBirthday",
    "newCustomerAddress",
    "newCustomerMobile",
    "newCustomerEmail",
    "newCustomerAccountType",
    "newCustomerSortCode",
    "newCustomerBalance",
    "newCustomerCardNumber"
})
public class EditCustomer {

    protected String originalAccountNumber;
    protected String newCustomerAccountNumber;
    protected String newCustomerName;
    protected String newCustomerBirthday;
    protected String newCustomerAddress;
    protected String newCustomerMobile;
    protected String newCustomerEmail;
    protected String newCustomerAccountType;
    protected String newCustomerSortCode;
    protected String newCustomerBalance;
    protected String newCustomerCardNumber;

    /**
     * Gets the value of the originalAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAccountNumber() {
        return originalAccountNumber;
    }

    /**
     * Sets the value of the originalAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAccountNumber(String value) {
        this.originalAccountNumber = value;
    }

    /**
     * Gets the value of the newCustomerAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerAccountNumber() {
        return newCustomerAccountNumber;
    }

    /**
     * Sets the value of the newCustomerAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerAccountNumber(String value) {
        this.newCustomerAccountNumber = value;
    }

    /**
     * Gets the value of the newCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerName() {
        return newCustomerName;
    }

    /**
     * Sets the value of the newCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerName(String value) {
        this.newCustomerName = value;
    }

    /**
     * Gets the value of the newCustomerBirthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerBirthday() {
        return newCustomerBirthday;
    }

    /**
     * Sets the value of the newCustomerBirthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerBirthday(String value) {
        this.newCustomerBirthday = value;
    }

    /**
     * Gets the value of the newCustomerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerAddress() {
        return newCustomerAddress;
    }

    /**
     * Sets the value of the newCustomerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerAddress(String value) {
        this.newCustomerAddress = value;
    }

    /**
     * Gets the value of the newCustomerMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerMobile() {
        return newCustomerMobile;
    }

    /**
     * Sets the value of the newCustomerMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerMobile(String value) {
        this.newCustomerMobile = value;
    }

    /**
     * Gets the value of the newCustomerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerEmail() {
        return newCustomerEmail;
    }

    /**
     * Sets the value of the newCustomerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerEmail(String value) {
        this.newCustomerEmail = value;
    }

    /**
     * Gets the value of the newCustomerAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerAccountType() {
        return newCustomerAccountType;
    }

    /**
     * Sets the value of the newCustomerAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerAccountType(String value) {
        this.newCustomerAccountType = value;
    }

    /**
     * Gets the value of the newCustomerSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerSortCode() {
        return newCustomerSortCode;
    }

    /**
     * Sets the value of the newCustomerSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerSortCode(String value) {
        this.newCustomerSortCode = value;
    }

    /**
     * Gets the value of the newCustomerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerBalance() {
        return newCustomerBalance;
    }

    /**
     * Sets the value of the newCustomerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerBalance(String value) {
        this.newCustomerBalance = value;
    }

    /**
     * Gets the value of the newCustomerCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCustomerCardNumber() {
        return newCustomerCardNumber;
    }

    /**
     * Sets the value of the newCustomerCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCustomerCardNumber(String value) {
        this.newCustomerCardNumber = value;
    }

}
