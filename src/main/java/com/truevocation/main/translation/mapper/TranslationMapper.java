package com.truevocation.main.translation.mapper;

import com.truevocation.main.translation.entity.Translation;
import com.truevocation.main.translation.dto.TranslationDTO;
import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Translation} and its DTO {@link TranslationDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TranslationMapper extends EntityMapper<TranslationDTO, Translation> {}
