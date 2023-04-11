package com.population.worldpopulationapp.dto.converter;

import com.population.worldpopulationapp.dto.PopulationDto;
import com.population.worldpopulationapp.model.Population;

public class PopulationConverter {

    public static PopulationDto toDto(Population from) {
        return new PopulationDto(
                from.getContinent(),
                from.getContinentCode(),
                from.getCountry(),
                from.getCountryCode(),
                from.getPopulationValue(),
                from.getPopulationGrowth()
        );
    }
}
