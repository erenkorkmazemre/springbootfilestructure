package com.eren.springbootfilestructure.repository;

import com.eren.springbootfilestructure.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    Student findAllById(String studentId);

}
