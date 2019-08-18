
package bank_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newEmployeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newEmployeePosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newEmployeeUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newEmployeePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerEmployee", propOrder = {
    "newEmployeeName",
    "newEmployeePosition",
    "newEmployeeUsername",
    "newEmployeePassword"
})
public class RegisterEmployee {

    protected String newEmployeeName;
    protected String newEmployeePosition;
    protected String newEmployeeUsername;
    protected String newEmployeePassword;

    /**
     * Gets the value of the newEmployeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmployeeName() {
        return newEmployeeName;
    }

    /**
     * Sets the value of the newEmployeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmployeeName(String value) {
        this.newEmployeeName = value;
    }

    /**
     * Gets the value of the newEmployeePosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmployeePosition() {
        return newEmployeePosition;
    }

    /**
     * Sets the value of the newEmployeePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmployeePosition(String value) {
        this.newEmployeePosition = value;
    }

    /**
     * Gets the value of the newEmployeeUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmployeeUsername() {
        return newEmployeeUsername;
    }

    /**
     * Sets the value of the newEmployeeUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmployeeUsername(String value) {
        this.newEmployeeUsername = value;
    }

    /**
     * Gets the value of the newEmployeePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmployeePassword() {
        return newEmployeePassword;
    }

    /**
     * Sets the value of the newEmployeePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmployeePassword(String value) {
        this.newEmployeePassword = value;
    }

}
