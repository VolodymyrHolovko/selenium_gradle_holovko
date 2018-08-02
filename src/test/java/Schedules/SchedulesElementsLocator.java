package Schedules;

public class SchedulesElementsLocator {
    String workersSchedules = "//*/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]/span";
    String selectWorkersScheduleType = "//*/md-tab-content[2]/div/div/div[2]/div/div[1]/md-select/md-select-value/span[1]/div/span";
    String schedulesDropDown = "html/body/div/md-select-menu/md-content";
    String openCalendar = "//*/div/div/div[2]/working-days-settings-recurrence/div/div[1]/md-datepicker/div/button";
    String chooseFirstDay = "//*/tbody[4]/tr[4]/td[3]";
    String saveButtonZminnuy = "//*/div/div/div[2]/div/div[2]/button/span";
    String successMessageZminnuy = "/html/body/md-toast/div/span";
    String currentCalendarDay = "//*/div/div/div[2]/working-days-settings-recurrence/div/div[1]/md-datepicker/div/input";
    String workingDaysDropDown = "/html/body/app/ui-view/div/ui-view/working-days/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[2]/working-days-settings-recurrence/div/div[2]/div/md-select[1]";
    String freeDaysDropDown = "/html/body/app/ui-view/div/ui-view/working-days/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[2]/working-days-settings-recurrence/div/div[2]/div/md-select[2]";
    String chooseHowMatchWorkDays = "//md-option[@value='6']";
    String checkHowMatchWorkingDaysSelected = "//*/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[2]/working-days-settings-recurrence/div/div[2]/div/md-select[1]";
    String checkHowMatchFreeDaysSelected =   "//*/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[2]/working-days-settings-recurrence/div/div[2]/div/md-select[2]/md-select-value/span[1]";
    String checkSaturdayOnCalendarIsFree= "//*/working-days-settings-recurrence/working-days-settings-recurrence-calendar/div[2]/div/div[3]/div[6]";
    String checkSandayOnCalendarIsFree= "//*/working-days-settings-recurrence/working-days-settings-recurrence-calendar/div[2]/div/div[3]/div[7]";
    String swicherAtRegularSchedule = "//*/div/div/div[2]/working-days-settings-regular/working-days-settings-regular-slot[7]/div[1]/div/div/md-switch/div[1]/div[1]";
    String swicherClass = "//*/div/div/div[2]/working-days-settings-regular/working-days-settings-regular-slot[7]/div[1]/div/div/md-switch";
    String saveRegularGrafikButton = "//*/div/div/div[2]/div/div[2]/button/span";
    String successRegularSaveMessage = "/html/body/md-toast/div/span";
    String addressWorkongDaysSwitcher = "//*/div/div/ul/li[6]/working-day-slot/div[1]/div/div/md-switch";
    String addressTabInHeader = "/html/body/app/ui-view/div/ui-view/working-days/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]/span";
    String choseeDovilnuyDay = "//*/div/div/div[2]/working-days-settings-custom/working-days-settings-custom-calendar/div[2]/div/div[4]/div[2]";
    String dovilnuyDayOf = "//*/div/div/div[2]/working-days-settings-custom/working-days-settings-custom-calendar/div[2]/div/div[3]/div[7]";
    String whenAddessInThisDayNotWork = "/html/body/div[5]/md-dialog";
    String dayOfOk = "/html/body/div[5]/md-dialog/md-dialog-actions/button";
    String zminnuyCertainDaySchedule = "/html/body/app/ui-view/div/ui-view/working-days/div/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div[2]/working-days-settings-recurrence/working-days-settings-recurrence-calendar/div[2]/div/div[1]/div[2]/div/button";
    String breakCheckBox = "md-container";
    String breakStartDropDown = "//*/md-input-container[1]/md-select/md-select-value";
    String breakEndDropDown = "//*/md-input-container[2]/md-select/md-select-value";
    String breakStartChoose = "//*/md-select-menu/md-content/md-option[1]";
    String breakEndChoose = "//*/div/[contains(text(), '10:30')]";
}
