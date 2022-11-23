package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Classroom;

import java.util.List;
import java.util.Optional;

public interface ClassroomService {

    Optional<Classroom> findById(int id);

    List<Classroom> findAll();

    void update(Classroom building);

    void save(Classroom building);

    void deleteById(int id);
}
