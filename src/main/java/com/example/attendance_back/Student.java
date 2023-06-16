package com.example.attendance_back;

import jakarta.persistence.Entity;

@Entity
public class Student extends User{
    private String group;
    private Absente abstente;

    public Student(String login, String password, Integer id, String name, String surname, String group, Absente abstente) {
        super(login, password, id, name, surname);
        this.group = group;
        this.abstente = abstente;
    }

    public Student() {

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAbstente(Absente abstente) {
        this.abstente = abstente;
    }


}



