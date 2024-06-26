package com.myProject.QrGenerator.model.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String firstName;
     private String lastName;
     private String email;
     private int mobile;



}
