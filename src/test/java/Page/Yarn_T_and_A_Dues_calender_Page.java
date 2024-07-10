package Page;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Yarn_T_and_A_Dues_calender_Page extends DriverFactory{
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);
	String Pastdate = DateTime.now().plusDays(-1).toString("dd-MM-yyyy");
	String tomorrow = DateTime.now().plusDays(1).toString("dd-MM-yyyy");
	
	Utilities utilities = new Utilities();
	
	By T_and_A_dropdown       = By.xpath("(//span[text()='T&A'])[4]");
	By T_and_A_Dues_Cal       = By.xpath("(//a[text()='T&A Dues Calendar'])[4]");
	By T_and_A_Dues_Cal_screen= By.xpath("//h3[text()='Yarn T&A Dues Calendar']");
	By Sr_merchant            = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')])[1]");
	By Sr_Mer_textbox         = By.xpath("//input[@role='textbox']");
	By Check_box              = By.xpath("//div[@role='checkbox']//span[1]");
	By Select_Check_box       = By.xpath("//div[@role='checkbox']");
	By Supplier_field         = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[2]");
	By Supplier_Textfield     = By.xpath("//input[@role='textbox']");
	By supplier_Check_box     = By.xpath("//div[@role='checkbox']");
	By From_Date              = By.xpath("//input[@formcontrolname='fromDate']");
	By To_date                = By.xpath("//input[@formcontrolname='toDate']");
	By Download_button        = By.xpath("//button[text()=' Download']");

	public void Click_on_the_T_and_A_dues_Calender_under_the_T_A_dropdown() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_dropdown);
		driver.findElement(T_and_A_dropdown).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, T_and_A_Dues_Cal);
		driver.findElement(T_and_A_Dues_Cal).click();
		
		
	}

	public void the_Yarn_T_and_A_Dues_Calender_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_Dues_Cal_screen);
		String Screen_name  = driver.findElement(T_and_A_Dues_Cal_screen).getText();
		System.out.println("Display the Yarn T&A Dues Calender Screen:" +Screen_name);
		
	}

	public void Select_the_Sr_Merchant_(String Merchant) throws Throwable {
		driver.findElement(Sr_merchant).click();
		Thread.sleep(2000);
		driver.findElement(Check_box).click();
		utilities.MediumWait(driver);
		driver.findElement(Sr_Mer_textbox).sendKeys(Merchant);
		utilities.MediumWait(driver);
		driver.findElement(Select_Check_box).click();
		utilities.MediumWait(driver);
		driver.findElement(Sr_merchant).click();
		utilities.MediumWait(driver);
		
		
	}

	public void User_Select_the_Supplier_name_in_the_field(String Supplier) throws Throwable {
		driver.findElement(Supplier_field).click();
		Thread.sleep(2000);
		driver.findElement(supplier_Check_box).click();
		utilities.MediumWait(driver);
		driver.findElement(Supplier_Textfield).sendKeys(Supplier);
		utilities.MediumWait(driver);
		driver.findElement(supplier_Check_box).click();
		utilities.MediumWait(driver);
		driver.findElement(Supplier_field).click();
		utilities.MediumWait(driver);
		
	}

	public void I_enter_the_From_date_and_To_Date() throws Throwable {
		utilities.webDriverWait(driver, From_Date );
		driver.findElement(From_Date).sendKeys(Pastdate);
		utilities.MediumWait(driver);
		System.out.println("Past date: " + Pastdate);
		
		
		utilities.webDriverWait(driver, To_date );
		driver.findElement(To_date).sendKeys(formattedDate);
		utilities.MediumWait(driver);
		System.out.println("Current date: " + formattedDate);
		
	}

	public void Click_on_the_Download_button() throws Throwable {
		utilities.webDriverWait(driver, Download_button);
		driver.findElement(Download_button).click();
		utilities.MediumWait(driver);
		
	}

}
