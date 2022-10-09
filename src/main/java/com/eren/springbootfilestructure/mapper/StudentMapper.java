package com.eren.springbootfilestructure.mapper;
import com.eren.springbootfilestructure.dto.StudentDto;
import com.eren.springbootfilestructure.model.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDto fromStudent(Student student);

    Student toStudent(StudentDto studentDto);


}
