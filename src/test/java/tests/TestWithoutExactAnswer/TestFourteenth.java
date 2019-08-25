package tests.TestWithoutExactAnswer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase;

public class TestFourteenth extends TestBase {
    @Test
    public void checkRadioButton() {
        app.getBase().waitingUntilPageLoad();
        app.getBase().click(By.id("q1_1"));
        app.getBase().click(By.id("_cassubmit"));
        Assert.assertTrue(!Boolean.parseBoolean("_cassubmit"));
        app.getBase().goTo();
    }
}
