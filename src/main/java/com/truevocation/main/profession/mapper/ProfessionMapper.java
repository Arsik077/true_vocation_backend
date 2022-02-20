package com.truevocation.main.profession.mapper;

import com.truevocation.main.course.mapper.CourseMapper;
import com.truevocation.main.profession.entity.Profession;
import com.truevocation.main.profession.dto.ProfessionDTO;
import java.util.Set;

import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Profession} and its DTO {@link ProfessionDTO}.
 */
@Mapper(componentModel = "spring", uses = { CourseMapper.class })
public interface ProfessionMapper extends EntityMapper<ProfessionDTO, Profession> {
    @Mapping(target = "courses", source = "courses", qualifiedByName = "idSet")
    ProfessionDTO toDto(Profession s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProfessionDTO toDtoId(Profession profession);

    @Named("idSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    Set<ProfessionDTO> toDtoIdSet(Set<Profession> profession);

    @Mapping(target = "removeCourse", ignore = true)
    Profession toEntity(ProfessionDTO professionDTO);
}
