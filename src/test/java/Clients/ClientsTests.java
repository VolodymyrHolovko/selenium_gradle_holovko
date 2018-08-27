package Clients;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import Routes.BaseUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ClientsTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,20);
    LoginPageCode login = new LoginPageCode(driver,wait);
    BaseUrls baseUrls = new BaseUrls();
    ClientsCode test = new ClientsCode(driver,wait);


    ManagementPageCode managment = new ManagementPageCode(driver, wait);
    Faker faker = new Faker();
    String clientName = faker.name().firstName();
    String clientMidleName = faker.cat().name();
    String clientLastName = faker.name().lastName();
    String clientEmail = faker.color().name()+"@mail.com";
    String clientPhoneNumber = faker.regexify("[0-9]{9}");

    @BeforeClass
    public void Before() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();

        managment.clickAtClients();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test
    //Перевірка UI елементів сторінки та наявності навігаційних кнопок
    public void checkPageElements() {
        test.checkClientsPageHeader();
        test.checkHeaderButtons();
    }
    @Test
    //Перевірка створення нового <Клієнта>
    public void addClients() throws InterruptedException {
        test.addNewClients(clientName, clientMidleName, clientLastName, clientEmail, clientPhoneNumber);
    }
    @AfterClass
    public void closeDriver() {
        driver.quit();

    }
}
