package com.exampleProject.step_definitions;

import com.exampleProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DashboardStepDefinition {


    @Given("user on dashboard page")
    public void userOnDashboardPage() {
        Assert.assertEquals(Driver.get().getTitle(),"Trycloud QA");
    }

    @Then("menu bar contains list of elements")
    public void menu_bar_contains_list_of_elements(List<String> dataTable) {
        List<WebElement> elementName = Driver.get().findElements(By.id("appmenu"));
       for (WebElement element : elementName) {
           for (String each : dataTable) {
               Assert.assertEquals(element.getText(), each);
           }
       }
    }




}
