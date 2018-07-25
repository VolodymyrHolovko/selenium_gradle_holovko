package Schedules;

import Managment.ManagmentElementsLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SchedulesPageCode {
    WebDriver driver;
    WebDriverWait wait;
    public  SchedulesPageCode (WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    String date;
    SchedulesElementsLocator schedulesElementsLocator = new SchedulesElementsLocator();
    ManagmentElementsLocators management = new ManagmentElementsLocators();
    By staffSchedules = By.xpath(schedulesElementsLocator.workersSchedules);
    By countWorkDay= By.xpath(schedulesElementsLocator.countWorkDay);
    By staffScheduleType = By.xpath(schedulesElementsLocator.selectWorkersScheduleType);
    By schedulesDropDown = By.xpath(schedulesElementsLocator.schedulesDropDown);
    By openCalendar = By.xpath(schedulesElementsLocator.openCalendar);
    By chooseFirstDay = By.xpath(schedulesElementsLocator.chooseFirstDay);
    By saveButtonZminnuy = By.xpath(schedulesElementsLocator.saveButtonZminnuy);
    By currentCalendarDay = By.xpath(schedulesElementsLocator.currentCalendarDay);
    By workingDaysDropDown = By.xpath(schedulesElementsLocator.workingDaysDropDown);
    By chooseHowMatchWorkDays = By.xpath(schedulesElementsLocator.chooseHowMatchWorkDays);


    public void clickAtStaffSchedules() throws StaleElementReferenceException {
        wait.until(ExpectedConditions.presenceOfElementLocated(staffSchedules)).click();
    }

    public void clickAtStaffSchedulesType(){
        wait.until(ExpectedConditions.presenceOfElementLocated(staffScheduleType)).click();
    }

    public void openSchedulesDropDown(){
        wait.until(ExpectedConditions.presenceOfElementLocated(schedulesDropDown)).click();
    }

    public void clickAtCertainSchedule (int t) throws StaleElementReferenceException{
        List<WebElement> schedulesType = driver.findElement(schedulesDropDown).findElements(By.className("md-ink-ripple"));
        schedulesType.get(t).click();
    }

    public String checkSelectedStaffScheduleText() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(staffScheduleType));
            WebElement element = driver.findElement(staffScheduleType);
            String schedulesType = element.getText();
            return schedulesType;
        }
        catch (StaleElementReferenceException e){
            wait.until(ExpectedConditions.presenceOfElementLocated(staffScheduleType));
            WebElement element = driver.findElement(staffScheduleType);
            String schedulesType = element.getText();
            return schedulesType;
        }
    }

    public void openCalendar(){
        wait.until(ExpectedConditions.presenceOfElementLocated(openCalendar)).click();
    }

    public void chooseFirstWorkingDay(){
        wait.until(ExpectedConditions.presenceOfElementLocated(chooseFirstDay));
        String date = driver.findElement(chooseFirstDay).getText();
        driver.findElement(chooseFirstDay).click();
        this.date = date;
    }

    public void saveZminnuyGrafik(){
        wait.until(ExpectedConditions.presenceOfElementLocated(saveButtonZminnuy)).click();
    }

    public String checkCurrentCalendarDay(){
        String currentCalendar = wait.until(ExpectedConditions.presenceOfElementLocated(currentCalendarDay)).getAttribute("value");
        return  currentCalendar;
    }
    public String returnDate(){
        return date;
    }

    public void chooseHowMutchWorkDays (){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(workingDaysDropDown)).click();
            List<WebElement> days = driver.findElement(workingDaysDropDown).findElements(chooseHowMatchWorkDays);
            days.get(4).click();
        }
        catch (ElementNotInteractableException e){
            wait.until(ExpectedConditions.presenceOfElementLocated(workingDaysDropDown)).click();
            List<WebElement> days = driver.findElement(workingDaysDropDown).findElements(chooseHowMatchWorkDays);
            days.get(4).click();
        }
    }

}
