
/**
 * ReservationFailedFaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package in.co.irctc.rail.services;

public class ReservationFailedFaultMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1531020139441L;
    
    private in.co.irctc.rail.types.ReservationFailedFault faultMessage;

    
        public ReservationFailedFaultMessage() {
            super("ReservationFailedFaultMessage");
        }

        public ReservationFailedFaultMessage(java.lang.String s) {
           super(s);
        }

        public ReservationFailedFaultMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ReservationFailedFaultMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(in.co.irctc.rail.types.ReservationFailedFault msg){
       faultMessage = msg;
    }
    
    public in.co.irctc.rail.types.ReservationFailedFault getFaultMessage(){
       return faultMessage;
    }
}
    