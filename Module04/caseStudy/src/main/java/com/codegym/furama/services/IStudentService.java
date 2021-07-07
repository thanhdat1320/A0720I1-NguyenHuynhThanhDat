package com.codegym.furama.services;

import com.codegym.furama.models.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> getAllStudent();

    Student addStudent(Student student);

    Student findById(Long id);

    Student updateStudent(Student student);

    void delete(Long id);
}
