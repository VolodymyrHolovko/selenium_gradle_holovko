package Managment;

public class ManagmentElementsLocators {
    String managementButtonSmall = "//*/div/business-left-bar/div/ul/li[3]/a";
    String managementButtonBig = "//*/div/business-left-bar/div/ul/li[3]/ul/li[3]/a/span";
    String poslugyButton = "послуги";
    String personalButton = "персонал";
    String schedules = "графік роботи";
    String bookingButton = "//*/ui-view/business-header/nav/div[2]/ul/li[1]/a/button";

    public String getPersonalButton() {
        return personalButton;
    }

    public String getPoslugyButton() {
        return poslugyButton;
    }

    public String getManagementButtonSmall() {
        return managementButtonSmall;
    }

    public String getManagementButtonBig() {
        return managementButtonBig;
    }

    public String getSchedules() {
        return schedules;
    }
}
