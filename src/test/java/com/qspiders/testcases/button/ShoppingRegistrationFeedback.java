package com.qspiders.testcases.button;

import org.testng.annotations.Test;

import com.qspiders.configurations.TestSuiteBase;
import com.qspiders.pages.ButtonPage;

public class ShoppingRegistrationFeedback extends TestSuiteBase
{
	@Test
	public void shoppingRegistrationFeedback()
	{
		ButtonPage page=new ButtonPage(getDriver());
		page.clickOnButtonPageElement();
		page.satisfiedFeedBack("Ye");
		String satisfiedMessage=page.getSatisfiedButtonConfirmationMessage();
		System.out.println(satisfiedMessage);
		
		page.concernsFeedback("N");
		String concernsMeassage=page.getConcernsButtonConfirmationMessage();
		System.out.println(concernsMeassage);
		
		page.rateOnScale("6");
		String rating=page.getRateButtonConfirmationMessage();
		System.out.println(rating);
	}
}
