package com.diyo.flightbooking.controller;

import com.diyo.flightbooking.entity.FlightBookingDetails;
import com.diyo.flightbooking.entity.FlightInformation;
import com.diyo.flightbooking.service.FlightInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flightInformation")
public class FlightInfoController {
    private FlightInformationService flightInformationService;
    @PostMapping

        public ResponseEntity<FlightInformation> flightInfo(FlightInformation flightInformation){
        return new ResponseEntity(flightInformationService.flightInformation(flightInformation), HttpStatus.OK);
    }



}
