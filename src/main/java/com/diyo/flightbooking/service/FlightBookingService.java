package com.diyo.flightbooking.service;

import com.diyo.flightbooking.entity.FlightBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {
    @Autowired
    private FlightBookingRepo flightBookingRepo;

    public String flightBookingDetails(FlightBooking flightBooking) {
        flightBookingRepo.save(flightBooking);
        return "Successfully Updated";

    }
}
