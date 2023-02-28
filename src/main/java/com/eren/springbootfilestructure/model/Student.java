package com.eren.springbootfilestructure.model;


import com.eren.springbootfilestructure.enums.Roles;
import com.eren.springbootfilestructure.enums.UserTypes;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Student {

    @Id
    private String id;

    @Field(name = "name")
    @NotEmpty(message = "User's first name must not be null")
    private String name;
    @Field(name = "surname")
    @NotBlank(message = "User's last name must not be null")
    private String surname;
    @Builder.Default
    @Field(name = "user_type")
    private String userType = UserTypes.STUDENT.getValue();
    @Builder.Default
    @Field(name = "user_role")
    private String userRole = Roles.USER.getValue();
    @Builder.Default
    @Field(name = "is_active")
    private Boolean isActive = Boolean.TRUE;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Field(name = "created_time")
    private LocalDateTime createdTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Field(name = "last_updated")
    private LocalDateTime lastUpdated;


}
