package Calendar;

import LoginTests.LoginPageCode;
import Routes.BaseUrls;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageFactory.Abstract;


public class CalendarPageTests extends Abstract {

    BaseUrls baseUrls = new BaseUrls();
    LoginPageCode login = new LoginPageCode(driver,wait);
    CalendarCode test = new CalendarCode(driver, wait);

    @Test
    //Перевірка відповідності UI елементів сторінки, наявності навігаційних кнопок та хедера сторінки
    public void CheckCalendarPageElements() throws InterruptedException {
        test.checkAddresField();
        test.checkModalCalendar();
        test.checkCalendarButtons();
        driver.navigate().back();
        test.checkStaff();
        test.checkCalendarGrid();
        test.checkProfileIcon();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}

