package Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    By managementButtonSmall = By.xpath(management.getManagementButtonSmall());
    By managementButtonBig = By.xpath(management.getManagementButtonBig());
    By poslugyButton = By.linkText(management.getPoslugyButton());
    By personalButton  = By.linkText(management.getPersonalButton());
    By schedulesButton = By.linkText(management.schedules);

    public void makeHoverAtElement(){
        WebElement element = driver.findElement(managementButtonSmall);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public void clickAtPoslugy (){
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonSmall));
        makeHoverAtElement();
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonBig)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(poslugyButton)).click();

    }

    public void clickAtPersonal(){
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonSmall));
        makeHoverAtElement();
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonBig)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(personalButton)).click();
    }

    public void clickAtSchedules(){
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonSmall));
        makeHoverAtElement();
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonBig)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(schedulesButton)).click();


    }
}
