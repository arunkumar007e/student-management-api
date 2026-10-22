
package com.arun.studentmanagement.controller;

import com.arun.studentmanagement.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/students")
    public List<String> getStudents() {
        return studentService.getStudents();
    }
}
