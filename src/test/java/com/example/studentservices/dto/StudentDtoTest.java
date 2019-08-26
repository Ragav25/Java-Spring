package com.example.studentservices.dto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class StudentDtoTest {

    private StudentDto studentDto = new StudentDto();

    @Before
    public void setUp(){
        studentDto.setStudentName("sam");
        studentDto.setStudentId(25L);
    }

    @Test
    public void assertStudentDto(){

        Assert.assertEquals("sam", studentDto.getStudentName());
        Assert.assertEquals("25", studentDto.getStudentId().toString());
    }

}
