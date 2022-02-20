package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.university.mapper.UniversityMapper;
import org.junit.jupiter.api.BeforeEach;

class UniversityMapperTest {

    private UniversityMapper universityMapper;

    @BeforeEach
    public void setUp() {
        universityMapper = new UniversityMapperImpl();
    }
}
