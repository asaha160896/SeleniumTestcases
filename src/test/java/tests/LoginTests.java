package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test(description = "Positive: Login with valid Admin credentials should land on Dashboard")
    public void testLoginWithValidCredentials() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded(), "Dashboard should be displayed after valid login");
    }

    @Test(description = "Negative: Login with invalid password should show error message")
    public void testLoginWithInvalidPassword() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "wrongpass");
        String err = login.getErrorMessage();
        Assert.assertFalse(err.isEmpty(), "Error message should be displayed for invalid login");
    }

    @Test(description = "Negative: Blank username and/or password validations")
    public void testLoginWithBlankCredentials() {
        LoginPage login = new LoginPage(driver);
        login.login("", "");
        String err = login.getErrorMessage();
        Assert.assertFalse(err.isEmpty(), "Validation message should be shown for blank credentials");
    }
}
