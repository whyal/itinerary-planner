package com.yonglun.itineraryassistant.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private Long userId;
    private String destination;
//    private String startDate;
//    private String endDate;
    private Integer budget;
    private Integer days;
    private List<Activity> activityList;

    public Trip(String destination, Integer budget, Integer days) {
//        this.userId = userId;
        this.destination = destination;
//        this.startDate = startDate;
//        this.endDate = endDate;
        this.budget = budget;
        this.days = days;
    }
}
