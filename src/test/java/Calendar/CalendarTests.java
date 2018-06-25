package Calendar;

import LoginTests.LoginPageCode;
import LoginTests.LoginPageTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalendarTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,30,700);
    LoginPageCode loginPageCode = new LoginPageCode(driver,wait);

    @BeforeClass
    public void login(){
        loginPageCode.typeUsername();
        loginPageCode.typePassword();
        loginPageCode.pressSubmit();
    }

    @Test
    public void checkCalendarPage(){

    }
}
