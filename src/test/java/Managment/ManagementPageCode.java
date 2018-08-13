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
    By managementButtonSmall = By.xpath(management.managementButtonSmall);
    By managementButtonBig = By.xpath(management.managementButtonBig);
    By poslugyButton = By.linkText(management.poslugyButton);
    By personalButton  = By.linkText(management.personalButton);
    By schedulesButton = By.linkText(management.schedules);
    By addBookingButton = By.xpath(management.bookingButton);
    By salarySchemeSmallButton = By.xpath(management.salarySchemeSmallButton);
    By salarySchemeCountingButton = By.xpath(management.salarySchemeCountingButton);
    By salaryCounting = By.xpath(management.salaryCounting);
    By salaryHistory = By.xpath(management.salaryHistory);
    By marketingButtonBig = By.xpath(management.marketingButtonBig);
    By marketingButtonSmall = By.xpath(management.marketingButtonSmall);
    By cliensButtonBig = By.xpath(management.cliensButtonBig);
    By clientsButtonSmall = By.xpath(management.clientsButtonSmall);

    public void makeHoverAtElement(){
        WebElement element = driver.findElement(managementButtonSmall);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public void makeHoverAtCliets(){
        WebElement element = driver.findElement(cliensButtonBig);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }



    public void makeHoverAtSalary(){
        WebElement element = driver.findElement(salarySchemeSmallButton);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    public void makeHoverAtMarketing(){
        WebElement element = driver.findElement(marketingButtonBig);
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

    public void clickAtSalaryScheme () throws StaleElementReferenceException{
        wait.until(ExpectedConditions.presenceOfElementLocated(salarySchemeSmallButton));
        makeHoverAtSalary();
        wait.until(ExpectedConditions.presenceOfElementLocated(salarySchemeCountingButton)).click();
    }

    public void clickAtSalaryCounting() throws StaleElementReferenceException{
        wait.until(ExpectedConditions.presenceOfElementLocated(salarySchemeSmallButton));
        makeHoverAtSalary();
        wait.until(ExpectedConditions.presenceOfElementLocated(salaryCounting)).click();
    }

    public void clickAtSalaryHistory() throws StaleElementReferenceException{
        wait.until(ExpectedConditions.presenceOfElementLocated(salarySchemeSmallButton));
        makeHoverAtSalary();
        wait.until(ExpectedConditions.presenceOfElementLocated(salaryHistory)).click();
    }

    public void clickAtMarketing(){
        wait.until(ExpectedConditions.presenceOfElementLocated(marketingButtonBig));
        makeHoverAtMarketing();
        wait.until(ExpectedConditions.presenceOfElementLocated(marketingButtonSmall)).click();
    }

    public void clickAtClients(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cliensButtonBig));
        makeHoverAtCliets();
        wait.until(ExpectedConditions.presenceOfElementLocated(clientsButtonSmall)).click();
    }
}
