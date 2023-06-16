package com.example.attendance_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String getRoleById(String id) {
        String role = userRepository.findRoleByEmail(id);
        return role != null ? role : "unknown";
    }
}