package com.truevocation.main.post.mapper;

import com.truevocation.main.post.entity.Post;
import com.truevocation.main.post.dto.PostDTO;
import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Post} and its DTO {@link PostDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PostMapper extends EntityMapper<PostDTO, Post> {
    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PostDTO toDtoId(Post post);
}
