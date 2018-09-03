package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.BaseObject;

public class CalendarLocators extends BaseObject {
    public CalendarLocators(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    @FindBy(xpath = "//div[@class='top-header layout-row']")
            public WebElement addresField;
    String dateButton = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[2]/div[2]/md-datepicker/div[1]/button";
    @FindBy(xpath = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[2]/div[2]")
            public WebElement currentDate;
    @FindBy(xpath = "//span[@class='select-title ng-binding']")
            public WebElement addresFieldTitle;
    @FindBy(className = "md-datepicker-calendar-pane")
            public WebElement modalCalendarTab;
    @FindBy(className = "marketing-button-group")
            public WebElement calendarButton;
    String calendarHeader = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[3]/div/div/business-calendar-month/div";
    @FindBy(className = "staff-calendar-header")
            public WebElement staffHeader;
    @FindBy(xpath = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[3]/div/div/business-calendar-day/div/div[1]")
            public WebElement currentTimeLine;
    @FindBy(className = "table-day-container")
            public WebElement calendarGrid;
    @FindBy(xpath = "/html/body/app/ui-view/div/ui-view/business-calendar/div/div/div/div[2]/div[1]/div/button[2]")
            public WebElement nextDayButton;
    @FindBy(xpath = "/html/body/app/ui-view/business-header/nav/div[2]/ul/li[1]/a/button")
            public WebElement addBookingButton;
    @FindBy(xpath = "/html/body/app/ui-view/div/ui-view/add-booking-beauty/div/div/section[1]/div[2]/h2")
            public WebElement addBookingPageHeader;
    @FindBy(className = "md-icon-button")
            public WebElement profileIcon;
    @FindBy(className = "icon-close")
            public WebElement closeProfileModalIcon;
    @FindBy(xpath = "/html/body/div[4]")
            public WebElement modalCalendarHeader;
}
