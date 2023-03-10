package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import com.cloud.pages.LoginPage;
import com.cloud.pages.PhotosPage;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US14_StepDefs {


    @Given("users login to the app")
    public void users_login_to_the_app() {
        Driver.getDriver().get("https://qa.symund.com/");
        LoginPage loginPage=new LoginPage();
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username,password);
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
     BasePage basePage=new BasePage();
     basePage.PhotosIcon.click();
    }
    @Then("verify there are following sub-modules")
    public void verify_there_are_following_sub_modules(io.cucumber.datatable.DataTable dataTable) {

        PhotosPage photosPage = new PhotosPage();
        Assert.assertTrue(photosPage.ListOfSubModules.isDisplayed());

        List<String>expectedList= Arrays.asList("your photos","Favorites","Your albums","Shared albums","Tagged photos");

        List<String> actualList = Arrays.asList(photosPage.ListOfSubModules.getText());

          for (int i = 0; i < actualList.size(); i++) {
           System.out.println("actualList = " +actualList);
           Assert.assertTrue(actualList.contains(expectedList));
        

        
        
            }


        }

    }

















