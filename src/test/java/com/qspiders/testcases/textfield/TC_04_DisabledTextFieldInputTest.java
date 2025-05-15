package com.qspiders.testcases.textfield;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.textfield.WithPlaceholderPage;

public class TC_04_DisabledTextFieldInputTest extends TestSuiteBase{
	//Write a script to enter data into disabled text field?
	
	@Test
	public void disabledTextFieldInputTest()
	{
		WithPlaceholderPage page=new WithPlaceholderPage(getDriver());
		page.clickOnDisabledAction();
		page.enterName(property.getproperties("userName"));
		page.enterEmail(property.getproperties("userEmail"));
		page.enterPassword(property.getproperties("userPassword"));
		page.clickSubmitButton();
	}

}
