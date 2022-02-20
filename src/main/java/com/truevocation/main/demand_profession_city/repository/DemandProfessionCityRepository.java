package com.truevocation.main.demand_profession_city.repository;

import com.truevocation.main.demand_profession_city.entity.DemandProfessionCity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the DemandProfessionCity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DemandProfessionCityRepository extends JpaRepository<DemandProfessionCity, Long> {}
