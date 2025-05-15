package com.qspiders.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.utility.CustomUtilities;

public class BasePage 
{
	WebDriver driver;
	WebDriverWait wait;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=CustomUtilities.getWait(driver, 30);
	}
	
	@FindBy(xpath = "//section[text()='Web Elements']")
	private WebElement webElements;
	
	public void clickWebElements()
	{
		wait.until(ExpectedConditions.elementToBeClickable(webElements));
		webElements.click();
	}
}
