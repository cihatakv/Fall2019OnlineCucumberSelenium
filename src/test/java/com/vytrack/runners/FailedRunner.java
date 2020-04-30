package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions", // path to package with step definition method
        features = "@target/rerun.txt", // path to the folder/directory with feature files
        plugin = {
                "html:target/failed-default-report",
                "json:target/failed.json",
        }
)
public class FailedRunner {
}
