package com.truevocation.main.prof_test.mapper;

import com.truevocation.main.prof_test.entity.ProfTest;
import com.truevocation.main.prof_test.dto.ProfTestDTO;
import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ProfTest} and its DTO {@link ProfTestDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ProfTestMapper extends EntityMapper<ProfTestDTO, ProfTest> {
    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProfTestDTO toDtoId(ProfTest profTest);
}
