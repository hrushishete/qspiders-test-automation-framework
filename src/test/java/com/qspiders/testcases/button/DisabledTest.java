package com.qspiders.testcases.button;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.ButtonPage;
import com.qspiders.utility.ExcelUtilities;

public class DisabledTest extends TestSuiteBase {
	@Test
	public void disabledTest() {
		ButtonPage page = new ButtonPage(getDriver());
		page.clickOnButtonPageElement();
		page.disabledPage.clickOnDisabledElement();
		String feedback = ExcelUtilities.getCellData("DisabledTest", 0, 1);
		page.disabledPage.giveFeedBack(feedback);
		String feedbackMessage = page.disabledPage.getFeedbackMessage();
		System.out.println("feedbackMessage : " + feedbackMessage);
		boolean checkbox = page.disabledPage.checkBoxisEnabled();
		if (checkbox = true) {
			System.out.println("checkbox is enabled");
		} else {
			System.out.println("checkbox is disabled");
		}
		page.disabledPage.clickSubmit();
	}
}
