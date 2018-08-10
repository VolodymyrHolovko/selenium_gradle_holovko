package Marketing;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import Routes.BaseUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MarketingTests {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,20);
    LoginPageCode login = new LoginPageCode(driver,wait);
    BaseUrls baseUrls = new BaseUrls();
    MarketingPageCode code = new MarketingPageCode(driver,wait);
    ManagementPageCode managementCode = new ManagementPageCode(driver,wait);

    @BeforeClass
    public void befoe()throws InterruptedException{
        driver.manage().window().maximize();
        driver.get(baseUrls.getHomeUrl());
        login.typeUsername();
        login.typePassword();
        login.pressSubmit();
        login.checkSuccessLogin();
        managementCode.clickAtMarketing();
    }

    @Test
    public void createMarketing(){
    code.nullButtonCreateMarketingClick();
    code.chooseNewsButton();
    code.newsNameInput();
    code.newsDescription();
    code.newsPhoto();
    code.createNewsButton();
    }

    @AfterClass
    public void before(){
        driver.quit();
    }
}
