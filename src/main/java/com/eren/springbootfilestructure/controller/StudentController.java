package com.eren.springbootfilestructure.controller;

import com.eren.springbootfilestructure.model.Student;
import com.eren.springbootfilestructure.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/")
    @ResponseBody
    public ResponseEntity<Student> createStudents(@RequestBody Student student) {
        studentService.saveStudents(student);
        return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
    }

}
