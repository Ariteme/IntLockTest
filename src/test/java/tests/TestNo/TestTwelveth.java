package tests.TestNo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase;

public class TestTwelveth extends TestBase {
    @Test
    public void checkRadioButton() throws InterruptedException {
        app.getBase().waitingUntilPageLoad();
        app.getBase().waitUntilSurveyExists();
        app.getBase().click(By.id("q0_1"));
        app.getBase().click(By.id("_cassubmit"));
        Assert.assertTrue(!Boolean.parseBoolean("_cassubmit"));

        Thread.sleep(5000);
        app.getBase().waitingUntilPageLoad();
        Assert.assertEquals(app.getBase().GetCurrentLink(), "http://kb.intlock.com/display/Support/Knowledge+Base");
        app.getBase().goTo();
    }
}

