package com.exampleProject.step_definitions;

import com.exampleProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class DashboardStepDefinition {

    @Then("menu bar contains list of elements")
    public void menu_bar_contains_list_of_elements() {

        List<WebElement> elementName = Driver.get().findElements(By.id("appmenu"));
        List<String> elements = Arrays.asList("Files", "Galleries", "Activity", "Talk", "Contacts", "Calendar", "Note");

        for (WebElement element : elementName) {
            for (String each : elements) {
                Assert.assertEquals(element.getText(), each);
            }
        }

    }

    @Given("user on dashboard page")
    public void userOnDashboardPage() {
        Assert.assertEquals(Driver.get().getTitle(),"Dashboard - Trycloud QA");
    }
}
