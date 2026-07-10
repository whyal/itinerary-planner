package com.yonglun.itineraryassistant.repository;

import com.yonglun.itineraryassistant.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {
}
