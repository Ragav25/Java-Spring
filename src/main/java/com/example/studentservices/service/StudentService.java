package com.example.studentservices.service;

import com.example.studentservices.dto.CourseDto;

import java.util.List;

public interface StudentService {

    public List<CourseDto> getAllCourses(Long studentId);

    public String getCourseDetails(Long studentId, Long courseId);

}
