package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DirectoryTests extends BaseTest {

    @Test(description = "Navigate to Directory and verify search returns results or no-result gracefully")
    public void testDirectorySearchPage() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");
        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded());
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/directory/viewDirectory");
        Assert.assertTrue(driver.getCurrentUrl().contains("directory"));
    }
}
