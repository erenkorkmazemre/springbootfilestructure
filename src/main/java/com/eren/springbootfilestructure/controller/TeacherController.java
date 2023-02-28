package com.eren.springbootfilestructure.controller;

import com.eren.springbootfilestructure.dto.TeacherDto;
import com.eren.springbootfilestructure.mapper.TeacherMapper;
import com.eren.springbootfilestructure.model.Teacher;
import com.eren.springbootfilestructure.service.TeacherService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@AllArgsConstructor
@RequestMapping(value = "api/v1/teachers")
public class TeacherController {

    TeacherService teacherService;
    TeacherMapper teacherMapper;

    @GetMapping("/")
    public ResponseEntity<List<Teacher>> getAllStudents() {
        log.info("find all teachers");
        return ResponseEntity.ok(teacherService.findAllTeachers());
    }

    @Operation(summary = "Create a Teacher")
    @PostMapping("/")
    @ResponseBody
    public ResponseEntity<Teacher> createTeachers(@RequestBody TeacherDto teacherDto) {
        log.info("create student : {}", teacherDto);
        Teacher teacher = teacherService.saveTeachers(teacherMapper.toTeacher(teacherDto));
        return new ResponseEntity<>(teacher, HttpStatus.ACCEPTED);
    }

}
