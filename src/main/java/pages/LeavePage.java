package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {
    private WebDriver driver;
    private By pageHeader = By.xpath("//h6[text()='Leave List']");

    public LeavePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaded() {
        try {
            return driver.findElement(pageHeader).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // TODO: implement applyLeave, cancelLeave, approveLeave actions
}
