package tests;

import helpers.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();


        //login("VM1A3B71E\\\\testme ", "!@57e1674360!@");
        //Assert.assertEquals(currentUrl, "http://spdemo.intlock.com");


    }
}
