package com.main.app.Students;

public class Student {
    private String studentName;
    private int studentId;
    
    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;       
    }
    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}