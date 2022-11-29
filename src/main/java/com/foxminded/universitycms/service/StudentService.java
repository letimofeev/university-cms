package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Optional<Student> findById(int id);

    List<Student> findAll();

    void update(Student student);

    void save(Student student);

    void deleteById(int id);
}
