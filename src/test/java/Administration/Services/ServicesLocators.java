package Administration.Services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.BaseObject;

public class ServicesLocators extends BaseObject {
    public ServicesLocators(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = "body > app > ui-view > div > ui-view > business-profile > section > business-profile-tabs > div > md-tabs")
    public WebElement headerTabCaption;
    String menuAdministrationButton = "/html/body/app/ui-view/business-left-bar/div/nav/ul/li[4]/a/span";
    @FindBy(xpath = "//button[@class='btn plus-text-btn']")
            public WebElement addServiceGroupeButton;
    String addNameServiceGroupe = "//*[@id=\"service_group_name\"]";
    @FindBy(css = "body > div.md-dialog-container.ng-scope > md-dialog > form > md-dialog-actions > button")
            public WebElement addGroupeButtonOnModal;
    @FindBy(xpath = "//*/ui-view/business-profile-services/div/md-card/div/base-accordion-item-title/div/div/h4/span")
            public WebElement serviceGroupeNamefields;
    @FindBy(xpath = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-services/div")
            public WebElement listOfSrvicesGroupe;
    @FindBy(xpath = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-services/div/md-card[1]/div/base-accordion-item-content/div/ul/li/div/button")
            public WebElement addServicesButton;
    @FindBy(className = "icon-edit")
            public WebElement editServicesGroupIcon;
    @FindBy(className = "icon-close")
            public WebElement deleteServicesGroupeIcon;
    @FindBy(xpath = "/html/body/md-toast/div/span")
            public WebElement succsessMessage;
    @FindBy(xpath = "//div[@class='base-accordion']//md-card[1]//div[1]//base-accordion-item-content[1]")
            public WebElement listOfServices;
    @FindBy(className = "icon-dropdown")
            public WebElement dropdownIconSrevicesGrouope;
    String addServicesModalTab = "add-service-modal-wrapper";
    String nameServiceField = "service_service";
    String serviceCostFField = "/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[1]/div[1]/md-input-container[1]/input[1]";
    String selectCurrencyDropDown = "/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[1]/div[1]/md-input-container[2]/md-select[1]";
    String currencyListModalTab = "/html/body/div[5]/md-select-menu";
    String currency = "md-option";
    @FindBy(xpath = "/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[1]/md-input-container[1]/md-select[1]")
            public WebElement durationField;
    @FindBy(tagName = "md-option")
            public WebElement durationFieldFromList;
    @FindBy(xpath = "/html/body/div[6]/md-select-menu/md-content")
            public WebElement durationsListTAb;
    String addresCheckBoxesForService = "/html/body/div[4]/md-dialog/form/md-dialog-content/div/div[2]";
    String addresCheckboxService = "md-checkbox";
    String saveServiceButton = "/html/body/div[4]/md-dialog/form/md-dialog-actions/button";
    @FindBy(xpath = "//div[@class='base-accordion']")
            public WebElement servicesGroupeLists;
    @FindBy(xpath = "//div[@class='base-accordion']//md-card[1]//div[1]//base-accordion-item-title[1]//div[1]//div[1]//div[1]//div[1]")
            public WebElement editGroupeIcon;
    By yesButton = By.xpath("//button[contains(text(),'так')]");
    @FindBy(xpath = "/html/body/div[4]/md-dialog/md-dialog-actions/button[2]")
            public WebElement deleteServiceGroupeModalDialog;
    @FindBy(className = "services-item")
            public WebElement serviceFromGroupe;
    @FindBy(className = "icon-edit")
            public WebElement editServiiceButton;
    @FindBy(className = "icon-close")
            public WebElement deleteServiceButton;
    By deleteServiceModalDialog = By.xpath("//*[@id=\"dialogContent_21\"]");
    By deleteServicesYesButton = By.xpath("//button[contains(text(),'так')]");


    public By getDeleteServicesYesButton() {
        return deleteServicesYesButton;
    }

    public void setDeleteServicesYesButton(By deleteServicesYesButton) {
        this.deleteServicesYesButton = deleteServicesYesButton;
    }

    public By getDeleteServiceModalDialog() {
        return deleteServiceModalDialog;
    }

    public void setDeleteServiceModalDialog(By deleteServiceModalDialog) {
        this.deleteServiceModalDialog = deleteServiceModalDialog;
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

    public String getAddNameServiceGroupe() {
        return addNameServiceGroupe;
    }

    public void setAddNameServiceGroupe(String addNameServiceGroupe) {
        this.addNameServiceGroupe = addNameServiceGroupe;
    }

    public String getMenuAdministrationButton() {
        return menuAdministrationButton;
    }

    public void setMenuAdministrationButton(String menuAdministrationButton) {
        this.menuAdministrationButton = menuAdministrationButton;
    }
}
