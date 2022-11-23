package com.foxminded.universitycms.repository;

import com.foxminded.universitycms.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
