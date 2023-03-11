package com.cloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US03_MainModulesPage extends BasePage {

    @FindBy(xpath = "(//a[@aria-label='Dashboard'])[1]")
    public WebElement DashboardIcon;

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement FilesIcon;

    @FindBy(xpath = "(//a[@aria-label='Photos'])[1]")
    public WebElement PhotosIcon;

    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement ActivityIcon;

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement TalkIcon;

    @FindBy(xpath = "(//a[@aria-label='Mail'])[1]")
    public WebElement MailIcon;

    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement ContactsIcon;

    @FindBy(xpath = "(//a[@aria-label='Circles'])[1]")
    public WebElement CirclesIcon;

    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement CalendarIcon;

    @FindBy(xpath = "(//a[@aria-label='Notes'])[1]")
    public WebElement NotesIcon;

    @FindBy(xpath = "(//a[@aria-label='Deck'])[1]")
    public WebElement DeckIcon;

    @FindBy(xpath = "(//a[@aria-label='Tasks'])[1]")
    public WebElement TasksIcon;
}
