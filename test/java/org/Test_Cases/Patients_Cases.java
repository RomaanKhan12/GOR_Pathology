package org.Test_Cases;



import java.time.Duration;

import org.Pages.Login_Page;
import org.Pages.Patients_Page;
import org.Utilities.Generic_Utilities;
import org.Utilities.Reuseable_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Patients_Cases {
	WebDriver driver;
	
	@BeforeMethod
	public void launchingBrowser()
	{
		driver = Generic_Utilities.launchBrowser("chrome", "https://gor-pathology.web.app/");
	}

	
//	@Test(priority =1)
	public void verifyTheDahsBoardPage()
	{
		Login_Page lp = new Login_Page(driver);
		lp.enterUsername("test@kennect.io");
		lp.enterPassword("Qwerty@1234");
		lp.clickOnLoginButton();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://gor-pathology.web.app/dashboard"));
		
	    String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals("https://gor-pathology.web.app/dashboard", currentUrl);
	}
	
	@Test(priority =2)
	public void addPatient()
	{
		
		Login_Page lp = new Login_Page(driver);
		lp.enterUsername("test@kennect.io");
		lp.enterPassword("Qwerty@1234");
		lp.clickOnLoginButton();
		
		Reuseable_Methods.addingPatientContactDetail(driver, "Romaan", "romankhan@gmail.com", "9137678797");
		Reuseable_Methods.addingGeneralDetail(driver,"178", "75", "Male", "23", "120", "80");
		Reuseable_Methods.addingTestDetails(driver, "VITAMIN B12", "Test", "kiran", "2");
		
		Patients_Page pp = new Patients_Page(driver);
		Assert.assertTrue(pp.patientsIDIsDisplayed(), " patients id is not displayed");
	}
	
	
	@AfterMethod
	public void quitBrowser()
	{
		driver.quit();
	}
}
