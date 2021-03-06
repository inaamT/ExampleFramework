package com.exampleProject.step_definitions;

import com.exampleProject.pages.BasePage;
import com.exampleProject.pages.FilesModulePage;
import com.exampleProject.utilities.ConfigurationReader;
import com.exampleProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilesModulesStepDefinition extends BasePage {
    FilesModulePage filesModulePage = new FilesModulePage();

    @Given("user logged as user")
    public void userLoggedAsUser() {
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
    public void click_the_top_left_checkbox_of_the_table() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
        new WebDriverWait(Driver.get(),20).until(ExpectedConditions
                                                         .elementToBeClickable(selectAllFiles));
        executor.executeScript("arguments[0].click();", selectAllFiles);
    }

    @Then("all files are selected")
    public void all_files_are_selected() {
        for (WebElement each : filesModulePage.getSelectedCheckBox()) {
            System.out.println(each.isSelected());
        }
    }

}
