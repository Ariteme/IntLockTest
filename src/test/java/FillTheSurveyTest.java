import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;


public class FillTheSurveyTest {
    WebDriver driver = new ChromeDriver();
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public void waiting(int value) throws InterruptedException {
        driver.wait(value);
    }


    public void init() throws Exception {

        InitNo initNo = new InitNo();
        initNo.testInitNo();
        waiting(20000);

        InitNoImpossible initNoImpossible = new InitNoImpossible();
        initNoImpossible.testInitNoImpossible();
        waiting(20000);


        InitNoHardTo initNoHardTo = new InitNoHardTo();
        initNoHardTo.testInitNoHardTo();
        waiting(20000);


        InitNoFine initNoFine = new InitNoFine();
        initNoFine.testInitNoFine();
        waiting(20000);


        InitNoPrettyEasy initNoPrettyEasy = new InitNoPrettyEasy();
        initNoPrettyEasy.testInitNoPrettyEasy();
        waiting(20000);


        InitNoVeryEasy initNoVeryEasy = new InitNoVeryEasy();
        initNoVeryEasy.testInitNoVeryEasy();
        waiting(20000);


        InitYes initYes = new InitYes();
        initYes.testInitYes();
        waiting(20000);

        InitYesImpossible initYesImpossible = new InitYesImpossible();
        initYesImpossible.testInitYesImpossible();
        waiting(20000);


        InitYesHardTo initYesHardTo = new InitYesHardTo();
        initYesHardTo.testInitYesHardTo();
        waiting(20000);


        InitYesFine initYesFine = new InitYesFine();
        initYesFine.testInitYesFine();
        waiting(20000);


        InitYesPrettyEasy initYesPrettyEasy = new InitYesPrettyEasy();
        initYesPrettyEasy.testInitYesPrettyEasy();
        waiting(20000);


        InitYesVeryEasy initYesVeryEasy = new InitYesVeryEasy();
        initYesVeryEasy.testInitYesVeryEasy();
        waiting(20000);


    }
    /* *//*       ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");*//*
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        String URL = "https://teamplace.volvo.com/sites/vp-russiandealers/default.aspx";
        driver.get(URL);*/
//        cancelSignInModalWindow();


////  r.keyPress(27);
//      //  driver.findElement(By.name("Cancel")).click();
//    //    String alertMessage= driver.switchTo().alert().getText();
//  //      System.out.println(alertMessage);
////        driver.switchTo().alert().dismiss();
//    }
//
//    private Robot robot;
//
//    public void login(String login, String password) {
//        copyValueFromClipboardToInput(login);
//        getRobot().keyPress(KeyEvent.VK_TAB);
//        getRobot().keyRelease(KeyEvent.VK_TAB);
//        System.out.println("login value is "+login);
//        copyValueFromClipboardToInput(password);
//        getRobot().keyPress(KeyEvent.VK_ENTER);
//        getRobot().keyRelease(KeyEvent.VK_ENTER);
//        System.out.println("pass value is "+password);
//    }
//
//    private void copyValueFromClipboardToInput(String value) {
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(value), null);
//        getRobot().keyPress(KeyEvent.VK_CONTROL);
//        getRobot().keyPress(KeyEvent.VK_V);
//        getRobot().keyRelease(KeyEvent.VK_V);
//        getRobot().keyRelease(KeyEvent.VK_CONTROL);
//        System.out.println("copied value is " + value);
//    }
//
//    private Robot getRobot() {
//        if (robot == null) {
//            try {
//                robot = new Robot();
//            } catch (AWTException e) {
//                e.printStackTrace();
//            }
//        }
//        return robot;
//    }
//
//     /*       public void stop() {
//        driver.quit();
//    }
//    public String getUrl() {
//        return driver.getCurrentUrl();
//    }*/


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

/*    private void cancelSignInModalWindow() {
        Robot r = null;
        try {
            r = new Robot();
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                r.keyPress(KeyEvent.VK_TAB);
            }
            r.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}

