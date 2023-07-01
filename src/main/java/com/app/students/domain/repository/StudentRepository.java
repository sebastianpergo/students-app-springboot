package com.app.students.domain.repository;

import com.app.students.persistence.entity.StudentModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

}
