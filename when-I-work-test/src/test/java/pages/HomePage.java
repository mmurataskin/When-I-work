package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "wheniwork-app")
    public WebElement appDashboard;

    @FindBy(xpath = "//span[contains(text(),'Scheduler')]")
    public WebElement scheduler;

    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    public WebElement addEmployeeContinueButton;

    @FindBy(xpath = "//span[contains(text(),'Add Employees')]")
    public WebElement addEmployeesButton;

    @FindBy(id = "first_name")
    public WebElement employeeFirstName;

    @FindBy(id = "last_name")
    public WebElement employeeLastName;

    @FindBy(id = "email")
    public WebElement employeeEmail;

    @FindBy(id = "phone_number")
    public WebElement employeeMobileNumber;

    @FindBy(xpath = "//button[@class='btn btn-secondary float-right btn-md']")
    public WebElement addInviteEmployeeButton;

    @FindBy(xpath = "//div[contains(text(),'The employee has been saved.')]")
    public WebElement successfulEntryAlert;

    @FindBy(xpath = "//div[@class='shift-holder']")
    public WebElement createOpenShift;

    @FindBy(xpath = "//input[@class='form-control time-picker-input react-autosuggest__input']")
    public WebElement timeEntryBox;

    @FindBy(xpath = "(//input[@class='Select__input'])[3]")
    public WebElement assignToSelectBox;

    @FindBy(xpath = "(//input[@class='Select__input'])[4]")
    public WebElement positionSelectBox;

    @FindBy(name = "save")
    public WebElement saveButton;

    @FindBy(name = "save-publish")
    public WebElement saveAndPublishButton;

    @FindBy(xpath = "//button[@class='btn btn-primary edit-shift btn-block btn-sm']")
    public WebElement editShiftButton;

    @FindBy(xpath= "//button[@class='btn btn-primary btn btn-primary btn-sm overflow-menu btn-block btn-md']//div")
    public WebElement shiftActionsIcon;

    @FindBy(xpath = "//li[contains(text(),'Delete')]")
    public WebElement actionDeleteButton;

    @FindBy(xpath = "//div[contains(text(),'Confirm Delete')]")
    public WebElement confirmDeleteButton;

    @FindBy(xpath = "//div[@class='shift-item row no-gutters unpublished can-schedule']")
    public WebElement unpublishedShiftverification;

    @FindBy(xpath = " //div[@class='Toastify__toast-body']")
    public WebElement publishedShiftAlert;










}