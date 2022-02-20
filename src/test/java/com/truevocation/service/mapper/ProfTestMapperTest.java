package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.prof_test.mapper.ProfTestMapper;
import org.junit.jupiter.api.BeforeEach;

class ProfTestMapperTest {

    private ProfTestMapper profTestMapper;

    @BeforeEach
    public void setUp() {
        profTestMapper = new ProfTestMapperImpl();
    }
}
