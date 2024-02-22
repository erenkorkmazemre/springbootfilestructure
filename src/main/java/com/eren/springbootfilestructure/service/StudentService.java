package com.eren.springbootfilestructure.service;

import com.eren.springbootfilestructure.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student saveStudents(Student student);
    Student updateStudentById(Student student, String studentId);
    List<Student> getAllStudentsByPagination(Integer pageNo, Integer pageSize, String sortBy);
    List<Student> getAllStudents();
    Optional<Student> getStudentById(String id);
}
