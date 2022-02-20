package com.truevocation.main.answer_user.repository;

import com.truevocation.main.answer_user.entity.AnswerUser;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the AnswerUser entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AnswerUserRepository extends JpaRepository<AnswerUser, Long> {}
