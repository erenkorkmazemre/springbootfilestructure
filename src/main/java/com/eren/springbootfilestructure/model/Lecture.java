package com.eren.springbootfilestructure.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Lecture {
    @Id
    @Field(name = "id")
    private String id;

    private String math;
    private String history;
    private String physic;
    private String language;

}
