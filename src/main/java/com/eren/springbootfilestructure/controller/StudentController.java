package com.eren.springbootfilestructure.controller;

import com.eren.springbootfilestructure.dto.StudentDto;
import com.eren.springbootfilestructure.mapper.StudentMapper;
import com.eren.springbootfilestructure.model.Student;
import com.eren.springbootfilestructure.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {

    StudentService studentService;

    StudentMapper studentMapper;

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents() {
        log.info("find all students");
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable String id) {
        log.info("find all students");
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudentsByPagination(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "5") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy)
    {
        List<Student> list = studentService.getAllStudentsByPagination(pageNo, pageSize, sortBy);

        return new ResponseEntity<>(list, HttpStatus.OK);
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
