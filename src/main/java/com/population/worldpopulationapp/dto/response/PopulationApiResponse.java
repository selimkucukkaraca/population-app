package com.population.worldpopulationapp.dto.response;

import java.util.List;

public record PopulationApiResponse(
        PagerResponse pager,
        List<Results> results
) {
}
