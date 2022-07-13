package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "Name",nullable = false)
    private String name;
    @Column(name= "Email",nullable = true)
    private String email;
    @Column(name= "Phone Number",nullable = true)
    private String phnum;
    @Column(name= "Pass",nullable = true)
    private boolean solve;

    public Student() {
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

    public String getPhnum() {
        return phnum;
    }

    public void setPhnum(String phnum) {
        this.phnum = phnum;
    }

    public boolean isSolve() {
        return solve;
    }

    public void setSolve(boolean solve) {
        this.solve = solve;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String email, String phnum, boolean solve) {
        this.name = name;
        this.email = email;
        this.phnum = phnum;
        this.solve = solve;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phnum='" + phnum + '\'' +
                ", solve=" + solve +
                '}';
    }
}
