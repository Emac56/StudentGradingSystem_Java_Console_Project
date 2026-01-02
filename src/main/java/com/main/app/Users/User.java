package com.main.app.Users;

public class User {

private String firstname;  
private String lastname;  
private String username;  
private String password;  
  
public User(String firstname, String lastname, String username, String password) {  
    this.firstname = firstname;  
    this.lastname = lastname;  
    this.username = username;  
    this.password = password;  
}  
  
public String getFirstname() { return firstname; }  
public String getLastname()  { return lastname; }  
public String getUsername()  { return username; }  

public void setFirstname(String firstname) { this.firstname = firstname; }  
public void setLastname(String lastname)   { this.lastname = lastname; }  
public void setPassword(String password)   { this.password = password; }  
  
public boolean checkPassword(String pass) {  
    return this.password.equals(pass);  
}

}
class Admin {
    private String adminUsername = "Admin123";
    private int adminPassword = 1234;
    
    Admin(String adminUsername,int adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }
    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }
    public void setAdminPassword(int adminPassword) {
        this.adminPassword = adminPassword;
    }
    