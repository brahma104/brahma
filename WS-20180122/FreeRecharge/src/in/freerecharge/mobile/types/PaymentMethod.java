package in.freerecharge.mobile.types;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import in.freerecharge.mobile.types.PaymentMethod;

/**
 * <p>
 * Java class for paymentMethod element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name="paymentMethod">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "", propOrder = { "paymentType", "paymentDate", "amount" })
@XmlRootElement(name = "paymentMethod")
public class PaymentMethod {

	protected String paymentType;
	protected XMLGregorianCalendar paymentDate;
	@XmlElement(type = Float.class)
	protected float amount;

	/**
	 * Gets the value of the paymentType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * Sets the value of the paymentType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentType(String value) {
		this.paymentType = value;
	}

	/**
	 * Gets the value of the paymentDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getPaymentDate() {
		return paymentDate;
	}

	/**
	 * Sets the value of the paymentDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setPaymentDate(XMLGregorianCalendar value) {
		this.paymentDate = value;
	}

	/**
	 * Gets the value of the amount property.
	 * 
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the amount property.
	 * 
	 */
	public void setAmount(float value) {
		this.amount = value;
	}

}
