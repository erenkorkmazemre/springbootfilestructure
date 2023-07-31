package com.eren.springbootfilestructure.mapper;

import com.eren.springbootfilestructure.dto.TeacherDto;
import com.eren.springbootfilestructure.model.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    TeacherDto fromTeacher(Teacher teacher);

    Teacher toTeacher(TeacherDto teacherDto);
}
