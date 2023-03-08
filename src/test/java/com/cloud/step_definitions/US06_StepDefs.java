package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.FilesModulePage_OG;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;

public class US06_StepDefs {
    BasePage basePage=new BasePage();
    FilesModulePage_OG filesModulePageOg=new FilesModulePage_OG();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get("https://qa.symund.com/");
        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.getProperty("usernameOlga");
        String password= ConfigurationReader.getProperty("passwordOlga");
        loginPage.login(username,password);


    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        basePage.FilesIcon.click();

    }
    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() throws InterruptedException {

       filesModulePageOg.actionIcon.click();
       Thread.sleep(3);

    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

        filesModulePageOg.removeButton.click();
    }
    @Then("Verify that the file is not listed in the Favorites table")
    public void verify_that_the_file_is_not_listed_in_the_favorites_table() {


       String actualResult=filesModulePageOg.notFav.getText();
       String expectedResult="Not favorited";
       Assert.assertTrue(expectedResult.contains(actualResult));

    }
}
