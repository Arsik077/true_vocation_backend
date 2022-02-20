package com.truevocation.main.university.mapper;

import com.truevocation.main.city.mapper.CityMapper;
import com.truevocation.main.faculty.mapper.FacultyMapper;
import com.truevocation.main.university.entity.University;
import com.truevocation.main.university.dto.UniversityDTO;
import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link University} and its DTO {@link UniversityDTO}.
 */
@Mapper(componentModel = "spring", uses = { FacultyMapper.class, CityMapper.class })
public interface UniversityMapper extends EntityMapper<UniversityDTO, University> {
    @Mapping(target = "faculties", source = "faculties", qualifiedByName = "idSet")
    @Mapping(target = "city", source = "city", qualifiedByName = "id")
    UniversityDTO toDto(University s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    UniversityDTO toDtoId(University university);

    @Mapping(target = "removeFaculty", ignore = true)
    University toEntity(UniversityDTO universityDTO);
}
