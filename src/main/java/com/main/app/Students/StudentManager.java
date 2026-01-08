package com.main.app.Students;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages a list of students.
 */
public class StudentManager {

    // List to store all students
    private final List<Student> students = new ArrayList<>();

    /**
     * Adds a student to the list if the name is not already taken.
     *
     * @param student The student to add
     * @return true if added successfully, false if a student with the same name already exists
     */
    public boolean addStudent(Student student) {
        if (getByName(student.getStudentName()) != null) {
            return false; // Student name already exists
        }
        students.add(student);
        return true;
    }

    /**
     * Retrieves a student by their name
     *
     * @param name Name of the student to search
     * @return Student object if found, null otherwise
     */
    public Student getByName(String name) {
        for (Student s : students) {
            if (s.getStudentName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    /**
     * Returns all students as a new list
     *
     * @return list of all students
     */
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    /**
     * Returns the total number of students
     *
     * @return student count
     */
    public int getStudentCount() {
        return students.size();
    }
}