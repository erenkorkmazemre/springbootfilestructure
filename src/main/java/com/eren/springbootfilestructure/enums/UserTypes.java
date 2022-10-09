package com.eren.springbootfilestructure.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum UserTypes {
    ADMIN("admin"),
    USER("user");

    @Getter
    private String value;
}
