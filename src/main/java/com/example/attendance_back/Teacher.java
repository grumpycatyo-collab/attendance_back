package com.example.attendance_back;

import jakarta.persistence.Entity;

import java.util.ArrayList;

public class Teacher extends User {
    private String grupe;
    public Teacher() {
    }

    public String getGrupe() {
        return grupe;
    }

    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }

    public static ArrayList getList() {
        return list;
    }

    public static void setList(ArrayList list) {
        Teacher.list = list;
    }

    public Teacher(String grupe) {
        this.grupe = grupe;
    }

    public Teacher(String role, Integer id, String name, String surname, String grupe) {
        super(role, id, name, surname);
        this.grupe = grupe;
    }

    public static ArrayList list = new ArrayList<Teacher>();
    public static void startTeacher() {

        list.add(new Teacher("teacher",1,"Gavrilita","Mihail","FAF-221,FAF-223,TI-221"));
        list.add(new Teacher("teacher",2,"Bostan","Viorel","FAF-222,CR-223,TI-223"));
        list.add(new Teacher("teacher",3,"Cojuhari","Elena","TI-222,CR-222,TI-222"));

    }
}
