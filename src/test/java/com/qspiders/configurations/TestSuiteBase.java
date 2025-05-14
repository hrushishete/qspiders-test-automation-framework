package com.qspiders.configurations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qspiders.utility.PropertyUtils;

public class TestSuiteBase 
{
	public static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<WebDriver>();
	public WebDriver getDriver()
	{
		return threadDriver.get();
	}
	public PropertyUtils property;
	@BeforeMethod
	public void setup()
	{
		threadDriver.set(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().get("https://demoapps.qspiders.com/ui?scenario=1");
		property=new PropertyUtils();
	}
	
	@AfterMethod
	public void tearDown()
	{
		getDriver().close();
		threadDriver.remove();
	}
}
