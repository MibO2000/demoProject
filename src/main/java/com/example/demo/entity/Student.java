package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "Name",nullable = false)
    private String name;
    @Column(name="Date_of_Birth")
    private LocalDate dob;
    @Transient
    @Column(name="Age")
    private Integer age;
    @Column(name = "Email")
    private String email;
    @Column(name= "Phone_Number")
    private String phnum;
    @Column(name= "Pass")
    private Boolean solve;

    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }

    public Student(String name,LocalDate dob, String email, String phnum, Boolean solve) {
        this.name = name;
        this.dob = dob;
        this.phnum = phnum;
        this.solve = solve;
        this.email = email;
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
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(dob,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phnum='" + phnum + '\'' +
                ", solve=" + solve +
                '}';
    }
}
