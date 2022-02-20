package com.truevocation.main.comment_answer.repository;

import com.truevocation.main.comment_answer.entity.CommentAnswer;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the CommentAnswer entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CommentAnswerRepository extends JpaRepository<CommentAnswer, Long> {}
