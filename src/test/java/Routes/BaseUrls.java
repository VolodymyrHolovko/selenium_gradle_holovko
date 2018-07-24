package Routes;

public class BaseUrls {
    String homeUrl = "http://staging.eservia.com/auth/sign-in";
    String serviceUrl = "http://staging.eservia.com/business/settings/services";

    public String getServiceUrl() {
        return serviceUrl;
    }

    public String getHomeUrl() {
        return homeUrl;
    }
}
