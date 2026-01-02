package com.main.app.StudentLogin;
import com.main.app.Users.UserManager;
import com.main.app.Users.User;
import java.util.Scanner;
import com.main.app.Utils.Clear;

public class Login {
    private static final Scanner scan = new Scanner(System.in);
    private static final Clear clear = new Clear();
    
    public static void loginStudent(UserManager userManager) {
        String username = prompt("Enter username: ");
        String password = prompt("Enter password: ");
        
        User user = userManager.getByUsername(username);
        
        if (user == null) {
            System.out.println();
            System.out.println("You don't have an account. Please sign up first.");
            scan.nextLine();
            return;
        }
        
        if (user.checkPassword(password)) {
            System.out.println();
            System.out.println("Login Successful!");
            scan.nextLine();
            return;
        }
        
        System.out.println();
        System.out.println("Incorrect password. Try again.");
        scan.nextLine();
        
        return;
    }
    private static String prompt(String message) {
        System.out.print(message);
        return scan.nextLine().trim();
    }
}