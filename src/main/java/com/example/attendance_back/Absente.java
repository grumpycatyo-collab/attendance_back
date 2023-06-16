package com.example.attendance_back;

import java.util.Date;

public class Absente {
    private Integer id;
    private Teacher teacher;
    private String subject;
    private Date dataabsenta;
    private Date datarecuperare;
   private AbsentaStatus status;

    public Absente(Integer id, Teacher teacher, String subject, Date dataabsenta, Date datarecuperare, AbsentaStatus status) {
        this.id = id;
        this.teacher = teacher;
        this.subject = subject;
        this.dataabsenta = dataabsenta;
        this.datarecuperare = datarecuperare;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDataabsenta() {
        return dataabsenta;
    }

    public void setDataabsenta(Date dataabsenta) {
        this.dataabsenta = dataabsenta;
    }

    public Date getDatarecuperare() {
        return datarecuperare;
    }

    public void setDatarecuperare(Date datarecuperare) {
        this.datarecuperare = datarecuperare;
    }

    public AbsentaStatus getStatus() {
        return status;
    }

    public void setStatus(AbsentaStatus status) {
        this.status = status;
    }
}
