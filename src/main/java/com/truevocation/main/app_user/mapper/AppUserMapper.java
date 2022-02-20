package com.truevocation.main.app_user.mapper;

import com.truevocation.main.app_user.entity.AppUser;
import com.truevocation.main.app_user.dto.AppUserDTO;
import com.truevocation.service.mapper.EntityMapper;
import com.truevocation.service.mapper.UserMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link AppUser} and its DTO {@link AppUserDTO}.
 */
@Mapper(componentModel = "spring", uses = { UserMapper.class })
public interface AppUserMapper extends EntityMapper<AppUserDTO, AppUser> {
    @Mapping(target = "user", source = "user", qualifiedByName = "id")
    AppUserDTO toDto(AppUser s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    AppUserDTO toDtoId(AppUser appUser);
}
