
package org.lic.insurance.service.jaxws;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.lic.insurance.service.jaxws.Enroll;

@XmlRootElement(name = "enroll", namespace = "http://lic.org/insurance/service")
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "enroll", namespace = "http://lic.org/insurance/service", propOrder = {
    "memberInfo",
    "policyInfo"
})
public class Enroll {

    @XmlElement(name = "memberInfo", namespace = "http://lic.org/insurance/types")
    private org.lic.insurance.types.MemberInfo memberInfo;
    @XmlElement(name = "policyInfo", namespace = "http://lic.org/insurance/types")
    private org.lic.insurance.types.PolicyInfo policyInfo;

    /**
     * 
     * @return
     *     returns MemberInfo
     */
    public org.lic.insurance.types.MemberInfo getMemberInfo() {
        return this.memberInfo;
    }

    /**
     * 
     * @param memberInfo
     *     the value for the memberInfo property
     */
    public void setMemberInfo(org.lic.insurance.types.MemberInfo memberInfo) {
        this.memberInfo = memberInfo;
    }

    /**
     * 
     * @return
     *     returns PolicyInfo
     */
    public org.lic.insurance.types.PolicyInfo getPolicyInfo() {
        return this.policyInfo;
    }

    /**
     * 
     * @param policyInfo
     *     the value for the policyInfo property
     */
    public void setPolicyInfo(org.lic.insurance.types.PolicyInfo policyInfo) {
        this.policyInfo = policyInfo;
    }

}
