package com.springboot.cache.controller;

import com.springboot.cache.model.Student;
import com.springboot.cache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class StudentController {

        @Autowired
        StudentService studentService;


    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") String id){



       return new ResponseEntity<Student>(studentService.getStudent(id), HttpStatus.OK);
    }



}
