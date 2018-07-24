package LoginTests;

import Routes.BaseUrls;

public class LoginPageElementsLocators {
    BaseUrls baseUrls = new BaseUrls();
    String usernameOnLoginFieldLocator = "login";
    String passwordOnLoginFieldLocator = "password";
    String submitLoginButoonlocator = "login-btn";
    String bookingCreateButton = "/html/body/app/ui-view/business-header/nav/div[2]/ul/li[1]/a/button";

    public String getUrlAfterLogin() {
        return baseUrls.getUrlAfterLogin();
    }

    public String getUsernameOnLoginFieldLocator() {
        return usernameOnLoginFieldLocator;
    }

    public void setUsernameOnLoginFieldLocator(String usernameOnLoginFieldLocator) {
        this.usernameOnLoginFieldLocator = usernameOnLoginFieldLocator;
    }

    public String getPasswordOnLoginFieldLocator() {
        return passwordOnLoginFieldLocator;
    }

    public void setPasswordOnLoginFieldLocator(String passwordOnLoginFieldLocator) {
        this.passwordOnLoginFieldLocator = passwordOnLoginFieldLocator;
    }

    public String getSubmitLoginButoonlocator() {
        return submitLoginButoonlocator;
    }

    public void setSubmitLoginButoonlocator(String submitLoginButoonlocator) {
        this.submitLoginButoonlocator = submitLoginButoonlocator;
    }

    public String getBookingCreateButton() {
        return bookingCreateButton;
    }

    public void setBookingCreateButton(String bookingCreateButton) {
        this.bookingCreateButton = bookingCreateButton;
    }
}
