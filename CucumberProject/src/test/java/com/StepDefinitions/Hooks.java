package com.StepDefinitions;

import org.sap.driver.Driver;
import org.sap.enums.ConfigProperties;
import org.sap.reports.ExtentReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before(order = 0)
	public static void setUp() throws Exception {
		System.out.println("Set up method");
		Driver.initDriver("chrome");
	//	ExtentReporter.initReports();
		
	}
	@After(order = 1)
	public static void tearDown() throws Exception {
		System.out.println("Tear down method");
		Driver.quitDriver();
		//ExtentReporter.tearDownReports();
	}


}
