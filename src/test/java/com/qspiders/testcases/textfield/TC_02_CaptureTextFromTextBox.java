package com.qspiders.testcases.textfield;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.textfield.WithPlaceholderPage;

public class TC_02_CaptureTextFromTextBox extends TestSuiteBase
{
	//Write a script to capture data from the text field in the console that you have sent?
	@Test
	public void getTextFromTextBox()
	{
		WithPlaceholderPage page=new WithPlaceholderPage(getDriver());
		
		page.enterName(property.getproperties("userName"));
		String name=page.getEnteredName();
		Assert.assertEquals(property.getproperties("userName"), name);
		
		page.enterEmail(property.getproperties("userEmail"));
		String email=page.getEnteredEmail();
		Assert.assertEquals(property.getproperties("userEmail"), email);
		
		page.enterPassword(property.getproperties("userPassword"));
		String password=page.getEnteredPassword();
		Assert.assertEquals(property.getproperties("userPassword"), password);
	}
}
