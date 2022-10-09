package com.eren.springbootfilestructure.service.impl;
import com.eren.springbootfilestructure.model.Student;
import com.eren.springbootfilestructure.repository.StudentRepository;
import com.eren.springbootfilestructure.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudents(Student student) {
        Student newStudent = createStudent(student);
        return studentRepository.save(newStudent);
    }

    private Student createStudent(Student student) {
        student.setCreatedTime(LocalDateTime.now());
        return student;
    }
}
