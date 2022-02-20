package com.truevocation.main.prof_test.repository;

import com.truevocation.main.prof_test.entity.ProfTest;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the ProfTest entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProfTestRepository extends JpaRepository<ProfTest, Long> {}
