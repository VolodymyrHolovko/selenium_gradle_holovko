package Administration.Services;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
    ManagementPageCode managment = new ManagementPageCode(driver, wait);

    @BeforeClass
    public  void Before() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(homeUrl);
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
        managment.clickAtPoslugy();
    }
    @Test
    public void checkElementsOfPage() {
        test.checkHeaderNavigationTab();
    }
    @Test
    public void  addServicesGroupe() {
        test.addServicesGroupe(nameServiceGroupe);
        Assert.assertEquals(true, test.getServiceGroupeName(nameServiceGroupe));
    }
    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
