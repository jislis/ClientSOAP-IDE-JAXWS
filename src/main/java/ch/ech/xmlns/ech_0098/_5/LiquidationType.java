
package ch.ech.xmlns.ech_0098._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour liquidationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="liquidationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="liquidationDate" type="{http://www.ech.ch/xmlns/eCH-0098/5}datePartiallyKnownType" minOccurs="0"/>
 *         &lt;element name="liquidationStartDate" type="{http://www.ech.ch/xmlns/eCH-0098/5}datePartiallyKnownType" minOccurs="0"/>
 *         &lt;element name="liquidationReason" type="{http://www.ech.ch/xmlns/eCH-0098/5}liquidationReasonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "liquidationType", propOrder = {
    "liquidationDate",
    "liquidationStartDate",
    "liquidationReason"
})
public class LiquidationType {

    protected DatePartiallyKnownType liquidationDate;
    protected DatePartiallyKnownType liquidationStartDate;
    protected String liquidationReason;

    /**
     * Obtient la valeur de la propri�t� liquidationDate.
     * 
     * @return
     *     possible object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public DatePartiallyKnownType getLiquidationDate() {
        return liquidationDate;
    }

    /**
     * D�finit la valeur de la propri�t� liquidationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public void setLiquidationDate(DatePartiallyKnownType value) {
        this.liquidationDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� liquidationStartDate.
     * 
     * @return
     *     possible object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public DatePartiallyKnownType getLiquidationStartDate() {
        return liquidationStartDate;
    }

    /**
     * D�finit la valeur de la propri�t� liquidationStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public void setLiquidationStartDate(DatePartiallyKnownType value) {
        this.liquidationStartDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� liquidationReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidationReason() {
        return liquidationReason;
    }

    /**
     * D�finit la valeur de la propri�t� liquidationReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidationReason(String value) {
        this.liquidationReason = value;
    }

}
