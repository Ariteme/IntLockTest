package helpers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HelperBase {
    WebDriver driver;


    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void alertClose() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void waitUntilSurveyExists() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("q0_0")));
        // wait.until(ExpectedConditions.elementToBeClickable(By.id("q0_0")));
    }

    public void goTo() {
        driver.navigate().to("http://spdemo.intlock.com/SitePages/Home.aspx");
    }

    public void waitingUntilPageLoad() {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    public String GetCurrentLink() {
        return driver.getCurrentUrl();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
