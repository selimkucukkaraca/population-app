package com.population.worldpopulationapp.dto;

public record PopulationDto(
        String continent,
        String continentCode,
        String country,
        String countryCode,
        Long population,
        Double populationGrowth
) {}