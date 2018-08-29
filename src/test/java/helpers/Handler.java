package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Handler  {

    public WebDriver driver = new FirefoxDriver();
    public WebDriverWait wait = new WebDriverWait(driver, 30, 700);


    public void clickOnElement(WebElement element) {
        element.click();
    }

    public WebElement findElement(By xpath) {
        return driver.findElement((xpath));
    }


    public void findElement(WebElement element) {
    }
}

