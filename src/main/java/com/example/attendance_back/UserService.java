package com.example.attendance_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String findRoleByEmail(String email) {
        return userRepository.findRoleByEmail(email);
    }
}
