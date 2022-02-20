package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.recommendation.mapper.RecommendationMapper;
import org.junit.jupiter.api.BeforeEach;

class RecommendationMapperTest {

    private RecommendationMapper recommendationMapper;

    @BeforeEach
    public void setUp() {
        recommendationMapper = new RecommendationMapperImpl();
    }
}
