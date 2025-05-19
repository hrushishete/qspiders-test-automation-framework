package com.qspiders.testcases.button;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.ButtonPage;
import com.qspiders.utility.ExcelUtilities;

public class DefaultClickTest extends TestSuiteBase {
	@Test
	public void shoppingRegistrationFeedback() throws InterruptedException {
		ButtonPage page = new ButtonPage(getDriver());
		page.clickOnButtonPageElement();
		page.clickOnButtonPageElement();
		String feedback = ExcelUtilities.getCellData("shoppingRegistrationFeedback", 0, 1);
		page.defaultClickPage.satisfiedFeedBack(feedback);
		String satifiedMessage = page.defaultClickPage.getSatisfiedButtonConfirmationMessage();
		System.out.println("satifiedMessage : " + satifiedMessage);
	}
}
