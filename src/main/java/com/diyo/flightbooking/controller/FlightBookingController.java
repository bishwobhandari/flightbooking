package com.diyo.flightbooking.controller;

import com.diyo.flightbooking.entity.FlightBookingDetails;
import com.diyo.flightbooking.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/flightBooking")
public class FlightBookingController {
    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping
    public ResponseEntity<FlightBookingDetails> bookingDetails(@RequestBody FlightBookingDetails flightBookingDetails) {
        return new ResponseEntity (flightBookingService.flightBookingDetails(flightBookingDetails), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteFlightBookingDetailById(@PathVariable("id") Long id){
        String response = flightBookingService.deleteFlightBookingDetailById(id);
        if (response.equals("Bad Request")) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("get/{id}")
    public Optional<FlightBookingDetails> findById(@PathVariable("id") Long id){
        return flightBookingService.getFlightBookingDetailById(id);
    }
    @PutMapping("put/{id}")
    public ResponseEntity<FlightBookingDetails> bookingDetailsUpdate(@PathVariable("id") Long id,@RequestBody FlightBookingDetails flightBookingDetails) {
        return new ResponseEntity (flightBookingService.flightBookingDetails(id, flightBookingDetails), HttpStatus.OK);
    }
}
