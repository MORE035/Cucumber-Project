package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, glue = {
		"com.StepDefinitions" }, monochrome = true, tags = "@sanity or @smoke", plugin = {
				"html:Reports/HtmlReport.html", "json:Reports/jsonReport.json", "junit:Reports/xmlReport.xml","pretty"}

)

public class TestRunner {

}
