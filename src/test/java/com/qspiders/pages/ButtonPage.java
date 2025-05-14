package com.qspiders.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.utility.CustomUtilities;

public class ButtonPage 
{
	WebDriver driver;
	WebDriverWait wait;
	public ButtonPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=CustomUtilities.getWait(driver, 10);
	}
	
	@FindBy(xpath = "//a[@href='/ui/button']")
	WebElement buttonPageElement;
	
	@FindBy(id = "btn")
	WebElement satisfiedYesButton;
	
	@FindBy(id = "btn1")
	WebElement satisfiedNoButton;
	
	@FindBy(xpath = "//button[@id='btn']/following-sibling::span")
	WebElement satisfiedButtonConfirmationMessage;
	
	@FindBy(id = "btn2")
	WebElement concernsYesButton;
	
	@FindBy(id = "btn3")
	WebElement concernsNoButton;
	
	@FindBy(xpath = "//button[@id='btn2']/following-sibling::span")
	WebElement concernsButtonConfirmationMessage;
	
	@FindBy(id = "btn4")
	WebElement rate1Button;
	
	@FindBy(id = "btn5")
	WebElement rate2Button;
	
	@FindBy(id = "btn6")
	WebElement rate3Button;
	
	@FindBy(id = "btn7")
	WebElement rate4Button;
	
	@FindBy(id = "btn8")
	WebElement rate5Button;
	
	@FindBy(xpath = "//button[@id='btn']/following-sibling::span")
	WebElement rateButtonConfirmationMessage;
	
	public void clickOnButtonPageElement() {
		buttonPageElement.click();
		
	}
	
	public void satisfiedFeedBack(String feedback)
	{
		if(feedback.equalsIgnoreCase("yes"))
		{
			satisfiedYesButton.click();
		}
		else if(feedback.equalsIgnoreCase("no"))
		{
			satisfiedNoButton.click();
		}
		else
		{
			try
			{
				throw new Exception("Please select Yes or No as feedback");
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public void concernsFeedback(String feedback)
	{
		if(feedback.equalsIgnoreCase("yes"))
		{
			concernsYesButton.click();	
		}
		else if(feedback.equalsIgnoreCase("no"))
		{
			concernsNoButton.click();
		}
		else
		{
			try
			{
				throw new Exception("Please select Yes or No as feedback");
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public void rateOnScale(String rating)
	{
		if(rating.equals("1"))
		{
			rate1Button.click();
		}
		else if(rating.equals("2"))
		{
			rate2Button.click();
		}
		else if(rating.equals("3"))
		{
			rate3Button.click();
		}
		else if(rating.equals("4"))
		{
			rate4Button.click();
		}
		else if(rating.equals("5"))
		{
			rate5Button.click();
		}
		else
		{
			try
			{
				throw new Exception("Please select ratting between 1 to 5");
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public String getSatisfiedButtonConfirmationMessage()
	{
		wait.until(ExpectedConditions.visibilityOf(satisfiedButtonConfirmationMessage));
		return satisfiedButtonConfirmationMessage.getText();
	}
	
	public String getConcernsButtonConfirmationMessage()
	{
		wait.until(ExpectedConditions.visibilityOf(concernsButtonConfirmationMessage));
		return concernsButtonConfirmationMessage.getText();
	}
	
	public String getRateButtonConfirmationMessage()
	{
		wait.until(ExpectedConditions.visibilityOf(rateButtonConfirmationMessage));
		return rateButtonConfirmationMessage.getText();
	}
}
