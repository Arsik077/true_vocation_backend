package com.truevocation.main.test_result.service;

import com.truevocation.main.test_result.entity.TestResult;
import com.truevocation.main.test_result.dto.TestResultDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link TestResult}.
 */
public interface TestResultService {
    /**
     * Save a testResult.
     *
     * @param testResultDTO the entity to save.
     * @return the persisted entity.
     */
    TestResultDTO save(TestResultDTO testResultDTO);

    /**
     * Partially updates a testResult.
     *
     * @param testResultDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<TestResultDTO> partialUpdate(TestResultDTO testResultDTO);

    /**
     * Get all the testResults.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<TestResultDTO> findAll(Pageable pageable);

    /**
     * Get the "id" testResult.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TestResultDTO> findOne(Long id);

    /**
     * Delete the "id" testResult.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
