
package org.lic.insurance.service.jaxws;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.lic.insurance.service.jaxws.EnrollResponse;

@XmlRootElement(name = "enrollResponse", namespace = "http://lic.org/insurance/service")
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "enrollResponse", namespace = "http://lic.org/insurance/service")
public class EnrollResponse {

    @XmlElement(name = "memberCard", namespace = "http://lic.org/insurance/types")
    private org.lic.insurance.types.MemberCard _return;

    /**
     * 
     * @return
     *     returns MemberCard
     */
    public org.lic.insurance.types.MemberCard get_return() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void set_return(org.lic.insurance.types.MemberCard _return) {
        this._return = _return;
    }

}
