package com.truevocation.main.city.mapper;

import com.truevocation.main.city.entity.City;
import com.truevocation.main.city.dto.CityDTO;
import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link City} and its DTO {@link CityDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CityMapper extends EntityMapper<CityDTO, City> {
    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CityDTO toDtoId(City city);
}
