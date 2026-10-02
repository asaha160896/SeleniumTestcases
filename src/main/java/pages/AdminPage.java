package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    private WebDriver driver;
    private By pageHeader = By.xpath("//h6[text()='System Users']");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaded() {
        try {
            return driver.findElement(pageHeader).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // TODO: Add actions for create user, search user, edit user
}
