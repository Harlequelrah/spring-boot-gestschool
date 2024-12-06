package com.demo.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.models.Student;
import com.demo.demo.repositories.StudentRepository;
@Service
public class StudentService {
    @Autowired
    private  StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return  studentRepository.findAll();
    }

}
