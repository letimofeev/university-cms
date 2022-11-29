package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Lesson;
import com.foxminded.universitycms.repository.LessonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class LessonServiceJpaBackend implements LessonService {

    private final LessonRepository lessonRepository;

    @Override
    public Optional<Lesson> findById(int id) {
        return lessonRepository.findById(id);
    }

    @Override
    public List<Lesson> findAll() {
        return lessonRepository.findAll();
    }

    @Override
    public void update(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @Override
    public void save(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @Override
    public void deleteById(int id) {
        lessonRepository.deleteById(id);
    }
}
