package com.runner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
//@Listeners({org.sap.Listeners.ListenersClass.class,org.sap.Listeners.AnnotationTransFormer.class,org.sap.Listeners.MethodInterceptor.class})



@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, glue = {
		"com.StepDefinitions" }, monochrome = true, tags = "@smoke", plugin = {
				"html:Reports/HtmlReport.html", "json:Reports/jsonReport.json", "junit:Reports/xmlReport.xml","pretty"}

)

public class TestRunner {
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
	
	/*
	 * @After(value = "@smoke and @sanity")
	 * 
	 * public void tearDown(Scenario scenario) { if (scenario.isFailed()) { String
	 * screenshotname = scenario.getName().replaceAll(" ", "_"); byte[] sourcepath =
	 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	 * scenario.attach(sourcepath, "/CucumberPOMSeries/Attachments/png",
	 * screenshotname); } }
	 */

}
