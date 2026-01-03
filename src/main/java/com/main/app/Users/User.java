/*
 * Author: Jaymark Vicente
 * Description:
 * This class represents a User (Student).
 * It stores basic user information and validates login password.
 */

package com.main.app.Users;

public class User {

    // User personal information
    private String firstname;
    private String lastname;
    private String username;
    private String password;

    /*
     * Constructor for creating a User
     */
    public User(String firstname, String lastname, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    /* ========== GETTERS ========== */

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    /* ========== SETTERS ========== */

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
     * Checks if the entered password matches the user's password
     */
    public boolean checkPassword(String pass) {
        return this.password.equals(pass);
    }
}

/*
 * Author: Jaymark Vicente
 * Description:
 * This class represents the Admin account.
 * It has separate login credentials from normal users.
 */

class Admin {

    // Default admin credentials
    private String adminUsername = "Admin123";
    private int adminPassword = 1234;

    /* ========== ADMIN SETTERS ========== */

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public void setAdminPassword(int adminPassword) {
        this.adminPassword = adminPassword;
    }

    /* ========== ADMIN GETTER ========== */

    public String getAdminUsername() {
        return adminUsername;
    }

    /*
     * Checks if admin password is correct
     * Uses == because adminPassword is a primitive int
     */
    public boolean checkAdminPass(int pass) {
        return this.adminPassword == pass;
    }
}