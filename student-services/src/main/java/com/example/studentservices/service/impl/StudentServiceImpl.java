package com.example.studentservices.service.impl;

import com.example.studentservices.dto.CourseDto;
import com.example.studentservices.dto.StudentDto;
import com.example.studentservices.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private static List<StudentDto> studentDtos = new ArrayList<>();

    static {
        CourseDto course1 = new CourseDto("English", 123L, "Teach us english");
        CourseDto course2 = new CourseDto("Physics", 12L, "Teach us Physics");
        CourseDto course3 = new CourseDto("Computer", 11L, "Teach us Programming");

        StudentDto student1 = new StudentDto("Joe", 1L, new ArrayList<>(Arrays.asList(course1, course2)));
        StudentDto student2 = new StudentDto("Chandler", 2L, new ArrayList<>(Arrays.asList(course1, course3)));
        studentDtos.add(student1);
        studentDtos.add(student2);

    }

    @Override
    public List<CourseDto> getAllCourses(Long studentId){

        for (StudentDto student: studentDtos ){
            if(student.getStudentId() == studentId){
                return student.getCourseDtos();
            }
        }
        return null;
    }

    @Override
    public String getCourseDetails(Long studentId, Long courseId){

        for (CourseDto course: getAllCourses(studentId)){

            if(course.getCourseId() == courseId){

                return course.getCourseDetail();
            }
        }

        return null;
    }
}
