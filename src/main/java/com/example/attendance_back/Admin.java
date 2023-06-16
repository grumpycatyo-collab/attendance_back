package com.example.attendance_back;



public class Admin extends User{


    public Admin(String login, String role, String password, Integer id, String name, String surname) {
        super(login, role, password, id, name, surname);
    }

    public Admin() {

    }
}
