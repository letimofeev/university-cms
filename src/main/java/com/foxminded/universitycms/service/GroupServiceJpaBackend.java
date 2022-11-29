package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Group;
import com.foxminded.universitycms.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class GroupServiceJpaBackend implements GroupService {

    private final GroupRepository groupRepository;

    @Override
    public Optional<Group> findById(int id) {
        return groupRepository.findById(id);
    }

    @Override
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public void update(Group group) {
        groupRepository.save(group);
    }

    @Override
    public void save(Group group) {
        groupRepository.save(group);
    }

    @Override
    public void deleteById(int id) {
        groupRepository.deleteById(id);
    }
}
