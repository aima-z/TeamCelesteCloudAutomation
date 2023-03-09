package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[@href='/index.php/apps/files?dir=//Talk']//span[.='Favorited']")
    public WebElement talkFolderFav;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesSubModule;

    @FindBy(xpath = "//a[@href='/index.php/apps/files?dir=//Talk']//a[@class='action action-menu permanent']")
    public WebElement actionBtn;

    @FindBy (xpath = "//span[.='Add to favorites']")
    public WebElement addFavorites;

    @FindBy (xpath = "//a[@class='button new']")
    public WebElement newFolderIcon;

    @FindBy (xpath = "//a[@data-templatename='New folder']")
    public WebElement addNewFolder;

    @FindBy (id = "view12-input-folder")
    public WebElement inputName;

    @FindBy (xpath = "//input[@class='icon-confirm']")
    public WebElement submitBtn;

    @FindBy (xpath = "//a[@href='/index.php/apps/files?dir=//AnyName']//span[@class='innernametext']")
    public WebElement newFolder;
////tr[@data-file='Hello']
}
