package Schedules;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import Settings.BaseUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SchedulesTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,30,500);
    BaseUrls baseUrls = new BaseUrls();
    LoginPageCode login =new LoginPageCode(driver,wait);
    SchedulesPageCode schedulesPageCode = new SchedulesPageCode(driver,wait);
    ManagementPageCode managementPageCode = new ManagementPageCode(driver,wait);
    @BeforeClass
    public void before() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
        managementPageCode.clickAtSchedules();
    }
    @Test
    public void createStaffSchedules(){
        schedulesPageCode.clickAtStaffSchedules();
    }
    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
