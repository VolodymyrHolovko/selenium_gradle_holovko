package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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

    public void assertElementIsEnabled(String xpath) {
        Assert.assertEquals(driver.findElement(By.xpath(xpath)).isEnabled(),true);
    }


    public void findElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void typeToField(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    public void clickOnRandomElement(WebElement listOfElements, WebElement element) {
        List<WebElement> webElementsList = driver.findElement((By) listOfElements).findElements((By) element);
        Random random = new Random();
        int randomElement = random.nextInt(webElementsList.size());
        webElementsList.get(randomElement).click();
    }
    public void clickOnFirstElementOfList(WebElement listOfElements, WebElement element) {
        List<WebElement> webElementsList = driver.findElement((By) listOfElements).findElements((By) element);
        Random random = new Random();
        int randomElement = 0;
        webElementsList.get(randomElement).click();
    }
    public void clickOnSelectedElementOfList(WebElement listOfElements, WebElement element, int selectedElement) {
        List<WebElement> webElementsList = driver.findElement((By) listOfElements).findElements((By) element);
        Random random = new Random();
        int randomElement = selectedElement;
        webElementsList.get(randomElement).click();
    }
    public void getElementNameFromList(WebElement listOfElements, WebElement element,String elementName) {
        List<WebElement> webElementsList = driver.findElement((By) listOfElements).findElements((By) element);
        int size = webElementsList.size();
        String result = "";
        for (int i=0; i<size; i++){
            result += webElementsList.get(i).getText();
            Assert.assertEquals(result.contains(elementName),true);
        }
    }
    public void scrollPageToElementAndClick(WebElement xpath) {
        WebElement element = driver.findElement(By.xpath(String.valueOf(xpath)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);" + "window.scrollBy(0,-100);", element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }


}

