package com.example.attendance_back;

public class Student extends User{
    private String group;
    private Absente abstente;

    public Student(String group, Absente abstente) {
        this.group = group;
        this.abstente = abstente;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Absente getAbstente() {
        return abstente;
    }

    public void setAbstente(Absente abstente) {
        this.abstente = abstente;
    }


}



