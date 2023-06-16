package com.example.attendance_back;

import jakarta.persistence.Entity;

@Entity
public class Teacher extends User {

    public Teacher(String login, String password, Integer id, String name, String surname) {
        super(login, password, id, name, surname);
    }
}
