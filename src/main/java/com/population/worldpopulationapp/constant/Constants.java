package com.population.worldpopulationapp.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constants {

    public static String API_URL;

    @Value("${population.api-path}")
    public void setApiUrl(String apiUrl) {
        Constants.API_URL = apiUrl;
    }
}
