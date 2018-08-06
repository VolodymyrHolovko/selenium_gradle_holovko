package LoginTests;

import Journal.JournalElementsLocators;
import Journal.JournalPageCode;

import Routes.BaseUrls;
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
        BaseUrls baseUrls = new BaseUrls();
        LoginPageCode login  = new LoginPageCode(driver,wait);
        WorkersPageCode worker  = new WorkersPageCode(driver,wait);
        @BeforeClass
        public void BeforeClass() {
            driver.get(baseUrls.getHomeUrl());
        }

        @Test
        public void CheckLogin() throws InterruptedException {
            //Перевірка успішного логіну в особистий кабінет
            login.typeUsername();
            login.typePassword();
            login.pressSubmit();
            worker.makeHoverAtElement();
            Assert.assertEquals(baseUrls.getCalendarBaseUrl(),login.checkSuccessLogin());
        }

        @AfterClass
        public void closeDriver() {
            driver.quit();
        }
    }

