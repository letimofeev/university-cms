package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Classroom;

import java.util.List;
import java.util.Optional;

public interface ClassroomService {

    Optional<Classroom> findById(int id);

    List<Classroom> findAll();

    void update(Classroom classroom);

    void save(Classroom classroom);

    void deleteById(int id);
}
