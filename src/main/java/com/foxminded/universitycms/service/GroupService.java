package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Group;

import java.util.List;
import java.util.Optional;

public interface GroupService {

    Optional<Group> findById(int id);

    List<Group> findAll();

    void update(Group group);

    void save(Group group);

    void deleteById(int id);
}
