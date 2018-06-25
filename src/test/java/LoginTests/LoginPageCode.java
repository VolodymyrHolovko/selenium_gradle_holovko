package LoginTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;

    public class LoginPageCode {
        WebDriver driver;
        WebDriverWait wait;
        ElementsLocators elementsLocators = new ElementsLocators();
        String urlAfterLogin = "http://stage.eservia.com/business/calendar/day";
        String username = "JohnstonLouie@mail.com";
        String password = "12345678";
        By usernameFieldLocator = By.id(elementsLocators.getUsernameOnLoginFieldLocator());
        By passwordFieldLocator = By.id(elementsLocators.getPasswordOnLoginFieldLocator());
        By pressSubmitLoginButoonlocator = By.id(elementsLocators.submitLoginButoonlocator);
        By bookingButton = By.xpath(elementsLocators.bookingCreateButton);


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

