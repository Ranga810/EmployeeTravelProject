package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.BookingDetails;

@Repository
public class BookingRepository implements BookingRepositoryInterface {
	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	    
	    private final  static String INSERT_NEW_BOOKING="insert into booking_details values(booking_id.nextVal,?,?,?,?,?,?,?,?,?,?)";
	    
	    private final static String UPDATE_EXISTING_BOOKING="update booking_details set travel_request_id=?, onboarding_date=? ,onboarding_place=? ,destination=? ,destination_date=?, hotel_name=?, hotel_address=? ,check_in_time=? ,check_out_time=?, contact_number=? where booking_id=?";
	    
	    
	    
	    private final static String SELECT_ALL_BOOKING="select B.booking_id,B.travel_request_id,B.onboarding_date,B.onboarding_place,B.destination,B.destination_date,B.hotel_name,B.hotel_address,B.check_in_time,B.check_out_time,B.contact_Number from booking_details B,travel_request TR WHERE B.travel_request_id = TR.travel_request_id";
	            
	    
	    private final static String SELECT_ONE_BOOKING="select * from booking_details where booking_id=?";

	    private final static String DELETE_EXISTING_BOOKING="delete from booking_details where booking_id =?";
	    

	@Override
	public boolean deletebooking(int bookingId) {
		 jdbcTemplate.update(DELETE_EXISTING_BOOKING,bookingId);
         return true;
	}

	@Override
	public BookingDetails getbookingBybookingId(int bookingId) {
		 BookingRowMapper bookingRowMapper = new BookingRowMapper();
	        BookingDetails bookingDetails =jdbcTemplate.queryForObject(SELECT_ONE_BOOKING, bookingRowMapper,bookingId);
	        return bookingDetails;   
	}

	@Override
	public List<BookingDetails> getallbookings() {
		BookingRowMapper bookingRowMapper = new BookingRowMapper();
        return jdbcTemplate.query(SELECT_ALL_BOOKING,bookingRowMapper);
	}

	@Override
	public boolean addnewbooking(BookingDetails bookingDetails) {
		 Object[] parameters = { bookingDetails.getRequestTravelId(),bookingDetails.getOnboardingDate(),bookingDetails.getOnboardingPlace(),bookingDetails.getDestination(),bookingDetails.getDestinationDate(),bookingDetails.getHotelName(),bookingDetails.getHotelAddress(),bookingDetails.getCheckInTime(),bookingDetails.getCheckOutTime(),bookingDetails.getContactNumber() };
	        

	        jdbcTemplate.update(INSERT_NEW_BOOKING, parameters);
	        return true;
	        
	}

	@Override
	public BookingDetails updatebooking(BookingDetails bookingDetails) {
		 Object [] parameters = {bookingDetails.getBookingId(),bookingDetails.getRequestTravelId(), bookingDetails.getDestination(), bookingDetails.getDestinationDate(), bookingDetails.getHotelAddress(), bookingDetails.getHotelName(), bookingDetails.getCheckInTime(), bookingDetails.getCheckOutTime(), bookingDetails.getContactNumber(), bookingDetails.getOnboardingDate(), bookingDetails.getOnboardingPlace() };
	        
	        int rowcount = jdbcTemplate.update(UPDATE_EXISTING_BOOKING, parameters);
	        if(rowcount >0){
	            return getbookingBybookingId(bookingDetails.getBookingId());
	        }
	        return null;
	    
	    }
}
