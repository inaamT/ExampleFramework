package com.exampleProject.pages;

import com.exampleProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesModulePage {

public FilesModulePage(){
    PageFactory.initElements(Driver.get(),this);
}
    @FindBy(xpath = "//tbody[@id='fileList']//td[@class='selection']")
    public List<WebElement> allSelectedCheckbox;

//@FindBy(xpath = "//input[@id='select_all_files']")
//    public WebElement selectAllFiles;


}
