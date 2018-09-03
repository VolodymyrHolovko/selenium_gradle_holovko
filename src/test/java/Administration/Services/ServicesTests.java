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
import pageFactory.Abstract;

import java.util.concurrent.TimeUnit;

public class ServicesTests extends Abstract {
    Faker faker = new Faker();
    String nameServiceGroupe = faker.beer().name();
    String updatedNameServicesGroupe = faker.name().title();
    String nameService = faker.job().seniority();
    String nameServiceUpdated = faker.cat().name();
    String serviceCost = String.valueOf(faker.number().randomDigitNotZero());
    String serviceCostUpdated = String.valueOf(faker.number().randomDigitNotZero());
    BaseUrls baseUrls = new BaseUrls();
    LoginPageCode login = new LoginPageCode(driver, wait);
    ServicesCode test = new ServicesCode(driver, wait);
    ManagementPageCode managment = new ManagementPageCode(driver, wait);

    @BeforeClass
    public  void Before() throws InterruptedException {
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
        managment.clickAtPoslugy();
    }

    @Test
    //Перевірка відповідності UI елементів сторінки, наявності навігаційних кнопок та хедера сторінки
    public void A_checkElementsOfPage() {
        test.checkHeaderNavigationTab();
        test.checkAddServicesButtons();
        test.checkEditServicesGroupeButton();
        test.checkDeleteServicesGroupeButton();
        test.checkDropDownButtonGroupes();
    }
    @Test
    //Додання <Групи послуг> та перевірка наявності щойноствореної групи у списку
    public void  B_addServicesGroupe() throws InterruptedException {
        test.addServicesGroupe(nameServiceGroupe);
        test.successMessagePresents();
    }
    @Test
     public void C_checkCreatedServiceGroupe() {
         test.getCreatedServiceGroupeName(nameServiceGroupe);
    }
    @Test
    //Редагування <Групи послуг> та перевірка наявності проредагованої групи у списку
    public void D_updateServicesGroupe() throws InterruptedException {
        test.updateServicesGroupe(updatedNameServicesGroupe);
        test.successMessagePresents();
    }
    @Test
    public void E_checkUpdatedServicesGroupe() {
        test.getUpdatedServicesGroupeName(updatedNameServicesGroupe);
    }
    @Test
    //Додання <Послуги> до <Групи послуг>
    public void F_addServices() throws InterruptedException {
        test.addServices(nameService, serviceCost);
        driver.navigate().refresh();
    }
    @Test
    //Перевірка доданої <Послуги> у списку <Групи послуг>
    public void G_getCreatedServices() throws InterruptedException {
        test.checkCreatedService(nameServiceGroupe);
        driver.navigate().refresh();
    }
    @Test
    //Редагування <Послуги> та перевірка проредагованих елементів у списку <Групи послуг>
    public void H_updateServices() throws InterruptedException {
        test.updateServices(nameServiceUpdated, serviceCostUpdated);
        test.successMessagePresents();
        driver.navigate().refresh();
    }
    @Test
    //Перевірка проредагованої <Послуги> у списку <Групи послуг>
    public void I_getUpdatedServices() throws InterruptedException {
        test.checkUpdatedService(nameServiceUpdated);
        driver.navigate().refresh();
    }
    @Test
    //Видалення <Послуги> з <Шрупи послуг>
    public void J_deleteServices() throws InterruptedException {
        test.deleteServices();
        test.successMessagePresents();
    }
    @Test
    //Вдалення <Групи послуг>
    public void K_deleteServiceGroupe() throws InterruptedException {
        test.deleteServiceGroupe();
        test.successMessagePresents();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
