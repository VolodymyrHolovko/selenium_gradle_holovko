package Managment;

import org.openqa.selenium.By;

public class ManagmentElementsLocators {
    String managementButtonSmall = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[3]/a/i";
    String managementButtonBig = "//*/div/business-left-bar/div/ul/li[3]/ul/li[3]/a/span";
    String poslugyButton = "послуги";
    String personalButton = "персонал";
    String schedules = "графік роботи";
    String bookingButton = "//*/ui-view/business-header/nav/div[2]/ul/li[1]/a/button";
    String salarySchemeSmallButton = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[8]/a";
    String salarySchemeCountingButton = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[8]/ul/li[3]/a/span";
    String salaryCounting = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[8]/ul/li[4]/a/span";

    String salaryHistory = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[8]/ul/li[5]/a/span";
    String marketingButtonBig = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[5]/a";
    String marketingButtonSmall = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[5]/ul/li/a/span";
    String cliensButtonBig = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[4]/a/i";
    String clientsButtonSmall = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[4]/ul/li/a/span";

    By clientsButton = By.xpath("/html[1]/body[1]/app[1]/ui-view[1]/div[1]/business-left-bar[1]/div[1]/ul[1]/li[4]");
    By clientsSideTab = By.xpath("//li[@ng-class=\"{'active-item' : $ctrl.$state.is('business/clients')}\"]//ul[@class='sidebar-sub-level-items fly-out-list']//a");
    By succsessMessage = By.xpath("/html/body/md-toast/div/span");

    public By getSuccsessMessage() {
        return succsessMessage;
    }

    public By getClientsSideTab() {
        return clientsSideTab;
    }

    public By getClientsButton() {
        return clientsButton;
    }

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
