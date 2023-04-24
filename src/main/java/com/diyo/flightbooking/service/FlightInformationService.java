package com.diyo.flightbooking.service;

import com.diyo.flightbooking.entity.FlightBookingDetails;
import com.diyo.flightbooking.entity.FlightInformation;
import com.diyo.flightbooking.repository.FLightInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlightInformationService {
    @Autowired
    private FLightInformationRepository fLightInformationRepository;

    public String flightInformation(FlightInformation flightInformation) {
        fLightInformationRepository.save(flightInformation);
        return "Successfully saved";
    }
}
