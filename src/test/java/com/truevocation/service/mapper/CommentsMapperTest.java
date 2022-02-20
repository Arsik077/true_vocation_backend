package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.comments.mapper.CommentsMapper;
import org.junit.jupiter.api.BeforeEach;

class CommentsMapperTest {

    private CommentsMapper commentsMapper;

    @BeforeEach
    public void setUp() {
        commentsMapper = new CommentsMapperImpl();
    }
}
