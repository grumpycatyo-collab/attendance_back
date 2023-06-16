package com.example.attendance_back;

import jakarta.persistence.Entity;

public class Student extends User{
    private String grupa;
    private String abstente;

    public Student(String login, String role, String password, Integer id, String name, String surname, String grupa, String absente) {
        super(login, role, password, id, name, surname);
        this.grupa = grupa;
        this.abstente = absente;
    }

    public Student() {

    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String group) {
        this.grupa = group;
    }

    public String getAbstente() {
        return abstente;
    }

    public void setAbstente(String abstente) {
        this.abstente = abstente;
    }


}



