package com.example.attendance_back;

import jakarta.persistence.Entity;

import java.util.ArrayList;

public class Student extends User{
    private String grupa;

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public Student(String grupa) {
        this.grupa = grupa;
    }


    public Student(String role, Integer id, String name, String surname, String grupa) {
        super(role, id, name, surname);
        this.grupa = grupa;
    }


    static ArrayList list = new ArrayList<Student>();
    public static void startStudent() {

        list.add(new Student("student",1,"Gusev","Roman","FAF-222"));
        list.add(new Student("student",2,"Popa","Maria","FAF-221"));
        list.add(new Student("student",3,"Georgescu","Andrei","FAF-222"));
        list.add(new Student("student",4,"Ionescu" ,"George","FAF-223"));
        list.add(new Student("student",5,"Popescu","Ion","FAF-221"));
        list.add(new Student("student",6,"Vasilescu","Ioana","FAF-222"));
        list.add(new Student("student",7,"Ionescu","Ana","FAF-223"));
        list.add(new Student("student",8,"Vasilescu","Maria","FAF-221"));
        list.add(new Student("student",9,"Grigoras","Maria","FAF-223"));
        list.add(new Student("student",10,"Popescu","Andrei","FAF-222"));
        list.add(new Student("student",11,"Gluga","Andrei","FAF-223"));
        list.add(new Student("student",12,"Popescu","Maria","FAF-221"));
        list.add(new Student("student",13,"Plamadeala","Maria","FAF-221"));
        list.add(new Student("student",14,"Vasile","Ion","FAF-222"));
        list.add(new Student("student",15,"Ciornii","Andrei","FAF-223"));
    }



    }




