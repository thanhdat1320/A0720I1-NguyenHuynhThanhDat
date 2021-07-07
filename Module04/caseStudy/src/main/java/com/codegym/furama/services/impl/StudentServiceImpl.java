package com.codegym.furama.services.impl;

import com.codegym.furama.models.Student;
import com.codegym.furama.repositories.IStudentRepo;
import com.codegym.furama.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepo iStudentRepo;

    @Override
    public List<Student> getAllStudent() {
        return iStudentRepo.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        student.setStudentCode(UUID.randomUUID().toString());
        return iStudentRepo.save(student);
    }

    @Override
    public Student findById(Long id) {
        return iStudentRepo.findById(id)
//              .orElseThrow(() -> new StudentNotFoundException("Student by id" + id + "was not found"));
                .orElse(null);
    }

    @Override
    public Student updateStudent(Student student) {
        return iStudentRepo.save(student);
    }

    @Override
    public void delete(Long id) {
        iStudentRepo.deleteById(id);
    }

}
