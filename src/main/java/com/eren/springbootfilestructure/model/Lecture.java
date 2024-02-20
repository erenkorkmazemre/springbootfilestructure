package com.eren.springbootfilestructure.model;

import lombok.*;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Lecture {

    @Id
    private String id;

    @Field(name = "name")
    private String name; // Turkish, English etc.
    @Field(name = "code")
    private String code; // TR, ENG etc.

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Field(name = "created_time")
    private LocalDateTime createdTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Field(name = "last_updated")
    private LocalDateTime lastUpdated;
}
