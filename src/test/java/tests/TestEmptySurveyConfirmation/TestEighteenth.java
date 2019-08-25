package tests.TestEmptySurveyConfirmation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase;

public class TestEighteenth extends TestBase {
    @Test
    public void checkRadioButton() {
        app.getBase().waitingUntilPageLoad();
        app.getBase().click(By.id("_cassubmit"));
        Assert.assertFalse(Boolean.parseBoolean("_cassubmit"));
        app.getBase().goTo();
    }
}
