package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Classroom;
import com.foxminded.universitycms.repository.ClassroomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ClassroomServiceJpaBackend implements ClassroomService {

    private final ClassroomRepository classroomRepository;

    @Override
    public Optional<Classroom> findById(int id) {
        return classroomRepository.findById(id);
    }

    @Override
    public List<Classroom> findAll() {
        return classroomRepository.findAll();
    }

    @Override
    public void update(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    @Override
    public void save(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    @Override
    public void deleteById(int id) {
        classroomRepository.deleteById(id);
    }
}
