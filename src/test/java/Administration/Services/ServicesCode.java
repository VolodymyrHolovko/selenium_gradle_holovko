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

    public void checkAddServicesButtons() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addServiceGroupeButton)));
    }

    public void checkEditServicesGroupeButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.editServicesGroupIcon)));
    }
    public void checkDeleteServicesGroupeButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.deleteServicesGroupeIcon)));
    }
    public void checkDropDownButtonGroupes() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.dropdownIconSrevicesGrouope)));
    }

    public void addServicesGroupe(String nameServiceGroupe) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addServiceGroupeButton))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addNameServiceGroupe))).clear();
        driver.findElement(By.xpath(locators.addNameServiceGroupe)).sendKeys(nameServiceGroupe);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locators.addGroupeButtonOnModal)));
        driver.findElement(By.cssSelector(locators.addGroupeButtonOnModal)).click();
    }

    public String getServiceGroupeName() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.listOfSrvicesGroupe)));
        List<WebElement> groupsNames = driver.findElement(By.xpath(locators.listOfSrvicesGroupe)).findElements(By.xpath(locators.serviceGroupeNamefields));
        int size = groupsNames.size();
        String results = "";
        for (int i = 0; i <size ; i ++){
            results += groupsNames.get(i).getText();
        }
        Thread.sleep(2000);
            return   results;
    }

    public void updateServiceGroupeName(String nameService, String serviceCost) throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.dropdownIconSrevicesGrouope))).click();
        Thread.sleep(1700);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addServicesButton)));
        driver.findElement(By.xpath(locators.addServicesButton)).click();
        Thread.sleep(300);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.addServicesModalTab)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locators.nameServiceField))).click();
        driver.findElement(By.id(locators.nameServiceField)).sendKeys(nameService);
        driver.findElement(By.id(locators.serviceCostFField));
        driver.findElement(By.id(locators.serviceCostFField)).clear();
        driver.findElement(By.id(locators.serviceCostFField)).sendKeys(serviceCost);
    }

}

