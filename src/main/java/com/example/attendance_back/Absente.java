package com.example.attendance_back;



import java.util.Date;

public class Absente {

    private Integer id;
    private String teacher;
    private String subject;
    private Date dataabsenta;
    private Date datarecuperare;
   private AbsentaStatus status;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
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
