
package in.co.irctc.rail.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.co.irctc.rail.types package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.co.irctc.rail.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReservationIn }
     * 
     */
    public ReservationIn createReservationIn() {
        return new ReservationIn();
    }

    /**
     * Create an instance of {@link ReservationFailedFault }
     * 
     */
    public ReservationFailedFault createReservationFailedFault() {
        return new ReservationFailedFault();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

}
