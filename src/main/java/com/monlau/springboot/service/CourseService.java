package com.monlau.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.monlau.springboot.model.Course;
import com.monlau.springboot.repository.CourseRepository;
import java.util.List;


@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
    return courseRepository.findAll();}
}
