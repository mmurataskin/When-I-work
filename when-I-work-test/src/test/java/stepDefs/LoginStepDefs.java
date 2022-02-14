package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Config;
import utilities.Driver;
import utilities.RandomDataUtils;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(Config.getProperty("url"));
    }

    @When("the user fills in emailbox with a valid email account")
    public void the_user_fills_in_emailbox_with_a_valid_email_account() {
        BrowserUtils.inputToTextBox(loginPage.emailTextBox, "mmurataskin@gmail.com");
    }

    @When("the user fills in passwordbox with a valid password")
    public void the_user_fills_in_passwordbox_with_a_valid_password() {
        BrowserUtils.inputToTextBox(loginPage.passwordTextBox, "Murat4975@");
    }

    @When("the user clicks Log In button")
    public void the_user_clicks_Log_In_button() {
        BrowserUtils.clickToElement(loginPage.logInButton);
    }

    @Then("the user should be on the Dashboard")
    public void the_user_should_be_on_the_Dashboard() {
        BrowserUtils.verifyElementDisplayed(homePage.appDashboard);
    }

    @When("the user fills in emailbox with an invalid email account")
    public void the_user_fills_in_emailbox_with_an_invalid_email_account() {
        BrowserUtils.inputToTextBox(loginPage.emailTextBox, RandomDataUtils.getRandomEmail());
    }

    @When("the user fills in passwordbox  with a invalid password")
    public void the_user_fills_in_passwordbox_with_a_invalid_password() {
        BrowserUtils.inputToTextBox(loginPage.passwordTextBox, "Galadriel123@");
    }

    @Then("the user should see invalid login message")
    public void the_user_should_see_invalid_login_message() {
        BrowserUtils.verifyElementDisplayed(loginPage.invalidLoginMessage);
        String actualMessage = BrowserUtils.getElementText(loginPage.invalidLoginMessage);
        String expectedMessage = "Incorrect username and/or password. Please try again.";
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}