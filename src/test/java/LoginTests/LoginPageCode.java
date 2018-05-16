package LoginTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;

    public class LoginPageCode {
        WebDriver driver;
        WebDriverWait wait;
        String urlAfterLogin = "http://stage.eservia.com/business/calendar/day";
        String username = "ivan@ukr.net";
        String password = "12345678";
        By usernameFieldLocator = By.id("login");
        By passwordFieldLocator = By.id("password");
        By pressSubmitLoginButoonlocator = By.id("login-btn");
        By bookingButton = By.xpath("/html/body/app/ui-view/business-header/nav/div[2]/ul/li[1]/a/button");


        public LoginPageCode(WebDriver driver, WebDriverWait wait){
            this.driver = driver;
            this.wait = wait;
        }

        public void typeUsername() {
            wait.until(ExpectedConditions.presenceOfElementLocated(usernameFieldLocator)).clear();
            driver.findElement(usernameFieldLocator).sendKeys(username);
        }

        public void typePassword() {
            wait.until(ExpectedConditions.presenceOfElementLocated(passwordFieldLocator)).clear();
            driver.findElement(passwordFieldLocator).sendKeys(password);
        }

        public void pressSubmit() {
            driver.findElement(pressSubmitLoginButoonlocator).click();
        }

        public void checkSuccessLogin(){
            wait.until(ExpectedConditions.presenceOfElementLocated(bookingButton));
            String currentUrl =  driver.getCurrentUrl();
            assertEquals(currentUrl,urlAfterLogin);
        }

    }

