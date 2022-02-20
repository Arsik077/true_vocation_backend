package com.truevocation.main.recommendation.mapper;

import com.truevocation.main.profession.mapper.ProfessionMapper;
import com.truevocation.main.recommendation.entity.Recommendation;
import com.truevocation.main.recommendation.dto.RecommendationDTO;
import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Recommendation} and its DTO {@link RecommendationDTO}.
 */
@Mapper(componentModel = "spring", uses = { ProfessionMapper.class })
public interface RecommendationMapper extends EntityMapper<RecommendationDTO, Recommendation> {
    @Mapping(target = "profession", source = "profession", qualifiedByName = "id")
    RecommendationDTO toDto(Recommendation s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    RecommendationDTO toDtoId(Recommendation recommendation);
}
