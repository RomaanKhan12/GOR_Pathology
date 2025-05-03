package org.Utilities;

import org.Pages.Add_Patients_Page;
import org.Pages.General_Details_Page;
import org.Pages.Patients_Page;
import org.openqa.selenium.WebDriver;

public class Reuseable_Methods {
	static WebDriver driver;
	
	public static void addingPatientContactDetail(WebDriver driver ,String name , String email , String phone)
	{
		Patients_Page pp = new Patients_Page(driver);
		
		pp.clickOnPatientsMuiListButton();
		pp.clickOnAddPatientButton();
		pp.enterName(name);
		pp.enterEmail(email);
		pp.enterPhone(phone);
	}
	
	public static void addingGeneralDetail(WebDriver driver , String height , String weight , String gender ,  String age , String systolicValue , String diastolicValue)
	{
		General_Details_Page gp = new General_Details_Page(driver);
		
		gp.clickOnGeneralDetailsButton();
		gp.enterHeight(height);
		gp.enterWeight(weight);
		gp.clickOnGenderDrpdownAndSelectGender();
		gp.enterAge(age);
		gp.enterSystolic(systolicValue);
		gp.enterDiastolic(diastolicValue);
	}

	
	public static void addingTestDetails(WebDriver driver , String testName , String labsName , String doctorsName , String requireDetails )
	{
	
		Add_Patients_Page ap = new Add_Patients_Page(driver);
		
		ap.clickOnAddTestsButton();
		ap.selectTestsForPatient(testName);
		ap.selectDiscount();
		ap.selectLabsRecommendation(labsName);
		ap.selectDoctorWhoRecommendedThisTest(doctorsName);
		ap.selectDoctosCommission();
		ap.clickOnAddEquimentsIcon();
		ap.selectEquipmentName();
		ap.enterRequireDetails(requireDetails);
		ap.clickOnCheckActions();
		
    }
    
    }
   
