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
    public void checkMenuElement() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.menuAdministrationButton)));
    }
    public void checkElementsOfPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.headerTabCaption)));
    }
    public void addServiceGroupe(String nameServiceGroupe) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addServiceGroupeButton))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators.addNameServiceGroupe))).clear();
        driver.findElement(By.xpath(locators.addNameServiceGroupe)).sendKeys(nameServiceGroupe);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locators.addGroupeButtonOnModal))).click();
    }
}
