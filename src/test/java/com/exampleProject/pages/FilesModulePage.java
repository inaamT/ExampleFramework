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


    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement fileModuleClick;
    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllFiles;
    @FindBy(xpath = "//tbody//input")
    public List<WebElement> allSelectedCheckbox;


    public List<WebElement> getSelectedCheckBox() {
        selectAllFiles.click();
        List<WebElement> list = allSelectedCheckbox;
        return list;
    }


}
