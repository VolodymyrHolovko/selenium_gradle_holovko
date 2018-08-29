package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarLocators {
    @FindBy(xpath = "//div[@class='top-header layout-row']")
            public WebElement addresField;
   /* By addresField = By.xpath("//div[@class='top-header layout-row']");*/
    String dateButton = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[2]/div[2]/md-datepicker/div[1]/button";
    String currentDate = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[2]/div[2]";
    String addresFieldTitle = "/html/body/app/ui-view/div/ui-view/business-calendar/div/beauty-business-calendar/div/div/div/div[1]/div/span[2]";
    String modalCalendarTab = "md-datepicker-calendar-pane";
    String calendarButton = "marketing-button-group";
    String calendarHeader = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[3]/div/div/business-calendar-month/div";
    String staffHeader = "staff-calendar-header";
    String currentTimeLine = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[3]/div/div/business-calendar-day/div/div[1]";
    String calendarGrid = "table-day-container";
    String nextDayButton = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[2]/div[1]/div/button[2]";
    String addBookingButton = "/html/body/app/ui-view/business-header/nav/div[2]/ul/li[1]/a/button";
    String addBookingPageHeader = "/html/body/app/ui-view/div/ui-view/add-booking-beauty/div/div/section[1]/div[2]/h2";
    String profileIcon = "md-icon-button";
    String closeProfileModal = "icon-close";
    String modalCalendarHeader = "/html/body/div[4]";

    public String getModalCalendarHeader() {
        return modalCalendarHeader;
    }

    public void setModalCalendarHeader(String modalCalendarHeader) {
        this.modalCalendarHeader = modalCalendarHeader;
    }

    public String getCloseProfileModal() {
        return closeProfileModal;
    }

    public void setCloseProfileModal(String closeProfileModal) {
        this.closeProfileModal = closeProfileModal;
    }

    public String getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(String profileIcon) {
        this.profileIcon = profileIcon;
    }

    public String getAddBookingPageHeader() {
        return addBookingPageHeader;
    }

    public void setAddBookingPageHeader(String addBookingPageHeader) {
        this.addBookingPageHeader = addBookingPageHeader;
    }

    public String getAddBookingButton() {
        return addBookingButton;
    }

    public void setAddBookingButton(String addBookingButton) {
        this.addBookingButton = addBookingButton;
    }

    public String getNextDayButton() {
        return nextDayButton;
    }

    public void setNextDayButton(String nextDayButton) {
        this.nextDayButton = nextDayButton;
    }

    public String getCalendarGrid() {
        return calendarGrid;
    }

    public void setCalendarGrid(String calendarGrid) {
        this.calendarGrid = calendarGrid;
    }

    public String getCurrentTimeLine() {
        return currentTimeLine;
    }

    public void setCurrentTimeLine(String currentTimeLine) {
        this.currentTimeLine = currentTimeLine;
    }

    public String getStaffHeader() {
        return staffHeader;
    }

    public void setStaffHeader(String staffHeader) {
        this.staffHeader = staffHeader;
    }

    public String getCalendarHeader() {
        return calendarHeader;
    }

    public void setCalendarHeader(String calendarHeader) {
        this.calendarHeader = calendarHeader;
    }

    public String getCalendarButton() {
        return calendarButton;
    }

    public void setCalendarButton(String calendarButton) {
        this.calendarButton = calendarButton;
    }

    public String getModalCalendarTab() {
        return modalCalendarTab;
    }

    public void setModalCalendarTab(String modalCalendarTab) {
        this.modalCalendarTab = modalCalendarTab;
    }

    public String getAddresFieldTitle() {
        return addresFieldTitle;
    }

    public void setAddresFieldTitle(String addresFieldTitle) {
        this.addresFieldTitle = addresFieldTitle;
    }


    public String getDateButton() {
        return dateButton;
    }

    public void setDateButton(String dateButton) {
        this.dateButton = dateButton;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
}
