package com.example.attendance_back;

import jakarta.persistence.Entity;

import java.util.ArrayList;

@Entity
public class Teacher extends User {
    public Teacher() {
    }

    public Teacher(String role, Integer id, String name, String surname) {
        super(role, id, name, surname);
    }

    static ArrayList list = new ArrayList<Teacher>();
    public static void startTeacher() {

        list.add(new Teacher("teacher",1,"Gavrilita","Mihail"));
        list.add(new Teacher("teacher",2,"Bostan","Viorel"));
        list.add(new Teacher("teacher",3,"Cojuhari","Elena"));

    }
}
