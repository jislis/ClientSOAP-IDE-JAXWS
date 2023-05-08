
package ch.admin.uid.xmlns.uid_wse._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour commercialRegisterInformationSearchType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commercialRegisterInformationSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commercialRegisterStatus" type="{http://www.ech.ch/xmlns/eCH-0108/5}commercialRegisterStatusType" minOccurs="0"/>
 *         &lt;element name="commercialRegisterEntryStatus" type="{http://www.ech.ch/xmlns/eCH-0108/5}commercialRegisterEntryStatusType" minOccurs="0"/>
 *         &lt;element name="commercialRegisterEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="commercialRegisterLiquidationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="commercialRegisterEnterpriseType" type="{http://www.ech.ch/xmlns/eCH-0108/5}commercialRegisterEnterpriseTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commercialRegisterInformationSearchType", propOrder = {
    "commercialRegisterStatus",
    "commercialRegisterEntryStatus",
    "commercialRegisterEntryDate",
    "commercialRegisterLiquidationDate",
    "commercialRegisterEnterpriseType"
})
public class CommercialRegisterInformationSearchType {

    protected String commercialRegisterStatus;
    protected String commercialRegisterEntryStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commercialRegisterEntryDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commercialRegisterLiquidationDate;
    protected String commercialRegisterEnterpriseType;

    /**
     * Obtient la valeur de la propri�t� commercialRegisterStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegisterStatus() {
        return commercialRegisterStatus;
    }

    /**
     * D�finit la valeur de la propri�t� commercialRegisterStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegisterStatus(String value) {
        this.commercialRegisterStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� commercialRegisterEntryStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegisterEntryStatus() {
        return commercialRegisterEntryStatus;
    }

    /**
     * D�finit la valeur de la propri�t� commercialRegisterEntryStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegisterEntryStatus(String value) {
        this.commercialRegisterEntryStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� commercialRegisterEntryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommercialRegisterEntryDate() {
        return commercialRegisterEntryDate;
    }

    /**
     * D�finit la valeur de la propri�t� commercialRegisterEntryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommercialRegisterEntryDate(XMLGregorianCalendar value) {
        this.commercialRegisterEntryDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� commercialRegisterLiquidationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommercialRegisterLiquidationDate() {
        return commercialRegisterLiquidationDate;
    }

    /**
     * D�finit la valeur de la propri�t� commercialRegisterLiquidationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommercialRegisterLiquidationDate(XMLGregorianCalendar value) {
        this.commercialRegisterLiquidationDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� commercialRegisterEnterpriseType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegisterEnterpriseType() {
        return commercialRegisterEnterpriseType;
    }

    /**
     * D�finit la valeur de la propri�t� commercialRegisterEnterpriseType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegisterEnterpriseType(String value) {
        this.commercialRegisterEnterpriseType = value;
    }

}
