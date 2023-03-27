package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repo repo;
    public List<Student> get_student(){
        return repo.findAll();
    }
    public Student post_student(Student student){
        Student _student = repo.save(
                new Student(student.getName(),student.getDob(), student.getEmail(), student.getPhnum(), student.isSolve()));
        return _student;
    }

    public List<Student> delete_student(long id) {
        try{
            repo.deleteById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return repo.findAll();
    }

    public List<Student> findStudentByName(String name) {
        List<Student> student = new ArrayList<>();
        try {
            if (name == null){
                repo.findAll().forEach(student::add);
            } else {
                repo.findStudentByName(name).forEach(student::add);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return student;
    }

    public Student updateStudent(long id, Student student) {
        Optional<Student> studentData = repo.findById(id);
        try{
            Student _student = studentData.get();
            _student.setId(id);
            _student.setName(student.getName());
            _student.setDob(student.getDob());
            _student.setEmail(student.getEmail());
            _student.setPhnum(student.getPhnum());
            repo.save(_student);
            return _student;
        }catch (Exception e) {
            e.printStackTrace();
            return new Student();
        }
    }
}
