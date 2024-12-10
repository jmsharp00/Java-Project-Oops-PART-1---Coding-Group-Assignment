package org.RamiOopsProject.ZooEcoSystemSim;

public class Registration {

    private String email;
    private String userName;
    private String password;

    // Setter for email
    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Only yahoo emails are allowed.");
        }
    }

    // Setter for userName
    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. It must not be empty and must be longer than 6 characters.");
        }
    }

    // Setter for password
    public void setPassword(String password) {
        if (password != null && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It must be longer than 6 characters and cannot contain the username.");
        }
    }

    // Method to display registration details
    public void displayRegistrationDetails() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
    }
}
