package com.eren.springbootfilestructure.controller;

import com.eren.springbootfilestructure.dto.TeacherDto;
import com.eren.springbootfilestructure.model.Student;
import com.eren.springbootfilestructure.model.Teacher;
import com.eren.springbootfilestructure.service.TeacherService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "api/v1/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/")
    public ResponseEntity<List<Teacher>> getAllStudents() {
        log.info("find all teachers");
        return ResponseEntity.ok(teacherService.findAllTeachers());
    }

}
