
package ch.ech.xmlns.ech_0010._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour organisationMailAddressInfoType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="organisationMailAddressInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organisationName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="organisationNameAddOn1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="organisationNameAddOn2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="mrMrs" type="{http://www.ech.ch/xmlns/eCH-0010/7}mrMrsType" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationMailAddressInfoType", propOrder = {
    "organisationName",
    "organisationNameAddOn1",
    "organisationNameAddOn2",
    "mrMrs",
    "title",
    "firstName",
    "lastName"
})
public class OrganisationMailAddressInfoType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationNameAddOn1;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationNameAddOn2;
    protected String mrMrs;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String title;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lastName;

    /**
     * Obtient la valeur de la propri�t� organisationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * D�finit la valeur de la propri�t� organisationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationName(String value) {
        this.organisationName = value;
    }

    /**
     * Obtient la valeur de la propri�t� organisationNameAddOn1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationNameAddOn1() {
        return organisationNameAddOn1;
    }

    /**
     * D�finit la valeur de la propri�t� organisationNameAddOn1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationNameAddOn1(String value) {
        this.organisationNameAddOn1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� organisationNameAddOn2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationNameAddOn2() {
        return organisationNameAddOn2;
    }

    /**
     * D�finit la valeur de la propri�t� organisationNameAddOn2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationNameAddOn2(String value) {
        this.organisationNameAddOn2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� mrMrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrMrs() {
        return mrMrs;
    }

    /**
     * D�finit la valeur de la propri�t� mrMrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrMrs(String value) {
        this.mrMrs = value;
    }

    /**
     * Obtient la valeur de la propri�t� title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * D�finit la valeur de la propri�t� title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propri�t� firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * D�finit la valeur de la propri�t� firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtient la valeur de la propri�t� lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * D�finit la valeur de la propri�t� lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

}
