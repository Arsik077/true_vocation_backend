package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.faculty.mapper.FacultyMapper;
import org.junit.jupiter.api.BeforeEach;

class FacultyMapperTest {

    private FacultyMapper facultyMapper;

    @BeforeEach
    public void setUp() {
        facultyMapper = new FacultyMapperImpl();
    }
}
