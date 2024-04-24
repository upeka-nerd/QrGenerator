package com.myProject.QrGenerator.model.student.controller;


import com.myProject.QrGenerator.model.student.Student;
import com.myProject.QrGenerator.model.student.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public class StudentController {
    private  StudentService studentService;



    public ResponseEntity<List<Student>> getAllStudent(){

        return ResponseEntity.ok(studentService.getAllStudent());


    }

    public Student addStudent( @RequestBody Student student){

        return studentService.addStudent(student);
    }







}
