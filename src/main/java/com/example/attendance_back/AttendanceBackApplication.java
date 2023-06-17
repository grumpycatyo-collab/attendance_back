package com.example.attendance_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@SpringBootApplication
public class AttendanceBackApplication  {

    private final UserRepository userRepository;

    @Autowired
    public AttendanceBackApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args)  throws IOException {
        SpringApplication.run(AttendanceBackApplication.class, args);
    }

    /*@Override
    public void run(String... args) {
        String email = "john_doe"; // Provide the email address for which you want to retrieve the role
        String role = userRepository.findRoleByEmail(email);
        System.out.println("Role for email " + email + ": " + role);
    }*/
}

