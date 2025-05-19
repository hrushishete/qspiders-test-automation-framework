package com.qspiders.testcases.button;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.ButtonPage;
import com.qspiders.utility.ExcelUtilities;

public class SubmitClickTest extends TestSuiteBase {
	@Test
	public void submitClick() {
		ButtonPage page = new ButtonPage(getDriver());
		page.clickOnButtonPageElement();
		page.submitClickPage.clickOnSubmitClick();
		String feedback = ExcelUtilities.getCellData("SubmitClickTest", 0, 1);
		page.submitClickPage.clickOnYesOrNORadioButton(feedback);
		page.submitClickPage.clickOnSubmitButton();
		String message = page.submitClickPage.getFeedbackMessage();
		System.out.println("message : " + message);
	}
}
