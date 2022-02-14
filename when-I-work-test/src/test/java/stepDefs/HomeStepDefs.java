package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtils;
import utilities.RandomDataUtils;

public class HomeStepDefs {


    HomePage homePage = new HomePage();

    @Given("the user wants to add an employee")
    public void the_user_wants_to_add_an_employee() {
        BrowserUtils.verifyElementDisplayed(homePage.appDashboard);
    }

    @When("the user clicks on continue button")
    public void the_user_clicks_on_continue_button() {
        BrowserUtils.clickToElement(homePage.addEmployeeContinueButton);
    }
    @When("the user clicks on add an employee button")
    public void the_user_clicks_on_add_an_employee_button() {
       BrowserUtils.clickToElement(homePage.addEmployeesButton);
    }
    @When("the user enter employee credentials")
    public void the_user_enter_employee_credentials() {
        BrowserUtils.inputToTextBox(homePage.employeeFirstName, RandomDataUtils.getRandomFirstName());
        BrowserUtils.inputToTextBox(homePage.employeeLastName,RandomDataUtils.getRandomLastName());
        BrowserUtils.inputToTextBox(homePage.employeeEmail,RandomDataUtils.getRandomEmail());
        BrowserUtils.inputToTextBox(homePage.employeeMobileNumber, "2013787889");
    }
    @When("the user clicks on add employee button")
    public void the_user_clicks_on_add_employee_button() {
        BrowserUtils.clickToElement(homePage.addInviteEmployeeButton);
    }
    @Then("the user should see employee is added")
    public void the_user_should_see_employee_is_added() {
        BrowserUtils.verifyElementDisplayed(homePage.successfulEntryAlert);

    }

    @Given("the user wants to create an OpenShift on the Scheduler")
    public void the_user_wants_to_create_an_OpenShift_on_the_Scheduler() {

    }

    @When("the user clicks on Scheduler tab")
    public void the_user_clicks_on_Scheduler_tab() {
       BrowserUtils.clickToElement(homePage.scheduler);
    }
    @When("the user clicks on createOpenshift icon")
    public void the_user_clicks_on_createOpenshift_icon() {
        BrowserUtils.clickToElement(homePage.createOpenShift);

    }
    @When("the user enters credentials")
    public void the_user_enters_credentials() {
        BrowserUtils.inputToTextBox(homePage.timeEntryBox,"9:00AM - 5:00PM");
    }
    @When("the user clicks on save button")
    public void the_user_clicks_on_save_button() {
        BrowserUtils.clickToElement(homePage.saveButton);

    }
    @Then("the the scheduled shift will show up")
    public void the_the_scheduled_shift_will_show_up() {
        BrowserUtils.verifyElementDisplayed(homePage.unpublishedShiftverification);
    }
    @Then("the user clicks on shiftactions icon")
    public void the_user_clicks_on_shiftactions_icon() {
        BrowserUtils.hover(homePage.createOpenShift);
        BrowserUtils.clickToElement(homePage.shiftActionsIcon);
    }
    @Then("the user clicks on delete button")
    public void the_user_clicks_on_delete_button() {
        BrowserUtils.clickToElement(homePage.actionDeleteButton);
    }
    @When("the user clicks on confirm delete button")
    public void the_user_clicks_on_confirm_delete_button() {
        BrowserUtils.clickToElement(homePage.confirmDeleteButton);
    }

    @When("the user clicks on edit icon")
    public void the_user_clicks_on_edit_icon() {
        BrowserUtils.hover(homePage.createOpenShift);
        BrowserUtils.clickToElement(homePage.editShiftButton);
    }
    @When("the user assigns to employee")
    public void the_user_assigns_to_employee() {
       BrowserUtils.inputToTextBox(homePage.assignToSelectBox,"Nathan Scott");
       BrowserUtils.inputToTextBox(homePage.assignToSelectBox,"Engineer");

    }
    @When("the user clicks on saveandpublish button")
    public void the_user_clicks_on_saveandpublish_button() {
        BrowserUtils.clickToElement(homePage.saveAndPublishButton);
    }
    @Then("the user will see successful entry message")
    public void the_user_will_see_successful_entry_message() {
        BrowserUtils.verifyElementDisplayed(homePage.publishedShiftAlert);
    }


}
