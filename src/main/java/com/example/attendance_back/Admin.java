package com.example.attendance_back;


import java.util.ArrayList;

public class Admin extends User{


    public Admin(String role,Integer id, String name, String surname) {
        super(role,id, name, surname);
    }

    public Admin() {

    }


    static ArrayList list = new ArrayList<Admin>();
    public static void startAdmin() {

        list.add(new Admin("admin",1,"Admin","Dima"));

    }
}
