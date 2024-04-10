package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import util.DriverFactory;
import util.Utilities;

public class Supplier_Pages extends DriverFactory{

	Utilities utilities = new Utilities();

	
	By Supplier_Menu = By.xpath("//a[text()='Supplier']");
	By Supplier_Add  = By.xpath("//button[text()=' Add']");
	By Supplier_Name = By.xpath("//input[@formcontrolname='supplierName']");
	By Supplier_Category = By.xpath("//ng-select[@formcontrolname='supplierCategory']");
	By Fabric_Supplier = By.xpath("//span[text()='Fabric Supplier']");
	By Trim_Supplier = By.xpath("//span[text()='Trim Supplier']");
	By Yarn_Supplier = By.xpath("//span[text()='Yarn Supplier']");
	By Street_Address = By.xpath("//textarea[@formcontrolname='streetAddress']");
	By City = By.xpath("//input[@formcontrolname='city']");
	By State = By.xpath("//p-autocomplete[@placeholder='Search By State Name']");
	By State_Enter = By.xpath("//input[@placeholder='Search By State Name']");
	By Zipcode = By.xpath("//input[@formcontrolname='zipCode']");
	By Country = By.xpath("//select[@formcontrolname='country']");
	By Contact_Person = By.xpath("//input[@formcontrolname='contactPerson']");
	By Designation = By.xpath("//input[@formcontrolname='designation']");
	By Contact_Number = By.xpath("//input[@formcontrolname='contactNumber']");
	By Email_Address = By.xpath("//input[@formcontrolname='emailAddress']");
	By GST_Number = By.xpath("//input[@formcontrolname='gstNumber']");
	By Delivery_Terms = By.xpath("//select[@formcontrolname='deliveryTerms']");
	By Payment_Currency = By.xpath("//select[@formcontrolname='currencyType']");
	By Advance = By.xpath("//input[@formcontrolname='advance']");
	By Against_PI = By.xpath("//input[@formcontrolname='againstShipment']");
	By Against_Delivery = By.xpath("//input[@formcontrolname='againstDelivery']");
	By Credit_PDC = By.xpath("//input[@formcontrolname='pdc']");
	By PDC_Open_Credit = By.xpath("//select[@formcontrolname='creditType']");
	By Number_of_Days = By.xpath("//input[@formcontrolname='numberofDays']");
	By Save_Button = By.xpath("//button[@type='submit']");
	
	//Validation Texts
	By Validation_Supplier_Name = By.xpath("//div[@data-validate='Supplier Name is required']");
	By Validation_Supplier_Category = By.xpath("//div[@data-validate='Supplier Category is required']");
	By Validation_Street_Address = By.xpath("//div[@data-validate='Street Address is required']");
	By Validation_City = By.xpath("//div[@data-validate='City is required']");
	By Validation_State = By.xpath("//div[@data-validate='State is required']");
	By Validation_Zipcode = By.xpath("//div[@data-validate='Zip Code is required']");
	By Validation_Country = By.xpath("//div[@data-validate='Country is required']");
	By Validation_Contact_Person = By.xpath("//div[@data-validate='Contact Person is required']");
	By Validation_Designation = By.xpath("//div[@data-validate='Designation is required']");
	By Validation_Contact_Number = By.xpath("//div[@data-validate='Contact Number is required']");
	By Validation_Email_Address = By.xpath("//div[@data-validate='Email Address is required']");
	By Validation_GST_Number = By.xpath("//div[@data-validate='GST Number is required']");
	By Validation_Delivery_Terms = By.xpath("//div[@data-validate='Delivery Terms is required']");
	By Validation_Payment_Currency = By.xpath("//div[@data-validate='Payment Currency is required']");
	By Validation_Advance = By.xpath("//div[@data-validate='% Advance  is required']");
	By Validation_Against_PI = By.xpath("//div[@data-validate='% Against PI is required']");
	By Validation_Against_Delivery = By.xpath("//div[@data-validate='% Against Delivery is required']");
	By Validation_Credit_PDC = By.xpath("//div[@data-validate=' % Credit / PDC is required']");
	By Validation_PDC_Open_Credit = By.xpath("//div[@data-validate='PDC or Open Credit is required']");
	By Validation_Number_of_Days = By.xpath("//div[@data-validate='Number of Days is required']");
	
	
	public void Click_on_the_Supplier_screen() throws Throwable {
		utilities.webDriverWait(driver, Supplier_Menu);
		driver.findElement(Supplier_Menu).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Add_button_to_add_the_supplier_details() throws Throwable {
		utilities.webDriverWait(driver, Supplier_Add);
		driver.findElement(Supplier_Add).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_mandatory_fields_data() throws Throwable {
		utilities.webDriverWait(driver, Supplier_Name);
		driver.findElement(Supplier_Name).sendKeys("WildHorn");
		String suppliername = driver.findElement(Supplier_Name).getAttribute("value");
		System.out.println("Print the supplier name:  "  +  suppliername);
		utilities.MinimumWait(driver);
		
		driver.findElement(Supplier_Category).click();
		utilities.MinimumWait(driver);
		driver.findElement(Fabric_Supplier).click();
		utilities.MinimumWait(driver);
		driver.findElement(Supplier_Category).click();
		utilities.MinimumWait(driver);
		driver.findElement(Trim_Supplier).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Street_Address).sendKeys("68/1, near Nhpc metro, Block A, DLF Industrial Area, Sector 32, Faridabad");
		utilities.MinimumWait(driver);
		driver.findElement(City).click();
		driver.findElement(City).sendKeys("Faridabad");
		driver.findElement(State).click();
		utilities.MinimumWait(driver);
		driver.findElement(State_Enter).sendKeys("hr");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(Zipcode).click();
		driver.findElement(Zipcode).sendKeys("121003");
		utilities.MinimumWait(driver);
		
		
		String country = driver.findElement(Country).getText();
		System.out.println("print the country name:  " + country);
		utilities.MinimumWait(driver);
		
		driver.findElement(Contact_Person).click();
		driver.findElement(Contact_Person).sendKeys("Sudheer");
		driver.findElement(Designation).click();
		driver.findElement(Designation).sendKeys("Fabric Assistant Manager");
		driver.findElement(Contact_Number).click();
		driver.findElement(Contact_Number).sendKeys("9966984533");
		driver.findElement(Email_Address).click();
		driver.findElement(Email_Address).sendKeys("anilkumar@calibrage.in");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(GST_Number).click();
		driver.findElement(GST_Number).sendKeys("06BZAHM6245P6Z4");
		driver.findElement(Delivery_Terms).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(Payment_Currency).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(Advance).click();
		driver.findElement(Advance).sendKeys("4");
		driver.findElement(Against_PI).click();
		driver.findElement(Against_PI).sendKeys("5");
		driver.findElement(Against_Delivery).click();
		driver.findElement(Against_Delivery).sendKeys("8");
		driver.findElement(Credit_PDC).click();
		driver.findElement(Credit_PDC).sendKeys("2.05");
		driver.findElement(PDC_Open_Credit).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(Number_of_Days).click();
		driver.findElement(Number_of_Days).sendKeys("15");
		
		
	}



	public void Click_on_Save_button_in_create_supplier_screen(String screenshotName) throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
		
	}
	
	public void Verify_the_success_toaster_is_displaying_or_not() {
		
		
	}



	public void Verify_the_Validation_messsages_for_mandatory_fields() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		
		utilities.webDriverWait(driver, Validation_Supplier_Name);
		driver.findElement(Validation_Supplier_Name).click();
		Thread.sleep(2000);
		
		driver.findElement(Validation_Supplier_Category).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Street_Address).click();
		Thread.sleep(2000);
		driver.findElement(Validation_City).click();
		Thread.sleep(2000);
		driver.findElement(Validation_State).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Zipcode).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Country).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Contact_Person).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Designation).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Contact_Number).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Email_Address).click();
		Thread.sleep(2000);
		driver.findElement(Validation_GST_Number).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Delivery_Terms).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Payment_Currency).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Advance).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Against_PI).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Against_Delivery).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Credit_PDC).click();
		Thread.sleep(2000);
		driver.findElement(Validation_PDC_Open_Credit).click();
		Thread.sleep(2000);
		driver.findElement(Validation_Number_of_Days).click();
		Thread.sleep(2000);
		
		
	}

}
