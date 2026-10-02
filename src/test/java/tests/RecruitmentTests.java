package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class RecruitmentTests extends BaseTest {

    @Test(description = "Navigate to Recruitment module")
    public void testNavigateToRecruitment() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");
        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded());
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
        Assert.assertTrue(driver.getCurrentUrl().contains("recruitment"));
    }

    // TODO: Add candidate add/search/flow tests
}
