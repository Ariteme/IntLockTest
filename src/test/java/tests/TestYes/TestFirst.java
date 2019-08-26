package tests.TestYes;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase;

public class TestFirst extends TestBase {
    @Test
    public void checkRadioButton() {
        app.getBase().waitingUntilPageLoad();
        app.getBase().waitUntilSurveyExists();
        app.getBase().click(By.id("q0_0"));
        app.getBase().click(By.id("q1_0"));
        app.getBase().click(By.id("_cassubmit"));
        Assert.assertFalse(Boolean.parseBoolean("_cassubmit"));
        app.getBase().goTo();

//        app.getFirst().AssertDetailNotPresent();
//        System.out.println(app.getFirst().AssertDetailNotPresent());
    }
}
