package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.DashboardPage;
import pages.LoginPage;

public class AdminTests extends BaseTest {

    @Test(description = "Navigate to Admin module after login and validate page load")
    public void testNavigateToAdminModule() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        Assert.assertTrue(dashboard.isLoaded(), "Dashboard should be visible");

        // Navigate to Admin - this uses a simple click via URL or menu; adjust as needed
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");

        AdminPage admin = new AdminPage(driver);
        Assert.assertTrue(admin.isLoaded(), "Admin System Users page should load correctly");
    }

    @Test(description = "Negative: Non-admin cannot access admin page (should be access denied or redirected)")
    public void testNonAdminCannotAccessAdmin() {
        // This is a placeholder. For full test a non-admin user must be provisioned.
        // For now, ensure admin page requires login by opening it without login
        if (driver != null) {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
            AdminPage admin = new AdminPage(driver);
            Assert.assertFalse(admin.isLoaded(), "Admin page should not be visible without proper login");
        }
    }
}
