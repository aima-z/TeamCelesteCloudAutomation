package com.cloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

        public BasePage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//li[@data-id='dashboard']")
        public WebElement DashboardIcon;

        @FindBy(xpath = "//li[@data-id='files']")
        public WebElement FilesIcon;

        @FindBy(xpath = "//li[@data-id='photos']")
        public WebElement PhotosIcon;

        @FindBy(xpath = "//li[@data-id='activity']")
        public WebElement ActivityIcon;

        @FindBy(xpath = "//li[@data-id='spreed']")
        public WebElement TalkIcon;

        @FindBy(xpath = "//")
        public WebElement MailIcon;

        @FindBy(xpath = "//")
        public WebElement ContactsIcon;

        @FindBy(xpath = "//")
        public WebElement CirclesIcon;

        @FindBy(xpath = "//")
        public WebElement CalendarIcon;

        @FindBy(xpath = "//")
        public WebElement NotesIcon;

        @FindBy(xpath = "//")
        public WebElement DeckIcon;

        @FindBy(xpath = "//")
        public WebElement TasksIcon;

        @FindBy(xpath = "//")
        public WebElement SearchIcon;

        @FindBy(xpath = "//")
        public WebElement NotificationsIcon;

        @FindBy(xpath = "//")
        public WebElement CornerContactsIcon;

        @FindBy(xpath = "//")
        public WebElement AccountIcon;
    }



