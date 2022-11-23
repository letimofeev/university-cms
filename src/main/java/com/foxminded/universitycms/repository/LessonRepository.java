package com.foxminded.universitycms.repository;

import com.foxminded.universitycms.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
}
