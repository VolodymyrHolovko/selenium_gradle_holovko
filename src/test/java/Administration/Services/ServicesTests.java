package Administration.Services;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import Routes.BaseUrls;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ServicesTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30, 700);
    Faker faker = new Faker();
    String nameServiceGroupe = faker.artist().name();
    String updatedNameServicesGroupe = faker.name().title();
    String nameService = faker.job().seniority();
    String serviceCost = String.valueOf(faker.number().randomDigitNotZero());
    BaseUrls baseUrls = new BaseUrls();
    LoginPageCode login = new LoginPageCode(driver, wait);
    ServicesCode test = new ServicesCode(driver, wait);
    ManagementPageCode managment = new ManagementPageCode(driver, wait);

    @BeforeClass
    public  void Before() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
        managment.clickAtPoslugy();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (priority = 0)
    //Перевірка відповідності UI елементів сторінки, наявності навігаційних кнопок та хедера сторінки
    public void checkElementsOfPage() {
        test.checkHeaderNavigationTab();
        test.checkAddServicesButtons();
        test.checkEditServicesGroupeButton();
        test.checkDeleteServicesGroupeButton();
        test.checkDropDownButtonGroupes();
    }

    @Test (priority = 1)
    //Додання <Групи послуг> та перевірка наявності щойноствореної групи у списку
    public void  addServicesGroupe() throws InterruptedException {
        test.addServicesGroupe(nameServiceGroupe);
        Assert.assertEquals(true,test.getServiceGroupeName().contains(nameServiceGroupe));
    }
    @Test (priority = 2)
    //Редагування <Групи послуг> та перевірка наявності проредагованої групи у списку
    public void updateServicesGroupe() throws InterruptedException {
        test.updateServicesGroupe(updatedNameServicesGroupe);
        Assert.assertEquals(true, test.getServiceGroupeName().contains(updatedNameServicesGroupe));
    }
    @Test (priority = 3)
    //Додання <Послуги> до <Групи послуг>
    public void addServices() throws InterruptedException {
        test.addServices(nameService, serviceCost);
    }
    @Test (priority = 4)
    //Вдалення <Групи послуг>
    public void deleteServiceGroupe() throws InterruptedException {
        test.deleteServiceGroupe();
    }
    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
