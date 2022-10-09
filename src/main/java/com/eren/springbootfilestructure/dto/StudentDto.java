package com.eren.springbootfilestructure.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private String name;
    private String surname;
    private String userType;
    private String userRole;

}
