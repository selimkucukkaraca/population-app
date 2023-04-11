package com.population.worldpopulationapp.repository;

import com.population.worldpopulationapp.model.Population;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopulationRepository extends JpaRepository<Population,Long> {
    Population findPopulationByCountry(String country);
}