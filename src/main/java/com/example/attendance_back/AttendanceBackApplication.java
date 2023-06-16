package com.example.attendance_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendanceBackApplication {
    @Autowired
    private static UserRepository userRepository;


    public static void main(String[] args) {
        SpringApplication.run(AttendanceBackApplication.class, args);
        try {
            String email = "john_doe"; // Replace with a valid email in your database

            String role = userRepository.findRoleByEmail(email);
            System.out.println("Role: " + role);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
