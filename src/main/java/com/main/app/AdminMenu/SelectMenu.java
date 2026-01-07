package com.main.app.AdminMenu;
import com.main.app.Output;
import com.main.app.Students.StudentManager;

public class SelectMenu {
    private Output output = new Output();
    public void userChoice(int choice) {
        
        StudentManager studentManager = new StudentManager();
        AddStudent addStudent = new AddStudent(studentManager);
        switch (choice) {
            case 1 -> addStudent.add();
            //case 2 -> //Remove Student
            //case 3 -> //View All Student
            //case 4 -> //Enter/Update Grade
            //case 5 -> //View Student Grade
            case 6 -> output.display(); // logout
        }
    }
}