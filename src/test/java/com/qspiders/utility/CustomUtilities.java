package com.qspiders.utility;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CustomUtilities {

	public static String captureScreenShot(WebDriver driver, String methodName) {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File output = sc.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\Resources\\Screenshots\\" + methodName + ".jpg";
		File fis = new File(path);
		try {
			FileHandler.copy(output, fis);
		} catch (Exception e) {
			System.out.println(e);
		}
		return path;
	}

	public static WebDriverWait getWait(WebDriver driver, int timeoutSeconds) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
	}
}
