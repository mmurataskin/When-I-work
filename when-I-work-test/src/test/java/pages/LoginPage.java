package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    public WebElement logInButton;

    @FindBy(name = "email")
    public WebElement emailTextBox;

    @FindBy(name = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//div[contains(text(),'Incorrect username and/or password. Please try again')]")
    public WebElement invalidLoginMessage;


    }