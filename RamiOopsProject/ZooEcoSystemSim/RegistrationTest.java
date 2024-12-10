package org.RamiOopsProject.ZooEcoSystemSim;

public class RegistrationTest {
    public static void main(String[] args) {
        Registration user = new Registration();

        user.setEmail("test@yahoo.com");
        user.setUserName("testUser123");
        user.setPassword("securePass123");

        user.displayRegistrationDetails();
    }
}
