package util;

import java.io.File;
import java.io.IOException;
import java.util.List;
<<<<<<< HEAD
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Scenario;

public class Utilities {
	public static Scenario scenario;
	public static String feature;

	public void webDriverWait(WebDriver driver,By locator) throws Throwable  {
		int attempts = 0;
	    while(attempts < 50) 
	    {
	        try {
	                Thread.sleep(2000);
	                Boolean isPresent = driver.findElements(locator).size()>0;
	                if (isPresent) 
	                {
	                	if (driver.findElement(locator).isDisplayed() && driver.findElement(locator).isEnabled()) {
	                		Thread.sleep(1000);
	                        break;
	                	}
	                }
	        	} 
	        catch(Exception e) {
	        }
	        attempts++;
	    }
    }
	
	public void PerformancewebDriverWait(WebDriver driver,By locator) throws Throwable  {
		int attempts = 0;
	    while(attempts < 1000) 
	    {
	        try {
	                Boolean isPresent = driver.findElements(locator).size()>0;
	                if (isPresent) 
	                {
	                	if (driver.findElement(locator).isDisplayed() && driver.findElement(locator).isEnabled()) {
	                        break;
	                	}
	                }
	        	} 
	        catch(Exception e) {
	        }
	        attempts++;
	    }
    }
	
	public void MinimumWait(WebDriver driver) throws Throwable  {
        Thread.sleep(1000);
    }
   
    public void MediumWait(WebDriver driver) throws Throwable  {
        Thread.sleep(2000);
    }
    
    public void BatchProcessWait(WebDriver driver) throws Throwable  {
		Thread.sleep(60*1000);
	}
	
	public void WaitUntilRecordsMovedFromSimsToVault(WebDriver driver) throws Throwable  {
		Thread.sleep(600*1000);
	}
	
	public void MaximumWait(WebDriver driver) throws Throwable  {
		Thread.sleep(5000);
	}
	
	public void MaximumLongWait(WebDriver driver) throws Throwable  {
		Thread.sleep(10000);
	}
	
	public void PerformClickUsingJavaScriptExecutor(WebDriver driver,By locator) throws Throwable  {
		WebElement ele = driver.findElement(locator);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public static byte[] getByteScreenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
	}
	
	public void SelectByValueFromDropdown(WebDriver driver, By locator, String Value) throws Throwable {
		WebElement dropdown = driver.findElement(locator);
    	Select s = new Select(dropdown);
    	List<WebElement> l = s.getOptions();
    	l.size();
    	s.selectByValue(Value);
	}
	
	public void WaitUntilPageIsLoaded(WebDriver driver) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
	    if (j.executeScript("return document.readyState").toString().equals("complete")){
	       System.out.println("Page has loaded");
	    }
	}
	    
	public void performSearch(WebDriver driver, By searchBoxLocator, String searchQuery) {
		try {
			WebElement searchBox = driver.findElement(searchBoxLocator);
			searchBox.clear();
			searchBox.sendKeys(searchQuery);
		} catch (NoSuchElementException e) {
			// Handle the case when the search box element is not found
			e.printStackTrace(); 
			// You can replace this with proper error handling
		} catch (Exception e) {
			// Handle other exceptions as needed
			e.printStackTrace(); // You can replace this with proper error handling
		}

	}
}
=======

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Scenario;

public class Utilities {
	public static Scenario scenario;
	public static String feature;

	public void webDriverWait(WebDriver driver,By locator) throws Throwable  {
		int attempts = 0;
	    while(attempts < 50)
	    {
	        try {
	                Thread.sleep(2000);
	                Boolean isPresent = driver.findElements(locator).size()>0;
	                if (isPresent) 
	                {
	                	if (driver.findElement(locator).isDisplayed() && driver.findElement(locator).isEnabled()) {
	                		Thread.sleep(1000);
	                        break;
	                	}
	                }
	        	} 
	        catch(Exception e) {
	        }
	        attempts++;
	    }
    }
	
	public void MinimumWait(WebDriver driver) throws Throwable  {
        Thread.sleep(2000);
    }
   
    public void MediumWait(WebDriver driver) throws Throwable  {
        Thread.sleep(5000);
    }
    
    public void BatchProcessWait(WebDriver driver) throws Throwable  {
		Thread.sleep(60*1000);
	}
	
	public void WaitUntilRecordsMovedFromSimsToVault(WebDriver driver) throws Throwable  {
		Thread.sleep(600*1000);
	}
	
	public void MaximumWait(WebDriver driver) throws Throwable  {
		Thread.sleep(3000);
	}
	
	public void MaximumLongWait(WebDriver driver) throws Throwable  {
		Thread.sleep(15000);
	}
	
	public void PerformClickUsingJavaScriptExecutor(WebDriver driver,By locator) throws Throwable  {
		WebElement ele = driver.findElement(locator);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public static byte[] getByteScreenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
	}
	
	public void SelectByValueFromDropdown(WebDriver driver, By locator, String Value) throws Throwable {
		WebElement dropdown = driver.findElement(locator);
    	Select s = new Select(dropdown);
    	List<WebElement> l = s.getOptions();
    	l.size();
    	s.selectByValue(Value);
	}
	
	public void WaitUntilPageIsLoaded(WebDriver driver) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
	    if (j.executeScript("return document.readyState").toString().equals("complete")){
	       System.out.println("Page has loaded");
	    }
	}
}

>>>>>>> branch 'master' of https://github.com/BoyaAnilkumar/JivaAutomation.git
