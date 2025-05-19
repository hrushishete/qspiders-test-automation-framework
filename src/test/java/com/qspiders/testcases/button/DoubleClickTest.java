package com.qspiders.testcases.button;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.ButtonPage;
import com.qspiders.utility.ExcelUtilities;

public class DoubleClickTest extends TestSuiteBase {
	@Test
	public void satisfiedDoubleClick() {
		ButtonPage page = new ButtonPage(getDriver());
		page.clickOnButtonPageElement();
		page.doubleClickPage.clickOnDoubleClickPage();
		String feedback = ExcelUtilities.getCellData("DoubleClickTest", 0, 1);
		page.doubleClickPage.satisfiedWithDoubleClick(feedback);
		String message = page.doubleClickPage.getSatisfiedFeedbackMessage();
		System.out.println("message : " + message);
	}
}
