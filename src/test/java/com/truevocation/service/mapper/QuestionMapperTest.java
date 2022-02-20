package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.question.mapper.QuestionMapper;
import org.junit.jupiter.api.BeforeEach;

class QuestionMapperTest {

    private QuestionMapper questionMapper;

    @BeforeEach
    public void setUp() {
        questionMapper = new QuestionMapperImpl();
    }
}
