package com.cloud.step_definitions;


import com.cloud.pages.BasePage;
import com.cloud.pages.FilesPage_Ch;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US08_StepDefs extends BasePage {
   // LoginPage loginPage = new LoginPage();
    FilesPage_Ch filesPage = new FilesPage_Ch();
    String newFolderName = ConfigurationReader.getProperty("folderName");

    /*   @Given("user on the dashboard page")
       public void user_on_the_dashboard_page() {
           Driver.getDriver().get("https://qa.symund.com/");
           String username = ConfigurationReader.getProperty("username3");
           String password = ConfigurationReader.getProperty("password3");
           loginPage.login(username, password);
       }
     */
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        filesPage.newFolderIcon.click();
    }


    @When("user click new folder")
    public void user_click_new_folder() {
        filesPage.addNewFolderBtn.click();
    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        filesPage.inputName.sendKeys(newFolderName);
    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        filesPage.submitBtn.click();
    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

        Driver.getDriver().navigate().refresh();
        boolean isCreated = false;

        List<WebElement> folderDirectory = Driver.getDriver().findElements(By.xpath("//span[@class='innernametext']"));

        for (WebElement element : folderDirectory) {

            System.out.println("element.getText() = " + element.getText());
            if ((element.getText()).equals(newFolderName)) {
                isCreated = true;
                break;
            }

        }

        Assert.assertTrue("Directory does not contain new folder ", isCreated);


    }



}