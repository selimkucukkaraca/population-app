package com.population.worldpopulationapp.controller;

import com.population.worldpopulationapp.dto.PopulationDto;
import com.population.worldpopulationapp.service.PopulationListService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PopulationController {

    private final PopulationListService populationListService;

    public PopulationController(PopulationListService populationListService) {
        this.populationListService = populationListService;
    }

    @QueryMapping
    public List<PopulationDto> getAllPopulations(@Argument int page, @Argument int size) {
        return populationListService.getAll(page, size);
    }

    @QueryMapping
    public PopulationDto getCountry(@Argument String country) {
        return populationListService.getByCountry(country);
    }

    @QueryMapping
    public List<PopulationDto> getByPopulationPopulationNumber(@Argument int min, @Argument int max){
        return populationListService.getByPopulationPopulationNumber(min, max);
    }
}
