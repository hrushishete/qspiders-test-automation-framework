package com.qspiders.testcases.textfield;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.textfield.WithPlaceholderPage;

public class TC_05_HidePasswordIcon extends TestSuiteBase {
	@Test
	public void hidePasswordIcon() {
		WithPlaceholderPage page = new WithPlaceholderPage(getDriver());
		page.enterName(property.getproperties("userName"));
		page.enterEmail(property.getproperties("userEmail"));
		page.enterPassword(property.getproperties("userPassword"));
		page.clickOnShowPasswordIcon();
	}
}
