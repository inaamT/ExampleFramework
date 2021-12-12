package com.exampleProject.step_definitions;

import com.exampleProject.pages.BasePage;
import com.exampleProject.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginStepDefinition extends BasePage {

    @Given("user on {string} page")
    public void user_on_page(String str) {
        Assert.assertEquals(Driver.get().getTitle(),str);
    }

    @When("user Enter valid username")
    public void user_enter_valid_username() {
       usernameBox.sendKeys(ConfigurationReader.get("username"));
    }

    @When("user Enter valid password")
    public void user_enter_valid_password() {
        passwordBox.sendKeys(ConfigurationReader.get("password"));
    }

    @When("Click loginbutton")
    public void click_loginbutton() {
        signInButton.click();
    }

    @Then("user access Homepage")
    public void user_access_homepage() {
        Assert.assertEquals(Driver.get().getTitle(), "Dashboard - Trycloud QA");
    }

    @When("user Enter invalid password")
    public void user_enter_invalid_password() {
        passwordBox.sendKeys(ConfigurationReader.get("username"));
    }

    @Then("Message {string} should be displayed")
    public void message_should_be_displayed(String string) {
        Assert.assertEquals(warningWrongCredentials.getText(), string);
    }

    @Then("Title should be same as {string}")
    public void title_should_be_same_as(String string) {
        Assert.assertEquals(Driver.get().getTitle(), string);
    }

}
