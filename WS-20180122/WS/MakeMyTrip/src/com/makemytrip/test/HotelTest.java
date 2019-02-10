package com.makemytrip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.makemytrip.bo.BookingInfo;
import com.makemytrip.bo.HotelEnquiry;
import com.makemytrip.service.HotelService;

public class HotelTest {
	public static void main(String[] args) {
		BookingInfo bookingInfo = null;
		HotelEnquiry enquiry = null;
		HotelService hotelService = null;
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/makemytrip/common/application-context.xml");
		
		enquiry = new HotelEnquiry();
		enquiry.setRoomType("Delux");
		enquiry.setDays(2);
		enquiry.setPersonName("Smith");
		enquiry.setMobileNo("93948494");
		
		hotelService = context.getBean("hotelService", HotelService.class);
		bookingInfo = hotelService.bookHotel(enquiry);
		System.out.println("booking no : " +bookingInfo.getBookingNo());
	}
}















