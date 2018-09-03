package Marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MarketingPageCode {
    WebDriver driver ;
    WebDriverWait wait;
    MarketingLocators locators = new MarketingLocators();

    public MarketingPageCode (WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    By nullButtonCreateMarketing = By.xpath(locators.nullButtonCreateMarketing);
    By chooseNewsButton = By.xpath(locators.chooseNewsButton);
    By newsNameInput = By.xpath(locators.newsNameInput);
    By newsDescription = By.xpath(locators.newsDescription);
    By newsPhoto = By.xpath(locators.newsPhoto);
    By createNewsButton = By.xpath(locators.createNewsButton);

    public void newsNameInput(){
        driver.findElement(newsNameInput).sendKeys("News");
    }

    public void newsDescription(){
        driver.findElement(newsDescription).sendKeys("Description");
    }

    public void chooseNewsButton(){
        driver.findElement(chooseNewsButton).click();
    }

    public void nullButtonCreateMarketingClick(){
        driver.findElement(nullButtonCreateMarketing).click();
    }
}
