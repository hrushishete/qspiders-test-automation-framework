package com.qspiders.testcases.textfield;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.textfield.WithPlaceholderPage;
import com.qspiders.utility.PropertyUtils;

public class TC_01_WebElementTest extends TestSuiteBase {
	String name = PropertyUtils.getproperties("userName");
	String email = PropertyUtils.getproperties("userEmail");
	String password = PropertyUtils.getproperties("userPassword");

	@Test
	public void registerUser() {
		// Write a script to enter data into Text field?
		WithPlaceholderPage registerPage = new WithPlaceholderPage(getDriver());
		System.out.println(name);
		registerPage.enterName(name);
		registerPage.enterEmail(email);
		registerPage.enterPassword(password);
		registerPage.clickSubmitButton();
		String title = getDriver().getTitle();
		Assert.assertEquals("DemoApps | Qspiders | Text Box", title);
	}
}
