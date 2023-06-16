package com.example.attendance_back;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class User {
    private String login;
    private String password;
    @Id
    private Integer id;
    private String  name;
    private String surname;

    protected User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public User(String login, String password, Integer id, String name, String surname) {
        this.login = login;
        this.password = password;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
