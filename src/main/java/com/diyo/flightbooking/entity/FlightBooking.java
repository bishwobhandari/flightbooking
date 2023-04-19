package com.diyo.flightbooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class FlightBooking {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private long id;
    private String book_date;
    private String flight_date;

}
