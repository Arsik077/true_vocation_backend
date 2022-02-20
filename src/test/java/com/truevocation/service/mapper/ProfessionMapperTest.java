package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.profession.mapper.ProfessionMapper;
import org.junit.jupiter.api.BeforeEach;

class ProfessionMapperTest {

    private ProfessionMapper professionMapper;

    @BeforeEach
    public void setUp() {
        professionMapper = new ProfessionMapperImpl();
    }
}
