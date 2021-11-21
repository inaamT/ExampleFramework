package com.exampleProject.utilities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.function.Function;

public class BrowserUtils {

    public static void sleep(int second) {

        second*=1000;

        try {

            Thread.sleep(second);

        } catch (InterruptedException e) {

            System.out.println("something happened in the sleep method");

        }

    }

    public static WebDriverWait waitFor(){
        return new WebDriverWait(Driver.get(),15);
    }
    public static void waitUntilTitle(String title){
      waitFor().until(ExpectedConditions.titleIs(title));

    }
    public static WebElement fluentWait(WebElement ele, int second){

        Wait<WebDriver> wait = new FluentWait<>(Driver.get())
                .withTimeout(Duration.ofSeconds(second))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);


        WebElement element = wait.until(driver -> ele);

     if (element.isDisplayed()){
         return element;
     }
     throw new NoSuchElementException("element found");


    }

}
