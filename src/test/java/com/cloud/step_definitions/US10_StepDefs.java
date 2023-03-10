package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_StepDefs {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("https://qa.symund.com/");

    }
    LoginPage loginPage = new LoginPage();

    @When("user use username {string} and passcode “Userpass123\"")
    public void user_use_username_and_passcode_userpass123(String username, String password) {
        String user1 = ConfigurationReader.getProperty("username");
        String pass = ConfigurationReader.getProperty("password");
        loginPage.login(user1, pass);

    }
    @When("user click the login button")
    public void user_click_the_login_button() {

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        String dashboardUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(dashboardUrl, "https://qa.symund.com/index.php/apps/dashboard/");

    }

}
