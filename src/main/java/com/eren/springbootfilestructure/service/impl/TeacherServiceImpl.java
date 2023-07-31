package com.eren.springbootfilestructure.service.impl;

import com.eren.springbootfilestructure.model.Student;
import com.eren.springbootfilestructure.model.Teacher;
import com.eren.springbootfilestructure.repository.TeacherRepository;
import com.eren.springbootfilestructure.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher saveTeachers(Teacher teacher) {
        Teacher newTeacher = createTeacher(teacher);
        return teacherRepository.save(newTeacher);
    }

    private Teacher createTeacher(Teacher teacher) {
        teacher.setCreatedTime(LocalDateTime.now());
        return teacher;
    }


}
