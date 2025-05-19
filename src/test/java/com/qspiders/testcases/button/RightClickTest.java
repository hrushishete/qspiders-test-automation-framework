package com.qspiders.testcases.button;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.ButtonPage;
import com.qspiders.utility.ExcelUtilities;

public class RightClickTest extends TestSuiteBase {
	@Test
	public void rightClick() {
		// How to Right Click on a button?
		ButtonPage page = new ButtonPage(getDriver());
		page.clickOnButtonPageElement();

		page.rightClickPage.clickOnRightClickElement();
		page.rightClickPage.clickOnSatisfiedRightClickButton();
		String feedback = ExcelUtilities.getCellData("RightClickTest", 0, 1);
		page.rightClickPage.clickOnYesNoSatisfiedRightClickButton(feedback);
		String satisfiedMessage = page.rightClickPage.getMeassageSatisfiedRightClickButton();
		System.out.println("satisfiedMessage : " + satisfiedMessage);
	}
}
