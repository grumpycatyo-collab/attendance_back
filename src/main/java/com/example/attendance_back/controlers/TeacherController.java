package com.example.attendance_back.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grupe")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/{teacherName}")
    public ResponseEntity<String> getGroupsByTeacherName(
            @PathVariable String teacherName
    ) {
        String groups = teacherService.getGroupsByTeacherName(teacherName);
        if (groups == null) {
            return ResponseEntity.ok("No groups found for the specified teacher.");
        } else {
            return ResponseEntity.ok(groups);
        }
    }
}