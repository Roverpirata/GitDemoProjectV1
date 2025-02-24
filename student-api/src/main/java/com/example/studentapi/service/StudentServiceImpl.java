package com.example.studentapi.service;

import com.example.studentapi.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getStudent() {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(20);
        return student;
    }
}
