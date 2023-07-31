package com.eren.springbootfilestructure.repository;

import com.eren.springbootfilestructure.model.Lecture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends MongoRepository<Lecture, String> {
}
