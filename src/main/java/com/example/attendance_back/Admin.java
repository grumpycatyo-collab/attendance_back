package com.example.attendance_back;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User{


    public Admin(String login, String password, Integer id, String name, String surname) {
        super(login, password, id, name, surname);
    }
}
