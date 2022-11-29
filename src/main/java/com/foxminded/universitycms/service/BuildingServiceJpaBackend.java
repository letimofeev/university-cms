package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Building;
import com.foxminded.universitycms.repository.BuildingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class BuildingServiceJpaBackend implements BuildingService {

    private final BuildingRepository buildingRepository;

    @Override
    public Optional<Building> findById(int id) {
        return buildingRepository.findById(id);
    }

    @Override
    public List<Building> findAll() {
        return buildingRepository.findAll();
    }

    @Override
    public void update(Building building) {
        buildingRepository.save(building);
    }

    @Override
    public void save(Building building) {
        buildingRepository.save(building);
    }

    @Override
    public void deleteById(int id) {
        buildingRepository.deleteById(id);
    }
}
