package com.eren.springbootfilestructure.service.impl;

import com.eren.springbootfilestructure.model.Lecture;
import com.eren.springbootfilestructure.repository.LectureRepository;
import com.eren.springbootfilestructure.service.LectureService;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureServiceImpl implements LectureService {

    @Autowired
    LectureRepository lectureRepository;

    @Override
    public Lecture saveLectures(Lecture lecture) {
        Lecture newLecture = createLecture(lecture);
        return lectureRepository.save(newLecture);
    }

    private Lecture createLecture(Lecture lecture) {
        lecture.setCreatedTime(LocalDateTime.now());
        return lecture;
    }

    public List<Lecture> getAllLectures() {
        return lectureRepository.findAll();
    }

    @Override
    public Lecture updateLectureById(Lecture lecture, String lectureId) {
        Lecture newLecture = putLectureById(lecture, lectureId);
        return lectureRepository.save(newLecture);
    }

    private Lecture putLectureById(Lecture lecture, String lectureId) {
        Lecture lectureUpdated = lectureRepository.findAllById(lectureId);
        lectureUpdated.setName(lecture.getName());
        lectureUpdated.setCode(lecture.getCode());
        lectureUpdated.setLastUpdated(LocalDateTime.now());
        return lectureUpdated;
    }
}
