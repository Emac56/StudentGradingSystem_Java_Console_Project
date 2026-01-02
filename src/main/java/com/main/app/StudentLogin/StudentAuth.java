package com.main.app.StudentLogin;

import com.main.app.StudentLogin.Signup;
import com.main.app.StudentLogin.Login;
import com.main.app.Users.UserManager;
import com.main.app.Utils.Clear;
import com.main.app.Output;
import java.util.Scanner;
import com.main.app.Validations.ValidateChoice;

public class StudentAuth {

    private static final Scanner SC = new Scanner(System.in);
    private static String header = "WELCOME TO STUDENT GRADING SYSTEM IN JAVA";
    private static final int titleLength = header.length();
    private static final String BORDER = "=".repeat(titleLength + 5);
    private static final Clear clear = new Clear();
    private static final Output output = new Output();
    private static final ValidateChoice input = new ValidateChoice();
    
    public static void loginAsStudent() {
        UserManager userManager = new UserManager();
        
        while (true) {
            int choice = getMenuChoice();
            handleChoice(choice, userManager);
        }
    }

    // Prints the header with a border
    private static void printHeader(String message) {
        System.out.println(BORDER);
        System.out.println(message);
        System.out.println(BORDER);
        System.out.println();
    }

    // Displays the menu and reads user's choice
    private static int getMenuChoice() {
        clear.screen();
        printHeader(header);
        System.out.println();
        System.out.println("====STUDENT LOGIN====");
        System.out.println(" [1] Login");
        System.out.println(" [2] Signup");
        System.out.println(" [3] Back");
        System.out.println(" [4] Exit");
        System.out.println(BORDER);
        
        int choice = input.validateChoice("Enter your choice: ");
        return choice;
    }

    // Handles menu choices
    private static void handleChoice(int choice, UserManager userManager) {
        switch (choice) {
            case 1 -> Login.loginStudent(userManager);
            case 2 -> Signup.registerStudent(userManager);
            case 3 -> {clear.screen(); output.display();}
            case 4 -> {
                if (confirmExit()) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            }
        }
    }

    // Confirm exit from the program
    private static boolean confirmExit() {
        while (true) {
            System.out.print("Confirm Exit? (yes/no): ");
            String input = SC.nextLine().trim().toLowerCase();

            switch (input) {
                case "yes" -> { return true; }
                case "no" -> { return false; }
                default -> System.out.println("Error: Input should be 'yes' or 'no'.");
            }
        }
    }
}