package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.LoginPage;
import com.cloud.pages.US03_MainModulesPage;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class US03_MainModules_StepDefs {

  LoginPage loginPage=new LoginPage();
    String username=ConfigurationReader.getProperty("username");
    String password=ConfigurationReader.getProperty("password");

    BasePage basePage= new BasePage();
    US03_MainModulesPage us03_mainModulesPage=new US03_MainModulesPage();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        Driver.getDriver().get((ConfigurationReader.getProperty("url")));
        loginPage.login(username,password);
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String>MainModules) {

        us03_mainModulesPage.DashboardIcon.click();
        us03_mainModulesPage.FilesIcon.click();
        us03_mainModulesPage.PhotosIcon.click();
        us03_mainModulesPage.ActivityIcon.click();
        us03_mainModulesPage.TalkIcon.click();
        us03_mainModulesPage.MailIcon.click();
        us03_mainModulesPage.ContactsIcon.click();
        us03_mainModulesPage.CirclesIcon.click();
        us03_mainModulesPage.CalendarIcon.click();
        us03_mainModulesPage.NotesIcon.click();
        us03_mainModulesPage.DeckIcon.click();
        us03_mainModulesPage.TasksIcon.click();


    }



}
