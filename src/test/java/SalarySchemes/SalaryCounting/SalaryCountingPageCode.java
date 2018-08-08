package SalarySchemes.SalaryCounting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SalaryCountingPageCode {
    WebDriver driver ;
    WebDriverWait wait;
    SalaryCountingElementsLocators locators = new SalaryCountingElementsLocators();

    public SalaryCountingPageCode(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    By createAwardsButton = By.xpath(locators.createAwardsButton);
    By awardsChhoseWorkers = By.xpath(locators.awardsChhoseWorkers);
    By awardsChooseFirstWorkersOnList = By.xpath(locators.awardsChooseFirstWorkersOnList);
    By awardsModalSumma = By.xpath(locators.awardsModalSumma);
    By awardsComment = By.xpath(locators.awardsComment);
    By awardsButtonCreate = By.xpath(locators.awardsButtonCreate);

    public void clickAtCreateAwardsButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(createAwardsButton)).click();
    }

    public void chooseWorkers(){
        driver.findElement(awardsChhoseWorkers).click();
        driver.findElement(awardsChooseFirstWorkersOnList).click();
    }

    public void writeSumma(){
        driver.findElement(awardsModalSumma).sendKeys("230");
    }

    public void writeComment(){
        driver.findElement(awardsComment).sendKeys("zbs comment");
    }

    public void pressSaveAwardsButton(){
        driver.findElement(awardsButtonCreate).click();
    }



}
