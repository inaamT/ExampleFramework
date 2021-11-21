package com.exampleProject.step_definitions;

import com.exampleProject.pages.BasePage;
import com.exampleProject.utilities.*;
import com.exampleProject.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilesModulesStepDefinition extends BasePage {

    @Given("user loged as user")
    public void userLogedAsUser() {
        usernameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        signInButton.click();
    }

    @When("user click Files module")
    public void userClickFilesModule() {
        fileModuleClick.click();
    }

    @And("Title is Files's module Title")
    public void title_is_files_s_module_title() {
        Assert.assertEquals(Driver.get().getTitle(), "Files - Trycloud QA");
    }


    @Given("click the top left checkbox of the table")
    public void click_the_top_left_checkbox_of_the_table() {
        selectAllFiles.click();
    }

    @Then("all files are slected")
    public void all_files_are_slected() {
    List<WebElement> listOfFiles = Driver.get().findElements(By.name("selectCheckBox checkbox"));
        for (WebElement file : listOfFiles) {
            Assert.assertTrue(file.isSelected());
        }

    }



}
