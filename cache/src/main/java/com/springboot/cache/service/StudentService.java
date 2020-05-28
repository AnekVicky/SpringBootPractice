package com.springboot.cache.service;

import com.springboot.cache.model.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {


    @Cacheable(value = "studentCache",key = "#id")
    public Student getStudent(String id){

        System.out.println("********   hitting the db  ************");
        Student student = new Student("1","Anek","Singh",7L);

        return student;

    }

}
