package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
    private WebDriver driver;
    private By pageHeader = By.xpath("//h6[text()='Employee Information']");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaded() {
        try {
            return driver.findElement(pageHeader).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // TODO: Add methods: addEmployee, searchEmployee, editEmployee
}
