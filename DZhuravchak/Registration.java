package RegistrationEx;

public class Registration {
    private String email;
    private String username;
    private String password;


    public Registration(String email, String username, String password) {
        setEmail(email);
        setUsername(username);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Email is not accepted");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (!username.isEmpty() && username.length() > 6) {
            this.username = username;
        } else {
            System.out.println("Invalid username");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(username)) {
            this.password = password;
        } else {
            System.out.println("Invalid password");
        }
    }
    public void displayInfo(){
        if(!email.isEmpty()&&!username.isEmpty()&& !password.isEmpty()){
            System.out.println("Registration completed "+username+" "+email+" "+password);
        }
    }
}






