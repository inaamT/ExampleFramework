package com.exampleProject.pages;

import com.exampleProject.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class FilesModulePage {

public FilesModulePage(){
    PageFactory.initElements(Driver.get(),this);
}

//@FindBy(xpath = "//input[@id='select_all_files']")
//    public WebElement selectAllFiles;


}
