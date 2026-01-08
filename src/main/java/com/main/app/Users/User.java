/*
 * Author: Jaymark Vicente
 * Description:
 * This class represents a User (Student).
 * Stores basic user information and validates login credentials.
 */

package com.main.app.Users;

public class User {

    // ===== User personal information =====
    private String firstname;
    private String lastname;
    private String username;
    private String password;

    /**
     * Constructor to create a new User
     *
     * @param firstname User's first name
     * @param lastname User's last name
     * @param username User's username
     * @param password User's password
     */
    public User(String firstname, String lastname, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    // ===== Getters =====
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public String getUsername() { return username; }

    // ===== Setters =====
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public void setPassword(String password) { this.password = password; }

    /**
     * Validates the entered password against the user's password
     *
     * @param pass Password to check
     * @return true if the password matches, false otherwise
     */
    public boolean checkPassword(String pass) {
        return this.password.equals(pass);
    }
}