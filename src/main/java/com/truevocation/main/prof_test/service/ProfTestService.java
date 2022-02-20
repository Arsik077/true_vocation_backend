package com.truevocation.main.prof_test.service;

import com.truevocation.main.prof_test.entity.ProfTest;
import com.truevocation.main.prof_test.dto.ProfTestDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link ProfTest}.
 */
public interface ProfTestService {
    /**
     * Save a profTest.
     *
     * @param profTestDTO the entity to save.
     * @return the persisted entity.
     */
    ProfTestDTO save(ProfTestDTO profTestDTO);

    /**
     * Partially updates a profTest.
     *
     * @param profTestDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<ProfTestDTO> partialUpdate(ProfTestDTO profTestDTO);

    /**
     * Get all the profTests.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<ProfTestDTO> findAll(Pageable pageable);

    /**
     * Get the "id" profTest.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<ProfTestDTO> findOne(Long id);

    /**
     * Delete the "id" profTest.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
