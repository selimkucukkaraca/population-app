package com.population.worldpopulationapp.dto.response;

public record PagerResponse(
        int page,
        int pageCount,
        int pageSize,
        int total
) {
}
