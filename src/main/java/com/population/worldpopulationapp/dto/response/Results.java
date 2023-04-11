package com.population.worldpopulationapp.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Results(
        @JsonProperty("Continent")
        String continent,
        @JsonProperty("ContinentCode")
        String continentCode,
        @JsonProperty("Country")
        String country,
        @JsonProperty("CountryCode")
        String countryCode,
        @JsonProperty("Population")
        Long population,
        @JsonProperty("PopulationGrowth")
        Double populationGrowth
) {
}
