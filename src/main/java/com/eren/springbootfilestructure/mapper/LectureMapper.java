package com.eren.springbootfilestructure.mapper;

import com.eren.springbootfilestructure.dto.LectureDto;
import com.eren.springbootfilestructure.model.Lecture;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LectureMapper {
    
    LectureDto fromLecture(Lecture lecture);

    Lecture toLecture(LectureDto lectureDto);
}
