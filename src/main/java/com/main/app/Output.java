package com.main.app;

import java.util.Scanner;
import com.main.app.AdminLogin.AdminLogin;
import com.main.app.Users.UserManager;
import com.main.app.StudentLogin.StudentAuth;
import com.main.app.Utils.Clear;
import com.main.app.AdminLogin.AdminAuth;
import com.main.app.Validations.ValidateChoice;

public class Output {

    // ===== Constants =====
    private static final String HEADER = "WELCOME TO STUDENT GRADING SYSTEM IN JAVA";
    private static final String BORDER = "=".repeat(HEADER.length() + 10);

    // ===== Static Objects =====
    private static final Scanner SC = new Scanner(System.in);
    private static final UserManager userManager = new UserManager();
    private static final Clear clear = new Clear();
    private static final AdminAuth adminAuth = new AdminAuth(userManager);
    private static final ValidateChoice input = new ValidateChoice();

    /**
     * Main display loop for the program.
     * Continuously shows the menu and handles user choices.
     */
    public void display() {
        while (true) {
            int choice = getMenuChoice();
            handleChoice(choice);
        }
    }

    /**
     * Prints the login menu and validates user choice.
     * @return user's menu selection as an integer
     */
    private int getMenuChoice() {
        clear.screen();
        printHeader();

        System.out.println("\n==== LOGIN MENU ====");
        System.out.println(" [1] Admin Menu");
        System.out.println(" [2] Student Login");
        System.out.println(" [3] Exit");
        System.out.println(BORDER);

        return input.validateChoice("Enter your choice: ");
    }

    /**
     * Handles the selected menu option.
     * @param choice the user's menu selection
     */
    private void handleChoice(int choice) {
        switch (choice) {
            case 1 -> adminAuth.showMenu();       // Admin login and menu
            case 2 -> StudentAuth.loginAsStudent(); // Student login
            case 3 -> {                            // Exit option
                if (confirmExit()) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            }
            default -> System.out.println("Invalid choice. Try again.");
        }
    }

    /**
     * Prints the program header.
     */
    private void printHeader() {
        System.out.println(BORDER);
        System.out.println(HEADER);
        System.out.println(BORDER);
    }

    /**
     * Asks the user for confirmation before exiting the program.
     * Loops until a valid input ("yes" or "no") is entered.
     * @return true if user confirms exit, false otherwise
     */
    private boolean confirmExit() {
        while (true) {
            System.out.print("Confirm Exit? (yes/no): ");
            String userInput = SC.nextLine().trim().toLowerCase();

            if (userInput.equals("yes")) return true;
            if (userInput.equals("no")) return false;

            System.out.println("Error: Input should be 'yes' or 'no'.");
        }
    }
}