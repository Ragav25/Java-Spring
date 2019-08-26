package com.example.studentservices.controller;

import com.example.studentservices.dto.CourseDto;
import com.example.studentservices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{studentId}/courses")
    public List<CourseDto> retrieveCourses(@PathVariable Long studentId){
        List<CourseDto> result =  studentService.getAllCourses(studentId);
        return result;
    }

    @GetMapping("/student/{studentId}/courses/{courseId}")
    public String retrieveCourseDetails(@PathVariable(value = "studentId") Long studentId,
                                        @PathVariable(value = "courseId") Long courseId){
        return studentService.getCourseDetails(studentId, courseId);
    }

}
