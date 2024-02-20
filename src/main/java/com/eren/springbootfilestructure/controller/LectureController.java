package com.eren.springbootfilestructure.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.eren.springbootfilestructure.dto.LectureDto;
import com.eren.springbootfilestructure.mapper.LectureMapper;
import com.eren.springbootfilestructure.model.Lecture;
import com.eren.springbootfilestructure.service.LectureService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
@RequestMapping(value = "api/v1/lectures")
public class LectureController {

    LectureService lectureService;
    LectureMapper lectureMapper;

    @Operation(summary = "Create a Lecture")
    @PostMapping("/")
    @ResponseBody
    public ResponseEntity<Lecture> createLectures(@RequestBody LectureDto lectureDto) {
        log.info("create lecture : {}", lectureDto);
        Lecture lecture = lectureService.saveLectures(lectureMapper.toLecture(lectureDto));
        return new ResponseEntity<>(lecture, HttpStatus.ACCEPTED);
    }


    @Operation(summary = "Get all Lectures")
    @GetMapping("/")
    public ResponseEntity<List<Lecture>> getAllLectures() {
        log.info("get all lectures : {}");
        return ResponseEntity.ok(lectureService.getAllLectures());
    }
    
    @Operation(summary = "Update lecture by id")
    @PutMapping("/{lectureId}")
    public ResponseEntity<Lecture> updateLectureById(@RequestBody LectureDto lectureDto, @PathVariable String lectureId) {
        log.info("update lecture by id : {}", lectureDto);
        Lecture lecture = lectureService.updateLectureById(lectureMapper.toLecture(lectureDto), lectureId);
        return new ResponseEntity<>(lecture, HttpStatus.ACCEPTED);
    }
}
