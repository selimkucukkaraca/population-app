package com.population.worldpopulationapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Population {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String continent;
    private String continentCode;
    private String country;
    private String countryCode;
    private Long populationValue;
    private Double populationGrowth;

    public Population(String continent, String continentCode, String country,
                      String countryCode, Long populationValue, Double populationGrowth) {
        this.continent = continent;
        this.continentCode = continentCode;
        this.country = country;
        this.countryCode = countryCode;
        this.populationValue = populationValue;
        this.populationGrowth = populationGrowth;
    }
}