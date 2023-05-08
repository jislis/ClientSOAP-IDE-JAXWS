
package ch.ech.xmlns.ech_0046._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0044._4.NamedPersonIdType;


/**
 * <p>Classe Java pour contactType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="contactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localID" type="{http://www.ech.ch/xmlns/eCH-0044/4}namedPersonIdType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.ech.ch/xmlns/eCH-0046/5}addressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.ech.ch/xmlns/eCH-0046/5}emailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.ech.ch/xmlns/eCH-0046/5}phoneType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="internet" type="{http://www.ech.ch/xmlns/eCH-0046/5}internetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactType", propOrder = {
    "localID",
    "address",
    "email",
    "phone",
    "internet"
})
public class ContactType {

    protected NamedPersonIdType localID;
    protected List<AddressType> address;
    protected List<EmailType> email;
    protected List<PhoneType> phone;
    protected List<InternetType> internet;

    /**
     * Obtient la valeur de la propri�t� localID.
     * 
     * @return
     *     possible object is
     *     {@link NamedPersonIdType }
     *     
     */
    public NamedPersonIdType getLocalID() {
        return localID;
    }

    /**
     * D�finit la valeur de la propri�t� localID.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPersonIdType }
     *     
     */
    public void setLocalID(NamedPersonIdType value) {
        this.localID = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneType }
     * 
     * 
     */
    public List<PhoneType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneType>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the internet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternetType }
     * 
     * 
     */
    public List<InternetType> getInternet() {
        if (internet == null) {
            internet = new ArrayList<InternetType>();
        }
        return this.internet;
    }

}
