package org.sap.Listeners;

import java.io.IOException;
import java.util.Arrays;

import org.sap.annotations.FrameWorkAnnotation;
import org.sap.reports.ExtentLogger;
import org.sap.reports.ExtentReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;


public class ListenersClass implements ITestListener,ISuiteListener {
	
	

	@Override
	public void onStart(ISuite suite) {
		try {
			ExtentReporter.initReports();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ISuite suite) {
		try {
			ExtentReporter.tearDownReports();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		
		// result.setTestName(Scenario.getGherkinName());
		ExtentReporter.createTest(Scenario.getGherkinName());
		ExtentReporter.addAuthors(result.getMethod().getConstructorOrMethod().getMethod()
				.getAnnotation(FrameWorkAnnotation.class).autherName());
		ExtentReporter.addCatogeries(result.getMethod().getConstructorOrMethod().getMethod()
				.getAnnotation(FrameWorkAnnotation.class).category());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// ExtentLogger.pass(result.getMethod().getMethodName()+" is passed");
		
			try {
				ExtentLogger.pass(result.getMethod().getMethodName() + " is passed", true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// ExtentLogger.fail(result.getMethod().getMethodName()+" is failed");
			
				try {
					ExtentLogger.fail(result.getMethod().getMethodName() + " is failed", true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			ExtentLogger.fail(result.getThrowable().toString());// exception will print in reports
			ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));// whole Exception will print at
																						// reports

		
		// atatch screenshot

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// ExtentLogger.skip(result.getMethod().getMethodName()+" is skipped");
		
			try {
				ExtentLogger.skip(result.getMethod().getMethodName() + " is skipped", true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

}
