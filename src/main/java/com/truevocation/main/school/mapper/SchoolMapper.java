package com.truevocation.main.school.mapper;

import com.truevocation.main.city.mapper.CityMapper;
import com.truevocation.main.school.entity.School;
import com.truevocation.main.school.dto.SchoolDTO;
import java.util.Set;

import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link School} and its DTO {@link SchoolDTO}.
 */
@Mapper(componentModel = "spring", uses = { CityMapper.class })
public interface SchoolMapper extends EntityMapper<SchoolDTO, School> {
    @Mapping(target = "city", source = "city", qualifiedByName = "id")
    SchoolDTO toDto(School s);

    @Named("idSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    Set<SchoolDTO> toDtoIdSet(Set<School> school);
}
