package Workers;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import Routes.BaseUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkersTests {
WebDriver driver = new FirefoxDriver();
WebDriverWait wait = new WebDriverWait(driver,30,700);
    BaseUrls baseUrls = new BaseUrls();
WorkersPageCode worker = new WorkersPageCode(driver,wait);
ManagementPageCode management = new ManagementPageCode(driver,wait);
LoginPageCode login  = new LoginPageCode(driver,wait);

@BeforeClass
    public void beforeClass() throws InterruptedException{
    driver.get(baseUrls.getHomeUrl());
    login.typeUsername();
    login.typePassword();
    login.pressSubmit();
    driver.manage().window().maximize();
}

@BeforeMethod
public void directToPage(){
    management.clickAtPersonal();
    worker.makeHoverAtElement();
}

@Test
public void A_checkWorkersCreate() {
    //Перевірка успішного створенння праціника з валідними даними
    worker.pressAddMainButton();
    worker.writeFirstName();
    worker.writelastName();
    worker.writePosada();
    worker.writePhone();
    worker.writeDescription();
    worker.addWorkerButton();
    Assert.assertEquals(true, worker.successMessagePresents());
}

@Test
public void B_updateWorkes(){
    //Перевірка успішної зміни даних праціника з валідними даними
    worker.expandWorkerInfoAfterCreate();
    worker.updateFirstName();
    worker.updateLastName();
    worker.updateDescription();
    worker.updatePosade();
    worker.addWorkerButtonAfterCreate();
    Assert.assertEquals(true, worker.successMessagePresents());
}

@Test
public void C_checkWorkerInformation(){
    //Перевірка збереження змінених даних працівника
    worker.expandWorkerInfoAfterCreate();
    Assert.assertEquals("Максік",worker.getFirstName());
    Assert.assertEquals("Литковець",worker.getLastName());
    Assert.assertEquals("посада",worker.getPosada());
    Assert.assertEquals("курча",worker.getDescription());
}


@AfterClass
public void afterClass(){
    driver.quit();
}
}
