package SalarySchemes.SalaryScheme;

import Managment.ManagementPageCode;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SalarySchemePageCode {
    WebDriver driver;
    WebDriverWait wait;
    public SalarySchemePageCode(WebDriver driver,WebDriverWait wait){
        this.driver =driver;
        this.wait = wait;
    }
    SalarySchemeLocators locators = new SalarySchemeLocators();
    ManagementPageCode code = new ManagementPageCode(driver,wait);

    int countBefore;
    int countAfter;

    By createSalaryButton = By.xpath(locators.createSalaryButton);
    By workersDropDown = By.xpath(locators.workersDropDown);
    By certainWorker = By.xpath(locators.certainWorker);
    By chooseFiksovanaScheme = By.xpath(locators.chooseFiksovanaSchemeRadio);
    By arrowFiksovanaScheme = By.xpath(locators.arrowFiksovanaScheme);
    By pogodunnaStavka = By.xpath(locators.pogodunnaStavka);
    By saveSchemeButton = By.xpath(locators.saveSchemeButton);
    By salarySchemesList = By.xpath(locators.salarySchemesList);
    By deleteSalarySchemeButton = By.xpath(locators.deleteSalarySchemeButton);
    By deleteSalarySchemeSubmit = By.xpath(locators.deleteSalarySchemeSubmit);

    public void clickAtCreateSchemeButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(createSalaryButton)).click();
    }

    public void clickAtWorkerDropDowmn(){
        wait.until(ExpectedConditions.presenceOfElementLocated(workersDropDown)).click();
    }

    public void chooseWorkerOnScheme(){
        wait.until(ExpectedConditions.presenceOfElementLocated(certainWorker)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(certainWorker));
    }

    public void chooseFiksovanaScheme() throws ElementClickInterceptedException {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(chooseFiksovanaScheme)).click();
        }
        catch (ElementClickInterceptedException e){
            wait.until(ExpectedConditions.presenceOfElementLocated(chooseFiksovanaScheme)).click();
        }
    }

    public void clickAtArrowFiksovanaScheme(){
        wait.until(ExpectedConditions.presenceOfElementLocated(arrowFiksovanaScheme)).click();
    }

    public void setpogodunnaStavka(){
        wait.until(ExpectedConditions.presenceOfElementLocated(pogodunnaStavka)).sendKeys("20");
    }

    public void saveSchemeButtonPress(){
        wait.until(ExpectedConditions.presenceOfElementLocated(saveSchemeButton)).click();
    }

    public String checkSchemesListCreates (){
        wait.until(ExpectedConditions.presenceOfElementLocated(salarySchemesList));
        List<WebElement> list = driver.findElement(salarySchemesList).findElements(By.tagName("tr"));
        int count = list.size();
        String xpath = "/html/body/app/ui-view/div/ui-view/business-accounting-scheme-payroll/div/div[2]/table/tbody/tr["+count+"]/td[2]/div/div/span";
        String schemeText = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
        return schemeText;
    }

    public void openSchemeAfterCreate(){
        wait.until(ExpectedConditions.presenceOfElementLocated(salarySchemesList));
        List<WebElement> list = driver.findElement(salarySchemesList).findElements(By.tagName("tr"));
        int count = list.size();
        this.countBefore=count;
        String xpath = "/html/body/app/ui-view/div/ui-view/business-accounting-scheme-payroll/div/div[2]/table/tbody/tr["+count+"]/td[4]/i";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
    }

    public void clickOnDeleteSalarySchemeButton() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(deleteSalarySchemeButton)).click();
        Thread.sleep(2000);
    }

    public void clickDeleteSalarySchemeSubmit() throws InterruptedException{
        wait.until(ExpectedConditions.presenceOfElementLocated(deleteSalarySchemeSubmit)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(arrowFiksovanaScheme));
        Thread.sleep(2000);

    }

    public String checkPogodunnaStavka(){
        String stavka = wait.until(ExpectedConditions.presenceOfElementLocated(chooseFiksovanaScheme)).getAttribute("class");
        return stavka;
    }

    public int checkCountAfterDelete() {
        wait.until(ExpectedConditions.presenceOfElementLocated(salarySchemesList));
        List<WebElement> list = driver.findElement(salarySchemesList).findElements(By.tagName("tr"));
        int count = list.size();
        countAfter = count;
        return  countAfter;
    }

    public int countBeforeDelete(){
        return  countBefore;
    }
}
