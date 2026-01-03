package com.main.app;
import java.util.Scanner;
import com.main.app.Utils.Clear;
import com.main.app.StudentLogin.StudentAuth;
import java.util.InputMismatchException;
import com.main.app.Validations.ValidateChoice;

import java.util.Scanner;

public class Output {
    
    private static String header = "WELCOME TO STUDENT GRADING SYSTEM IN JAVA";
    private static final int titleLength = header.length();
    private static final String BORDER = "=".repeat(titleLength + 13);
    private static final Scanner SC = new Scanner(System.in);
    private static final Clear clear = new Clear();
    private static final ValidateChoice input = new ValidateChoice();
    
    public void display() {
        
        while (true) {
            int choice = getMenuChoice();
            handleChoice(choice);
        }
    }

    // Prints the header with a border
    private static void printHeader() {
        System.out.println(BORDER);
        System.out.println(header);
        System.out.println(BORDER);
    }

    // Displays the menu and reads user's choice
    private static int getMenuChoice() {
        clear.screen();
        printHeader();
        System.out.println();
        System.out.println("==== LOGIN MENU ====");
        System.out.println(" [1] Admin Login");
        System.out.println(" [2] Student Login");
        System.out.println(" [3] Exit");
        System.out.println(BORDER);
        int choice = input.validateChoice("Enter your choice: ");
        return choice;
    }

    // Handles menu choices
    private static void handleChoice(int choice) {
        switch (choice) {
            //case 1 -> //TeacherLogin
            case 2 -> StudentAuth.loginAsStudent();
            case 3 -> {
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
                case "yes" -> {return true; }
                case "no" -> {return false; }
                default -> {
                    System.out.println("Error: Input should be 'yes' or 'no'.");
                    SC.nextLine();
                }
            }
        }
    }
}