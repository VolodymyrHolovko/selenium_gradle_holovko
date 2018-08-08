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

import java.util.concurrent.TimeUnit;

public class  SchedulesTests {
    WebDriver driver = new FirefoxDriver();
   // driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

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

    @Test (priority = 1)
    public void chooseFirstStaffSchedules() {
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        Assert.assertEquals("Змінний робочий графік",schedulesPageCode.checkSelectedStaffScheduleText());
    }

    @Test (priority = 2)
    public void setRegularSchedule(){
        //Перевірка встановлення регулярного графіку відділенню, на основі одного робочого дня
        //та подальша перевірка чи дані відносно дня збереглися
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(1);
        Assert.assertEquals("Регулярний робочий графік",schedulesPageCode.checkSelectedStaffScheduleText());
        schedulesPageCode.choseeDayAsWorkRegular();
        schedulesPageCode.saveRegularSchedule();
        schedulesPageCode.successRegularSaveMessageInvisible();
        Assert.assertEquals(true,schedulesPageCode.choseeDayAsWorkRegularGetClass().contains("checked"));
    }

    @Test(priority = 3)
    public void chooseThirdStaffSchedules() {
        //Перевірка встановлення довільного робочого дня на основі встановлення довільного дня
        //робочим - збереження - та перевірка чи день є робочим
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(2);
        Assert.assertEquals("Довільний графік", schedulesPageCode.checkSelectedStaffScheduleText());
        schedulesPageCode.clickAtDovilnuyDay();
        schedulesPageCode.saveZminnuyGrafik();
        schedulesPageCode.successZminnuySaveMessageInvisible();
        Assert.assertEquals(true,schedulesPageCode.checkIsDovilnuyDayChecked().contains("active"));
        schedulesPageCode.clickAtDovilnuyDay();
        schedulesPageCode.saveZminnuyGrafik();
    }

    @Test (priority = 5)
    public void setZminnuyGrafik(){
        //Перевірка встановлення першого робочого дня відділення при змінному графіку, його
        //збереження та подальше відображення
        schedulesPageCode.openCalendar();
        schedulesPageCode.chooseFirstWorkingDay();
        schedulesPageCode.saveZminnuyGrafik();
        Assert.assertEquals(true,schedulesPageCode.checkCurrentCalendarDay().contains(schedulesPageCode.returnDate()));
    }

    @Test (priority = 4)
    public void setZminnuySchedule(){
        //Перевірка встановлення робочого графіку при змінному розкладі роботи робочих/неробочих
        //та подальшого їх сечення на календарі
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        schedulesPageCode.chooseHowMutchWorkDays();
        Assert.assertEquals(schedulesPageCode.chosenWorkDaysCount(),schedulesPageCode.checkHowMatchWorkingDaysSelected());
        schedulesPageCode.chooseHowMutchFreeDays();
        Assert.assertEquals(schedulesPageCode.chosenFreeDays(),schedulesPageCode.checkHowMatchFreeDaysSelected());
        schedulesPageCode.saveZminnuyGrafik();
       schedulesPageCode.successZminnuySaveMessageInvisible();
    }

    @Test(priority = 0)
    public void checkDaysOfOnCalendar(){
        //Перевірка того що вихідні дні є вихідними)
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        Assert.assertEquals(false,schedulesPageCode.checkIfDaysCheckedOnCalendar().contains("active"));
    }

    @Test (priority = 6)
    public void setAddressWorkingDays() {
        //Встановлення робочих днів адреси, якщо день неробочий то сетимо робочим
        schedulesPageCode.clickAtAddressScheduleHeader();
        if (!schedulesPageCode.chooseAddressWorkingDays().contains("checked")) {
            schedulesPageCode.makeFirstAddressDayAsWorked();
            Assert.assertEquals(true, schedulesPageCode.chooseAddressWorkingDays().contains("checked"));
        }
        else if (schedulesPageCode.chooseAddressWorkingDays().contains("checked")) {
            schedulesPageCode.makeFirstAddressDayAsWorked();
            Assert.assertEquals(true, !schedulesPageCode.chooseAddressWorkingDays().contains("checked"));
        }
    }

    @Test (priority = 7)
    public void workWhenAdressIsDayOf() throws InterruptedException{
        //Перевірка вихідних днів при довільному графіку
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(2);
        schedulesPageCode.checkWorkWhenAdressIsNotWork();
        schedulesPageCode.clickDayOfOk();
        Thread.sleep(2000);
    }

    @Test (priority = 8)
    public void setBreakForWorker(){
        //Перевірка встановлення годин обіду і їх подальшого відображення
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        schedulesPageCode.clickAtzminnuyCertainDaySchedule();

    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
