package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.subject.mapper.SubjectMapper;
import org.junit.jupiter.api.BeforeEach;

class SubjectMapperTest {

    private SubjectMapper subjectMapper;

    @BeforeEach
    public void setUp() {
        subjectMapper = new SubjectMapperImpl();
    }
}
