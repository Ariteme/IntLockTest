package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class HelperFirst extends HelperBase {

    WebDriver driver;

    public HelperFirst(WebDriver driver) {
        super(driver);
    }

    public boolean AssertDetailNotPresent() {
        try {
            driver.findElement(By.id("_cassubmit"));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }


    public void waitUntilSurveyExists() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("q0_0")));
    }
}
