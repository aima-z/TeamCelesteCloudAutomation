package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotosPage {

   public PhotosPage() {
       PageFactory.initElements(Driver.getDriver(), this);
   }

       @FindBy(xpath = "//ul[@class='app-navigation__list']")

       public WebElement listOfSubModules;
   }





