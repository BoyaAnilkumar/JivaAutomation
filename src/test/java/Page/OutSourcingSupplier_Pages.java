package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import util.DriverFactory;
import util.Utilities;

public class OutSourcingSupplier_Pages extends DriverFactory {

	Utilities utilities = new Utilities();
	
	By Out_Sourcing_Supplier = By.xpath("//a[text()='Out Sourcing Supplier ']");
	By Add_button = By.xpath("//button[text()=' Add']");
	By Supplier_Name = By.xpath("//input[@formcontrolname='supplierName']");
	By Source = By.xpath("//select[@formcontrolname='sourceId']");
	By Supplier_To = By.xpath("//select[@formcontrolname='supplierType']");
	By Street_Address = By.xpath("//textarea[@formcontrolname='streetAddress']");
	By City = By.xpath("//input[@formcontrolname='city']");
	By State = By.xpath("//p-autocomplete[@placeholder='Search By State Name']");
	By State_Enter = By.xpath("//input[@placeholder='Search By State Name']");
	By Zipcode = By.xpath("//input[@formcontrolname='zipCode']");
	By Country = By.xpath("//select[@formcontrolname='country']");
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
	By update_Toaster = By.xpath("//h2[text()='Out Source Supplier Saved Successfully ']");
	
	//Update the Out Sourcing Supplier Details by clicking on Edit icon
		By Search_Keyword = By.xpath("//input[@placeholder='Search keyword']");
		By Edit_Icon = By.xpath("//button[@title='Edit'][1]");
		
		//Delete the Out Sourcing supplier by clicking on delete icon
		By Delete_Icon = By.xpath("(//button[@title='Delete'])[1]");
		By Confirmation = By.xpath("//h2[text()='Are you sure you want to Deactivate?']");
		By Yes_Delete = By.xpath("//button[text()='Yes']");
		By No_Delete = By.xpath("//button[text()='No'][2]");
		By Delete_Successfull_Toaster = By.xpath("//h2[@id='swal2-title']");
	

	public void Click_on_the_Out_Sourcing_Supplier_screen() throws Throwable {
		utilities.webDriverWait(driver, Out_Sourcing_Supplier);
		driver.findElement(Out_Sourcing_Supplier).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Add_button_to_add_the_Out_Sourcing_Supplier_details() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		utilities.MinimumWait(driver);
		
	}


	public void Enter_the_mandatory_fields_data_in_Out_Sourcing_Supplier() throws Throwable {
		utilities.webDriverWait(driver, Supplier_Name);
		driver.findElement(Supplier_Name).sendKeys("Sada Teja");
		String suppliername = driver.findElement(Supplier_Name).getAttribute("value");
		System.out.println("Print the supplier name:  "  +  suppliername);
		utilities.MinimumWait(driver);
		
		driver.findElement(Source).click();
		utilities.MinimumWait(driver);
		Robot J = new Robot();
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(Supplier_To).click();
		Thread.sleep(2000);
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(Street_Address).sendKeys("68/1, near Nhpc metro, Block A, DLF Industrial , Gate no 2, Gachibowli");
		utilities.MinimumWait(driver);
		
		driver.findElement(City).click();
		driver.findElement(City).sendKeys("Hyderabad");
		driver.findElement(State).click();
		utilities.MinimumWait(driver);
		driver.findElement(State_Enter).sendKeys("TS");
		Thread.sleep(2000);
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(Zipcode).click();
		driver.findElement(Zipcode).sendKeys("500032");
		utilities.MinimumWait(driver);
		
		driver.findElement(GST_Number).click();
		driver.findElement(GST_Number).sendKeys("06BZAHM6245P6Z4");
		driver.findElement(Delivery_Terms).click();
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(Payment_Currency).click();
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(Advance).click();
		driver.findElement(Advance).sendKeys("14");
		driver.findElement(Against_PI).click();
		driver.findElement(Against_PI).sendKeys("15");
		driver.findElement(Against_Delivery).click();
		driver.findElement(Against_Delivery).sendKeys("18");
		driver.findElement(Credit_PDC).click();
		driver.findElement(Credit_PDC).sendKeys("12.05");
		driver.findElement(PDC_Open_Credit).click();
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(Number_of_Days).click();
		driver.findElement(Number_of_Days).sendKeys("15");
		Thread.sleep(2000);
		
	}


	public void Click_on_Save_button_in_create_Out_Sourcing_Supplier_screen() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Edit_icon_to_update_the_Out_Sourcing_Supplier_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("SadaTeja");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(750,0)", "");
		
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Source);
		driver.findElement(Source).click();
		Robot J = new Robot();
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Supplier_To);
		driver.findElement(Supplier_To).click();
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0,350)", "");
		
		driver.findElement(Save_Button).click();
		Thread.sleep(2000);
		
		driver.findElement(update_Toaster).click();
		String toasterupdate = driver.findElement(update_Toaster).getText();
		System.out.println(toasterupdate);
		
	}


	public void Click_on_delete_icon_to_update_the_Out_Sourcing_Supplier_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("SadaTeja");
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Delete_Icon);
		driver.findElement(Delete_Icon).click();
		Thread.sleep(2000);
		
		String confirmation_text = driver.findElement(Confirmation).getText();
		System.out.println(confirmation_text);
		System.out.println();
		driver.findElement(Yes_Delete).click();
		Thread.sleep(2000);
		
		driver.findElement(Delete_Successfull_Toaster).click();
		String deletetoaster = driver.findElement(Delete_Successfull_Toaster).getText();
		System.out.println(deletetoaster);
		Thread.sleep(2000);
	}
	
}
