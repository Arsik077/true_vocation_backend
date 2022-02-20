package com.truevocation.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.truevocation.main.achievement.mapper.AchievementMapper;
import org.junit.jupiter.api.BeforeEach;

class AchievementMapperTest {

    private AchievementMapper achievementMapper;

    @BeforeEach
    public void setUp() {
        achievementMapper = new AchievementMapperImpl();
    }
}
