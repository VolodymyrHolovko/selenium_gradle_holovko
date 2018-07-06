package Managment;

public class ManagmentElementsLocators {
    String managementButtonSmall = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[3]/a";
    String managementButtonBig = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[3]/ul/li[3]/a/span";
    String poslugyButton = "послуги";
    String personalButton = "персонал";
    String schedules = "графік роботи";

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
