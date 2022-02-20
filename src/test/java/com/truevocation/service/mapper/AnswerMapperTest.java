package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.answer.mapper.AnswerMapper;
import org.junit.jupiter.api.BeforeEach;

class AnswerMapperTest {

    private AnswerMapper answerMapper;

    @BeforeEach
    public void setUp() {
        answerMapper = new AnswerMapperImpl();
    }
}
