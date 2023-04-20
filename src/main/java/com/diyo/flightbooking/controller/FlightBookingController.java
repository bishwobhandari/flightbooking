package com.diyo.flightbooking.controller;

import com.diyo.flightbooking.entity.FlightInformation;
import com.diyo.flightbooking.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flightBooking")
public class FlightBookingController {
    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping
    public ResponseEntity<FlightBookingService> bookingDetails(@RequestBody FlightInformation flightInformation) {
        return new ResponseEntity (flightBookingService.flightBookingDetails(flightInformation), HttpStatus.OK);
    }

}
