package Workers;

import LoginTests.LoginPageCode;
import Managment.ManagementPageCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
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
public void checkWorkersCreate() {
    worker.pressAddMainButton();
    worker.writeFirstName();
    worker.writelastName();
    worker.writePosada();
    worker.writePhone();
    worker.writeDescription();
    worker.addWorkerButton();
}

@AfterClass
    public void afterClass(){
        driver.quit();
}
}
