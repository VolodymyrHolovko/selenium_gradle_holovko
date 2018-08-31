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
    WebDriverWait wait = new WebDriverWait(driver,20);
    BaseUrls baseUrls = new BaseUrls();
    LoginPageCode login =new LoginPageCode(driver, wait);
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
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test
    public void B_chooseFirstStaffSchedules() throws InterruptedException {
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        Assert.assertEquals("Змінний робочий графік",schedulesPageCode.checkSelectedStaffScheduleText());
    }

    @Test
    public void C_setRegularSchedule() throws InterruptedException {
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

    @Test
    public void D_chooseThirdStaffSchedules() throws InterruptedException {
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

    @Test
    public void F_setZminnuyGrafik(){
        //Перевірка встановлення першого робочого дня відділення при змінному графіку, його
        //збереження та подальше відображення
        schedulesPageCode.openCalendar();
        schedulesPageCode.chooseFirstWorkingDay();
        schedulesPageCode.saveZminnuyGrafik();
        Assert.assertEquals(true,schedulesPageCode.checkCurrentCalendarDay().contains(schedulesPageCode.returnDate()));
    }

    @Test
    public void E_setZminnuySchedule() throws InterruptedException {
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

    @Test
    public void A_checkDaysOfOnCalendar() throws InterruptedException {
        //Перевірка того що вихідні дні є вихідними)
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(0);
        Assert.assertEquals(false,schedulesPageCode.checkIfDaysCheckedOnCalendar().contains("active"));
    }

    @Test
    public void G_setAddressWorkingDays() {
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

    @Test
    public void H_workWhenAdressIsDayOf() throws InterruptedException{
        //Перевірка вихідних днів при довільному графіку
        schedulesPageCode.clickAtStaffSchedules();
        schedulesPageCode.clickAtStaffSchedulesType();
        schedulesPageCode.clickAtCertainSchedule(2);
        schedulesPageCode.checkWorkWhenAdressIsNotWork();
        schedulesPageCode.clickDayOfOk();
        Thread.sleep(2000);
    }

    @Test
    public void I_setBreakForWorker() throws InterruptedException {
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
