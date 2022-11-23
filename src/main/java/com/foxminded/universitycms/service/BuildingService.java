package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Building;

import java.util.List;
import java.util.Optional;

public interface BuildingService {

    Optional<Building> findById(int id);

    List<Building> findAll();

    void update(Building building);

    void save(Building building);

    void deleteById(int id);
}
