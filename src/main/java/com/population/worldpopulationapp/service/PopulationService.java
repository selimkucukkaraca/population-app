package com.population.worldpopulationapp.service;

import com.population.worldpopulationapp.model.Population;
import com.population.worldpopulationapp.repository.PopulationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PopulationService {

    private final PopulationRepository populationRepository;

    public void save(Population population) {
        populationRepository.save(population);
    }
}
