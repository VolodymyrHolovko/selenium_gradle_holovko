package Workers;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkersTests {
WebDriver driver = new FirefoxDriver();
WebDriverWait wait = new WebDriverWait(driver,30,70);
String homeUrl = "http://staging.eservia.com/auth/sign-in";
WorkersPageCode worker = new WorkersPageCode(driver,wait);
ManagementPageCode management = new ManagementPageCode(driver,wait);
LoginPageCode login  = new LoginPageCode(driver,wait);

@BeforeClass
    public void beforeClass(){
    driver.get(homeUrl);
    login.typeUsername();
    login.typePassword();
    login.pressSubmit();
    management.clickAtPersonal();
}

@Test
public void A_checkWorkersCreate() {
    worker.makeHoverAtElement();
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
public void B_checkWorkerInformation(){
        worker.expandWorkerInfo();
        Assert.assertEquals("Aтестовий",worker.getFirstName());
        Assert.assertEquals("целафан",worker.getLastName());
        Assert.assertEquals("671285351",worker.getPhone());
        Assert.assertEquals("виносить",worker.getPosada());
        Assert.assertEquals("Працює краще всіх",worker.getDescription());
}

@Test
public void C_checkWorkersDelete(){
    worker.deleteWorker();
    Assert.assertEquals(true, worker.successMessagePresents());
}



@AfterClass
public void afterClass(){
    driver.quit();
}
}
