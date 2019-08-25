package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver driver = new FirefoxDriver();
    HelperBase base;
    HelperFirst first;


    public void init() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        base = new HelperBase(driver);
        base.goTo();
        first = new HelperFirst(driver);
        base.alertClose();
    }

    public HelperFirst getFirst() {
        return first;
    }

    public HelperBase getBase() {
        return base;
    }

    public void stop() {
        driver.quit();
    }

}
