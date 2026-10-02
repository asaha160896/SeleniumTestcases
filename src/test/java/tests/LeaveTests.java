package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LeavePage;
import pages.LoginPage;

public class LeaveTests extends BaseTest {

    @Test(description = "Navigate to Leave module and validate Leave List page")
    public void testNavigateToLeave() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded());

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
        LeavePage leave = new LeavePage(driver);
        Assert.assertTrue(leave.isLoaded(), "Leave List should be displayed");
    }

    // TODO: Implement positive and negative leave tests: apply leave, validate overlaps and balances
}
