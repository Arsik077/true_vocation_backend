package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.likes.mapper.LikesMapper;
import org.junit.jupiter.api.BeforeEach;

class LikesMapperTest {

    private LikesMapper likesMapper;

    @BeforeEach
    public void setUp() {
        likesMapper = new LikesMapperImpl();
    }
}
