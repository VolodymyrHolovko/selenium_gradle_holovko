package Administration.Services;

import LoginTests.LoginPageCode;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ServicesTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30, 700);
    Faker faker = new Faker();
    String nameServiceGroupe = faker.artist().name();
    String homeUrl = "http://staging.eservia.com/auth/sign-in";
    String servicesURL = "http://staging.eservia.com/business/settings/services";
    LoginPageCode login = new LoginPageCode(driver, wait);
    ServicesCode test = new ServicesCode(driver, wait);

    @BeforeClass
    public  void Before() {
        driver.manage().window().maximize();
        driver.get(homeUrl);
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
        driver.get(servicesURL);
    }
    @Test
    public void  checkElements() {
        test.addServiceGroupe(nameServiceGroupe);
    }
    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
