package com.mounika.midterm.adminportal;

public class Students {
    private String studentName;
    private Double subject1Marks;
    private Double subject2Marks;
    private Double subject3Marks;

    public Students(String studentName, Double subject1Marks, Double subject2Marks, Double subject3Marks) {
        this.studentName = studentName;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Double getSubject1Marks() {
        return subject1Marks;
    }

    public void setSubject1Marks(Double subject1Marks) {
        this.subject1Marks = subject1Marks;
    }

    public Double getSubject2Marks() {
        return subject2Marks;
    }

    public void setSubject2Marks(Double subject2Marks) {
        this.subject2Marks = subject2Marks;
    }

    public Double getSubject3Marks() {
        return subject3Marks;
    }

    public void setSubject3Marks(Double subject3Marks) {
        this.subject3Marks = subject3Marks;
    }
}
