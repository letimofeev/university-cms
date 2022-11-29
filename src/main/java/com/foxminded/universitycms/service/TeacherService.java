package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    Optional<Teacher> findById(int id);

    List<Teacher> findAll();

    void update(Teacher teacher);

    void save(Teacher teacher);

    void deleteById(int id);
}
