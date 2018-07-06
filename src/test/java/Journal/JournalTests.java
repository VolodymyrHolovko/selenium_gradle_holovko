package Journal;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JournalTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30, 700);
    String homeUrl = "http://staging.eservia.com/auth/sign-in";
    JournalElementsLocators locators = new JournalElementsLocators();
    LoginPageCode login  = new LoginPageCode(driver,wait);
    ManagementPageCode managementPageCode = new ManagementPageCode(driver,wait);
    JournalPageCode journal= new JournalPageCode(driver,wait);

    @BeforeClass
    public void BeforeClass() throws InterruptedException{
        driver.get(homeUrl);
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
    }

    @Test
    public void checkElementspresents() {
        journal.clickAtJournal();
        journal.checkElementsVisibilityXpath(locators.getJournalButton());
        journal.checkElementsVisibilityXpath(locators.getJournalTitle());
        journal.checkElementsVisibilityXpath(locators.getJournalActualTab());
        journal.checkElementsVisibilityXpath(locators.getJournalArchiveTab());
        journal.checkElementsVisibilityClassName(locators.getJournalAddressFilter());
        journal.checkElementsVisibilityClassName(locators.getJournalStaffFilter());
        journal.checkElementsVisibilityClassName(locators.getJournalPeriodFilter());
        journal.checkElementsVisibilityClassName(locators.getJournalSearchFilter());
        journal.checkElementsVisibilityCssSelector(locators.getJournalSearch());
        managementPageCode.clickAtPoslugy();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
