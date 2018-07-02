package Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagementPageCode {
    WebDriver driver;
    WebDriverWait wait;
    public  ManagementPageCode (WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    ManagmentElementsLocators management = new ManagmentElementsLocators();
    By managementButton = By.className(management.getManagementButton());
    By poslugyButton = By.linkText(management.getPoslugyButton());
    By personalButton  = By.linkText(management.getPersonalButton());

    public void clickAtPoslugy (){
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButton));
        driver.findElement(managementButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(poslugyButton));
        driver.findElement(poslugyButton).click();
    }

    public void clickAtPersonal(){
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButton));
        driver.findElement(managementButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(personalButton));
        driver.findElement(personalButton).click();
    }
}
