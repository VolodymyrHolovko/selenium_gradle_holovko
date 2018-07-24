package Calendar;

import Managment.ManagementPageCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarCode {
    WebDriver driver;
    WebDriverWait wait;
    CalendarLocators locators = new CalendarLocators();
    ManagementPageCode hover = new ManagementPageCode(driver, wait);


    public CalendarCode(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public  void checkAddresField() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addresField)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addresFieldTitle)));
        Thread.sleep(250);
    }

    public void checkModalCalendar() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.currentDate)));
        Thread.sleep(250);
        driver.findElement(By.xpath(locators.currentDate)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.modalCalendarTab)));
        driver.findElement(By.xpath(locators.headerCalendar)).click();
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
