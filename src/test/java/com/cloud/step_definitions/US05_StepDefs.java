package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.FilesPage_Ch;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_StepDefs extends BasePage {
    LoginPage loginPage = new LoginPage();
    FilesPage_Ch filesPage = new FilesPage_Ch();

    @Given("user on the home page")
    public void user_on_the_home_page() {
        Driver.getDriver().get("https://qa.symund.com/");
        String username = ConfigurationReader.getProperty("usernameOlga");
        String password = ConfigurationReader.getProperty("passwordOlga");
        loginPage.login(username, password);

    }

  /*  @When("the user clicks the Files module")
    public void the_user_clicks_the_module() {
        FilesIcon.click();
    }

   */


    @When("the user clicks action-icon from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {

        filesPage.actionBtn.click();
        BrowserUtils.sleep(3);
    }

    @When("user choose the Add to favorites option")
    public void user_choose_the_option() {
        filesPage.addFavorites.click();
    }

    @When("user click the Favorites sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side() {
        filesPage.favoritesSubModuleBtn.click();
        BrowserUtils.sleep(3);
    }


    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {

        Assert.assertTrue(filesPage.talkFolderFav.isEnabled());
    }



}
