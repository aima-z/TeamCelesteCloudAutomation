package com.cloud.pages;

import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cloud.utilities.Driver.getDriver;
public class LoginPage {
    
    public LoginPage(){
        
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    @FindBy(id="user")
    public WebElement userName;
    
    @FindBy(id="password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement submit;

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged


    }

}
