package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class BuzzTests extends BaseTest {

    @Test(description = "Navigate to Buzz and verify access")
    public void testNavigateToBuzz() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");
        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded());
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz");
        Assert.assertTrue(driver.getCurrentUrl().contains("buzz"));
    }

    // TODO: Add create post, like, comment tests
}
