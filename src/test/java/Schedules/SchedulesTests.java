package Schedules;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import Routes.BaseUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class  SchedulesTests {
    String date;
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,20);
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
    public void chooseFirstStaffSchedules() {
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        Assert.assertEquals("Змінний робочий графік",schedulesPageCode.checkSelectedStaffScheduleText());
    }

    @Test
    public void chooseSecondStaffSchedules(){
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(1);
        Assert.assertEquals("Регулярний робочий графік",schedulesPageCode.checkSelectedStaffScheduleText());
    }

    @Test
    public void chooseThirdStaffSchedules() {
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(2);
        Assert.assertEquals("Довільний графік", schedulesPageCode.checkSelectedStaffScheduleText());
    }

    @Test
    public void setZminnuyGrafik(){
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        schedulesPageCode.openCalendar();
        schedulesPageCode.chooseFirstWorkingDay();
        schedulesPageCode.saveZminnuyGrafik();
        Assert.assertEquals(true,schedulesPageCode.checkCurrentCalendarDay().contains(schedulesPageCode.returnDate()));
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
