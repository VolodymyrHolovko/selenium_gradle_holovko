package Managment;

public class ManagmentElementsLocators {
    String managementButtonSmall = "/html/body/app/ui-view/business-left-bar/div/nav/ul/li[4]/a/i[1]";
    String managementButtonBig = "/html/body/app/ui-view/business-left-bar/div/nav/ul/li[4]/a/span";
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
