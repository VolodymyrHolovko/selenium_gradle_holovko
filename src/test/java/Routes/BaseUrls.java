package Routes;

public class BaseUrls {
    String homeUrl = "http://staging.eservia.com/auth/sign-in";
    String serviceUrl = "http://staging.eservia.com/business/settings/services";
    String calendarBaseUrl = "https://staging.eservia.com/business/calendar/day";
    String urlAfterLogin = "https://staging.eservia.com/business/calendar/day";

    public String getUrlAfterLogin() {
        return urlAfterLogin;
    }

    public String getCalendarBaseUrl() {
        return calendarBaseUrl;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public String getHomeUrl() {
        return homeUrl;
    }
}
