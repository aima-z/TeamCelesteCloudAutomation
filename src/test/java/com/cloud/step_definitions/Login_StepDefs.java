package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage=new LoginPage();
    BasePage basePage=new BasePage();

    @Given("user on the login page")
    public void user_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }
    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
    }


    @When("user click the login button")
    public void user_click_the_login_button() {

        loginPage.logInButton.click();
    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

        String actualResult=Driver.getDriver().getCurrentUrl();
        String expectedResult="dashboard";

        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}
