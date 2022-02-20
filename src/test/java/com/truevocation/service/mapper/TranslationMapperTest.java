package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.translation.mapper.TranslationMapper;
import org.junit.jupiter.api.BeforeEach;

class TranslationMapperTest {

    private TranslationMapper translationMapper;

    @BeforeEach
    public void setUp() {
        translationMapper = new TranslationMapperImpl();
    }
}
