package com.qspiders.pages.elements.button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.utility.CustomUtilities;

public class RightClickPage {
	
	WebDriver driver;
	WebDriverWait wait;
	public RightClickPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=CustomUtilities.getWait(driver, 10);
	}
	
	//====================================================================================
	
	//click on Right Click Element of button page
	@FindBy(xpath = "//a[contains(text(),'Right Click')]")
	private WebElement rightClick;
	
	//Click on Satisfied Right Click button inside Right Click Element
	@FindBy(id = "btn_a")
	private WebElement satisfiedRightClickButton;
	
	//Click on Satisfied Right Click Yes
	@FindBy(xpath = "//button[@id='btn_a']//div[text()='Yes']")
	private WebElement satisfiedRightClickButtonYes;
	
	//Click on Satisfied Right Click No
	@FindBy(xpath = "//button[@id='btn_a']//div[text()='No']")
	private WebElement satisfiedRightClickButtonNo;
	
	//Element for satisfied right click message
	@FindBy(xpath = "//button[@id='btn_a']/following-sibling::span")
	private WebElement satisfiedRightClickButtonMessage;
	
	//====================================================================================
	
	public void clickOnRightClickElement()
	{
		rightClick.click();
	}
	
	//====================================================================================
	
	public void clickOnSatisfiedRightClickButton()
	{
		wait.until(ExpectedConditions.visibilityOf(satisfiedRightClickButton));
		Actions action=CustomUtilities.actionClass(driver);
		action.contextClick(satisfiedRightClickButton).perform();
	}
	
	public void clickOnYesNoSatisfiedRightClickButton(String feedback)
	{
		if(feedback.equalsIgnoreCase("yes"))
		{
			wait.until(ExpectedConditions.visibilityOf(satisfiedRightClickButtonYes));
			satisfiedRightClickButtonYes.click();
		}
		else if(feedback.equalsIgnoreCase("no"))
		{
			wait.until(ExpectedConditions.visibilityOf(satisfiedRightClickButtonNo));
			satisfiedRightClickButtonNo.click();
		}
	}
	
	public String getMeassageSatisfiedRightClickButton()
	{
		wait.until(ExpectedConditions.visibilityOf(satisfiedRightClickButtonMessage));
		return satisfiedRightClickButtonMessage.getText();
	}
	
}
