package com.mindgate.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(BookingApplication.class, args);
//		SpringApplication.run(BookingApplication.class, args);
		System.out.println("Booking Application running..............");
	}

}
