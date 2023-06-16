package com.example.attendance_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String getRoleById(String email) {
        String role = userRepository.findRoleByEmail(email);
        return role != null ? role : "unknown";
    }
}