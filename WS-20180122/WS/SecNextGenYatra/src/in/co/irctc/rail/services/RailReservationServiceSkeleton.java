
/**
 * RailReservationServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package in.co.irctc.rail.services;

import in.co.irctc.rail.types.Ticket;

/**
 * RailReservationServiceSkeleton java skeleton for the axisService
 */
public class RailReservationServiceSkeleton implements RailReservationServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param reservationIn0
	 * @return ticket1
	 * @throws ReservationFailedFaultMessage
	 */

	public in.co.irctc.rail.types.Ticket bookTicket(in.co.irctc.rail.types.ReservationIn reservationIn0)
			throws ReservationFailedFaultMessage {
		Ticket ticket = new Ticket();
		ticket.setPnrNo("pnr9394");
		ticket.setStatus("Confirmed");
		return ticket;
	}

}
