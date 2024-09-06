package com.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"./src/test/resources/features/Registration.feature"}, glue = {"com.stepdefinitions"},
plugin = {"pretty","html:reports/result1.html","json:reports/jsonreport1.json"},
publish = true)
@RunWith(Cucumber.class)
public class RegistrationTest {

}
