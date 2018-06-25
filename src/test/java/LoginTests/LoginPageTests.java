package LoginTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTests {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30, 700);
        String homeUrl = "http://stage.eservia.com/auth/sign-in";

        @BeforeClass
        public  void main() {
            String os = System.getProperty("os.name").toLowerCase();
                if (os.contains("mac")){
            System.setProperty("webdriver.gecko.driver", "/Users/volodymyr_holovko/WORK/QA/projects/BookingWebTests/geckodriver");}
            else {
                    System.setProperty("webdriver.gecko.driver" , "C:\\Users\\User\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
                }

        }
        @BeforeMethod
        public void BeforeClass() {
            driver.get(homeUrl);
        }
        LoginPageCode test = new LoginPageCode(driver,wait);

        @Test
        public void CheckLogin() throws InterruptedException {
            test.typeUsername();
            test.typePassword();
            test.pressSubmit();
            test.checkSuccessLogin();
        }

        @AfterClass
        public void closeDriver() {
            driver.quit();
        }
    }

