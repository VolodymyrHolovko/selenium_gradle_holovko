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
    public void makeHoverOnBody() {
        WebElement element = driver.findElement(By.xpath(locators.body));
        Actions builder = new Actions(driver);
        builder.click(element).build().perform();
    }

    public  void checkAddresField() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addresField)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addresFieldTitle)));
    }

    public void checkModalCalendar() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.currentDate)));
        driver.findElement(By.xpath(locators.currentDate)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.modalCalendarTab)));
        makeHoverOnBody();

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
