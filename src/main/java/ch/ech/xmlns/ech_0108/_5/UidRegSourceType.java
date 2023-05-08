
package ch.ech.xmlns.ech_0108._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0097._5.UidStructureType;


/**
 * <p>Classe Java pour uidRegSourceType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="uidRegSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.ech.ch/xmlns/eCH-0097/5}uidStructureType" minOccurs="0"/>
 *         &lt;element name="relationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Responsible"/>
 *               &lt;enumeration value="Registered"/>
 *               &lt;enumeration value="Subscribed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="registrationStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Active"/>
 *               &lt;enumeration value="WaitingForSuccessor"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "uidRegSourceType", propOrder = {
    "uid",
    "relationType",
    "registrationDate",
    "registrationStatus"
})
public class UidRegSourceType {

    protected UidStructureType uid;
    @XmlElement(required = true)
    protected String relationType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(required = true)
    protected String registrationStatus;

    /**
     * Obtient la valeur de la propri�t� uid.
     * 
     * @return
     *     possible object is
     *     {@link UidStructureType }
     *     
     */
    public UidStructureType getUid() {
        return uid;
    }

    /**
     * D�finit la valeur de la propri�t� uid.
     * 
     * @param value
     *     allowed object is
     *     {@link UidStructureType }
     *     
     */
    public void setUid(UidStructureType value) {
        this.uid = value;
    }

    /**
     * Obtient la valeur de la propri�t� relationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType() {
        return relationType;
    }

    /**
     * D�finit la valeur de la propri�t� relationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType(String value) {
        this.relationType = value;
    }

    /**
     * Obtient la valeur de la propri�t� registrationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * D�finit la valeur de la propri�t� registrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� registrationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * D�finit la valeur de la propri�t� registrationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationStatus(String value) {
        this.registrationStatus = value;
    }

}
