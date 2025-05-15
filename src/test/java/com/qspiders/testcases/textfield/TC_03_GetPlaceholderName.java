package com.qspiders.testcases.textfield;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.textfield.WithPlaceholderPage;


public class TC_03_GetPlaceholderName extends TestSuiteBase {
	@Test
	public void placeholderName() 
	{
		//Write a script to validate placeholder is present in the text field?
		WithPlaceholderPage page=new WithPlaceholderPage(getDriver());
		String namePalceHolder=page.getNameFieldAttributeValue("placeholder");
		Assert.assertEquals("Enter your name", namePalceHolder);
		
		String emailPlaceholder=page.getEmailFieldAttributeValue("placeholder");
		Assert.assertEquals("Enter Your Email", emailPlaceholder);
		
		String passwordPlaceholder=page.getPasswordFieldAttributeValue("placeholder");
		Assert.assertEquals("Enter your password", passwordPlaceholder);
	}
}
