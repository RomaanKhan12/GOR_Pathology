package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver loginDriver;
	
	@FindBy(xpath ="(//input[contains(@class,'MuiInputBase-input')])[1]")
	private WebElement userameField;
	
	@FindBy(xpath ="(//input[contains(@class,'MuiInputBase-input')])[2]")
	private WebElement passwordField;
	
	@FindBy(xpath = "(//span[@class='MuiButton-label'])[1]")
	private WebElement loginButton;
	

	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		loginDriver = driver;
	}
	
	public void enterUsername(String username)
	{
		userameField.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}
