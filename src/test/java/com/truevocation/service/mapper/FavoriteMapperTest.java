package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.favorite.mapper.FavoriteMapper;
import org.junit.jupiter.api.BeforeEach;

class FavoriteMapperTest {

    private FavoriteMapper favoriteMapper;

    @BeforeEach
    public void setUp() {
        favoriteMapper = new FavoriteMapperImpl();
    }
}
