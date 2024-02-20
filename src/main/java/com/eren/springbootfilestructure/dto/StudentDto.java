package com.eren.springbootfilestructure.dto;

import java.util.List;

import com.eren.springbootfilestructure.model.Lecture;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private String name;
    private String surname;

    private  List<Lecture> lectures;


}
