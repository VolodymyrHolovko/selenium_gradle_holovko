package Workers;

public class WorkersElementsLocators {
    String addWorkers = "icon-add";
    String workersFirstNameAfterCreate = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/div/base-accordion-item-content/div/div[1]/md-input-container[1]/input";
    String workersFirstName = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/base-accordion-item-content/div/div[1]/div[1]/md-input-container/input";
    String workerLastNameAfterCreate = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/div/base-accordion-item-content/div/div[1]/md-input-container[2]/input";
    String workersLastName = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/base-accordion-item-content/div/div[1]/div[2]/md-input-container/input";
    String workersPosadaAfterCreate = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/div/base-accordion-item-content/div/div[2]/md-input-container/input";
    String workersPosada = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/base-accordion-item-content/div/div[2]/div[1]/md-input-container/input";
    String workersPhone = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/base-accordion-item-content/div/div[2]/div[2]/md-input-container/phone/div/div/input";
    String workersDescriptionAfterCreate = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/div/base-accordion-item-content/div/div[3]/div/md-input-container/div[1]/textarea";
    String workersDescription = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/base-accordion-item-content/div/div[3]/div[2]/md-input-container/div[1]/textarea";
    String workersAddButton = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/base-accordion-item-content/div/div[5]/div[2]/button";
    String workersAddButtonAfterCreate = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/div[1]/base-accordion-item-content/div/div[6]/div[2]/button/span";
    String workersDeactivateButton = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/div[1]/base-accordion-item-title/div/div[3]/div[1]/md-checkbox/div[1]/div";
    String workersSuccessMessage = "/html/body/md-toast/div/span";
    String workersDeleteButton = "icon-close";
    String workersSuccessDeleteMessage = "/html/body/md-toast/div/span";
    String workersExpandInformation = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/div[1]/base-accordion-item-title/div/div[1]/i[1]";
    String workersExpandInformationAfterLogin = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-staffs/div/div/div[1]/div/base-accordion-item-title/div/div[1]/i[1]";
    String createBookingButton = "/html/body/app/ui-view/business-header/nav/div[2]/ul/li[1]/a/button";
    String deleteWorkersSubmit = "/html/body/div[4]/md-dialog/md-dialog-actions/button[2]";

    public String getWorkersDeleteButton() {
        return workersDeleteButton;
    }

    public String getAddWorkers() {
        return addWorkers;
    }

    public String getWorkersFirstName() {
        return workersFirstName;
    }

    public String getWorkersLastName() {
        return workersLastName;
    }

    public String getWorkersPosada() {
        return workersPosada;
    }

    public String getWorkersPhone() {
        return workersPhone;
    }

    public String getWorkersDescription() {
        return workersDescription;
    }

    public String getWorkersAddButton() {
        return workersAddButton;
    }

    public String getWorkersDeactivateButton() {
        return workersDeactivateButton;
    }

    public String getWorkersSuccessMessage() {
        return workersSuccessMessage;
    }
}
