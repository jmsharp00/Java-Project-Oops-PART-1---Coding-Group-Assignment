package EsatJavaProject;

public class Registration {

    private String email;
    private String userName;
    private String password;


    public Registration() {
        this.email = null;
        this.userName = null;
        this.password = null;
    }

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set to: " + this.email);
        } else {
            System.out.println("Invalid email. Only Yahoo email is allowed.");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set to: " + this.userName);
        } else {
            System.out.println("Invalid username. Username must be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6) {
            if (!password.contains(this.userName)) {
                this.password = password;
                System.out.println("Password set successfully.");
            } else {
                System.out.println("Invalid password. Password cannot contain the username.");
            }
        } else {
            System.out.println("Invalid password. Password must be longer than 6 characters.");
        }
    }

    public void getUserInfo() {
        System.out.println("Email: " + this.email);
        System.out.println("Username: " + this.userName);
        System.out.println("Password: " + this.password);
    }

    public static void main(String[] args) {

        Registration user = new Registration();


        user.setEmail("Esat1515gk@yahoo.com");
        user.setUserName("Esat1234");
        user.setPassword("securepassword");


        user.setEmail("Esat1515gk@gmail.com");
        user.setUserName("esat");
        user.setPassword("esat12");


        user.getUserInfo();

    }

}
