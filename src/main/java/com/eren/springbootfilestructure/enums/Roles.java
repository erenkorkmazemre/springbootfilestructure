package com.eren.springbootfilestructure.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Roles {
    ADMIN("admin"),
    USER("user");
    @Getter
    private String value;
}
