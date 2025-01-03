package main.java.com.example.automation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    @Test
    public void testValidateLogin() {
        LoginService loginService = new LoginService();
        boolean isValid = loginService.validateLogin("testUser", "testPassword");
        assertTrue(isValid, "Login should be valid for correct credentials");
    }

    @Test
    public void testGetDashboardTitle() {
        LoginService loginService = new LoginService();
        String title = loginService.getDashboardTitle();
        assertEquals("Dashboard", title, "Dashboard title should match");
    }
}
