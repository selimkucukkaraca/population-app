package com.population.worldpopulationapp.config;

import com.population.worldpopulationapp.dto.response.PopulationApiResponse;
import com.population.worldpopulationapp.model.Population;
import com.population.worldpopulationapp.service.PopulationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static com.population.worldpopulationapp.constant.Constants.API_URL;

import java.util.Objects;

@Configuration
public class Runner implements CommandLineRunner {

    private final RestTemplate restTemplate;
    private final PopulationService populationService;

    public Runner(RestTemplate restTemplate,
                  PopulationService populationService) {
        this.restTemplate = restTemplate;
        this.populationService = populationService;
    }

    @Override
    public void run(String... args) throws Exception {
        ResponseEntity<PopulationApiResponse> population = restTemplate.getForEntity(API_URL, PopulationApiResponse.class);
        Objects.requireNonNull(population.getBody()).results().forEach(response -> {
            Population saved = new Population(
                    response.continent(),
                    response.continentCode(),
                    response.country(),
                    response.countryCode(),
                    response.population(),
                    response.populationGrowth());

            populationService.save(saved);
        });
    }
}
