package com.qspiders.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.utility.CustomUtilities;


public class RegisterPage {
	WebDriver driver;
	CustomUtilities utilites;
	WebDriverWait wait;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		utilites = new CustomUtilities();
		wait = utilites.getWait(driver, 10);
	}

	@FindBy(xpath = "//input[@id='name']")
	private WebElement nameField;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailField;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//li[contains(text(),'Disabled')]")
	private WebElement disabledAction;
	
	@FindBy(xpath = "//span[@class='absolute text-slate-600 text-[18px] bg-gray-100']")
	private WebElement showPasswordIcon; 
	
	public void enterName(String name) {
		nameField.sendKeys(name);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void clickSubmitButton() {
		submitButton.click();
	}

	public void titleOfPage() {
		wait.until(ExpectedConditions.visibilityOf(submitButton));
		driver.getTitle();
	}
	
	public String getNameFieldAttributeValue(String attributename)
	{
		String palceholderName=nameField.getAttribute(attributename);
		return palceholderName;
	}
	
	public String getEmailFieldAttributeValue(String attributename)
	{
		String palceholderName=emailField.getAttribute(attributename);
		return palceholderName;
	}
	
	public String getPasswordFieldAttributeValue(String attributename)
	{
		String palceholderName=passwordField.getAttribute(attributename);
		return palceholderName;
	}
	
	public String getEnteredName()
	{
		return nameField.getAttribute("value");
	}
	
	public String getEnteredPassword()
	{
		return passwordField.getAttribute("value");
	}
	
	public String getEnteredEmail()
	{
		return emailField.getAttribute("value");
	}
	
	public void clickOnDisabledAction()
	{
		disabledAction.click();
	}
	
	public void clickOnShowPasswordIcon()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='absolute text-slate-600 text-[18px] bg-gray-100']")));
		showPasswordIcon.click();
	}
}
