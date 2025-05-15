package com.qspiders.testcases.button;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.ButtonPage;

public class RightClickTest extends TestSuiteBase
{
	@Test
	public void rightClick()
	{
		//How to Right Click on a button?
		ButtonPage page=new ButtonPage(getDriver());
		page.clickOnButtonPageElement();
		
		page.rightClickPage.clickOnRightClickElement();
		
		page.rightClickPage.clickOnSatisfiedRightClickButton();
		page.rightClickPage.clickOnYesNoSatisfiedRightClickButton("Yes");
		String satisfiedMessage=page.rightClickPage.getMeassageSatisfiedRightClickButton();
		System.out.println("satisfiedMessage : "+satisfiedMessage);
	}
}
