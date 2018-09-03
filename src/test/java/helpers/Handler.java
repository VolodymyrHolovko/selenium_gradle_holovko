package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.BaseObject;

import java.util.List;
import java.util.Random;


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

    public void clickOnRandomElement(By listOfElements, By element) {
        List<WebElement> webElementsList = driver.findElement(listOfElements).findElements(element);
        Random random = new Random();
        int randomElement = random.nextInt(webElementsList.size());
        webElementsList.get(randomElement).click();

    }


}

