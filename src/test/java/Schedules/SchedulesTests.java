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
    public void B_chooseFirstStaffSchedules() {
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        Assert.assertEquals("Змінний робочий графік",schedulesPageCode.checkSelectedStaffScheduleText());
    }

    @Test
    public void C_chooseSecondStaffSchedules(){
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(1);
        Assert.assertEquals("Регулярний робочий графік",schedulesPageCode.checkSelectedStaffScheduleText());
    }

    @Test
    public void D_chooseThirdStaffSchedules() {
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(2);
        Assert.assertEquals("Довільний графік", schedulesPageCode.checkSelectedStaffScheduleText());
    }

    @Test
    public void E_setZminnuyGrafik(){
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        schedulesPageCode.openCalendar();
        schedulesPageCode.chooseFirstWorkingDay();
        schedulesPageCode.saveZminnuyGrafik();
        Assert.assertEquals(true,schedulesPageCode.checkCurrentCalendarDay().contains(schedulesPageCode.returnDate()));
    }

    @Test
    public void F_setZminnuySchedule(){
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        schedulesPageCode.chooseHowMutchWorkDays();
        Assert.assertEquals(schedulesPageCode.chosenWorkDaysCount(),schedulesPageCode.checkHowMatchWorkingDaysSelected());
        schedulesPageCode.chooseHowMutchFreeDays();
        Assert.assertEquals(schedulesPageCode.chosenFreeDays(),schedulesPageCode.checkHowMatchFreeDaysSelected());
        schedulesPageCode.saveZminnuyGrafik();
    }

    @Test
    public void A_checkDaysOfOnCalendar(){
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        Assert.assertEquals(false,schedulesPageCode.checkIfDaysCheckedOnCalendar().contains("active"));
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
