
package org.tempuri;

import javax.xml.ws.WebFault;
import ch.admin.uid.xmlns.uid_wse_shared._2.SecurityFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "securityFault", targetNamespace = "http://www.uid.admin.ch/xmlns/uid-wse")
public class IPublicServicesGetByUIDSecurityFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SecurityFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IPublicServicesGetByUIDSecurityFaultFaultFaultMessage(String message, SecurityFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IPublicServicesGetByUIDSecurityFaultFaultFaultMessage(String message, SecurityFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ch.admin.uid.xmlns.uid_wse_shared._2.SecurityFault
     */
    public SecurityFault getFaultInfo() {
        return faultInfo;
    }

}
