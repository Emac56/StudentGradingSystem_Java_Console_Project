package com.main.app.Students;
import java.util.ArrayList;
public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    
    public boolean addStudent(Student student) {
        for (Student s : students) {
    if (s.getStudentName().equals(student.getStudentName())) {
        return false;
    }
        }
        students.add(student);
        return true;
    }
}
