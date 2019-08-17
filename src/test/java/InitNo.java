import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class InitNo extends FillTheSurveyTest {

    @Test
    public void testInitNo() throws Exception {
        driver.get("http://spdemo.intlock.com/SitePages/Home.aspx");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yes'])[2]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='On a scale of 1-5, how easy was it to find what you were looking for?'])[2]/following::input[6]")).click();
    }

}
