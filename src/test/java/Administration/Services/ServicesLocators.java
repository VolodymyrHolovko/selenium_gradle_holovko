package Administration.Services;

import org.openqa.selenium.By;

public class ServicesLocators {
    String headerTabCaption = "body > app > ui-view > div > ui-view > business-profile > section > business-profile-tabs > div > md-tabs";
    String menuAdministrationButton = "/html/body/app/ui-view/business-left-bar/div/nav/ul/li[4]/a/span";
    String addServiceGroupeButton = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-services/button/span";
    String addNameServiceGroupe = "//*[@id=\"service_group_name\"]";
    String addGroupeButtonOnModal = "body > div.md-dialog-container.ng-scope > md-dialog > form > md-dialog-actions > button";
    String serviceGroupeNamefields = "//*/ui-view/business-profile-services/div/md-card/div/base-accordion-item-title/div/div/h4/span";
    String listOfSrvicesGroupe = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-services/div";
    String addServicesButton = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-services/div/md-card[1]/div/base-accordion-item-content/div/ul/li/div/button";
    String editServicesGroupIcon = "icon-edit";
    By deleteServicesGroupeIcon = By.className("icon-close");
    By succsessMessage = By.xpath("/html/body/md-toast/div/span");
    By listOfServices = By.xpath("//div[@class='base-accordion']//md-card[1]//div[1]//base-accordion-item-content[1]");
    String dropdownIconSrevicesGrouope = "icon-dropdown";
    String addServicesModalTab = "add-service-modal-wrapper";
    String nameServiceField = "service_service";
    String serviceCostFField = "/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[1]/div[1]/md-input-container[1]/input[1]";
    String selectCurrencyDropDown = "/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[1]/div[1]/md-input-container[2]/md-select[1]";
    String currencyListModalTab = "/html/body/div[5]/md-select-menu";
    String currency = "md-option";
    String durationField = "/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[1]/md-input-container[1]/md-select[1]";
    String durationFieldFromList = "md-option";
    String durationsListTAb = "/html/body/div[6]/md-select-menu/md-content";
    String addresCheckBoxesForService = "/html/body/div[4]/md-dialog/form/md-dialog-content/div/div[2]";
    String addresCheckboxService = "md-checkbox";
    String saveServiceButton = "/html/body/div[4]/md-dialog/form/md-dialog-actions/button";
    String servicesGroupeLists = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-services/div";
    String editGroupeIcon = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-services/div/md-card[1]/div/base-accordion-item-title/div/div/div/div[1]";
    By yesButton = By.xpath( "//button[contains(text(),'так')]");
    By deleteServiceGroupeModalDialog = By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[2]");
    By serviceFromGroupe = By.tagName("li");

    public By getServiceFromGroupe() {
        return serviceFromGroupe;
    }

    public void setServiceFromGroupe(By serviceFromGroupe) {
        this.serviceFromGroupe = serviceFromGroupe;
    }

    public By getListOfServices() {
        return listOfServices;
    }

    public void setListOfServices(By listOfServices) {
        this.listOfServices = listOfServices;
    }

    public By getSuccsesMessage() {
        return succsessMessage;
    }

    public void setSuccsesMessage(By succsesMessage) {
        this.succsessMessage = succsesMessage;
    }

    public By getDeleteServiceGroupeModalDialog() {
        return deleteServiceGroupeModalDialog;
    }

    public void setDeleteServiceGroupeModalDialog(By deleteServiceGroupeModalDialog) {
        this.deleteServiceGroupeModalDialog = deleteServiceGroupeModalDialog;
    }

    public String getEditGroupeIcon() {
        return editGroupeIcon;
    }

    public void setEditGroupeIcon(String editGroupeIcon) {
        this.editGroupeIcon = editGroupeIcon;
    }

    public String getServicesGroupeLists() {
        return servicesGroupeLists;
    }

    public void setServicesGroupeLists(String servicesGroupeLists) {
        this.servicesGroupeLists = servicesGroupeLists;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSaveServiceButton() {
        return saveServiceButton;
    }

    public void setSaveServiceButton(String saveServiceButton) {
        this.saveServiceButton = saveServiceButton;
    }

    public String getAddresCheckboxService() {
        return addresCheckboxService;
    }

    public void setAddresCheckboxService(String addresCheckboxService) {
        this.addresCheckboxService = addresCheckboxService;
    }

    public String getAddresCheckBoxesForService() {
        return addresCheckBoxesForService;
    }

    public void setAddresCheckBoxesForService(String addresCheckBoxesForService) {
        this.addresCheckBoxesForService = addresCheckBoxesForService;
    }

    public String getDurationFieldFromList() {
        return durationFieldFromList;
    }

    public void setDurationFieldFromList(String durationFieldFromList) {
        this.durationFieldFromList = durationFieldFromList;
    }

    public String getDurationsListTAb() {
        return durationsListTAb;
    }

    public void setDurationsListTAb(String durationsListTAb) {
        this.durationsListTAb = durationsListTAb;
    }

    public String getDurationField() {
        return durationField;
    }

    public void setDurationField(String durationField) {
        this.durationField = durationField;
    }


    public String getCurrencyListModalTab() {
        return currencyListModalTab;
    }

    public void setCurrencyListModalTab(String currencyListModalTab) {
        this.currencyListModalTab = currencyListModalTab;
    }

    public String getSelectCurrencyDropDown() {
        return selectCurrencyDropDown;
    }

    public void setSelectCurrencyDropDown(String selectCurrencyDropDown) {
        this.selectCurrencyDropDown = selectCurrencyDropDown;
    }

    public String getServiceCostFField() {
        return serviceCostFField;
    }

    public void setServiceCostFField(String serviceCostFField) {
        this.serviceCostFField = serviceCostFField;
    }

    public String getNameServiceField() {
        return nameServiceField;
    }

    public void setNameServiceField(String nameServiceField) {
        this.nameServiceField = nameServiceField;
    }

    public String getAddServicesModalTab() {
        return addServicesModalTab;
    }

    public void setAddServicesModalTab(String addServicesModalTab) {
        this.addServicesModalTab = addServicesModalTab;
    }

    public String getAddServicesButton() {
        return addServicesButton;
    }

    public void setAddServicesButton(String addServicesButton) {
        this.addServicesButton = addServicesButton;
    }

    public String getDropdownIconSrevicesGrouope() {
        return dropdownIconSrevicesGrouope;
    }

    public void setDropdownIconSrevicesGrouope(String dropdownIconSrevicesGrouope) {
        this.dropdownIconSrevicesGrouope = dropdownIconSrevicesGrouope;
    }


    public String getEditServicesGroupIcon() {
        return editServicesGroupIcon;
    }

    public void setEditServicesGroupIcon(String editServicesGroupIcon) {
        this.editServicesGroupIcon = editServicesGroupIcon;
    }

    public String getServiceGroupeNamefields() {
        return serviceGroupeNamefields;
    }

    public void setServiceGroupeNamefields(String serviceGroupeNamefields) {
        this.serviceGroupeNamefields = serviceGroupeNamefields;
    }

    public String getListOfSrvicesGroupe() {
        return listOfSrvicesGroupe;
    }

    public void setListOfSrvicesGroupe(String listOfSrvicesGroupe) {
        this.listOfSrvicesGroupe = listOfSrvicesGroupe;
    }

    public String getAddGroupeButtonOnModal() {
        return addGroupeButtonOnModal;
    }

    public void setAddGroupeButtonOnModal(String addGroupeButtonOnModal) {
        this.addGroupeButtonOnModal = addGroupeButtonOnModal;
    }

    public String getAddNameServiceGroupe() {
        return addNameServiceGroupe;
    }

    public void setAddNameServiceGroupe(String addNameServiceGroupe) {
        this.addNameServiceGroupe = addNameServiceGroupe;
    }

    public String getAddServiceGroupeButton() {
        return addServiceGroupeButton;
    }

    public void setAddServiceGroupeButton(String addServiceGroupeButton) {
        this.addServiceGroupeButton = addServiceGroupeButton;
    }

    public String getMenuAdministrationButton() {
        return menuAdministrationButton;
    }

    public void setMenuAdministrationButton(String menuAdministrationButton) {
        this.menuAdministrationButton = menuAdministrationButton;
    }

    public String getHeaderTabCaption() {
        return headerTabCaption;
    }

    public void setHeaderTabCaption(String headerTabCaption) {
        this.headerTabCaption = headerTabCaption;
    }
}
