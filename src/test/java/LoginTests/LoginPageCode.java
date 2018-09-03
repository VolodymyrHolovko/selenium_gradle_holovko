package LoginTests;

import Routes.BaseUrls;
import helpers.Handler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.BaseObject;

import static org.testng.AssertJUnit.assertEquals;

    public class LoginPageCode extends BaseObject {
        Handler handler = new Handler(driver,wait);
        LoginPageElementsLocators locators = new LoginPageElementsLocators(driver,wait);
        String username = "JohnstonLouie@mail.com";
        String password = "12345678";

        public LoginPageCode(WebDriver driver, WebDriverWait wait) {
            super(driver, wait);
        }

        public void typeUsername() {
            handler.typeToField(locators.usernameOnLoginFieldLocator,username);
        }

        public void typePassword() {
            handler.typeToField(locators.passwordOnLoginFieldLocator,password);
        }

        public void pressSubmit() throws InterruptedException {
            handler.clickOnElement(locators.submitLoginButoonlocator);
            Thread.sleep(1500);
        }

        public String checkSuccessLogin(){
           handler.findElement(locators.bookingCreateButton);
            String currentUrl =  driver.getCurrentUrl();
            return  currentUrl;
        }

    }

