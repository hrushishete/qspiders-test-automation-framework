package com.qspiders.testcases.textfield;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.RegisterPage;

public class TC_05_HidePasswordIcon extends TestSuiteBase {
	@Test
	public void hidePasswordIcon() {
		RegisterPage page = new RegisterPage(getDriver());
		page.enterName(property.getproperties("userName"));
		page.enterEmail(property.getproperties("userEmail"));
		page.enterPassword(property.getproperties("userPassword"));
		page.clickOnShowPasswordIcon();
	}
}
