package com.qspiders.pages.elements.button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.utility.CustomUtilities;

public class SubmitClickPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public SubmitClickPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=CustomUtilities.getWait(driver, 10);
	}
	
	//===============================================================
	
	@FindBy(xpath = "//a[text()='Submit Click']")
	private WebElement submitClickElement;
	
	//===============================================================
	//Click on Yes or No radio button
	@FindBy(id = "sat_a")
	private WebElement satisfiedYesSubmitClick;
	
	@FindBy(id="sat_b")
	private WebElement satisfiedNoSubmitClick;
	
	//===============================================================
	//Web element for submit button
	@FindBy(id="btn_abh")
	private WebElement submitButtonElement;
	
	//===============================================================
	//Feedback message element
	@FindBy(xpath = "//section[@class=\"text-green-600 ms-4\"]//span")
	private WebElement feedBackMessageElement;
	
	//===============================================================
	//Method for click on submit click page
	public void clickOnSubmitClick()
	{
		submitClickElement.click();
	}
	
	//===============================================================
	
	//Method for selection yes or no radio button
	public void clickOnYesOrNORadioButton(String feedback)
	{
		if(feedback.equalsIgnoreCase("yes"))
		{
			wait.until(ExpectedConditions.visibilityOf(satisfiedYesSubmitClick));
			satisfiedYesSubmitClick.click();
		}
		else if(feedback.equalsIgnoreCase("no"))
		{
			wait.until(ExpectedConditions.visibilityOf(satisfiedNoSubmitClick));
			satisfiedNoSubmitClick.click();
		}
		else
		{
			System.out.println("Please select valid yes or no option");
		}
	}
	
	//===============================================================
	
	//Method for click on submit button
	public void clickOnSubmitButton()
	{
		submitButtonElement.click();
	}
	
	//===============================================================
	
	public String getFeedbackMessage()
	{
		wait.until(ExpectedConditions.visibilityOf(feedBackMessageElement));
		return feedBackMessageElement.getText();
	}
	
	//===============================================================
}
