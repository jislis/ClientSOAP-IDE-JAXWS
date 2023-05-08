
package ch.ech.xmlns.ech_0098._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour datePartiallyKnownType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="datePartiallyKnownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *           &lt;element name="yearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/>
 *           &lt;element name="yearMonthDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datePartiallyKnownType", propOrder = {
    "year",
    "yearMonth",
    "yearMonthDay"
})
public class DatePartiallyKnownType {

    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar year;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar yearMonth;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar yearMonthDay;

    /**
     * Obtient la valeur de la propri�t� year.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * D�finit la valeur de la propri�t� year.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

    /**
     * Obtient la valeur de la propri�t� yearMonth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearMonth() {
        return yearMonth;
    }

    /**
     * D�finit la valeur de la propri�t� yearMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearMonth(XMLGregorianCalendar value) {
        this.yearMonth = value;
    }

    /**
     * Obtient la valeur de la propri�t� yearMonthDay.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearMonthDay() {
        return yearMonthDay;
    }

    /**
     * D�finit la valeur de la propri�t� yearMonthDay.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearMonthDay(XMLGregorianCalendar value) {
        this.yearMonthDay = value;
    }

}
