package com.demo.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.models.Student;
import com.demo.demo.services.HelloService;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/")
    public String landing_page() {
        return "landing page";
    }

    @GetMapping("/hello")
    public String hello() {
        return this.helloService.sayHello();
    }

    @GetMapping("/student")
    public ResponseEntity<Student> introduction() {
        Student student = new Student();
        student.setFirstName("John");
        student.setAge(25);
        student.setId(1L);
        student.setLastName("Date");
        student.setPhone("91361029");
        return ResponseEntity.ok(student);
    }
}
