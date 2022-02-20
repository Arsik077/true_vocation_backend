package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.answer_user.mapper.AnswerUserMapper;
import org.junit.jupiter.api.BeforeEach;

class AnswerUserMapperTest {

    private AnswerUserMapper answerUserMapper;

    @BeforeEach
    public void setUp() {
        answerUserMapper = new AnswerUserMapperImpl();
    }
}
