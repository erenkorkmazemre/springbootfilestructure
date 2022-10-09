package com.eren.springbootfilestructure.service;

import com.eren.springbootfilestructure.model.Student;
import com.eren.springbootfilestructure.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void saveStudents(Student student) {
        student.setCreatedTime(LocalDateTime.now());
        studentRepository.save(student);
    }
}
