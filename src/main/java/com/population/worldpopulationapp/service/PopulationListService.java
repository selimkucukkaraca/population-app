package com.population.worldpopulationapp.service;

import com.population.worldpopulationapp.dto.PopulationDto;
import com.population.worldpopulationapp.dto.converter.PopulationConverter;
import com.population.worldpopulationapp.model.Population;
import com.population.worldpopulationapp.repository.PopulationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PopulationListService {

    private final PopulationRepository populationRepository;

    public List<PopulationDto> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return populationRepository.findAll(pageable)
                .stream()
                .map(PopulationConverter::toDto)
                .toList();
    }

    public PopulationDto getByCountry(String country) {
        Population fromDb = populationRepository.findPopulationByCountry(country);
        return PopulationConverter.toDto(fromDb);
    }

    public List<PopulationDto> getByPopulationPopulationNumber(int min, int max){
        return populationRepository.findAll()
                .stream()
                .filter(population -> population.getPopulationValue() >= min && population.getPopulationValue() <= max)
                .map(PopulationConverter::toDto)
                .toList();
    }
}