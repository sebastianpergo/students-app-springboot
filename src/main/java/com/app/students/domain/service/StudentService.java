package com.app.students.domain.service;

import com.app.students.domain.repository.StudentRepository;
import com.app.students.persistence.entity.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    // Listar
    public List<StudentModel> listAllStudents() {
        return repo.findAll();
    }

}
