package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class MyInfoTests extends BaseTest {

    @Test(description = "Navigate to My Info and validate access")
    public void testNavigateToMyInfo() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded());

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewMyDetails");
        // Simple check: URL contains viewMyDetails
        Assert.assertTrue(driver.getCurrentUrl().contains("viewMyDetails"), "Should navigate to My Info page");
    }

    // TODO: Implement edit personal details, upload photo, change password tests
}
