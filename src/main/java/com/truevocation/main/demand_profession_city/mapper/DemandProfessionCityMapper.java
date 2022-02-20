package com.truevocation.main.demand_profession_city.mapper;

import com.truevocation.main.city.mapper.CityMapper;
import com.truevocation.main.demand_profession_city.entity.DemandProfessionCity;
import com.truevocation.main.demand_profession_city.dto.DemandProfessionCityDTO;
import com.truevocation.service.mapper.EntityMapper;
import com.truevocation.main.profession.mapper.ProfessionMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DemandProfessionCity} and its DTO {@link DemandProfessionCityDTO}.
 */
@Mapper(componentModel = "spring", uses = { ProfessionMapper.class, CityMapper.class })
public interface DemandProfessionCityMapper extends EntityMapper<DemandProfessionCityDTO, DemandProfessionCity> {
    @Mapping(target = "profession", source = "profession", qualifiedByName = "id")
    @Mapping(target = "city", source = "city", qualifiedByName = "id")
    DemandProfessionCityDTO toDto(DemandProfessionCity s);
}
