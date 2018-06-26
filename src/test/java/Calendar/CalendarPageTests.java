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
    WebDriverWait wait = new WebDriverWait(driver, 30, 700);
    String homeUrl = "http://staging.eservia.com/auth/sign-in";
    LoginPageCode login = new LoginPageCode(driver, wait);
    CalendarCode test = new CalendarCode(driver, wait);

    @BeforeClass
    public  void Before() {
        driver.manage().window().fullscreen();
        driver.get(homeUrl);
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
    }
    @Test
    public void CheckCalendarPageElements() {
        test.checkAddresField();
        test.checkModalCalendar();
        driver.navigate().refresh();
        test.checkCalendarButton();
        driver.navigate().back();
        test.checkStaff();
        test.checkCalendarGrid();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}

