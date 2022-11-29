package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Lesson;

import java.util.List;
import java.util.Optional;

public interface LessonService {

    Optional<Lesson> findById(int id);

    List<Lesson> findAll();

    void update(Lesson lesson);

    void save(Lesson lesson);

    void deleteById(int id);
}
