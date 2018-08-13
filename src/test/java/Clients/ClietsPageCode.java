package Clients;

import Managment.ManagementPageCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClietsPageCode {
    WebDriver driver;
    WebDriverWait wait;
    public ClietsPageCode(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
    }
    ManagementPageCode management = new ManagementPageCode(driver,wait);
    ClientsLocators locators = new ClientsLocators();

    By openClientsFilter = By.xpath(locators.openClientsFilter);
    By filterByPhone = By.xpath(locators.filterByPhone);
    By searchString = By.xpath(locators.searchString);
    By searchResult = By.xpath(locators.searchResult);

    public void openClients(){
        driver.findElement(openClientsFilter).click();
    }

    public void choiseCertainFilter(){
        driver.findElement(filterByPhone).click();
    }

    public void writeSearchString(){
        driver.findElement(searchString).sendKeys("+380679296214");
    }

    public boolean searchResultVisibility(){
        wait.until(ExpectedConditions.presenceOfElementLocated(searchResult));
        return  true;
    }
}
