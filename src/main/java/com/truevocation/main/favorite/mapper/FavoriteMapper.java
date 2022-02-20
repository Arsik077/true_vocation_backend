package com.truevocation.main.favorite.mapper;

import com.truevocation.main.favorite.entity.Favorite;
import com.truevocation.main.app_user.mapper.AppUserMapper;
import com.truevocation.main.favorite.dto.FavoriteDTO;
import com.truevocation.service.mapper.EntityMapper;
import com.truevocation.main.post.mapper.PostMapper;
import com.truevocation.main.university.mapper.UniversityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Favorite} and its DTO {@link FavoriteDTO}.
 */
@Mapper(componentModel = "spring", uses = { UniversityMapper.class, AppUserMapper.class, PostMapper.class })
public interface FavoriteMapper extends EntityMapper<FavoriteDTO, Favorite> {
    @Mapping(target = "university", source = "university", qualifiedByName = "id")
    @Mapping(target = "user", source = "user", qualifiedByName = "id")
    @Mapping(target = "post", source = "post", qualifiedByName = "id")
    FavoriteDTO toDto(Favorite s);
}
