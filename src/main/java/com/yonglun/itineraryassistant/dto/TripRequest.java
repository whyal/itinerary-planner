package com.yonglun.itineraryassistant.dto;

import lombok.Data;

@Data
public class TripRequest {
    private String destination;
    private Integer budget;
    private Integer days;
}
