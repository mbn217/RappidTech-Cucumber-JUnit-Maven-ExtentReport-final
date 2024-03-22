package com.rappidtech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"@target/failed_scenarios.txt"}, // path to failed the feature files
        glue = {"com.rappidtech.stepdefinitions", "com.rappidtech.hooks"}  // path to the step definition files
)
public class FailedTestRunner {
}
