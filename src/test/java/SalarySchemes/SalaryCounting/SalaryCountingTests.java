package SalarySchemes.SalaryCounting;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import Routes.BaseUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SalaryCountingTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);
    LoginPageCode login =new LoginPageCode(driver,wait);
    BaseUrls baseUrls = new BaseUrls();
    SalaryCountingPageCode code = new SalaryCountingPageCode(driver,wait);
    ManagementPageCode managementPageCode = new ManagementPageCode(driver,wait);

    @BeforeClass
    public void before() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
        managementPageCode.clickAtSalaryCounting();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void A_createAwards() throws InterruptedException {
        code.clickAtCreateAwardsButton();
        code.chooseWorkers();
        code.writeSumma();
        code.writeComment();
        code.pressSaveAwardsButton();
        Assert.assertEquals(true,code.awardsSuccessMessagePresent());
    }

    @Test
    public void B_checkThatCalculatingCreated(){
        code.openWorkersListToCalculte();
        code.chooseCertainWorkerToCalculate();
        code.pressCalculateButton();
        Assert.assertEquals(true,code.checkCalculatingView());
    }

    @Test
    public void C_createRozrahunok() throws InterruptedException {
        code.rozrahuvatyBurronClick();
        String summa = code.rozrahovanasuma();
        code.narahuvatuZpFromModalClick();
        if (code.konfliktRozrahunkeModal()){
            code.konfliktRozrahunkyModalButton();
        }
        else {
            managementPageCode.clickAtSalaryHistory();
            managementPageCode.clickAtSalaryHistory();
            Assert.assertEquals(true, driver.findElement(By.xpath("//*[contains(text()," + summa + ")]")));
        }
        }

        @AfterClass
        public void quit(){
        driver.quit();
        }
}
