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
        Thread.sleep(3000);
    }



    public void checkModalCalendar() throws ElementClickInterceptedException {
        try  {
            handler.findElement(locators.currentDate);
            handler.clickOnElement(locators.currentDate);
            handler.findElement(locators.modalCalendarTab);
            handler.clickOnElement(locators.modalCalendarHeader);
        }
        catch (ElementClickInterceptedException e){
            handler.findElement(locators.currentDate);
            handler.clickOnElement(locators.currentDate);
            handler.findElement(locators.modalCalendarTab);
            handler.clickOnElement(locators.modalCalendarHeader);
        }
    }
    public void checkCalendarButtons() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.calendarButton)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.nextDayButton))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.calendarGrid)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addBookingButton))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addBookingPageHeader)));

    }
    public void checkStaff() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.staffHeader)));
    }
    public void checkCalendarGrid() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.currentTimeLine)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.calendarGrid)));
    }
    public  void checkProfileIcon() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.profileIcon))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.closeProfileModal)));
    }
}
