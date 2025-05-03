package org.Utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Generic_Utilities {
static WebDriver driver;
	
	public static WebDriver launchBrowser(String browser , String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	
	public static void clickByJS(WebElement element)
	{
		waitForTheElementTOBeClickable(element);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void waitForTheVisiblity(WebElement element)
	{
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(5));
		ewait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForTheElementTOBeClickable(WebElement element)
	{
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(5));
		ewait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public static void sendkeysByActionClass(WebElement element , String testName)
	{
		Actions ac = new Actions(driver);
		ac.sendKeys(element ,testName).sendKeys(Keys.chord(Keys.ARROW_DOWN , Keys.ENTER)).build().perform();;
	}
	
	public static void scrollTOTheElement(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
