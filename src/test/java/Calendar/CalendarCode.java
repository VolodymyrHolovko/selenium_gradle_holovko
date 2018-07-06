package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarCode {
    WebDriver driver;
    WebDriverWait wait;
    CalendarLocators locators = new CalendarLocators();


    public CalendarCode(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public  void checkAddresField() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addresField)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addresFieldTitle)));
    }

    public void checkModalCalendar(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.currentDate))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.modalCalendarTab)));
    }
    public void checkCalendarButtons() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.calendarButton)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.nextDayButton))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.calendarGrid)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addBookingButton))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addBookingPageHeader)));

    }

    public void checkCalendarGrid() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.currentTimeLine)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.calendarGrid)));
    }
    public  void checkProfileIcon() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.profileIcon))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.closeProfileModal)));
    }
}
