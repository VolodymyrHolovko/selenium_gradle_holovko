package LoginTests;

import Journal.JournalElementsLocators;
import Journal.JournalPageCode;

import Workers.WorkersPageCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTests {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30, 700);
        String homeUrl = "http://staging.eservia.com/auth/sign-in";
        LoginPageCode login  = new LoginPageCode(driver,wait);
        WorkersPageCode worker  = new WorkersPageCode(driver,wait);
        @BeforeClass
        public void BeforeClass() {
            driver.get(homeUrl);
        }

        @Test
        public void CheckLogin() throws InterruptedException {
            login.typeUsername();
            login.typePassword();
            login.pressSubmit();
            worker.makeHoverAtElement();
            Assert.assertEquals("http://staging.eservia.com/business/calendar/day",login.checkSuccessLogin());
        }

        @AfterClass
        public void closeDriver() {
            driver.quit();
        }
    }

