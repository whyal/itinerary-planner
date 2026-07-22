package com.yonglun.itineraryassistant.model;

import java.util.List;

public record Itinerary(
    String destination,
    int durationDays,
    String overallSummary,
    Double estimatedTotalBudget,
    List<DayPlan> days,
    List<String> localEtiquetteTips,
    List<String> recommendedPackingItems
) {
    public record DayPlan(
        int dayNumber,
        String theme,
        List<Activity> activities
    ) {}

    public record Activity(
        String timeOfDay,
        String title,
        String description,
        String locationName,
        Double estimatedCostUsd,
        List<String> tags
    ) {}
}
