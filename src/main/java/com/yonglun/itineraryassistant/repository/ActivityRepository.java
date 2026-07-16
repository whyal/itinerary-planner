package com.yonglun.itineraryassistant.repository;

import com.yonglun.itineraryassistant.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
