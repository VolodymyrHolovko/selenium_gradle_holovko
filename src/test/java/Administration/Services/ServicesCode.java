package Administration.Services;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.Random;

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
    public void updateServicesGroupe(String updatedNameServicesGroupe) throws InterruptedException {
        Thread.sleep(500);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.servicesGroupeLists)));
        List<WebElement> listServiceGroupes = driver.findElement(By.xpath(locators.servicesGroupeLists)).findElements(By.xpath(locators.editGroupeIcon));
        Random random = new Random();
        int randomGroupeForEdit = random.nextInt(listServiceGroupes.size());
        listServiceGroupes.get(randomGroupeForEdit).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addNameServiceGroupe))).clear();
        driver.findElement(By.xpath(locators.addNameServiceGroupe)).sendKeys(updatedNameServicesGroupe);
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

    public void setServicesDuration() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locators.durationField))).click();
        List<WebElement> durations = driver.findElement(By.xpath(locators.durationsListTAb)).findElements(By.tagName(locators.durationFieldFromList));
        Random random = new Random();
        int randomDuration = random.nextInt(durations.size());
        durations.get(randomDuration).click();
    }
    public void setServicesAddress() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addresCheckBoxesForService)));
        List<WebElement> address = driver.findElement(By.xpath(locators.addresCheckBoxesForService)).findElements(By.tagName(locators.addresCheckboxService));
        Random random = new Random();
        int randomAddress = random.nextInt(address.size());
        address.get(randomAddress).click();
    }

    public void setServicesCurrency() {
        driver.findElement(By.xpath(locators.selectCurrencyDropDown)).click();
        List<WebElement> currency = driver.findElement(By.xpath(locators.currencyListModalTab)).findElements(By.tagName(locators.currency));
        Random random = new Random();
        int randomCurrency = random.nextInt(currency.size());
        currency.get(randomCurrency).click();
    }
    public void addServiceToRandomServicesGroupe() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.servicesGroupeLists)));
        List<WebElement> listServicesGroups = driver.findElement(By.xpath(locators.servicesGroupeLists)).findElements(By.className(locators.dropdownIconSrevicesGrouope));
        Random random = new Random();
        int randomGroupe = random.nextInt(listServicesGroups.size());
        listServicesGroups.get(randomGroupe).click();
        Thread.sleep(1000);
        String xpath = "//*/md-card["+randomGroupe+"]/div/base-accordion-item-content/div/ul/li/div/button";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();

    }

    public void addServices(String nameService, String serviceCost) throws InterruptedException {
        Thread.sleep(2000);
        addServiceToRandomServicesGroupe();
        Thread.sleep(1700);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locators.nameServiceField))).click();
        driver.findElement(By.id(locators.nameServiceField)).sendKeys(nameService);
        driver.findElement(By.id(locators.serviceCostFField));
        driver.findElement(By.id(locators.serviceCostFField)).clear();
        driver.findElement(By.id(locators.serviceCostFField)).sendKeys(serviceCost);
        setServicesCurrency();
        setServicesDuration();
        setServicesAddress();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.saveServiceButton))).click();
    }

}

