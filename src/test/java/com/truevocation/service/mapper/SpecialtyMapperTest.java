package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.specialty.mapper.SpecialtyMapper;
import org.junit.jupiter.api.BeforeEach;

class SpecialtyMapperTest {

    private SpecialtyMapper specialtyMapper;

    @BeforeEach
    public void setUp() {
        specialtyMapper = new SpecialtyMapperImpl();
    }
}
