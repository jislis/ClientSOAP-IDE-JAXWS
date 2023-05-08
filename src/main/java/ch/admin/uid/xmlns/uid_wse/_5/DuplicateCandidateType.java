
package ch.admin.uid.xmlns.uid_wse._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0097._5.UidStructureType;


/**
 * <p>Classe Java pour duplicateCandidateType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="duplicateCandidateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uid" type="{http://www.ech.ch/xmlns/eCH-0097/5}uidStructureType" minOccurs="0"/>
 *         &lt;element name="organisationName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="organisationAdditionalName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="swissZipCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="town" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="uidregStatusEnterpriseDetail" type="{http://www.ech.ch/xmlns/eCH-0108/5}uidregStatusEnterpriseDetailType"/>
 *         &lt;element name="uidregOrganisationType" type="{http://www.ech.ch/xmlns/eCH-0108/5}uidregOrganisationTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "duplicateCandidateType", propOrder = {
    "rating",
    "uid",
    "organisationName",
    "organisationAdditionalName",
    "street",
    "swissZipCode",
    "town",
    "uidregStatusEnterpriseDetail",
    "uidregOrganisationType"
})
public class DuplicateCandidateType {

    protected int rating;
    protected UidStructureType uid;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationAdditionalName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String street;
    @XmlSchemaType(name = "unsignedInt")
    protected long swissZipCode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String town;
    @XmlElement(required = true)
    protected String uidregStatusEnterpriseDetail;
    @XmlElement(required = true)
    protected String uidregOrganisationType;

    /**
     * Obtient la valeur de la propri�t� rating.
     * 
     */
    public int getRating() {
        return rating;
    }

    /**
     * D�finit la valeur de la propri�t� rating.
     * 
     */
    public void setRating(int value) {
        this.rating = value;
    }

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
     * Obtient la valeur de la propri�t� organisationAdditionalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationAdditionalName() {
        return organisationAdditionalName;
    }

    /**
     * D�finit la valeur de la propri�t� organisationAdditionalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationAdditionalName(String value) {
        this.organisationAdditionalName = value;
    }

    /**
     * Obtient la valeur de la propri�t� street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * D�finit la valeur de la propri�t� street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Obtient la valeur de la propri�t� swissZipCode.
     * 
     */
    public long getSwissZipCode() {
        return swissZipCode;
    }

    /**
     * D�finit la valeur de la propri�t� swissZipCode.
     * 
     */
    public void setSwissZipCode(long value) {
        this.swissZipCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� town.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * D�finit la valeur de la propri�t� town.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Obtient la valeur de la propri�t� uidregStatusEnterpriseDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidregStatusEnterpriseDetail() {
        return uidregStatusEnterpriseDetail;
    }

    /**
     * D�finit la valeur de la propri�t� uidregStatusEnterpriseDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidregStatusEnterpriseDetail(String value) {
        this.uidregStatusEnterpriseDetail = value;
    }

    /**
     * Obtient la valeur de la propri�t� uidregOrganisationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidregOrganisationType() {
        return uidregOrganisationType;
    }

    /**
     * D�finit la valeur de la propri�t� uidregOrganisationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidregOrganisationType(String value) {
        this.uidregOrganisationType = value;
    }

}
