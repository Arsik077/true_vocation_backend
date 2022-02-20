package com.truevocation.main.faculty.mapper;

import com.truevocation.main.faculty.entity.Faculty;
import com.truevocation.main.faculty.dto.FacultyDTO;
import java.util.Set;

import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Faculty} and its DTO {@link FacultyDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface FacultyMapper extends EntityMapper<FacultyDTO, Faculty> {
    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    FacultyDTO toDtoId(Faculty faculty);

    @Named("idSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    Set<FacultyDTO> toDtoIdSet(Set<Faculty> faculty);
}
