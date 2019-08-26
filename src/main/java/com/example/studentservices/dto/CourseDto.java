package com.example.studentservices.dto;

public class CourseDto {

    private String courseName;
    private Long courseId;
    private String courseDetail;

    public CourseDto(String courseName, Long courseId, String courseDetail) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseDetail = courseDetail;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }
}
