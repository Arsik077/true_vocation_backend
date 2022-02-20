package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.post.mapper.PostMapper;
import org.junit.jupiter.api.BeforeEach;

class PostMapperTest {

    private PostMapper postMapper;

    @BeforeEach
    public void setUp() {
        postMapper = new PostMapperImpl();
    }
}
