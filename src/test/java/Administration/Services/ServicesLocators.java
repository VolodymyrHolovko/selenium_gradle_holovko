package Administration.Services;

public class ServicesLocators {
    String headerTabCaption = "body > app > ui-view > div > ui-view > business-profile > section > business-profile-tabs > div > md-tabs";
    String menuAdministrationButton = "/html/body/app/ui-view/business-left-bar/div/nav/ul/li[4]/a/span";
    String addServiceGroupeButton = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-services/button/span";
    String addNameServiceGroupe = "//*[@id=\"service_group_name\"]";
    String addGroupeButtonOnModal = "body > div.md-dialog-container.ng-scope > md-dialog > form > md-dialog-actions > button";
    String serviceGroupeNamefields = "//*/ui-view/business-profile-services/div/md-card/div/base-accordion-item-title/div/div/h4/span";
    String listOfSrvicesGroupe = "/html/body/app/ui-view/div/ui-view/business-profile/section/ui-view/business-profile-services/div";

    String editServicesGroupIcon = "icon-edit";
    String deleteServicesGroupeIcon = "icon-close";
    String dropdownIconSrevicesGrouope = "icon-dropdown";

    public String getDropdownIconSrevicesGrouope() {
        return dropdownIconSrevicesGrouope;
    }

    public void setDropdownIconSrevicesGrouope(String dropdownIconSrevicesGrouope) {
        this.dropdownIconSrevicesGrouope = dropdownIconSrevicesGrouope;
    }

    public String getDeleteServicesGroupeIcon() {
        return deleteServicesGroupeIcon;
    }

    public void setDeleteServicesGroupeIcon(String deleteServicesGroupeIcon) {
        this.deleteServicesGroupeIcon = deleteServicesGroupeIcon;
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
