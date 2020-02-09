package com.araujo.course.endpoint.service;


import com.araujo.core.model.Course;
import com.araujo.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {

    private final CourseRepository courseRepository;

    public Iterable<Course> list (Pageable pageable){
        log.info("testing logging with lombok");
        return courseRepository.findAll();
    }
}
