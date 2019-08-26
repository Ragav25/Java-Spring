package com.example.studentservices.controller;

import com.example.studentservices.dto.CourseDto;
import com.example.studentservices.service.StudentService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

    @InjectMocks
    private StudentController controller;

    @Mock
    private StudentService studentService;


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getCourses(){
        //arrange
        List<CourseDto> courseDto = new ArrayList<>();
        CourseDto courseDto1 = new CourseDto("english",1L,"test");
        courseDto.add(courseDto1);
        Mockito.when(studentService.getAllCourses(1L)).thenReturn(courseDto);

        //act
        List<CourseDto> result = controller.retrieveCourses(1L);

        //assert
        Assert.assertEquals("english", result.get(0).getCourseName());

    }



}
