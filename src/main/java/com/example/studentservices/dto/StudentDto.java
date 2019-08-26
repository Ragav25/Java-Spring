package com.example.studentservices.dto;

import java.util.List;

public class StudentDto {

    private String studentName;
    private Long studentId;
    private List<CourseDto> courseDtos;

    public StudentDto() {
    }

    public StudentDto(String studentName, Long studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public StudentDto(String studentName, Long studentId, List<CourseDto> courseDtos) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.courseDtos = courseDtos;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public List<CourseDto> getCourseDtos() {
        return courseDtos;
    }

    public void setCourseDtos(List<CourseDto> courseDtos) {
        this.courseDtos = courseDtos;
    }
}
