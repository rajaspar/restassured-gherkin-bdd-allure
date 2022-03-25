package com.template.project.cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/template/project/features", plugin = {"json:target/jsonReports/cucumber-report.json", "html:test-output", "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},monochrome = true , glue = {
    "com/template/project/stepDefinitions"}, publish = true,tags = "@Customer and not @Creation")
public class TestRunner {

}

// mvn clean test -D"cucumber.filter.tags=@Customer and not @Creation"
