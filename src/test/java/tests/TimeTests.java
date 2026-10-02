package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class TimeTests extends BaseTest {

    @Test(description = "Navigate to Time module")
    public void testNavigateToTime() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");
        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded());
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
        Assert.assertTrue(driver.getCurrentUrl().contains("time"));
    }

    // TODO: Add timesheet create/submit/approve tests
}
