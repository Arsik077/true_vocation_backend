package com.truevocation.main.achievement.service;

import com.truevocation.main.achievement.entity.Achievement;
import com.truevocation.main.achievement.dto.AchievementDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link Achievement}.
 */
public interface AchievementService {
    /**
     * Save a achievement.
     *
     * @param achievementDTO the entity to save.
     * @return the persisted entity.
     */
    AchievementDTO save(AchievementDTO achievementDTO);

    /**
     * Partially updates a achievement.
     *
     * @param achievementDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<AchievementDTO> partialUpdate(AchievementDTO achievementDTO);

    /**
     * Get all the achievements.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<AchievementDTO> findAll(Pageable pageable);

    /**
     * Get the "id" achievement.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AchievementDTO> findOne(Long id);

    /**
     * Delete the "id" achievement.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
