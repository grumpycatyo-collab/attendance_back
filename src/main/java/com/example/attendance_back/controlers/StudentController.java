package com.example.attendance_back.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/{grupa}")
    public ResponseEntity<ArrayList<String>> getStudentsByGroup(
            @PathVariable String grupa
    ) {
        ArrayList<String> students = studentService.getStudentsByGroup(grupa);

            return ResponseEntity.ok(students);
    }

}
