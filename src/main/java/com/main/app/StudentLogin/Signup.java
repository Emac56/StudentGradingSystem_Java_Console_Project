package com.main.app.StudentLogin;
import com.main.app.Users.UserManager;
import com.main.app.Users.User;
import java.util.Scanner;

public class Signup {

    private static final Scanner SC = new Scanner(System.in);

    public static void registerStudent(UserManager userManager) {
        System.out.println("\n=== REGISTER NEW STUDENT ===");

        String firstname = prompt("Enter your Firstname: ");
        String lastname  = prompt("Enter your Lastname: ");
        String username  = prompt("Enter your Username: ");
        String password  = prompt("Enter your Password: ");

        User newUser = new User(firstname, lastname, username, password);

        if (userManager.addUser(newUser)) {
            System.out.println();
            System.out.println("Successfully created an account!");
            SC.nextLine();
        } else {
            System.out.println();
            System.out.println("Username already exists. Try a different one.");
            SC.nextLine();
        }
    }

    
    private static String prompt(String message) {
        System.out.print(message);
        return SC.nextLine().trim();
    }
}