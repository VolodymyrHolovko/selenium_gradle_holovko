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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import sun.jvm.hotspot.ui.ObjectHistogramPanel;

import java.util.concurrent.TimeUnit;

public class Abstract {
    protected Handler handler;
    protected CalendarCode calendarCode;
    protected CalendarLocators calendarLocators;

    protected BaseUrls baseUrls = new BaseUrls();


    protected WebDriver driver = new FirefoxDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 30, 700);



    @BeforeClass
    public void setUp() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

    }
    }


