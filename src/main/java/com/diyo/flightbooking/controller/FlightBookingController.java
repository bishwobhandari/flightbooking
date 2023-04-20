package com.diyo.flightbooking.controller;

import com.diyo.flightbooking.entity.FlightBookingDetails;
import com.diyo.flightbooking.entity.FlightInformation;
import com.diyo.flightbooking.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flightBooking")
public class FlightBookingController {
    @Autowired
    private FlightBookingService flightBookingService;
    @GetMapping
    public List<FlightBookingDetails> showBooking() {
        return flightBookingService.showBooking();
    }

    @PostMapping
    public ResponseEntity<FlightBookingDetails> bookingDetails(@RequestBody FlightBookingDetails flightBookingDetails) {
        return new ResponseEntity (flightBookingService.flightBookingDetails(flightBookingDetails), HttpStatus.OK);
    }

}
