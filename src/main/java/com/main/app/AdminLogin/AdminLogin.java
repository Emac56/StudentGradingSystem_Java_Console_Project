package com.main.app.AdminLogin;
import com.main.app.AdminMenu.AdminMenu;
import com.main.app.Utils.Pause;
import java.util.Scanner;
import com.main.app.Users.UserManager;

public class AdminLogin {
    private static final Scanner sc = new Scanner(System.in);
    public static void loginAdmin(Admin admin,UserManager userManager) {
        
        AdminMenu menu = new AdminMenu(userManager);
        Pause pause = new Pause();
        System.out.println("\n==== ADMIN LOGIN ====");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (admin.getAdminUsername().equals(username) && admin.checkAdminPass(password)) {
            System.out.println("Login Successful!");
            pause.screen();
            menu.display();
            
        } else {
            System.out.println("Invalid Credentials.");
            pause.screen();
            return;
        }
        pause.screen();
    }
}