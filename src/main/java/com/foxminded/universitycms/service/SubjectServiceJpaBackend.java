package com.foxminded.universitycms.service;

import com.foxminded.universitycms.model.Subject;
import com.foxminded.universitycms.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SubjectServiceJpaBackend implements SubjectService {

    private final SubjectRepository subjectRepository;

    @Override
    public Optional<Subject> findById(int id) {
        return subjectRepository.findById(id);
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public void update(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void save(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void deleteById(int id) {
        subjectRepository.deleteById(id);
    }
}
