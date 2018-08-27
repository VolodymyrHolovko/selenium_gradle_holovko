package Clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class ClientsCode {
    WebDriver driver;
    WebDriverWait wait;
    ClientsLocators locators = new ClientsLocators();

    public ClientsCode(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void checkClientsPageHeader() {
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getClientsPageHeader()));
    }
    public  void checkHeaderButtons() {
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getImportFileButton()));
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getAddNewButton()));
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getSearchInputField()));
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getSearchFilterDropDown()));
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getSearchIcon()));
    }
    public void setRandomClientSex() {
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getAddClientSexDropdown())).click();
        List <WebElement> listOfSex =  driver.findElement(locators.getListOfSex()).findElements(locators.getSexTypeRow());
        Random random = new Random();
        int randomSexType = random.nextInt(listOfSex.size());
        listOfSex.get(randomSexType).click();

    }

    public void setRandomMonthForClient() {
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getModalCalendarMonunthPicker())).click();
        List<WebElement> listOfYears = driver.findElement(locators.getYearMounthsList()).findElements(locators.getRandomClientsMonth());
        Random random = new Random();
        int randomYear = random.nextInt(listOfYears.size());
        listOfYears.get(randomYear).click();
    }

    public void setRandomDayForClient() throws InterruptedException {
        Thread.sleep(1500);
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getListOfDays()));
        List<WebElement> listOfDays = driver.findElement(locators.getListOfDays()).findElements(locators.getDayColums());
        Random random = new Random();
        int randomDays = random.nextInt(listOfDays.size());
        Thread.sleep(1500);
        listOfDays.get(randomDays).click();
        Thread.sleep(1500);
    }

    public void setRandomClientBDay() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.addClientBDayCheckbox)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.addClientBDayInputField)).click();
        setRandomMonthForClient();
        setRandomDayForClient();
    }
    public void addNewClients(String clientName, String clientMidleName, String clientLastName, String clientEmail, String clientPhoneNumber) throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getAddNewButton())).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getAddClientForm()));
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getAddClientNameField())).sendKeys(clientName);
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getAddClientMidleNameField())).sendKeys(clientMidleName);
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getAddClientLastName())).sendKeys(clientLastName);
        wait.until(ExpectedConditions.presenceOfElementLocated(locators.getAddClientEmailField())).sendKeys(clientEmail);
        setRandomClientSex();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getAddClientPhoneField())).sendKeys(clientPhoneNumber);
        setRandomClientBDay();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.getSaveButton())).click();
        Thread.sleep(2000);
    }
}
