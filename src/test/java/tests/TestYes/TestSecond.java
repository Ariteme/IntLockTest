package tests.TestYes;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase;

public class TestSecond extends TestBase {
    @Test
    public void checkRadioButton() throws InterruptedException {
        app.getBase().alertClose();
        app.getBase().waitingUntilPageLoad();
        app.getBase().waitUntilSurveyExists();
        app.getBase().click(By.id("q0_0"));
        app.getBase().click(By.id("q1_1"));
        app.getBase().click(By.id("_cassubmit"));
        Assert.assertTrue(!Boolean.parseBoolean("_cassubmit"));
        app.getBase().goTo();
    }
}
