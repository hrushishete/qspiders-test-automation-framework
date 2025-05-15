package com.qspiders.pages.elements.button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.utility.CustomUtilities;

public class DefaultClickPage {
	WebDriver driver;
	WebDriverWait wait;

	public DefaultClickPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = CustomUtilities.getWait(driver, 30);
	}
	//====================================================================
	@FindBy(id = "btn")
	private WebElement satisfiedYesButton;
	
	@FindBy(id = "btn_two")
	private WebElement satisfiedNoButton;
	
	@FindBy(xpath = "//button[@id=\"btn\"]/following-sibling::span")
	private WebElement satisfiedButtonConfirmationMessage;
	
	//====================================================================
	
	public void satisfiedFeedBack(String feedback) {
		if (feedback.equalsIgnoreCase("yes")) {
			wait.until(ExpectedConditions.visibilityOf(satisfiedYesButton));
			satisfiedYesButton.click();
		} else if (feedback.equalsIgnoreCase("no")) {
			wait.until(ExpectedConditions.visibilityOf(satisfiedNoButton));
			satisfiedNoButton.click();
		} else {
			try {
				throw new Exception("Please select Yes or No as feedback");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public String getSatisfiedButtonConfirmationMessage() {
		wait.until(ExpectedConditions.visibilityOf(satisfiedButtonConfirmationMessage));
		return satisfiedButtonConfirmationMessage.getText();
	}
	
	//====================================================================
	
}


	
	