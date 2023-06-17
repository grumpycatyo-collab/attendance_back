package com.example.attendance_back.controlers;

import com.example.attendance_back.Student;
import com.example.attendance_back.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {


    private final List<Teacher> teacherList;

    public TeacherService() {
        // Initialize the absence list or fetch it from somewhere else
        Teacher.startTeacher();
        teacherList = Teacher.list;
    }

    public String getGroupsByTeacherName(String teacherName) {
        String groups = null;
        for (Teacher teacher : teacherList) {
            String t = teacher.getName()+ teacher.getSurname();
            if (t.equalsIgnoreCase(teacherName)) {
                groups = teacher.getGrupe();
                break;
            }
        }
        return groups;
    }
}