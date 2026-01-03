/*
 * Author: Jaymark Vicente
 * Description:
 * This class manages users in the system.
 * It handles adding users, finding users by username,
 * and checking admin credentials.
 */

package com.main.app.Users;

import java.util.ArrayList;

public class UserManager {

    // List that stores all registered users
    private ArrayList<User> users = new ArrayList<>();

    // Single admin account
    private Admin admin = new Admin();

    /*
     * Adds a new user to the list
     * Returns false if username already exists
     * Returns true if user is successfully added
     */
    public boolean addUser(User user) {

        // Loop through all users to check duplicate usernames
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                // Username already exists
                return false;
            }
        }

        // Add user if no duplicate found
        users.add(user);
        return true;
    }

    /*
     * Finds and returns a user by username
     * Returns null if user is not found
     */
    public User getByUsername(String username) {

        // Loop through user list
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return u; // User found
            }
        }

        // User not found
        return null;
    }

    /*
     * Checks if the admin username matches
     * Returns admin user if correct
     * Returns null if incorrect
     */
    public Admin getByAdminUsername(String adminUsername) {

        // Compare given username with admin's username
        if (admin.getAdminUsername().equals(adminUsername)) {
            return admin; // Admin found
        }

        // Admin not found
        return null;
    }

    /*
     * Sets admin account (optional helper method)
     * This makes admin usable
     */
    public void setAdmin(User admin) {
        this.admin = admin;
    }
}