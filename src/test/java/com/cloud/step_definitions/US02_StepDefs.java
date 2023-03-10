package com.cloud.step_definitions;

import com.cloud.pages.BasePage_AZ;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US02_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters invalid {string} and {string}")
    public void userEntersInvalidAnd(String userNameStr, String passwordStr) {
        loginPage.userName.sendKeys(userNameStr);
        loginPage.password.sendKeys(passwordStr);
    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        loginPage.logInButton.click();
    }
    @Then("verify {string} message is displayed")
    public void verifyMessageIsDisplayed(String message) {
        Assert.assertEquals(message, "Wrong username or password.");

    }
}
