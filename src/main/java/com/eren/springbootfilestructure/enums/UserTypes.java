package com.eren.springbootfilestructure.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum UserTypes {
    STUDENT("student"),
    TEACHER("teacher");

    @Getter
    private String value;
}
