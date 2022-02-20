package com.truevocation.main.comment_answer.mapper;

import com.truevocation.main.comment_answer.entity.CommentAnswer;
import com.truevocation.main.app_user.mapper.AppUserMapper;
import com.truevocation.main.comment_answer.dto.CommentAnswerDTO;
import com.truevocation.main.comments.mapper.CommentsMapper;
import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link CommentAnswer} and its DTO {@link CommentAnswerDTO}.
 */
@Mapper(componentModel = "spring", uses = { CommentsMapper.class, AppUserMapper.class })
public interface CommentAnswerMapper extends EntityMapper<CommentAnswerDTO, CommentAnswer> {
    @Mapping(target = "comment", source = "comment", qualifiedByName = "id")
    @Mapping(target = "user", source = "user", qualifiedByName = "id")
    CommentAnswerDTO toDto(CommentAnswer s);
}
