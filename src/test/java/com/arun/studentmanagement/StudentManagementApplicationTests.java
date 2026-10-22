
package com.arun.studentmanagement;

import com.arun.studentmanagement.service.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentManagementApplicationTests {

    @Test
    void shouldReturnStudentList() {
        StudentService studentService = new StudentService();

        List<String> students = studentService.getStudents();

        assertEquals(3, students.size());
        assertEquals("Arun", students.get(0));
    }
}
