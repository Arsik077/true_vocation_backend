package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.comment_answer.mapper.CommentAnswerMapper;
import org.junit.jupiter.api.BeforeEach;

class CommentAnswerMapperTest {

    private CommentAnswerMapper commentAnswerMapper;

    @BeforeEach
    public void setUp() {
        commentAnswerMapper = new CommentAnswerMapperImpl();
    }
}
