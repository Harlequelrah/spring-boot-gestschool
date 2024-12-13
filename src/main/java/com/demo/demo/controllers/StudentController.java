package com.demo.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.demo.models.Student;
import com.demo.demo.services.StudentService;


@Controller
public class StudentController {
    @Autowired
    private  StudentService studentService;

    @PostMapping("/students/save-student")
    public String saveStudent(@ModelAttribute("student") Student student) {
    // public String saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }


    @GetMapping("/students/create-student")
    public String createStudent(Model model) {
        model.addAttribute("student", new Student());
        return "create";
    }
    @GetMapping("/students")
    public String getStudents(Model model) {
        List<Student> students = studentService.getAllStudent();
        model.addAttribute("students", students); // Passer les étudiants au modèle
        return "get_all_students"; // Nom du template sans l'extension .html
    }


}
