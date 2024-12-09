package org.example;

public class Registration {

    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set succesfully.");
        } else {
            System.out.println("Invalid email. Only Yahoo emails are allowed.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && userName.length() > 9) {
            this.userName = userName;
            System.out.println("Username set successfully.");
        } else {
            System.out.println("Invalid username. It must be longer than 9 characters");
        }
    }

    public void setPassword(String password) {
        if (password != null && password.length() > 8) {
            this.password = password;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Invalid password. It must be longer than 8 characters and cannot contain the username.");
        }
    }

    public static void main(String[] args) {
        Registration registration = new Registration();

        // email test
        registration.setEmail("yoelG@yahoo.com");
        registration.setEmail("yoelG@gmail.com");

        // username Test
        registration.setUserName("yoelG9194");
        registration.setUserName("yoelG9");

        // password Test
        registration.setPassword("password123");
        registration.setPassword("yoelg91234");
    }
}
