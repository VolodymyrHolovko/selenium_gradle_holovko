package SalarySchemes;

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

public class SalarySchemeTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,20);
    BaseUrls baseUrls = new BaseUrls();
    LoginPageCode login =new LoginPageCode(driver,wait);
    SalarySchemePageCode code = new SalarySchemePageCode(driver, wait);
    ManagementPageCode managementPageCode = new ManagementPageCode(driver,wait);
    @BeforeClass
    public void before() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
        managementPageCode.clickAtSalaryScheme();
    }

    @Test
    public void A_createSalaryScheme(){
        code.clickAtCreateSchemeButton();
        code.clickAtWorkerDropDowmn();
        code.chooseWorkerOnScheme();
        code.chooseFiksovanaScheme();
        code.clickAtArrowFiksovanaScheme();
        code.setpogodunnaStavka();
        code.saveSchemeButtonPress();
    }

    @Test
    public void B_checkSchemeCreatedAtList() throws InterruptedException{
        Assert.assertEquals(code.checkSchemesListCreates(),"фіксована схема");
        Thread.sleep(2000);
    }


    @Test
    public void C_checkSchemeAfterCreate(){
        code.openSchemeAfterCreate();
        Assert.assertEquals(true,code.checkPogodunnaStavka().contains("checked"));
    }

    @Test
    public void D_deleteSalaryScheme() throws InterruptedException{
        code.clickOnDeleteSalarySchemeButton();
        code.clickDeleteSalarySchemeSubmit();
        Assert.assertEquals(code.countBeforeDelete()-1,code.checkCountAfterDelete());
    }



    @AfterClass
    public void after(){
        driver.quit();
    }
}
