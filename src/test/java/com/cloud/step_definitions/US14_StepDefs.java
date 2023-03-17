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

import java.util.Arrays;
import java.util.List;

public class US14_StepDefs extends PhotosPage {


    @Given("users login to the app")
    public void users_login_to_the_app() {
        Driver.getDriver().get("https://qa.symund.com/");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(username, password);
    }

    @When("the user clicks the Photos module")
    public void the_user_clicks_the_module() {
        BasePage basePage = new BasePage();
        basePage.PhotosIcon.click();
    }

    @Then("verify there are following sub-modules")
    public void verify_there_are_following_sub_modules(List<String> expectedPhotoSubModules) {


        PhotosPage photosPage = new PhotosPage();
        Assert.assertTrue(photosPage.listOfSubModules.isDisplayed());

        List<String> expectedList = Arrays.asList("Your photos", "Favorites", "Your albums", "Shared albums", "Tagged photos");

        List<String> actualList = Arrays.asList(photosPage.listOfSubModules.getText());

        for (int i = 0; i < actualList.size(); i++) {
            System.out.println("actualList = " + actualList);
            Assert.assertTrue(actualList.contains(expectedList));


             /* List<WebElement> photoNavigationMenu = Driver.getDriver().findElements(By.xpath("//ul[@class='app-navigation__list']/li"));
        List<String> actualTextPhotoSubModules = new ArrayList<>();

        for (WebElement subModule : photoNavigationMenu) {
            actualTextPhotoSubModules.add(subModule.getText());
            System.out.println(subModule.getText());
        }
       // System.out.println("actualTextPhotoSubModules = " + actualTextPhotoSubModules);
        //System.out.println("actualTextPhotoSubModules.get(1) = " + actualTextPhotoSubModules.get(1));
        Assert.assertEquals(expectedPhotoSubModules,actualTextPhotoSubModules);*/

        }

    }
}





















