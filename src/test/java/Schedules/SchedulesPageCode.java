package Schedules;

import Managment.ManagmentElementsLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchedulesPageCode {
    WebDriver driver;
    WebDriverWait wait;
    public  SchedulesPageCode (WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    SchedulesElementsLocator schedulesElementsLocator = new SchedulesElementsLocator();
    ManagmentElementsLocators management = new ManagmentElementsLocators();
    By staffSchedules = By.xpath(schedulesElementsLocator.workersSchedules);


public void clickAtStaffSchedules() {
wait.until(ExpectedConditions.presenceOfElementLocated(staffSchedules)).click();
}
}
