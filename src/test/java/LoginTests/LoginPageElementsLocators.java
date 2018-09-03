package LoginTests;

import Routes.BaseUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.BaseObject;

public class LoginPageElementsLocators extends BaseObject {
    BaseUrls baseUrls = new BaseUrls();
    @FindBy (id = "login")
    WebElement usernameOnLoginFieldLocator;

    @FindBy (id = "password")
    WebElement passwordOnLoginFieldLocator;

    @FindBy (id = "login-btn")
    WebElement submitLoginButoonlocator;

    @FindBy (xpath = "/html/body/app/ui-view/business-header/nav/div[2]/ul/li[1]/a/button")
    WebElement bookingCreateButton;

    public LoginPageElementsLocators(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

}
