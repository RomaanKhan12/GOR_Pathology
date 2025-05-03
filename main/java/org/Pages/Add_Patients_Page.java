package org.Pages;

import org.Utilities.Generic_Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Patients_Page {
	WebDriver addPatientsDriver;

	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-label')])[2]")
	private WebElement addTestsButton;
	
	@FindBy(id = "patient-test")
	private WebElement addTestsForPatientField;
	
	@FindBy(xpath = "(//div[contains(@class,'MuiSelect-root')])[1]")
	private WebElement discountDropdown;
	
	@FindBy (xpath = "//ul[contains(@class,'MuiList-root MuiMenu')]")
	private WebElement selectDiscount;
	
	@FindBy (xpath = "//li[text()='15%']")
	private WebElement discount15Percent;
	
	@FindBy(id = "patient-tests-labs")
	private WebElement selectLabsFromRecommendationField;
	
	@FindBy(xpath = "//input[contains(@id,'mui')]")
	private WebElement doctorWhoRecommendedThisTest;
	
	@FindBy(xpath = "(//div[contains(@class,'MuiSelect-root')])[2]")
	private WebElement doctorsCommission;
	
	@FindBy (xpath = "//li[text()='20%']")
	private WebElement doctorDiscount20Percent;
	
	
	@FindBy(xpath = "//span[text()='add_box']")
	private WebElement addEquipment;
	
	@FindBy (xpath = "(//div[contains(@class,'MuiSelect-root ')])[3]")
	private WebElement equimentName;
	
	@FindBy (xpath = "//li[text()='injection']")
	private WebElement selectEquipmentInjection;
	
	@FindBy (xpath = "//input[@class='MuiInputBase-input MuiInput-input']")
	private WebElement requiredDetails;
	
	@FindBy (xpath = "//span[text()='check']")
	private WebElement addingEquipments;
	
	public Add_Patients_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		addPatientsDriver = driver;
	}
	
	public void clickOnAddTestsButton()
	{	
		Generic_Utilities.scrollTOTheElement(addTestsButton);
		Generic_Utilities.clickByJS(addTestsButton);
	}
	
	public void selectTestsForPatient(String testName)
	{
		Generic_Utilities.sendkeysByActionClass(addTestsForPatientField ,testName);
		
	}
	
	public void selectDiscount()
	{
		discountDropdown.sendKeys(Keys.ARROW_DOWN);
		Generic_Utilities.waitForTheVisiblity(selectDiscount);
		Generic_Utilities.clickByJS(discount15Percent);
	}
	  
	public void selectLabsRecommendation(String labsName)
	{	 
		selectLabsFromRecommendationField.sendKeys(labsName);
		selectLabsFromRecommendationField.sendKeys(Keys.chord(Keys.ARROW_DOWN	 , Keys.ENTER));
	}
	
	public void selectDoctorWhoRecommendedThisTest(String doctorsName)
	{
		doctorWhoRecommendedThisTest.sendKeys(doctorsName);
		doctorWhoRecommendedThisTest.sendKeys(Keys.chord(Keys.ARROW_DOWN , Keys.ENTER));
	}
	
	public void selectDoctosCommission()
	{
		doctorsCommission.sendKeys(Keys.ARROW_DOWN);
		Generic_Utilities.waitForTheVisiblity(selectDiscount);
		Generic_Utilities.clickByJS(doctorDiscount20Percent);
	}
	
	public void clickOnAddEquimentsIcon()
	{
		Generic_Utilities.clickByJS(addEquipment);
		
	}
	
	public void selectEquipmentName()
	{
		Generic_Utilities.clickByJS(equimentName);	
		equimentName.sendKeys(Keys.ARROW_DOWN);
		Generic_Utilities.waitForTheVisiblity(selectDiscount);
		Generic_Utilities.clickByJS(selectEquipmentInjection);
	}
	
	public void enterRequireDetails(String requireDetails)
	{
		requiredDetails.sendKeys(requireDetails);
	}
	
	public void clickOnCheckActions()
	{
		Generic_Utilities.clickByJS(addingEquipments);
	}
}
