package com.qspiders.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.utility.CustomUtilities;

public class TextFieldPage {

	WebDriver driver;
	WebDriverWait wait;
	public TextFieldPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=CustomUtilities.getWait(driver, 30);
	}
	
	
}
