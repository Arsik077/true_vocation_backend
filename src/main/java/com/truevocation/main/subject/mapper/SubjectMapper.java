package com.truevocation.main.subject.mapper;

import com.truevocation.main.subject.entity.Subject;
import com.truevocation.main.subject.dto.SubjectDTO;
import java.util.Set;

import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Subject} and its DTO {@link SubjectDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface SubjectMapper extends EntityMapper<SubjectDTO, Subject> {
    @Named("idSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    Set<SubjectDTO> toDtoIdSet(Set<Subject> subject);
}
