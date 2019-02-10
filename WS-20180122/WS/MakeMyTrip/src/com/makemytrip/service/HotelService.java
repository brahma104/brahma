package com.makemytrip.service;

import com.makemytrip.bo.BookingInfo;
import com.makemytrip.bo.HotelEnquiry;
import com.oyo.reservation.services.Oyo;
import com.oyo.reservation.types.Checkin;
import com.oyo.reservation.types.Reservation;

public class HotelService {
	private Oyo oyo;

	public BookingInfo bookHotel(HotelEnquiry enquiry) {
		Checkin checkIn = null;
		Reservation reservation = null;
		BookingInfo bookingInfo = null;

		checkIn = new Checkin();
		checkIn.setRoomType(enquiry.getRoomType());
		// checkIn.setCheckInDate(enquiry.getCheckInDate());
		checkIn.setDays(enquiry.getDays());
		checkIn.setPersonName(enquiry.getPersonName());
		checkIn.setMobileNo(enquiry.getMobileNo());

		reservation = oyo.bookRoom(checkIn);
		bookingInfo = new BookingInfo();
		bookingInfo.setBookingNo(reservation.getBookingNo());
		bookingInfo.setStatus(reservation.getStatus());

		return bookingInfo;
	}

	public void setOyo(Oyo oyo) {
		this.oyo = oyo;
	}

}
