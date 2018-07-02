package Journal;

import LoginTests.LoginPageCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JournalTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30, 700);
    String homeUrl = "http://staging.eservia.com/auth/sign-in";

    @BeforeMethod
    public void BeforeClass() {
        driver.get(homeUrl);
    }
    LoginPageCode test = new LoginPageCode(driver,wait);

    @Test
    public void CheckLogin() throws InterruptedException {
        test.typeUsername();
        test.typePassword();
        test.pressSubmit();
        test.checkSuccessLogin();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
