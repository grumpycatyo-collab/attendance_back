package com.example.attendance_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendanceBackApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    @Autowired
    public AttendanceBackApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(AttendanceBackApplication.class, args);
    }

    @Override
    public void run(String... args) {
        String email = "john_doe"; // Provide the email address for which you want to retrieve the role
        String role = userRepository.findRoleByEmail(email);
        System.out.println("Role for email " + email + ": " + role);
    }
}

