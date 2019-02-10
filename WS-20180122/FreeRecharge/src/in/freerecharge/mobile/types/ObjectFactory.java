
package in.freerecharge.mobile.types;

import javax.xml.bind.annotation.XmlRegistry;
import in.freerecharge.mobile.types.ObjectFactory;
import in.freerecharge.mobile.types.PaymentMethod;
import in.freerecharge.mobile.types.Receipt;
import in.freerecharge.mobile.types.Recharge;
import in.freerecharge.mobile.types.RechargeResponse;
import in.freerecharge.mobile.types.Subscriber;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.freerecharge.mobile.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.freerecharge.mobile.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentMethod }
     * 
     */
    public PaymentMethod createPaymentMethod() {
        return new PaymentMethod();
    }

    /**
     * Create an instance of {@link Recharge }
     * 
     */
    public Recharge createRecharge() {
        return new Recharge();
    }

    /**
     * Create an instance of {@link Receipt }
     * 
     */
    public Receipt createReceipt() {
        return new Receipt();
    }

    /**
     * Create an instance of {@link Subscriber }
     * 
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link RechargeResponse }
     * 
     */
    public RechargeResponse createRechargeResponse() {
        return new RechargeResponse();
    }

}
