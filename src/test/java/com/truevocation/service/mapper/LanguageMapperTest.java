package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.language.mapper.LanguageMapper;
import org.junit.jupiter.api.BeforeEach;

class LanguageMapperTest {

    private LanguageMapper languageMapper;

    @BeforeEach
    public void setUp() {
        languageMapper = new LanguageMapperImpl();
    }
}
