package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.demand_profession_city.mapper.DemandProfessionCityMapper;
import org.junit.jupiter.api.BeforeEach;

class DemandProfessionCityMapperTest {

    private DemandProfessionCityMapper demandProfessionCityMapper;

    @BeforeEach
    public void setUp() {
        demandProfessionCityMapper = new DemandProfessionCityMapperImpl();
    }
}
