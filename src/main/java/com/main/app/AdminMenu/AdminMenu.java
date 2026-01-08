package com.main.app.AdminMenu;

import com.main.app.AdminLogin.Admin;
import com.main.app.Validations.ValidateChoice;
import com.main.app.Utils.Clear;
import com.main.app.Users.UserManager;
import com.main.app.Students.StudentManager;

public class AdminMenu {

private static final String HEADER = "WELCOME TO STUDENT GRADING SYSTEM IN JAVA";  
private static final String BORDER = "=".repeat(HEADER.length() + 10);  

private UserManager userManager;  
private Admin admin;  
private StudentManager studentManager;  

public AdminMenu(UserManager userManager) {  
    this.userManager = userManager;  
    this.admin = userManager.getAdmin();  
}  

public void display() {  
    ValidateChoice choice = new ValidateChoice();  
    SelectMenu menu = new SelectMenu();   
    Clear clear = new Clear();  

    while (true) {  
        clear.screen();  
        System.out.println(BORDER);  
        System.out.println(HEADER);  
        System.out.println(BORDER);  
        System.out.println("Username: " + admin.getAdminUsername());  
        System.out.println();  
        System.out.println("==== ADMIN MENU ====");  
        System.out.println(" [1] Add Student");  
        System.out.println(" [2] Remove Student");  
        System.out.println(" [3] View All Student");  
        System.out.println(" [4] Enter/Update Student Grade");  
        System.out.println(" [5] View Student Grades");  
        System.out.println(" [6] Logout");  
        System.out.println(BORDER);  

        int c = choice.validateChoice("Enter your choice: ");  

        if (c == 6) {  
            break;  
        }  

        menu.userChoice(c);  
    }  
}

}