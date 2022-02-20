package com.truevocation.main.contact.mapper;

import com.truevocation.main.contact.entity.Contact;
import com.truevocation.main.contact.dto.ContactDTO;
import com.truevocation.main.course.mapper.CourseMapper;
import com.truevocation.service.mapper.EntityMapper;
import com.truevocation.main.portfolio.mapper.PortfolioMapper;
import com.truevocation.main.university.mapper.UniversityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Contact} and its DTO {@link ContactDTO}.
 */
@Mapper(componentModel = "spring", uses = { CourseMapper.class, UniversityMapper.class, PortfolioMapper.class })
public interface ContactMapper extends EntityMapper<ContactDTO, Contact> {
    @Mapping(target = "course", source = "course", qualifiedByName = "id")
    @Mapping(target = "university", source = "university", qualifiedByName = "id")
    @Mapping(target = "portfolio", source = "portfolio", qualifiedByName = "id")
    ContactDTO toDto(Contact s);
}
