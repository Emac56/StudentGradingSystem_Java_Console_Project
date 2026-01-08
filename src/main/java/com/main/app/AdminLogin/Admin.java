package com.main.app.AdminLogin;

/**
 * Represents the Admin user for the Student Grading System.
 * Stores credentials and validates password.
 */
public class Admin {

    private String adminUsername;
    private String adminPassword;

    /**
     * Default Admin constructor with preset credentials.
     */
    public Admin() {
        this.adminUsername = "Admin123";
        this.adminPassword = "1234";
    }

    // ===== Getters =====
    public String getAdminUsername() {
        return adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    // ===== Setters =====
    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * Validates entered password against the admin's password.
     *
     * @param pass Password to check
     * @return true if correct, false otherwise
     */
    public boolean checkAdminPass(String pass) {
        return this.adminPassword.equals(pass);
    }
}