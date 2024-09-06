package com.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/Uber.feature", glue = {"com.stepdefinitions"},
                plugin = {"pretty", 
                		"html:reports/result.html","json:reports/jsonResult.json","junit:reports/xmlResult.xml"}, publish = true)
@RunWith(Cucumber.class)
public class UberTest {

}
