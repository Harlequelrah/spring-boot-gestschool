package com.demo.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.models.Student;
import com.demo.demo.services.StudentService;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/save-student")
    public Student saveStudent(Student student) {
        return studentService.saveStudent(student);
    }

}
