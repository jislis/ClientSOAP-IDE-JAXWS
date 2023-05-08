
package ch.ech.xmlns.ech_0098._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour foundationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="foundationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foundationDate" type="{http://www.ech.ch/xmlns/eCH-0098/5}datePartiallyKnownType" minOccurs="0"/>
 *         &lt;element name="foundationReason" type="{http://www.ech.ch/xmlns/eCH-0098/5}foundationReasonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foundationType", propOrder = {
    "foundationDate",
    "foundationReason"
})
public class FoundationType {

    protected DatePartiallyKnownType foundationDate;
    protected String foundationReason;

    /**
     * Obtient la valeur de la propri�t� foundationDate.
     * 
     * @return
     *     possible object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public DatePartiallyKnownType getFoundationDate() {
        return foundationDate;
    }

    /**
     * D�finit la valeur de la propri�t� foundationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public void setFoundationDate(DatePartiallyKnownType value) {
        this.foundationDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� foundationReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationReason() {
        return foundationReason;
    }

    /**
     * D�finit la valeur de la propri�t� foundationReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationReason(String value) {
        this.foundationReason = value;
    }

}
