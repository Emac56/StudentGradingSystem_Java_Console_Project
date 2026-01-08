package com.main.app.Utils;

import java.util.Scanner;

public class Pause {

    // Reusable Scanner for user input
    private static final Scanner SC = new Scanner(System.in);

    /**
     * Pauses the program until the user presses Enter.
     * Useful for letting the user read messages before continuing.
     */
    public static void screen() {
        System.out.print("\nPress Enter to continue...");
        SC.nextLine();
    }
}