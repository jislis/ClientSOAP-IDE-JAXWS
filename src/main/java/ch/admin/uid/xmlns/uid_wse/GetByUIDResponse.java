
package ch.admin.uid.xmlns.uid_wse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetByUIDResult" type="{http://www.uid.admin.ch/xmlns/uid-wse}ArrayOfOrganisationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getByUIDResult"
})
@XmlRootElement(name = "GetByUIDResponse")
public class GetByUIDResponse {

    @XmlElement(name = "GetByUIDResult")
    protected ArrayOfOrganisationType getByUIDResult;

    /**
     * Obtient la valeur de la propri�t� getByUIDResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrganisationType }
     *     
     */
    public ArrayOfOrganisationType getGetByUIDResult() {
        return getByUIDResult;
    }

    /**
     * D�finit la valeur de la propri�t� getByUIDResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrganisationType }
     *     
     */
    public void setGetByUIDResult(ArrayOfOrganisationType value) {
        this.getByUIDResult = value;
    }

}
