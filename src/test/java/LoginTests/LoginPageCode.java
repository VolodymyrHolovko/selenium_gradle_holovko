package LoginTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;

    public class LoginPageCode {
        WebDriver driver;
        WebDriverWait wait;
<<<<<<< HEAD
        LoginPageElementsLocators loginPageElementsLocators = new LoginPageElementsLocators();
=======
        ElementsLocators elementsLocators = new ElementsLocators();
>>>>>>> holovko
        String urlAfterLogin = "http://staging.eservia.com/business/calendar/day";
        String username = "JohnstonLouie@mail.com";
        String password = "12345678";
        By usernameFieldLocator = By.id(loginPageElementsLocators.getUsernameOnLoginFieldLocator());
        By passwordFieldLocator = By.id(loginPageElementsLocators.getPasswordOnLoginFieldLocator());
        By pressSubmitLoginButoonlocator = By.id(loginPageElementsLocators.submitLoginButoonlocator);
        By bookingButton = By.xpath(loginPageElementsLocators.bookingCreateButton);


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
            //assertEquals(currentUrl,urlAfterLogin);
        }

    }

