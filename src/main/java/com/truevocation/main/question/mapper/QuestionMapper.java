package com.truevocation.main.question.mapper;

import com.truevocation.main.prof_test.mapper.ProfTestMapper;
import com.truevocation.main.question.entity.Question;
import com.truevocation.main.answer.mapper.AnswerMapper;
import com.truevocation.main.question.dto.QuestionDTO;
import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Question} and its DTO {@link QuestionDTO}.
 */
@Mapper(componentModel = "spring", uses = { AnswerMapper.class, ProfTestMapper.class })
public interface QuestionMapper extends EntityMapper<QuestionDTO, Question> {
    @Mapping(target = "answers", source = "answers", qualifiedByName = "idSet")
    @Mapping(target = "profTest", source = "profTest", qualifiedByName = "id")
    QuestionDTO toDto(Question s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    QuestionDTO toDtoId(Question question);

    @Mapping(target = "removeAnswer", ignore = true)
    Question toEntity(QuestionDTO questionDTO);
}
