package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class MerchandisingTandAduesCalendar_pages extends DriverFactory {

	Utilities utilities = new Utilities();
	By TandA_dues_Calendar = By.xpath("(//a[text()='T&A Dues Calendar'])[1]");
	By Screen_Name = By.xpath("//h3[text()='Merchant T&A Dues Calendar']");
	By Sr_Merchant = By.xpath("//div[@class='ng-tns-c92-23 p-multiselect-trigger']");
	By Select_all_checkbox = By.xpath("//div[@aria-checked='true']");
	By From_Date = By.xpath("//input[@formcontrolname='fromDate']");
	By To_Date = By.xpath("//input[@formcontrolname='toDate']");
	By Download = By.xpath("//button[text()=' Download']");
	
	
	
	public void Click_on_Merchandising_T_and_A_Dues_Calendar() throws Throwable {
		utilities.webDriverWait(driver, TandA_dues_Calendar);
		driver.findElement(TandA_dues_Calendar).click();
		String DuesCalendar = driver.findElement(TandA_dues_Calendar).getText();
		System.out.println("Print the Menu name:  " +  DuesCalendar);
		utilities.MinimumWait(driver);
		
		String ScreenName = driver.findElement(Screen_Name).getText();
		System.out.println("Print the Screen Name:  " + ScreenName);
		utilities.MinimumWait(driver);
		
	}

	public void click_on_Sr_Merchant_dropdown_field_and_verify_that_bydefault_select_all_merchants_are_selected_or_not() throws Throwable {
		utilities.webDriverWait(driver, Sr_Merchant);
		driver.findElement(Sr_Merchant).click();
		Thread.sleep(2000);
		driver.findElement(Select_all_checkbox).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(Sr_Merchant).click();
		utilities.MinimumWait(driver);
		}

	public void change_from_date_and_To_date() throws Throwable {
	utilities.webDriverWait(driver, From_Date);
	driver.findElement(From_Date).click();
	Thread.sleep(2000);
	driver.findElement(From_Date).sendKeys("20032024");
	String fromdate = driver.findElement(From_Date).getAttribute("value");
	System.out.println("Print From Date:  " + fromdate);
	Thread.sleep(2000);
	driver.findElement(To_Date).click();
	Thread.sleep(2000);
	driver.findElement(To_Date).sendKeys("03042024");
	String todate = driver.findElement(To_Date).getAttribute("value");
	System.out.println("Print To Date:  " + todate);
	utilities.MinimumWait(driver);
	
	}

	public void click_on_Download_button() throws Throwable {
		utilities.webDriverWait(driver, Download);
		String button_download = driver.findElement(Download).getText();
		System.out.println("Print the Button name:  "  +  button_download);
		driver.findElement(Download).click();
		utilities.MaximumWait(driver);
		
	}
	
		
	}


