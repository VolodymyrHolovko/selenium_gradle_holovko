package pageFactory;

import Calendar.CalendarCode;
import Calendar.CalendarLocators;
import LoginTests.LoginPageCode;
import Routes.BaseUrls;
import helpers.Handler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

public class Abstract {
    protected Handler handler;
    protected CalendarCode calendarCode;
    protected CalendarLocators calendarLocators;
    LoginPageCode login;
    protected BaseUrls baseUrls = new BaseUrls();
    protected WebDriver driver = new FirefoxDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 30, 700);

    public Abstract() {
        login = new LoginPageCode(driver,wait);
    }


    @BeforeClass
    public void setUp() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
    }


    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
    }


