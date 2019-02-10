package in.freerecharge.mobile.types;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import in.freerecharge.mobile.types.Receipt;
import in.freerecharge.mobile.types.RechargeResponse;

/**
 * <p>
 * Java class for rechargeResponse element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name="rechargeResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://freerecharge.in/mobile/types}receipt"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "", propOrder = { "receipt" })
@XmlRootElement(name = "rechargeResponse")
public class RechargeResponse {

	@XmlElement(namespace = "http://freerecharge.in/mobile/types")
	protected Receipt receipt;

	/**
	 * Gets the value of the receipt property.
	 * 
	 * @return possible object is {@link Receipt }
	 * 
	 */
	public Receipt getReceipt() {
		return receipt;
	}

	/**
	 * Sets the value of the receipt property.
	 * 
	 * @param value
	 *            allowed object is {@link Receipt }
	 * 
	 */
	public void setReceipt(Receipt value) {
		this.receipt = value;
	}

}
