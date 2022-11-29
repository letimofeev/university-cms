package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

    Optional<Subject> findById(int id);

    List<Subject> findAll();

    void update(Subject subject);

    void save(Subject subject);

    void deleteById(int id);
}
