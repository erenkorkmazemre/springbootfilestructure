package com.eren.springbootfilestructure.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Long id;

    @Column(name = "namee")
    private String name;
    private String surname;

}
