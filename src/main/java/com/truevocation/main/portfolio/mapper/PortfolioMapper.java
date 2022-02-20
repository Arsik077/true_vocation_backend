package com.truevocation.main.portfolio.mapper;

import com.truevocation.main.language.mapper.LanguageMapper;
import com.truevocation.main.portfolio.entity.Portfolio;
import com.truevocation.main.app_user.mapper.AppUserMapper;
import com.truevocation.main.portfolio.dto.PortfolioDTO;
import com.truevocation.service.mapper.EntityMapper;
import com.truevocation.main.school.mapper.SchoolMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Portfolio} and its DTO {@link PortfolioDTO}.
 */
@Mapper(componentModel = "spring", uses = { AppUserMapper.class, LanguageMapper.class, SchoolMapper.class })
public interface PortfolioMapper extends EntityMapper<PortfolioDTO, Portfolio> {
    @Mapping(target = "appUser", source = "appUser", qualifiedByName = "id")
    @Mapping(target = "languages", source = "languages", qualifiedByName = "idSet")
    @Mapping(target = "schools", source = "schools", qualifiedByName = "idSet")
    PortfolioDTO toDto(Portfolio s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PortfolioDTO toDtoId(Portfolio portfolio);

    @Mapping(target = "removeLanguage", ignore = true)
    @Mapping(target = "removeSchool", ignore = true)
    Portfolio toEntity(PortfolioDTO portfolioDTO);
}
