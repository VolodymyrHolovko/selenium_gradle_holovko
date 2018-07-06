package Journal;

public class JournalElementsLocators {
    String journalButton = "/html/body/app/ui-view/div/business-left-bar/div/ul/li[2]/a/i";
    String journalTitle = "/html/body/app/ui-view/div/ui-view/business-booking/div/div[1]/h2/span";
    String journalActualTab  = "/html/body/app/ui-view/div/ui-view/business-booking/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper//*[contains(text(), 'поточні')]";
    String journalArchiveTab = "/html/body/app/ui-view/div/ui-view/business-booking/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper//*[contains(text(), 'Архів')]";
    String journalAddressFilter = "md-select-value";
    String journalStaffFilter = "dropdown-item";
    String journalPeriodFilter = "md-text";
    String journalSearch = "input[type='search']";
    String journalSearchFilter = "md-select-value";

    public String getJournalButton() {
        return journalButton;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public String getJournalActualTab() {
        return journalActualTab;
    }

    public String getJournalArchiveTab() {
        return journalArchiveTab;
    }

    public String getJournalAddressFilter() {
        return journalAddressFilter;
    }

    public String getJournalStaffFilter() {
        return journalStaffFilter;
    }

    public String getJournalPeriodFilter() {
        return journalPeriodFilter;
    }

    public String getJournalSearch() {
        return journalSearch;
    }

    public String getJournalSearchFilter() {
        return journalSearchFilter;
    }
}
