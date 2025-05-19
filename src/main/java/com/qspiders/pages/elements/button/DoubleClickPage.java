package com.qspiders.pages.elements.button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.utility.CustomUtilities;

public class DoubleClickPage 
{
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	public DoubleClickPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=CustomUtilities.getWait(driver, 10);
		action=CustomUtilities.actionClass(driver);
	}
	
	
	//Click on Double Click Page
	@FindBy(xpath = "//a[text()='Double Click']")
	private WebElement doubleClickPage;
	
	//====================================================================
	
	//Click on Yes "Are you satisfied with the registration process?"
	@FindBy(xpath = "//button[@id='btn_a']")
	private WebElement satisfiedYesdoubleClickPage;
	
	@FindBy(xpath = "//button[@id='btn_b']")
	private WebElement satisfiedNodoubleClickPage;
	
	//====================================================================
	
	//WebElement for getting message from satisfied feedback
	@FindBy(xpath = "//button[@id='btn_a']/following-sibling::span")
	private WebElement satisfiedMessage;
	
	//====================================================================
	
	//Method to click on double click page
	public void clickOnDoubleClickPage()
	{
		doubleClickPage.click();
	}
	
	//====================================================================
	
	//Method for "Are you satisfied with the registration process?"
	public void satisfiedWithDoubleClick(String feedback)
	{
		if(feedback.equalsIgnoreCase("yes"))
		{
			wait.until(ExpectedConditions.visibilityOf(satisfiedYesdoubleClickPage));
			action.doubleClick(satisfiedYesdoubleClickPage).perform();
		}
		else if(feedback.equalsIgnoreCase("no"))
		{
			wait.until(ExpectedConditions.visibilityOf(satisfiedNodoubleClickPage));
			action.doubleClick(satisfiedNodoubleClickPage).perform();
		}
		else
		{
			System.out.println("Please select valid option Yes or No");
		}
	}
	
	//====================================================================
	
	//Method for getting message from feedback
	public String getSatisfiedFeedbackMessage()
	{
		return satisfiedMessage.getText();
	}
	//====================================================================
	
}
