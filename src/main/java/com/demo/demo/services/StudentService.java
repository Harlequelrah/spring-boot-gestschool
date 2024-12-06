package com.demo.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.demo.models.Student;
import com.demo.demo.repositories.StudentRepository;
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return  studentRepository.findAll();
    }

}
