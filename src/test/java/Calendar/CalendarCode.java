package Calendar;

import helpers.Handler;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.BaseObject;

public class CalendarCode extends BaseObject {

    private CalendarLocators locators = new CalendarLocators(driver,wait);
    private Handler handler = new Handler(driver,wait);

    public CalendarCode(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public  void checkAddresField() throws InterruptedException {
        handler.findElement(locators.addresField);
        handler.findElement(locators.addresFieldTitle);
    }

    public void checkModalCalendar() {
        handler.findElement(locators.currentDate);
        handler.clickOnElement(locators.currentDate);
        handler.findElement(locators.modalCalendarTab);
        handler.clickOnElement(locators.modalCalendarHeader);
    }

    public void checkCalendarButtons() {
        handler.findElement(locators.calendarButton);
        handler.clickOnElement(locators.nextDayButton);
        handler.findElement(locators.calendarGrid);
        handler.clickOnElement(locators.addBookingButton);
        handler.findElement(locators.addBookingPageHeader);
    }

    public void checkStaff() {
        handler.findElement(locators.staffHeader);
    }

    public void checkCalendarGrid() {
        handler.findElement(locators.currentTimeLine);
        handler.findElement(locators.calendarGrid);
    }

    public  void checkProfileIcon() {
        handler.clickOnElement(locators.profileIcon);
        handler.findElement(locators.closeProfileModalIcon);
    }
}
