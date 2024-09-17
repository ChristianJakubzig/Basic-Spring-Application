package com.example.User_Management;

public class User {

    private Long id;
    private String name;
    private String email;
    private int alter;

    public User(Long id, String name, String email, int alter ){
        this.id = id;
        this.name = name;
        this.email = email;
        this.alter = alter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
