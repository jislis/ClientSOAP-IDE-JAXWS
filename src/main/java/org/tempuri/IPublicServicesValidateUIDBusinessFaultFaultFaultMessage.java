
package org.tempuri;

import javax.xml.ws.WebFault;
import ch.admin.uid.xmlns.uid_wse_shared._2.BusinessFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "businessFault", targetNamespace = "http://www.uid.admin.ch/xmlns/uid-wse")
public class IPublicServicesValidateUIDBusinessFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BusinessFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IPublicServicesValidateUIDBusinessFaultFaultFaultMessage(String message, BusinessFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IPublicServicesValidateUIDBusinessFaultFaultFaultMessage(String message, BusinessFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ch.admin.uid.xmlns.uid_wse_shared._2.BusinessFault
     */
    public BusinessFault getFaultInfo() {
        return faultInfo;
    }

}
