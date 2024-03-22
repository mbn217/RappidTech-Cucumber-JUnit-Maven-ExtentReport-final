package com.rappidtech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Verify_Checkout_Overview_Page.feature"},
        glue = {"com.rappidtech.stepdefinitions", "com.rappidtech.hooks"},
        plugin = {"pretty", "html:target/RappidTech-report-final.html",
                "rerun:target/failed_scenarios.txt",
                "json:target/RappidTech-report.json",
                "me.jvt.cucumber.report.PrettyReports:target/RappidTech-report",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false
)
public class TestRunner {

}
