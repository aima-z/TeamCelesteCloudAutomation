package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.FilesPage1;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class US04_StepDefs extends BasePage {

   // LoginPage loginPage = new LoginPage();
    FilesPage1 filesPage1 = new FilesPage1();


 /*   @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get("https://qa.symund.com/");
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username, password);

    }

  */

  /*  @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String arg0) {

        Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        filesPage1.FilesIcon.click();

    }

   */


    @Then("verify the page title is \"Files - Symund - QA”")
    public void verify_the_page_title_is_files_symund_qa() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Files - Symund - QA";
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("expectedTitle = " + expectedTitle);

    }


    @Then("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {

        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//label[@for='select_all_files']"));
        BrowserUtils.sleep(3);
        checkBox.click();

    }


    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {


        List<WebElement> folderDirectory = Driver.getDriver().findElements(By.xpath("//tbody//input[@type='checkbox']"));

        for (WebElement checkbox : folderDirectory) {
            Assert.assertTrue(checkbox.isSelected());

        }

     /*  -----------another way of ----------
       List<WebElement> folderDirectory = Driver.getDriver().findElements(By.xpath("//tbody//input[@type='checkbox']"));
        List<Boolean> uncheckedCheckboxes = new ArrayList<>();
        for (WebElement checkbox : folderDirectory) {
           uncheckedCheckboxes.add(checkbox.isSelected());

        }
        boolean allSelected = !(uncheckedCheckboxes.contains(false));
        Assert.assertTrue(allSelected);*/


//        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//label[@for='select_all_files']"));
        //  WebElement checkBox1 = Driver.getDriver().findElement(By.xpath("//label[@for='select-files-61588']"));
        // WebElement checkBox2 = Driver.getDriver().findElement(By.xpath("//label[@for='select-files-61583']"));
        // WebElement checkBox3 = Driver.getDriver().findElement(By.xpath("//label[@for='select-files-65148']"));


        //  Assert.assertTrue(checkBox.isSelected());

    }
}


// Assert.assertTrue(checkBox.isSelected());
// Assert.assertTrue(checkBox1.isSelected());
// Assert.assertTrue(checkBox2.isSelected());
// Assert.assertTrue(checkBox3.isSelected());


















