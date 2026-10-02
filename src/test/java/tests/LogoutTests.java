package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LogoutTests extends BaseTest {

    @Test(description = "Logout should terminate the session and redirect to login")
    public void testLogout() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded());

        // Perform logout via URL as a fallback; ideally use menu click
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/logout");
        Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"), "After logout user should be at login page");
    }
}
