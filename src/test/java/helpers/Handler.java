package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.BaseObject;


public class Handler extends BaseObject {

    public Handler(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public WebElement findElement(By xpath) {
        return driver.findElement((xpath));
    }


    public void findElement(WebElement element) {
    }

}

