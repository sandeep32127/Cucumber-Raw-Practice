package com.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"./src/test/resources/features/Search.feature"}, glue = {"com.stepdefinitions","com.hooks"},
                 plugin = {"pretty"},
                 publish = true)////tags = "@Regression and @Smoke", dryRun = true,
@RunWith(Cucumber.class)
public class SearchTest {

}
