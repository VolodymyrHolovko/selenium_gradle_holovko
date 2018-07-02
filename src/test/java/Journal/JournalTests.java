package Journal;

import LoginTests.LoginPageCode;
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

    @BeforeClass
    public void BeforeClass() {
        driver.get(homeUrl);
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
    }
    JournalPageCode test= new JournalPageCode(driver,wait);


    @Test
    public void CheckLogin() throws InterruptedException {
        test.checkElementsVisibility(locators.getJournalButton());
        test.checkElementsVisibility(locators.getJournalTitle());
        test.checkElementsVisibility(locators.getJournalActualTab());
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
