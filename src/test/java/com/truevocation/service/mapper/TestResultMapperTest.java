package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.test_result.mapper.TestResultMapper;
import org.junit.jupiter.api.BeforeEach;

class TestResultMapperTest {

    private TestResultMapper testResultMapper;

    @BeforeEach
    public void setUp() {
        testResultMapper = new TestResultMapperImpl();
    }
}
