package Schedules;

public class SchedulesElementsLocator {
    String workersSchedules = "//*/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]/span";
    String selectWorkersScheduleType = "//*/md-tab-content[2]/div/div/div[2]/div/div[1]/md-select/md-select-value/span[1]/div/span";
    String schedulesDropDown = "html/body/div/md-select-menu/md-content";
    String openCalendar = "//*/div/div/div[2]/working-days-settings-recurrence/div/div[1]/md-datepicker/div/button";
    String chooseFirstDay = "//*/tbody[4]/tr[4]/td[3]";
    String saveButtonZminnuy = "//*/div/div/div[2]/div/div[2]/button/span";
    String currentCalendarDay = "//*/div/div/div[2]/working-days-settings-recurrence/div/div[1]/md-datepicker/div/input";
    String countWorkDay = "//*/div/div/div[2]/working-days-settings-recurrence/div/div[2]/div/md-select/md-select-value/span[2]";
    String workingDaysDropDown = "//*/working-days-settings-recurrence/div/div[2]/div/md-select/md-select-value/span[2]";
    String freeDaysDropDown = "//*/working-days-settings-recurrence/div/div[2]/div/md-select[2]/md-select-value/span[2]";
    String chooseHowMatchWorkDays = "//md-option[@value='6']";
    String checkHowMatchWorkingDaysSelected = "//*/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[2]/working-days-settings-recurrence/div/div[2]/div/md-select[1]/md-select-value/span[1]";
    String checkHowMatchFreeDaysSelected =   "//*/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[2]/working-days-settings-recurrence/div/div[2]/div/md-select[2]/md-select-value/span[1]";
    String checkSaturdayOnCalendarIsFree= "//*/working-days-settings-recurrence/working-days-settings-recurrence-calendar/div[2]/div/div[3]/div[6]";
    String checkSandayOnCalendarIsFree= "//*/working-days-settings-recurrence/working-days-settings-recurrence-calendar/div[2]/div/div[3]/div[7]";
}
