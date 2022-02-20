package com.truevocation.main.answer.mapper;

import com.truevocation.main.answer.entity.Answer;
import com.truevocation.main.answer.dto.AnswerDTO;
import java.util.Set;

import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Answer} and its DTO {@link AnswerDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AnswerMapper extends EntityMapper<AnswerDTO, Answer> {
    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    AnswerDTO toDtoId(Answer answer);

    @Named("idSet")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    Set<AnswerDTO> toDtoIdSet(Set<Answer> answer);
}
