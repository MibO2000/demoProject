package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.repository.Repo;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Service service;

    @GetMapping("/")
    public List<Student> get_student(){
        return service.get_student();
    }
    @PostMapping("/")
    public Student post_student(@RequestBody Student student){
        return service.post_student(student);
    }
    @DeleteMapping("/{id}")
    public List<Student> delete_mapping(@PathVariable long id){
        return service.delete_student(id);
    }
    @DeleteMapping("/")
    public List<Student> deleteMapping(@RequestBody long id){
        return service.delete_student(id);
    }
    @GetMapping("/search")
    public List<Student> findStudentByName(@RequestParam(required = false) String name){
        return service.findStudentByName(name);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable long id, @RequestBody Student student){
        return service.updateStudent(id, student);
    }
}
