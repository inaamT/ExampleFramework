package com.exampleProject.pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.exampleProject.utilities.*;

import java.util.Arrays;
import java.util.List;

public class DashboardPage {

        @Test
        public void test1(){
    List<WebElement> elementName = Driver.get().findElements(By.id("appmenu"));
    List<String> elements = Arrays.asList("Files","Galleries","Activity","Talk","Contacts","Calendar","Note");

    for (WebElement element : elementName) {
        for (String each : elements) {
            Assert.assertEquals(element.getText(), each);
        }

    }
}

}
