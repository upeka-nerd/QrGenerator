package com.myProject.QrGenerator.model.student;

import com.myProject.QrGenerator.model.student.repo.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;


    public List<Student> getAllStudent(){

        return studentRepository.findAll();
    }








}
