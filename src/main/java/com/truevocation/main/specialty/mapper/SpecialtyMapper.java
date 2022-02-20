package com.truevocation.main.specialty.mapper;

import com.truevocation.main.faculty.mapper.FacultyMapper;
import com.truevocation.main.profession.mapper.ProfessionMapper;
import com.truevocation.main.specialty.entity.Specialty;
import com.truevocation.main.specialty.dto.SpecialtyDTO;
import com.truevocation.service.mapper.EntityMapper;
import com.truevocation.main.subject.mapper.SubjectMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Specialty} and its DTO {@link SpecialtyDTO}.
 */
@Mapper(componentModel = "spring", uses = { SubjectMapper.class, ProfessionMapper.class, FacultyMapper.class })
public interface SpecialtyMapper extends EntityMapper<SpecialtyDTO, Specialty> {
    @Mapping(target = "subjects", source = "subjects", qualifiedByName = "idSet")
    @Mapping(target = "professions", source = "professions", qualifiedByName = "idSet")
    @Mapping(target = "faculty", source = "faculty", qualifiedByName = "id")
    SpecialtyDTO toDto(Specialty s);

    @Mapping(target = "removeSubject", ignore = true)
    @Mapping(target = "removeProfession", ignore = true)
    Specialty toEntity(SpecialtyDTO specialtyDTO);
}
