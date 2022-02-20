package com.truevocation.main.achievement.mapper;

import com.truevocation.main.achievement.entity.Achievement;
import com.truevocation.main.achievement.dto.AchievementDTO;
import com.truevocation.service.mapper.EntityMapper;
import com.truevocation.main.portfolio.mapper.PortfolioMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Achievement} and its DTO {@link AchievementDTO}.
 */
@Mapper(componentModel = "spring", uses = { PortfolioMapper.class })
public interface AchievementMapper extends EntityMapper<AchievementDTO, Achievement> {
    @Mapping(target = "portfolio", source = "portfolio", qualifiedByName = "id")
    AchievementDTO toDto(Achievement s);
}
