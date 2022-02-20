package com.truevocation.main.comments.mapper;

import com.truevocation.main.comments.entity.Comments;
import com.truevocation.main.app_user.mapper.AppUserMapper;
import com.truevocation.main.comments.dto.CommentsDTO;
import com.truevocation.service.mapper.EntityMapper;
import com.truevocation.main.post.mapper.PostMapper;
import com.truevocation.main.university.mapper.UniversityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Comments} and its DTO {@link CommentsDTO}.
 */
@Mapper(componentModel = "spring", uses = { UniversityMapper.class, AppUserMapper.class, PostMapper.class })
public interface CommentsMapper extends EntityMapper<CommentsDTO, Comments> {
    @Mapping(target = "university", source = "university", qualifiedByName = "id")
    @Mapping(target = "user", source = "user", qualifiedByName = "id")
    @Mapping(target = "post", source = "post", qualifiedByName = "id")
    CommentsDTO toDto(Comments s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CommentsDTO toDtoId(Comments comments);
}
