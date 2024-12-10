public class RegistrationTest {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully.");
        } else {
            System.out.println("Invalid email. Only Yahoo email addresses are allowed.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully.");
        } else {
            System.out.println("Invalid username. Username cannot be empty and must be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password != null && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
            System.out.println("Password set successfully.");
        } else if (password.contains(userName)) {
            System.out.println("Invalid password. Password cannot contain the username.");
        } else {
            System.out.println("Invalid password. Password cannot be empty and must be longer than 6 characters.");
        }
    }

    public void displayInfo() {
        System.out.println("Registration Details:");
        System.out.println("Email: " + (email != null ? email : "Not set"));
        System.out.println("Username: " + (userName != null ? userName : "Not set"));
        System.out.println("Password: " + (password != null ? "*******" : "Not set"));
    }

    public static void main(String[] args) {
        RegistrationTest reg = new RegistrationTest();

        reg.setEmail("example@yahoo.com");
        reg.setUserName("user1234");
        reg.setPassword("securepassword");

        reg.setEmail("example@gmail.com");
        reg.setUserName("usr");
        reg.setPassword("user1234pass");

        reg.displayInfo();
    }
}


