package com.truevocation.main.likes.mapper;

import com.truevocation.main.comments.mapper.CommentsMapper;
import com.truevocation.main.likes.entity.Likes;
import com.truevocation.main.app_user.mapper.AppUserMapper;
import com.truevocation.main.likes.dto.LikesDTO;
import com.truevocation.service.mapper.EntityMapper;
import com.truevocation.main.post.mapper.PostMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Likes} and its DTO {@link LikesDTO}.
 */
@Mapper(componentModel = "spring", uses = { CommentsMapper.class, AppUserMapper.class, PostMapper.class })
public interface LikesMapper extends EntityMapper<LikesDTO, Likes> {
    @Mapping(target = "comment", source = "comment", qualifiedByName = "id")
    @Mapping(target = "user", source = "user", qualifiedByName = "id")
    @Mapping(target = "post", source = "post", qualifiedByName = "id")
    LikesDTO toDto(Likes s);
}
