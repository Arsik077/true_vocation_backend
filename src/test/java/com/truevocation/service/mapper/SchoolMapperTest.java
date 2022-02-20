package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.school.mapper.SchoolMapper;
import org.junit.jupiter.api.BeforeEach;

class SchoolMapperTest {

    private SchoolMapper schoolMapper;

    @BeforeEach
    public void setUp() {
        schoolMapper = new SchoolMapperImpl();
    }
}
