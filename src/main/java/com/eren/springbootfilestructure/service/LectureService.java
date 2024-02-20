package com.eren.springbootfilestructure.service;

import java.util.List;
import com.eren.springbootfilestructure.model.Lecture;

public interface LectureService {

        Lecture saveLectures(Lecture lecture);
        Lecture updateLectureById(Lecture lecture, String lectureId);
        List<Lecture> getAllLectures();
}
