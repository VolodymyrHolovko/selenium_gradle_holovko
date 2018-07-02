package Journal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JournalPageCode {
        WebDriver driver;
        WebDriverWait wait;
        JournalElementsLocators locators = new JournalElementsLocators();
        By journalButton = By.xpath(locators.journalButton);
        By journalTitle = By.xpath(locators.journalTitle);
        By journalActualTab = By.xpath(locators.journalActualTab);
        By journalArchiveTab = By.xpath(locators.journalArchiveTab);
        By journalAddressFilter = By.className(locators.journalAddressFilter);
        By journalStaffFilter = By.className(locators.journalStaffFilter);
        By journalPeriodFilter = By.className(locators.journalPeriodFilter);
        By journalSearch = By.xpath(locators.journalSearch);
        By journalSearchFilter = By.cssSelector(locators.journalSearchFilter);

        public  JournalPageCode(WebDriver driver,WebDriverWait wait){
            this.driver = driver;
            this.wait = wait;
        }

        public void checkElementsVisibilityXpath(String path){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
        }

        public void checkElementsVisibilityClassName(String path){
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
        }

        public void checkElementsVisibilityCssSelector(String path){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
        }

        public void clickAtJournal(){
                wait.until(ExpectedConditions.presenceOfElementLocated(journalButton));
                driver.findElement(journalButton).click();
        }




}
