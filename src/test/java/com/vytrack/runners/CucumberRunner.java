package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions", // path to package with step definition method
        features = "src/test/resources/features", // path to the folder/directory with feature files
        dryRun = false,
        strict = false,
        tags = "@scenario_outline",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }
)
public class CucumberRunner {


}
