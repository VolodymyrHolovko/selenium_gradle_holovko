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
    String workDaysCount;
    String freeDaysCount;
    SchedulesElementsLocator schedulesElementsLocator = new SchedulesElementsLocator();
    By staffSchedules = By.xpath(schedulesElementsLocator.workersSchedules);
    By freeDaysDropDown= By.xpath(schedulesElementsLocator.freeDaysDropDown);
    By staffScheduleType = By.xpath(schedulesElementsLocator.selectWorkersScheduleType);
    By schedulesDropDown = By.xpath(schedulesElementsLocator.schedulesDropDown);
    By openCalendar = By.xpath(schedulesElementsLocator.openCalendar);
    By successMessageZminnuy = By.xpath(schedulesElementsLocator.successMessageZminnuy);
    By chooseFirstDay = By.xpath(schedulesElementsLocator.chooseFirstDay);
    By saveButtonZminnuy = By.xpath(schedulesElementsLocator.saveButtonZminnuy);
    By currentCalendarDay = By.xpath(schedulesElementsLocator.currentCalendarDay);
    By workingDaysDropDown = By.xpath(schedulesElementsLocator.workingDaysDropDown);
    By chooseHowMatchWorkDays = By.xpath(schedulesElementsLocator.chooseHowMatchWorkDays);
    By checkHowMatchWorkingDaysSelected = By.xpath(schedulesElementsLocator.checkHowMatchWorkingDaysSelected);
    By checkHowMatchFreeDaysSelected = By.xpath(schedulesElementsLocator.checkHowMatchFreeDaysSelected);
    By checkSaturdayOnCalendarIsFree = By.xpath(schedulesElementsLocator.checkSaturdayOnCalendarIsFree);
    By checkSandayOnCalendarIsFree = By.xpath(schedulesElementsLocator.checkSandayOnCalendarIsFree);
    By swicherAtRegularSchedule = By.xpath(schedulesElementsLocator.swicherAtRegularSchedule);
    By saveRegularGrafikButton = By.xpath(schedulesElementsLocator.saveRegularGrafikButton);
    By successRegularSaveMessage = By.xpath(schedulesElementsLocator.successRegularSaveMessage);
    By swicherClass = By.xpath(schedulesElementsLocator.swicherClass);

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

    public void openCalendar()throws  ElementNotInteractableException{
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(openCalendar)).click();
        }
        catch (ElementNotInteractableException e){
            wait.until(ExpectedConditions.presenceOfElementLocated(openCalendar)).click();
        }
    }

    public void chooseFirstWorkingDay(){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(chooseFirstDay));
            String date = driver.findElement(chooseFirstDay).getText();
            driver.findElement(chooseFirstDay).click();
            this.date = date;
        }
        catch (ElementClickInterceptedException e){
            wait.until(ExpectedConditions.presenceOfElementLocated(chooseFirstDay));
            String date = driver.findElement(chooseFirstDay).getText();
            driver.findElement(chooseFirstDay).click();
            this.date = date;
        }
    }

    public void saveZminnuyGrafik(){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(saveButtonZminnuy)).click();
        }
        catch (ElementClickInterceptedException e){
            wait.until(ExpectedConditions.presenceOfElementLocated(saveButtonZminnuy)).click();
        }
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
            this.workDaysCount = days.get(1).getText();
            days.get(1).click();
        }
        catch (ElementClickInterceptedException e){
            wait.until(ExpectedConditions.presenceOfElementLocated(workingDaysDropDown)).click();
            List<WebElement> days = driver.findElement(workingDaysDropDown).findElements(chooseHowMatchWorkDays);
            this.workDaysCount = days.get(1).getText();
            days.get(1).click();
        }
    }

    public void chooseHowMutchFreeDays (){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(freeDaysDropDown)).click();
            List<WebElement> days = driver.findElement(freeDaysDropDown).findElements(chooseHowMatchWorkDays);
            this.freeDaysCount = days.get(1).getText();
            days.get(1).click();
        }
        catch (ElementNotInteractableException e){
            wait.until(ExpectedConditions.presenceOfElementLocated(freeDaysDropDown)).click();
            List<WebElement> days = driver.findElement(freeDaysDropDown).findElements(chooseHowMatchWorkDays);
            this.freeDaysCount = days.get(1).getText();
            days.get(1).click();
        }
    }

    public String chosenWorkDaysCount(){
        return workDaysCount;
    }

    public String chosenFreeDays(){
        return freeDaysCount;
    }

    public String checkHowMatchWorkingDaysSelected(){
       String howMatchDays =  wait.until(ExpectedConditions.presenceOfElementLocated(checkHowMatchWorkingDaysSelected)).getText();
       return  howMatchDays;
    }

    public String checkHowMatchFreeDaysSelected(){
        String howMatchDays =  wait.until(ExpectedConditions.presenceOfElementLocated(checkHowMatchFreeDaysSelected)).getText();
        return  howMatchDays;
    }

    public String checkIfDaysCheckedOnCalendar(){
        try {
            String className1 = wait.until(ExpectedConditions.presenceOfElementLocated(checkSaturdayOnCalendarIsFree)).getAttribute("class");
            String className2 = wait.until(ExpectedConditions.presenceOfElementLocated(checkSandayOnCalendarIsFree)).getAttribute("class");
            return className1 + className2;
        }
        catch (ElementNotInteractableException e){
            String className1 = wait.until(ExpectedConditions.presenceOfElementLocated(checkSaturdayOnCalendarIsFree)).getAttribute("class");
            String className2 = wait.until(ExpectedConditions.presenceOfElementLocated(checkSandayOnCalendarIsFree)).getAttribute("class");
            return className1 + className2;
        }
    }

    public void choseeDayAsWorkRegular(){
            wait.until(ExpectedConditions.presenceOfElementLocated(swicherAtRegularSchedule)).click();

    }

    public void saveRegularSchedule(){
        wait.until(ExpectedConditions.presenceOfElementLocated(saveRegularGrafikButton)).click();
    }

    public void successRegularSaveMessageInvisible(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(successRegularSaveMessage));
    }
    public void successZminnuySaveMessageInvisible(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(successMessageZminnuy));
    }

    public String choseeDayAsWorkRegularGetClass(){
       String cheked= wait.until(ExpectedConditions.presenceOfElementLocated(swicherClass)).getAttribute("class");
       return cheked;
    }

}
