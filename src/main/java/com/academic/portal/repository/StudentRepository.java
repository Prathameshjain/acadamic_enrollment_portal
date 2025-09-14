package com.academic.portal.repository;

import com.academic.portal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // extra query methods can go here
}
