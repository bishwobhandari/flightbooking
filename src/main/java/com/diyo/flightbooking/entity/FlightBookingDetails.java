package com.diyo.flightbooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bookDate;
    @OneToMany(mappedBy = "id")
    private Passenger passenger;
    @OneToMany(mappedBy = "id")
    private Payment payment;
}
