package org.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patients_Page {
	WebDriver patientsDriver;
	
	@FindBy(xpath = "//td[text()='289']")
	private WebElement patientsID;
	
	@FindBy(xpath = "(//div[@class='MuiListItemText-root'])[4]")
	private WebElement patientsMuiListButton;
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-label')])[1]")
	private WebElement addPatientButton;
	
	@FindBy(xpath = "(//input[contains(@class,'MuiOutlinedInput-input')])[1]")
	private WebElement nameInputField;
	
	@FindBy(xpath = "(//input[contains(@class,'MuiOutlinedInput-input')])[2]")
	private WebElement  emailInputField;
	
	@FindBy(xpath = "(//input[contains(@class,'MuiOutlinedInput-input')])[3]")
	private WebElement phoneInputField;
	
	public Patients_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		patientsDriver = driver;
	}
	
	public void clickOnPatientsMuiListButton()
	{
		patientsMuiListButton.click();
	}
	
	public void clickOnAddPatientButton()
	{
		addPatientButton.click();
	}
	
	public void enterName(String name)
	{
		nameInputField.sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		emailInputField.sendKeys(email);
	}
	
	public void enterPhone(String phone)
	{
		phoneInputField.sendKeys(phone);
	}
	
	public boolean patientsIDIsDisplayed()
	{
		return patientsID.isDisplayed();
	}
	

}
