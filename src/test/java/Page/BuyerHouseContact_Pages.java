package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class BuyerHouseContact_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Buying_House_Contact = By.xpath("//a[text()='Buying House Contact']");
	By Add_Button = By.xpath("//button[text()=' Add']");
	By Buying_House_Name = By.xpath("//select[@formcontrolname='buyingHouseId']");
	By contact_person = By.xpath("//input[@formcontrolname='contactPerson']");
	By contact_number = By.xpath("//input[@formcontrolname='contactNumber']");
	By Designation = By.xpath("//input[@formcontrolname='designation']");
	By Email = By.xpath("//input[@formcontrolname='email']");
	By Update = By.xpath("//button[@type='submit']");
	
	By Edit_icon = By.xpath("(//button[@title='Edit'])[1]");
	By Delete_Icon = By.xpath("(//button[@title='Delete'])[1]");
	By Confirmation = By.xpath("//h2[text()='Are you sure you want to Deactivate?']");
	By Yes_Delete = By.xpath("//button[text()='Yes']");
	By No_Delete = By.xpath("//button[text()='No'][2]");
	By Delete_Successfull_Toaster = By.xpath("//h2[@id='swal2-title']");
	
	
	

	public void Click_on_the_Buying_House_contact_in_menu() throws Throwable {
		utilities.webDriverWait(driver, Buying_House_Contact);
		driver.findElement(Buying_House_Contact).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Add_button_to_add_the_Buying_House_contact_details() throws Throwable {
		utilities.webDriverWait(driver, Add_Button);
		driver.findElement(Add_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_data_for_Buying_House_contact_in_add_form() throws Throwable {
		utilities.webDriverWait(driver, Buying_House_Name);
		driver.findElement(Buying_House_Name).click();
		Thread.sleep(2000);
		Robot B = new Robot();
		B.keyPress(KeyEvent.VK_DOWN);
		B.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, contact_person);
		driver.findElement(contact_person).click();
		Thread.sleep(2000);
		driver.findElement(contact_person).sendKeys("Nikhil");
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, contact_number);
		driver.findElement(contact_number).click();
		Thread.sleep(2000);
		driver.findElement(contact_number).sendKeys("985606876");
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Designation);
		driver.findElement(Designation).click();
		Thread.sleep(2000);
		driver.findElement(Designation).sendKeys("Manager");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Email);
		driver.findElement(Email).click();
		Thread.sleep(2000);
		driver.findElement(Email).sendKeys("kolli.nikhil@calibrage.in");
		Thread.sleep(2000);
		
	}

	public void Click_on_Save_button_in_create_Buying_House_contact_screen() throws Throwable {
		utilities.webDriverWait(driver, Update);
		driver.findElement(Update).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Edit_button_to_update_the_Buying_House_contact_details() throws Throwable {
		utilities.webDriverWait(driver, Edit_icon);
		driver.findElement(Edit_icon).click();
		utilities.MinimumWait(driver);
		
	}

	public void Clear_and_Insert_the_data_for_Buying_House_contact_in_update_form() throws Throwable {
		utilities.webDriverWait(driver, contact_person);
		driver.findElement(contact_person).click();
		driver.findElement(contact_person).clear();
		Thread.sleep(2000);
		driver.findElement(contact_person).sendKeys("Anjani");
		Thread.sleep(2000);
		driver.findElement(Email).click();
		driver.findElement(Email).clear();
		driver.findElement(Email).sendKeys("anjani123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(Update).click();
		
	}

	public void Click_on_Delete_button_to_update_the_Buying_House_contact_details() throws Throwable {
		utilities.webDriverWait(driver, Delete_Icon);
		driver.findElement(Delete_Icon).click();
		Thread.sleep(2000);
		
		String confir = driver.findElement(Confirmation).getText();
		System.out.println(confir);
		
		driver.findElement(Yes_Delete).click();
		Thread.sleep(2000);
		
		driver.findElement(Delete_Successfull_Toaster).click();
		String delet = driver.findElement(Delete_Successfull_Toaster).getText();
		System.out.println(delet);
	}
	
}
