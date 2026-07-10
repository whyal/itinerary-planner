package com.yonglun.itineraryassistant.controller;

import com.yonglun.itineraryassistant.dto.TripRequest;
import com.yonglun.itineraryassistant.entity.Trip;
import com.yonglun.itineraryassistant.service.TripService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @PostMapping
    public Trip saveTrip(@RequestBody TripRequest request) {

        return tripService.saveTrip(request);

    }
}