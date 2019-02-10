
/**
 * RailReservationServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
    package in.co.irctc.rail.services;
    /**
     *  RailReservationServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface RailReservationServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param reservationIn
             * @throws ReservationFailedFaultMessage : 
         */

        
                public in.co.irctc.rail.types.Ticket bookTicket
                (
                  in.co.irctc.rail.types.ReservationIn reservationIn
                 )
            throws ReservationFailedFaultMessage;
        
         }
    