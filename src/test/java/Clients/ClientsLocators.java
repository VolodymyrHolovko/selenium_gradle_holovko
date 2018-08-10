package Clients;

import org.openqa.selenium.By;

public class ClientsLocators {
    By clientsPageHeader = By.xpath("//div[@class='header-container layout-align-space-between-center layout-row']");
    By importFileButton = By.xpath("/html[1]/body[1]/app[1]/ui-view[1]/div[1]/ui-view[1]/business-clients-list[1]/div[1]/div[1]/div[2]/div[1]/a[1]");
    By addNewButton = By.xpath("/html[1]/body[1]/app[1]/ui-view[1]/div[1]/ui-view[1]/business-clients-list[1]/div[1]/div[1]/div[2]/div[2]/a[1]");
    By searchInputField = By.xpath("/html[1]/body[1]/app[1]/ui-view[1]/div[1]/ui-view[1]/business-clients-list[1]/div[1]/div[2]/business-search-customer[1]/div[1]/div[1]/div[1]/input[1]");
    By searchFilterDropDown = By.xpath("/html[1]/body[1]/app[1]/ui-view[1]/div[1]/ui-view[1]/business-clients-list[1]/div[1]/div[2]/business-search-customer[1]/md-select[1]");
    By searchIcon = By.className("icon-search");
    By addClientForm = By.xpath("//form[@class='create-customer-dialog ng-pristine ng-valid ng-valid-maxlength']");
    By addClientNameField = By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/input[1]");
    By addClientMidleNameField = By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[1]/div[1]/div[2]/md-input-container[1]/input[1]");
    By addClientLastName = By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[1]/div[1]/div[3]/md-input-container[1]/input[1]");
    By addClientEmailField = By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[2]/md-input-container[1]/input[1]");
    By addClientSexDropdown = By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[3]/md-input-container[1]");
    By listOfSex = By.xpath("/html[1]/body[1]/div[5]");
    By sexTypeRow = By.tagName("md-option");
    By addClientPhoneField = By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/div[2]/div[1]/div[1]/md-input-container[1]/phone[1]/div[1]/div[1]/input[1]");

    public By getAddClientPhoneField() {
        return addClientPhoneField;
    }

    public By getSexTypeRow() {
        return sexTypeRow;
    }

    public By getListOfSex() {
        return listOfSex;
    }

    public By getAddClientSexDropdown() {
        return addClientSexDropdown;
    }

    public By getAddClientEmailField() {
        return addClientEmailField;
    }

    public By getAddClientLastName() {
        return addClientLastName;
    }

    public By getAddClientMidleNameField() {
        return addClientMidleNameField;
    }

    public By getAddClientNameField() {
        return addClientNameField;
    }

    public By getAddClientForm() {
        return addClientForm;
    }

    public By getSearchIcon() {
        return searchIcon;
    }

    public By getSearchFilterDropDown() {
        return searchFilterDropDown;
    }

    public By getSearchInputField() {
        return searchInputField;
    }

    public By getAddNewButton() {
        return addNewButton;
    }

    public By getImportFileButton() {
        return importFileButton;
    }

    public By getClientsPageHeader() {
        return clientsPageHeader;
    }
}
