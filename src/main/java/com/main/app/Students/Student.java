package com.main.app.Students;

/**
 * Represents a Student with a name and ID.
 */
public class Student {

    // ===== Student Information =====
    private String studentName;
    private int studentId;

    /**
     * Constructor to create a new Student
     *
     * @param studentName Name of the student
     * @param studentId   Unique student ID
     */
    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    // ===== Getters =====
    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    // ===== Setters =====
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}