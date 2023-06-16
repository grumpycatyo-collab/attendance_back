package com.example.attendance_back;

import jakarta.persistence.Entity;

@Entity
public class Student extends User{
    private String grupa;
    private String abstente;

    public Student(String login, String password, Integer id, String name, String surname, String group, String abstente) {
        super(login, password, id, name, surname);
        this.grupa = group;
        this.abstente = abstente;
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



