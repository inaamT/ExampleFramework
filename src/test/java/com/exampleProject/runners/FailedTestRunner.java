package com.exampleProject.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features ="@target/rerun.txt",
        glue = "com/exampleProject/step_definitions"

)

public class FailedTestRunner {
}
