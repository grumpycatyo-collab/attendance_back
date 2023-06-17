package com.example.attendance_back.controlers;

import com.example.attendance_back.Absente;
import com.example.attendance_back.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final List<Student> studentList;

    public StudentService() {
        // Initialize the absence list or fetch it from somewhere else
        Student.startStudent();
        studentList = Student.list;
    }




}