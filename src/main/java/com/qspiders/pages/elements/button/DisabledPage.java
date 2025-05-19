package com.qspiders.pages.elements.button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.utility.CustomUtilities;

public class DisabledPage 
{
	WebDriver driver;
	WebDriverWait wait;
	public DisabledPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=CustomUtilities.getWait(driver, 10);
	}
	
	//==================================================
	//Find Disabled element
	@FindBy(xpath = "//a[text()='Disabled']")
	private WebElement disabledElement;
	
	//==================================================
	//Find Yes and No for satisfied
	@FindBy(id = "btn_abc")
	private WebElement clickOnYesSatisfiedElement; 
	
	@FindBy(id = "btn_xyz")
	private WebElement clickOnNoSatisfiedElement; 
	
	//==================================================
	//Feedback message element
	@FindBy(xpath = "//button[@id='btn_xyz']/following-sibling::span")
	private WebElement feedbackMessage;
	
	//==================================================
	//Check box element
	@FindBy(id = "submit")
	private WebElement checkboxElemet; 
	
	//==================================================
	//Submit Button element
	@FindBy(id = "submitButton")
	private WebElement submitButton;
	
	//==================================================
	//Click on Disabled element
	public void clickOnDisabledElement()
	{
		disabledElement.click();
	}
	
	//==================================================
	
	//Method to click on yes or no satisfied
	public void giveFeedBack(String feedback)
	{
		if(feedback.equalsIgnoreCase("yes"))
		{
			wait.until(ExpectedConditions.visibilityOf(clickOnYesSatisfiedElement));
			clickOnYesSatisfiedElement.click();
		}
		else if(feedback.equalsIgnoreCase("no"))
		{
			wait.until(ExpectedConditions.visibilityOf(clickOnYesSatisfiedElement));
			clickOnYesSatisfiedElement.click();
		}
		else
		{
			System.out.println("Please select valid feedback as Yes or No");
		}
	}
	//==================================================
	//Method for get feedback
	public String getFeedbackMessage()
	{
		wait.until(ExpectedConditions.visibilityOf(feedbackMessage));
		return feedbackMessage.getText();
	}
	
	//==================================================
	//Method for check box is enabled
	public boolean checkBoxisEnabled()
	{
		wait.until(ExpectedConditions.visibilityOf(checkboxElemet));
		return checkboxElemet.isEnabled();
	}
	
	//==================================================
	//Method for click on submit button
	public void clickSubmit()
	{
		submitButton.click();
	}
}
