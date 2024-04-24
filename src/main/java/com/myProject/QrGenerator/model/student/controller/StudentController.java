package com.myProject.QrGenerator.model.student.controller;


import com.myProject.QrGenerator.model.student.Student;
import com.myProject.QrGenerator.model.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/students")
public class StudentController {
    private final StudentService studentService;


    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudent(){

        return ResponseEntity.ok(studentService.getAllStudent());
    }
    @PostMapping("/save")
    public Student addStudent( @RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable  long id){
        return studentService.findById(id);
    }






}
