package com.yonglun.itineraryassistant.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long tripId;
    private int day;
    private Date time;
    private String location;
    private Long longitude;
    private String notes;
    private Long estimatedCost;
    private String bookingLink;

    public Activity(Long tripId, int day, Date time, String location, Long longitude, String notes, Long estimatedCost, String bookingLink) {
        this.tripId = tripId;
        this.day = day;
        this.time = time;
        this.location = location;
        this.longitude = longitude;
        this.notes = notes;
        this.estimatedCost = estimatedCost;
        this.bookingLink = bookingLink;
    }
}
