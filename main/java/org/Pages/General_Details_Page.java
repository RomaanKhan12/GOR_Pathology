package org.Pages;

import org.Utilities.Generic_Utilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class General_Details_Page {
	
	WebDriver generalDetailsDriver;
	
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-label')])[2]")
	private WebElement generalDetailsButton;
	
	@FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input')])[1]")
	private WebElement heightInputField;
		
	@FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input')])[2]")
	private WebElement weightInputField;
	
	@FindBy(css = "svg[class^='MuiSvgIcon-root MuiSelect-icon']")
	private WebElement genderDropdown;
	
	@FindBy (xpath = "//ul[contains(@class,'MuiList-root MuiMenu')]")
	private WebElement selectGender;
	
	@FindBy(xpath = "//li[text()='Male']")
	private WebElement genderMale;
	
	@FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input')])[3]")
	private WebElement agetInputField;
	
	@FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input')])[4]")
	private WebElement systolicInputField;
	
	@FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input')])[5]")
	private WebElement diastolicInputField;
	
	public General_Details_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		generalDetailsDriver = driver;
	}

	public void clickOnGeneralDetailsButton() {
		
		Generic_Utilities.scrollTOTheElement(generalDetailsButton);
		generalDetailsButton.click();
		
	}
	
	public void enterHeight(String heigth)
	{
		heightInputField.sendKeys(heigth);
	}
	
	public void enterWeight(String weigth)
	{
		weightInputField.sendKeys(weigth);
	}
	
	public void clickOnGenderDrpdownAndSelectGender()
	{	
//		genderDropdown.sendKeys(Keys.ARROW_DOWN);
//		Generic_Utilities.waitForTheVisiblity(selectGender);
//		Generic_Utilities.clickByJS(genderMale);
	}
	
	public void enterAge(String age)
	{
		agetInputField.sendKeys(age);
	}
	
	public void enterSystolic(String systolic)
	{
		systolicInputField.sendKeys(systolic);
	}
	
	public void enterDiastolic(String diastolic)
	{
		diastolicInputField.sendKeys(diastolic);
	}
}
