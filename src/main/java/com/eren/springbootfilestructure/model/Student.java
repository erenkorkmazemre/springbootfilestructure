package com.eren.springbootfilestructure.model;


import com.eren.springbootfilestructure.enums.Roles;
import com.eren.springbootfilestructure.enums.UserTypes;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false,unique = true)
    private String name;
    @Column(name = "surname")
    private String surname;
    @Builder.Default
    @Column(name = "user_type")
    private String userType = UserTypes.STUDENT.getValue();
    @Builder.Default
    @Column(name = "user_role")
    private String userRole = Roles.USER.getValue();
    @Builder.Default
    @Column(name = "is_active")
    private Boolean isActive = Boolean.TRUE;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_time")
    private LocalDateTime createdTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Lecture lectureSet;

}
