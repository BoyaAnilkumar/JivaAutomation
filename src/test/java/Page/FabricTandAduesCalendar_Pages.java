package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;


public class FabricTandAduesCalendar_Pages extends DriverFactory{
	Utilities util = new Utilities();

	By TandA = By.xpath("//div/span[text()='T&A']");
	By TandA_dues_calendar = By.xpath("//li/a[text()='T&A Dues Calendar']");
	By Sr_Merchant = By.xpath("//p-multiselect[@placeholder='Select Merchant']");
	By merchant_Checkbox_True = By.xpath("//div[@aria-checked='true']");
	By From_Date = By.xpath("//input[@formcontrolname='fromDate']");
	By To_Date = By.xpath("//input[@formcontrolname='toDate']");
	By Download = By.xpath("//button[text()=' Download']");
	By Supplier = By.xpath("//p-multiselect[@placeholder='Select Supplier']");
	By Supplier_Checkbox_True = By.xpath("//div[@aria-checked='true']");
	
	
	public void Click_on_Fabric_T_and_A_Dues_Calendar() throws Throwable {
		util.webDriverWait(driver, TandA);
		driver.findElement(TandA).click();
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, TandA_dues_calendar);
		driver.findElement(TandA_dues_calendar).click();
		util.MinimumWait(driver);
		
	}

	public void Click_on_Senior_merchant_dropdown_list_and_verify_that_checkbox_is_selected_or_not() throws Throwable {
		util.webDriverWait(driver, Sr_Merchant);
		driver.findElement(Sr_Merchant).click();
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, merchant_Checkbox_True);
		WebElement chcbx = driver.findElement(merchant_Checkbox_True);
		boolean isselected = chcbx.isSelected();
		System.out.println("Select all checkbox is: " + isselected);
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).click();
		util.MinimumWait(driver);
		
		util.webDriverWait(driver, Supplier_Checkbox_True);
		WebElement supplierchcbx = driver.findElement(Supplier_Checkbox_True);
		boolean IsSelected = supplierchcbx.isSelected();
		System.out.println("Select all checkbox is: " + IsSelected);
		util.MinimumWait(driver);
		
	}

	public void change_from_date_and_To_date_in_Fabric_TandA_Dues_calendar() throws Throwable {
		util.webDriverWait(driver, From_Date);
		driver.findElement(From_Date).click();
		Thread.sleep(2000);
		driver.findElement(From_Date).sendKeys("08052024");
		String fromdate = driver.findElement(From_Date).getAttribute("value");
		System.out.println("Print From Date:  " + fromdate);
		Thread.sleep(2000);
		driver.findElement(To_Date).click();
		Thread.sleep(2000);
		driver.findElement(To_Date).sendKeys("15052024");
		String todate = driver.findElement(To_Date).getAttribute("value");
		System.out.println("Print To Date:  " + todate);
		util.MinimumWait(driver);
		
	}
	
	
}
