package com.qspiders.listneres;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.utility.CustomUtilities;
import com.qspiders.utility.ExtentManager;

public class MyListneres extends TestSuiteBase implements ITestListener
{
	ExtentReports extent=ExtentManager.getInstance();
	ExtentTest test;
	ThreadLocal<ExtentTest> threadReport=new ThreadLocal<ExtentTest>();
	CustomUtilities customeUtilities=new CustomUtilities();
	
	@Override
	public void onTestStart(ITestResult result) {
		test =extent.createTest(result.getMethod().getMethodName());
		threadReport.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		threadReport.get().pass("test pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		threadReport.get().fail("test Fail");
		threadReport.get().fail(result.getThrowable());
		String path=customeUtilities.captureScreenShot(getDriver(),result.getMethod().getMethodName());
		threadReport.get().addScreenCaptureFromPath(path);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		threadReport.get().skip("test skip");
		String path=customeUtilities.captureScreenShot(getDriver(),result.getMethod().getMethodName());
		threadReport.get().addScreenCaptureFromPath(path);
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
		extent.flush();
	}
	
}
