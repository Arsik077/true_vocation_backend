package com.truevocation.main.course.mapper;

import com.truevocation.main.city.mapper.CityMapper;
import com.truevocation.main.course.entity.Course;
import com.truevocation.main.course.dto.CourseDTO;
import java.util.Set;

import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Course} and its DTO {@link CourseDTO}.
 */
@Mapper(componentModel = "spring", uses = { CityMapper.class })
public interface CourseMapper extends EntityMapper<CourseDTO, Course> {
    @Mapping(target = "city", source = "city", qualifiedByName = "id")
    CourseDTO toDto(Course s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CourseDTO toDtoId(Course course);

    @Named("idSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    Set<CourseDTO> toDtoIdSet(Set<Course> course);
}
