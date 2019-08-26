package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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


}
