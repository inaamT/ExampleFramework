package com.exampleProject.pages;

import com.exampleProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "user")
    public WebElement usernameBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;
    @FindBy(id = "submit-form")
    public WebElement signInButton;
    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningWrongCredentials;
    @FindBy(xpath = "//fieldset")
    public WebElement innertext;
    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement fileModuleClick;
    @FindBy(xpath = "//span[.='Select all'][1]/..")
    public WebElement selectAllFiles;
    @FindBy(xpath = "//tbody[@id='fileList']//td[@class='selection']")
    public List<WebElement> allSelectedCheckbox;



}