package com.yonglun.itineraryassistant.service;

import com.yonglun.itineraryassistant.dto.TripRequest;
import com.yonglun.itineraryassistant.entity.Trip;
import com.yonglun.itineraryassistant.repository.TripRepository;
import org.springframework.stereotype.Service;

@Service
public class TripService {
    private final TripRepository repository;

    public TripService(TripRepository repository) {
        this.repository = repository;
    }

    public Trip saveTrip(TripRequest request) {

        Trip trip = new Trip();

        trip.setDestination(request.getDestination());
        trip.setBudget(request.getBudget());
        trip.setDays(request.getDays());

        return repository.save(trip);
    }
}
