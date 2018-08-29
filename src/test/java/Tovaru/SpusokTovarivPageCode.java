package Tovaru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpusokTovarivPageCode {
    WebDriver driver;
    WebDriverWait wait;
    SpusokTovarivLocators locators = new SpusokTovarivLocators();

    By createTovarButton = By.xpath(locators.createTovarButton);
    By nazvaTovaru = By.xpath(locators.nazvaTovaru);
    By artukylTovary = By.xpath(locators.artukylTovary);

    public SpusokTovarivPageCode (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void clickAtCreateTovarButton(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(createTovarButton))).click();
    }

    public void writeTovarName(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(nazvaTovaru))).sendKeys();
    }

    public void writeTovarArticle(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(artukylTovary))).sendKeys();
    }
}
