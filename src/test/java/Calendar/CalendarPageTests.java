package Calendar;

import LoginTests.LoginPageCode;
import Routes.BaseUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CalendarPageTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30, 700);
    BaseUrls baseUrls = new BaseUrls();
    LoginPageCode login = new LoginPageCode(driver, wait);
    CalendarCode test = new CalendarCode(driver, wait);

    @BeforeClass
    public  void Before() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();

    }
    @Test
    //Перевірка відповідності UI елементів сторінки, наявності навігаційних кнопок та хедера сторінки
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

