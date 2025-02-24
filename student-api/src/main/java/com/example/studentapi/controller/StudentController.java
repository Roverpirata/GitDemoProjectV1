package com.example.studentapi.controller;

import com.example.studentapi.service.StudentService;
import com.example.studentapi.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public Student getStudent() {
        return studentService.getStudent();
    }
}
