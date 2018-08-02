package Managment;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
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
    By addBookingButton = By.xpath(management.bookingButton);

    public void makeHoverAtElement(){
        WebElement element = driver.findElement(managementButtonSmall);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public void makeHoverAtBooking(){
        WebElement element = driver.findElement(addBookingButton);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public void clickAtPoslugy () throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonSmall));
        makeHoverAtElement();
        Thread.sleep(450);
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonBig)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(poslugyButton)).click();
        makeHoverAtBooking();
    }

    public void clickAtPersonal(){
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonSmall));
        makeHoverAtElement();
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonBig)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(personalButton)).click();
        makeHoverAtBooking();
    }

    public void clickAtSchedules() throws StaleElementReferenceException {
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonSmall));
        makeHoverAtElement();
        wait.until(ExpectedConditions.presenceOfElementLocated(managementButtonBig));
        driver.findElement(managementButtonBig).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(schedulesButton));
        driver.findElement(schedulesButton).click();
        makeHoverAtBooking();
    }
}
