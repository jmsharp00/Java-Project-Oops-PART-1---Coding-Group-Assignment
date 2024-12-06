public class Registration {

    private String email;
    private String userName;
    private String password;


    public Registration() {
        this.email = null;
        this.userName = null;
        this.password = null;
    }

    // email
    public void setEmail(String email) {
        if (email.contains("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully!");
        } else {
            System.out.println("Invalid email. Only Yahoo email addresses are allowed.");
        }
    }

    // username
    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully!");
        } else {
            System.out.println("Invalid username. The username must be longer than 6 characters.");
        }
    }

    //Method to set the password
    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(this.userName)) {
            this.password = password;
            System.out.println("Password set successfully!");
        } else {
            System.out.println("Invalid password. The password must be longer than 6 characters and cannot contain the username.");
        }
    }

    //Method to get the user details
    public String getUserDetails() {
        return "Email: " + this.email + "\nUsername: " + this.userName + "\nPassword: " + this.password;
    }

    public static void main(String[] args) {
        // Creating an object of Registration class
        Registration userRegistration = new Registration();

        // Setting email, username, and password
        userRegistration.setEmail("jess.sharp@yahoo.com");
        userRegistration.setUserName("JessSharp123");
        userRegistration.setPassword("secureP@ssword");

        System.out.println(userRegistration.getUserDetails());
        userRegistration.setEmail("jess.sharp@gmail.com");
        userRegistration.setUserName("Jess");
        userRegistration.setPassword("Jess123");
    }
}