package com.diyo.flightbooking.service;

import com.diyo.flightbooking.entity.FlightBooking;
import com.diyo.flightbooking.entity.FlightBookingDetails;
import com.diyo.flightbooking.repository.FlightBookingRepo;
import com.diyo.flightbooking.repository.FlightDetailsInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightBookingService {
    @Autowired
    private FlightBookingRepo flightBookingRepo;
    private FlightDetailsInformationRepository flightDetailsInformationRepository;

    public String flightBookingDetails(FlightBooking flightBooking) {
        flightBookingRepo.save(flightBooking);
        return "Successfully Updated";

    }
    public String deleteFlightBookingDetailById(Long id){
        boolean exists=flightDetailsInformationRepository.existsById(id);
        if(exists){
            flightDetailsInformationRepository.deleteById(id);
            return "Deleted";
        }
        return "Bad Request";
    }
    public Optional<FlightBookingDetails> getFlightBookingDetailById(Long id){
        return flightBookingRepo.findById(id);
    }

}
