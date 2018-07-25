package Administration.Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ServicesCode {
    WebDriver driver;
    WebDriverWait wait;
    ServicesLocators locators = new ServicesLocators();

    public ServicesCode(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void checkHeaderNavigationTab() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locators.headerTabCaption)));
    }

    public void addServicesGroupe(String nameServiceGroupe) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addServiceGroupeButton))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addNameServiceGroupe))).clear();
        driver.findElement(By.xpath(locators.addNameServiceGroupe)).sendKeys(nameServiceGroupe);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locators.addGroupeButtonOnModal)));
        driver.findElement(By.cssSelector(locators.addGroupeButtonOnModal)).click();
    }

    public boolean getServiceGroupeName(String nameServiceGroupe) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.listOfSrvicesGroupe)));
        List<WebElement> servicesGroupe = driver.findElement(By.xpath(locators.listOfSrvicesGroupe)).findElements(By.className(locators.serviceGroupeNamefields));
        if (servicesGroupe.toString().contains(nameServiceGroupe)){return true;}
        else {return false;}
    }

}

