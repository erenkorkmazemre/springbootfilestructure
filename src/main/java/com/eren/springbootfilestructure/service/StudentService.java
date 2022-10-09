package com.eren.springbootfilestructure.service;

import com.eren.springbootfilestructure.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudents(Student student);

    List<Student> getAllStudents();
}
