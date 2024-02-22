package com.eren.springbootfilestructure.service.impl;

import com.eren.springbootfilestructure.model.Student;
import com.eren.springbootfilestructure.repository.StudentRepository;
import com.eren.springbootfilestructure.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }


    @Override
    public Student saveStudents(Student student) {
        Student newStudent = createStudent(student);
        return studentRepository.save(newStudent);
    }

    @Override
    public List<Student> getAllStudentsByPagination(Integer pageNo, Integer pageSize, String sortBy)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<Student> pagedResult = studentRepository.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Student>();
        }
    }

    private Student createStudent(Student student) {
        student.setCreatedTime(LocalDateTime.now());
        return student;
    }
    @Override
    public Student updateStudentById(Student student, String studentId) {
        Student newStudent = putStudentById(student, studentId);
        return studentRepository.save(newStudent);
        
    }

    private Student putStudentById(Student student, String studentId){
        Student studentUpdated = studentRepository.findAllById(studentId);
        studentUpdated.setName(student.getName());
        studentUpdated.setSurname(student.getSurname());
        //studentUpdated.setLectures(student.getLectures());
        studentUpdated.setLastUpdated(LocalDateTime.now());
        return studentUpdated;
    }

}
