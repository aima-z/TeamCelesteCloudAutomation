package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileModulesPage_KM {

    public FileModulesPage_KM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement iconButton;

    @FindBy(xpath = "//label[@for='file_upload_start']")
    public WebElement uploadFileBtn;



    @FindBy(xpath = "(//span[@class='nametext'])[7]")
    public WebElement fileUploaded;
}
