package com.qspiders.testcases.button;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.elements.ButtonPage;

public class DefaultClickTest extends TestSuiteBase
{
	@Test
	public void shoppingRegistrationFeedback() throws InterruptedException
	{
		ButtonPage page=new ButtonPage(getDriver());
		page.clickOnButtonPageElement();
		
		page.defaultClickPage.satisfiedFeedBack("Yes");
		String satifiedMessage=page.defaultClickPage.getSatisfiedButtonConfirmationMessage();
		System.out.println("satifiedMessage : "+satifiedMessage);
	}
}
