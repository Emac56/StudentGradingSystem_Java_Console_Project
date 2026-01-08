package com.main.app.Utils;

public class Clear {

    /**
     * Clears the console screen using ANSI escape codes.
     * Works on most terminals that support ANSI sequences.
     */
    public static void screen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}