package com.qspiders.testcases.button;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.ButtonPage;

public class ClickOnButtonPage extends TestSuiteBase {
	
	@Test
	public void clickOnButtonPage() throws InterruptedException
	{
		ButtonPage page=new ButtonPage(getDriver());
		page.clickOnButtonPageElement();
	}

}
