package com.cloud.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US10_StepDefs {
/*
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

    }*/


    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @And("user choose the Delete file or folder option")
    public void userChooseTheDeleteFileOrFolderOption() {
    }

    @When("the user clicks the Deleted file or folder sub-module on the left side")
    public void theUserClicksTheDeletedFileOrFolderSubModuleOnTheLeftSide() {
    }

    @Then("Verify the deleted file is displayed on the Deleted Files page")
    public void verify_the_deleted_file_is_displayed_on_the_deleted_files_page() {
        // Write code here that turns the phrase above into concrete actions

    }



}
