package com.cloud.step_definitions;
import com.cloud.pages.BasePage;
import com.cloud.pages.FileModulesPage_KM;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import com.google.j2objc.annotations.Weak;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class US07_StepDefs extends BasePage{

    LoginPage loginPage = new LoginPage();
    FileModulesPage_KM fileModulesPage_km = new FileModulesPage_KM();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get((ConfigurationReader.getProperty("url")));
        loginPage.login("user1","Userpass123");

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        FilesIcon.click();
    }

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        fileModulesPage_km.iconButton.click();
    }

    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {

        String path = "C://Users/mksen/OneDrive/Desktop/file.txt";
        fileModulesPage_km.uploadFileBtn.sendKeys(path);
        BrowserUtils.sleep(3);
    }

    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        Assert.assertTrue(fileModulesPage_km.fileUploaded.isDisplayed());
    }

}
