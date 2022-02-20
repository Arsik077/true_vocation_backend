package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.app_user.mapper.AppUserMapper;
import org.junit.jupiter.api.BeforeEach;

class AppUserMapperTest {

    private AppUserMapper appUserMapper;

    @BeforeEach
    public void setUp() {
        appUserMapper = new AppUserMapperImpl();
    }
}
