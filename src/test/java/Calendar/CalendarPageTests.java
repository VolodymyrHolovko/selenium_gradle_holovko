package Calendar;

import LoginTests.LoginPageCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalendarPageTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 90, 1700);
    String homeUrl = "http://staging.eservia.com/auth/sign-in";
    LoginPageCode login = new LoginPageCode(driver, wait);
    CalendarCode test = new CalendarCode(driver, wait);

    @BeforeClass
    public  void Before() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(homeUrl);
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();

    }
    @Test
    public void CheckCalendarPageElements() throws InterruptedException {
        test.checkAddresField();
        test.checkModalCalendar();
        test.checkCalendarButtons();
        driver.navigate().back();
        test.checkCalendarGrid();
        test.checkProfileIcon();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}

