package com.qspiders.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspiders.pages.elements.button.DefaultClickPage;
import com.qspiders.pages.elements.button.RightClickPage;
import com.qspiders.utility.CustomUtilities;

public class ButtonPage {
	WebDriver driver;
	WebDriverWait wait;
	public DefaultClickPage defaultClickPage;
	public RightClickPage rightClickPage;

	public ButtonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = CustomUtilities.getWait(driver, 30);
		defaultClickPage = new DefaultClickPage(driver);
		rightClickPage = new RightClickPage(driver);
	}

	@FindBy(xpath = "//a[@href='/ui/button']")
	private WebElement buttonPageElement;

	public void clickOnButtonPageElement(){
		wait.until(ExpectedConditions.elementToBeClickable(buttonPageElement));
		buttonPageElement.click();
	}

}
