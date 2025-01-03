package com.example.automation;

/**
 * A simple service class that simulates login functionality.
 */
public class LoginService {

    /**
     * Validates the login credentials.
     *
     * @param username The username entered by the user.
     * @param password The password entered by the user.
     * @return A boolean indicating whether the login credentials are valid.
     */
    public boolean validateLogin(String username, String password) {
        // Simulating credential validation
        String validUsername = "testUser";
        String validPassword = "testPassword";

        return username.equals(validUsername) && password.equals(validPassword);
    }

    /**
     * Retrieves the dashboard title upon successful login.
     *
     * @return The title of the dashboard page.
     */
    public String getDashboardTitle() {
        return "Dashboard";
    }
}
