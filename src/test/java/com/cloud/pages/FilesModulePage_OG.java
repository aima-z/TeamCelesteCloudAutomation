package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesModulePage_OG {

    public FilesModulePage_OG(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement actionIcon;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeButton;


    @FindBy(xpath = "//span[.='Not favorited']")
    public WebElement notFav;





}
