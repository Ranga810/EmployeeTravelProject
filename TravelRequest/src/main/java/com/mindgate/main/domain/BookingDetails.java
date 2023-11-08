package com.mindgate.main.domain;

public class BookingDetails {
	
private int bookingId;
private int requestTravelId; 
private String onboardingDate;
private String onboardingPlace;
private String destination;
private String destinationDate;
private String hotelName;
private String hotelAddress;
private String checkInTime;
private String checkOutTime;
private long contactNumber;

public BookingDetails() {
	// TODO Auto-generated constructor stub
}

public BookingDetails(int bookingId, int requestTravelId, String onboardingDate, String onboardingPlace,
		String destination, String destinationDate, String hotelName, String hotelAddress, String checkInTime,
		String checkOutTime, long contactNumber) {
	super();
	this.bookingId = bookingId;
	this.requestTravelId = requestTravelId;
	this.onboardingDate = onboardingDate;
	this.onboardingPlace = onboardingPlace;
	this.destination = destination;
	this.destinationDate = destinationDate;
	this.hotelName = hotelName;
	this.hotelAddress = hotelAddress;
	this.checkInTime = checkInTime;
	this.checkOutTime = checkOutTime;
	this.contactNumber = contactNumber;
}

public int getBookingId() {
	return bookingId;
}

public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}

public int getRequestTravelId() {
	return requestTravelId;
}

public void setRequestTravelId(int requestTravelId) {
	this.requestTravelId = requestTravelId;
}

public String getOnboardingDate() {
	return onboardingDate;
}

public void setOnboardingDate(String onboardingDate) {
	this.onboardingDate = onboardingDate;
}

public String getOnboardingPlace() {
	return onboardingPlace;
}

public void setOnboardingPlace(String onboardingPlace) {
	this.onboardingPlace = onboardingPlace;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getDestinationDate() {
	return destinationDate;
}

public void setDestinationDate(String destinationDate) {
	this.destinationDate = destinationDate;
}

public String getHotelName() {
	return hotelName;
}

public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}

public String getHotelAddress() {
	return hotelAddress;
}

public void setHotelAddress(String hotelAddress) {
	this.hotelAddress = hotelAddress;
}

public String getCheckInTime() {
	return checkInTime;
}

public void setCheckInTime(String checkInTime) {
	this.checkInTime = checkInTime;
}

public String getCheckOutTime() {
	return checkOutTime;
}

public void setCheckOutTime(String checkOutTime) {
	this.checkOutTime = checkOutTime;
}

public long getContactNumber() {
	return contactNumber;
}

public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}

@Override
public String toString() {
	return "BookingDetails [bookingId=" + bookingId + ", requestTravelId=" + requestTravelId + ", onboardingDate="
			+ onboardingDate + ", onboardingPlace=" + onboardingPlace + ", destination=" + destination
			+ ", destinationDate=" + destinationDate + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress
			+ ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + ", contactNumber=" + contactNumber
			+ "]";
}




}
