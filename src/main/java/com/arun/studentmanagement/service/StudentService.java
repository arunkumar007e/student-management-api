
package com.arun.studentmanagement.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<String> getStudents() {
        return List.of("Arun", "Kavin", "Rahul");
    }
}
