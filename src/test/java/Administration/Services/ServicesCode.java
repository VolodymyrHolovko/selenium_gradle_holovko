package Administration.Services;

import helpers.Handler;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.BaseObject;

import java.util.List;
import java.util.Random;

public class ServicesCode extends BaseObject {
    ServicesLocators locators = new ServicesLocators(driver, wait);
    Handler handler = new Handler(driver, wait);

    public ServicesCode(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void checkHeaderNavigationTab() {
        handler.findElement(locators.headerTabCaption);
    }

    public void checkAddServicesButtons() {
        handler.findElement(locators.addServiceGroupeButton);
    }

    public void checkEditServicesGroupeButton() {
        handler.findElement(locators.editServicesGroupIcon);
    }

    public void checkDeleteServicesGroupeButton() {
        handler.findElement(locators.deleteServicesGroupeIcon);
    }

    public void checkDropDownButtonGroupes() {
        handler.findElement(locators.dropdownIconSrevicesGrouope);
    }

    public void successMessagePresents() throws InterruptedException {
        handler.assertElementIsEnabled(String.valueOf(locators.succsessMessage));
        Thread.sleep(4000);
    }

    public void addServicesGroupe(String nameServiceGroupe) {
        handler.clickOnElement(locators.addServiceGroupeButton);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addNameServiceGroupe))).clear();
        driver.findElement(By.xpath(locators.addNameServiceGroupe)).sendKeys(nameServiceGroupe);
        handler.findElement(locators.addGroupeButtonOnModal);
        handler.clickOnElement(locators.addGroupeButtonOnModal);
    }

    public void updateServicesGroupe(String updatedNameServicesGroupe) throws InterruptedException {
        Thread.sleep(500);
        handler.clickOnRandomElement(locators.servicesGroupeLists, locators.editGroupeIcon);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addNameServiceGroupe))).clear();
        driver.findElement(By.xpath(locators.addNameServiceGroupe)).sendKeys(updatedNameServicesGroupe);
        handler.clickOnElement(locators.addGroupeButtonOnModal);
    }

    public void getCreatedServiceGroupeName(String nameServiceGroupe) {
        handler.getElementNameFromList(locators.listOfSrvicesGroupe,locators.serviceGroupeNamefields, nameServiceGroupe);
    }
    public void getUpdatedServicesGroupeName(String updatedNameServicesGroupe) {
        handler.getElementNameFromList(locators.listOfSrvicesGroupe,locators.serviceGroupeNamefields, updatedNameServicesGroupe);
    }
    public void checkCreatedService(String nameService) throws InterruptedException {
        handler.clickOnFirstElementOfList(locators.servicesGroupeLists, locators.dropdownIconSrevicesGrouope);
        Thread.sleep(1000);
        handler.getElementNameFromList(locators.listOfServices, locators.serviceFromGroupe, nameService);
    }
    public void checkUpdatedService(String nameServiceUpdated) throws InterruptedException {
        handler.clickOnFirstElementOfList(locators.servicesGroupeLists, locators.dropdownIconSrevicesGrouope);
        Thread.sleep(1000);
        handler.getElementNameFromList(locators.listOfServices, locators.serviceFromGroupe, nameServiceUpdated);
    }

    public void setServicesDuration() {
        handler.clickOnElement(locators.durationField);
        handler.clickOnRandomElement(locators.durationsListTAb, locators.durationFieldFromList);

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
    public void addServiceToServicesGroupe() throws InterruptedException {
        handler.clickOnFirstElementOfList(locators.servicesGroupeLists, locators.dropdownIconSrevicesGrouope);
        Thread.sleep(1000);
        handler.scrollPageToElementAndClick(locators.addServicesButton);
    }

    public void addServices(String nameService, String serviceCost) throws InterruptedException {
        Thread.sleep(2000);
        addServiceToServicesGroupe();
        Thread.sleep(1700);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locators.nameServiceField))).click();
        driver.findElement(By.id(locators.nameServiceField)).sendKeys(nameService);
        driver.findElement(By.xpath(locators.serviceCostFField)).clear();
        driver.findElement(By.xpath(locators.serviceCostFField)).sendKeys(serviceCost);
        setServicesCurrency();
        setServicesDuration();
        setServicesAddress();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.saveServiceButton))).click();
        Thread.sleep(3000);
    }
    public void updateServices(String nameServiceUpdated, String serviceCostUpdated) throws InterruptedException {
        Thread.sleep(2000);
        handler.clickOnFirstElementOfList(locators.servicesGroupeLists, locators.dropdownIconSrevicesGrouope);
        Thread.sleep(1000);
        handler.clickOnRandomElement(locators.listOfServices, locators.editServiiceButton);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locators.nameServiceField))).click();
        driver.findElement(By.id(locators.nameServiceField)).sendKeys(nameServiceUpdated);
        driver.findElement(By.xpath(locators.serviceCostFField)).clear();
        driver.findElement(By.xpath(locators.serviceCostFField)).sendKeys(serviceCostUpdated);
        setServicesCurrency();
        setServicesDuration();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.saveServiceButton))).click();
        Thread.sleep(3000);
    }
    public  void deleteServices() throws InterruptedException {
        Thread.sleep(2000);
        handler.clickOnFirstElementOfList(locators.servicesGroupeLists, locators.dropdownIconSrevicesGrouope);
        Thread.sleep(1000);
        handler.clickOnRandomElement(locators.listOfServices, locators.deleteServiceButton);
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        WebElement yesButton = driver.findElement(locators.deleteServicesYesButton);
        actions.moveToElement(yesButton).click().perform();

    }
    public void deleteServiceGroupe() throws InterruptedException {
        handler.clickOnSelectedElementOfList(locators.servicesGroupeLists, locators.deleteServicesGroupeIcon, 1);
        Thread.sleep(1000);
        handler.findElement(locators.deleteServiceGroupeModalDialog);
        WebElement element = driver.findElement(locators.yesButton);
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(element).click().perform();
    }

    }

