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
        By journalAddressFilter = By.xpath(locators.journalAddressFilter);
        By journalStaffFilter = By.xpath(locators.journalStaffFilter);
        By journalPeriodFilter = By.xpath(locators.journalPeriodFilter);
        By journalSearch = By.xpath(locators.journalSearch);
        By journalSearchFilter = By.xpath(locators.journalSearchFilter);

        public  JournalPageCode(WebDriver driver,WebDriverWait wait){
            this.driver = driver;
            this.wait = wait;
        }

        public void checkElementsVisibility(String path){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
        }




}
