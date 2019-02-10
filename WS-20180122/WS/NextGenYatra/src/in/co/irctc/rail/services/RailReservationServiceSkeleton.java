
/**
 * RailReservationServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package in.co.irctc.rail.services;

import java.util.UUID;

import in.co.irctc.rail.types.ReservationFailedFault;
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

	public in.co.irctc.rail.types.Ticket bookTicket(in.co.irctc.rail.types.ReservationIn reservationIn)
			throws ReservationFailedFaultMessage {
		Ticket ticket = null;
		ReservationFailedFaultMessage faultMessage = null;
		if (reservationIn.getSource().equals("hyderabad")) {
			faultMessage = new ReservationFailedFaultMessage();
			ReservationFailedFault fault = new ReservationFailedFault();
			fault.setErrorCode("NG001");
			fault.setErrorMessage("No trains available from that source");
			fault.setErrorType("Bussiness Fault");
			faultMessage.setFaultMessage(fault);
			throw faultMessage;
		}
		ticket = new Ticket();
		ticket.setPnrNo(UUID.randomUUID().toString());
		ticket.setStatus("Confirmed");
		return ticket;
	}

}
