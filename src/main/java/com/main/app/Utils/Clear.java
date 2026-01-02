package com.main.app.Utils;

public class Clear {
    public void screen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }  
}