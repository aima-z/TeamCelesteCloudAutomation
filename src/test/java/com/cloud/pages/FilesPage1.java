package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage1 {


   public FilesPage1(){

       PageFactory.initElements(Driver.getDriver(),this);

   }

    @FindBy(id="user")
    public WebElement userName;


    @FindBy(id="password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement submit;


    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement FilesIcon;


     @FindBy(xpath = "//label[@for='select_all_files']")
     public WebElement checkBox;

    @FindBy(xpath = "//label[@for='select-files-61588']")
    public WebElement checkBox1;

    @FindBy(xpath = "//label[@for='select-files-61583']")
    public WebElement checkBox2;

    @FindBy(xpath = "//label[@for='select-files-65148']")
    public WebElement checkBox3;








}
