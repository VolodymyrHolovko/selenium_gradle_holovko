package Clients;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import Routes.BaseUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ClientsTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,20);
    LoginPageCode login = new LoginPageCode(driver,wait);
    BaseUrls baseUrls = new BaseUrls();
    ClietsPageCode code = new ClietsPageCode(driver,wait);
    ManagementPageCode managementPageCode = new ManagementPageCode(driver,wait);

    @BeforeClass
    public void before() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
        managementPageCode.clickAtClients();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void checkClientSearch(){
        code.openClients();
        code.choiseCertainFilter();
        code.writeSearchString();
        Assert.assertEquals(true,code.searchResultVisibility());
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
