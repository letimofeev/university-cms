package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Teacher;
import com.foxminded.universitycms.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class TeacherServiceJpaBackend implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Override
    public Optional<Teacher> findById(int id) {
        return teacherRepository.findById(id);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public void update(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteById(int id) {
        teacherRepository.deleteById(id);
    }
}
