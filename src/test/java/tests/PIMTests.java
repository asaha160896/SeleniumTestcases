package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PIMPage;

public class PIMTests extends BaseTest {

    @Test(description = "Navigate to PIM and validate Employee Information page")
    public void testNavigateToPIM() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded());

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
        PIMPage pim = new PIMPage(driver);
        Assert.assertTrue(pim.isLoaded(), "PIM Employee Information page should load");
    }

    // Additional PIM tests (add employee, search, edit) should be implemented here using PIMPage methods
}
