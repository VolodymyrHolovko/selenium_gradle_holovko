package LoginTests;

import Routes.BaseUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.BaseObject;

import static org.testng.AssertJUnit.assertEquals;

    public class LoginPageCode extends BaseObject {

        LoginPageElementsLocators loginPageElementsLocators = new LoginPageElementsLocators(driver,wait);
        BaseUrls baseUrls = new BaseUrls();
        String username = "JohnstonLouie@mail.com";
        String password = "12345678";
        By usernameFieldLocator = By.id(loginPageElementsLocators.getUsernameOnLoginFieldLocator());
        By passwordFieldLocator = By.id(loginPageElementsLocators.getPasswordOnLoginFieldLocator());
        By pressSubmitLoginButoonlocator = By.id(loginPageElementsLocators.submitLoginButoonlocator);
        By bookingButton = By.xpath(loginPageElementsLocators.bookingCreateButton);

        public LoginPageCode(WebDriver driver, WebDriverWait wait) {
            super(driver, wait);
        }


        public void typeUsername() {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(usernameFieldLocator))).clear();
            driver.findElement(usernameFieldLocator).sendKeys(username);
        }

        public void typePassword() {
            wait.until(ExpectedConditions.presenceOfElementLocated(passwordFieldLocator)).clear();
            driver.findElement(passwordFieldLocator).sendKeys(password);
        }

        public void pressSubmit() throws InterruptedException {
            driver.findElement(pressSubmitLoginButoonlocator).click();
            Thread.sleep(1500);
        }

        public String checkSuccessLogin(){
            wait.until(ExpectedConditions.presenceOfElementLocated(bookingButton));
            String currentUrl =  driver.getCurrentUrl();
            return  currentUrl;
        }

    }

