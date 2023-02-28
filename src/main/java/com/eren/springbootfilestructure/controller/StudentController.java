package com.eren.springbootfilestructure.controller;

import com.eren.springbootfilestructure.dto.StudentDto;
import com.eren.springbootfilestructure.mapper.StudentMapper;
import com.eren.springbootfilestructure.model.Student;
import com.eren.springbootfilestructure.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    StudentMapper studentMapper;

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents() {
        log.info("find all students");
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @Operation(summary = "Create a Student")
    @PostMapping("/")
    @ResponseBody
    public ResponseEntity<Student> createStudents(@RequestBody StudentDto studentDto) {
        log.info("create student : {}", studentDto);
        Student student = studentService.saveStudents(studentMapper.toStudent(studentDto));
        return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
    }

}
