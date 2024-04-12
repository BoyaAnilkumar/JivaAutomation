package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class BuyerPOtypes_Pages extends DriverFactory {
	Utilities utilities = new Utilities();
	By Buyer_PO_Types = By.xpath("//a[text()='Buyer PO Types ']");
	By Add_button = By.xpath("//button[text()=' Add ']");
	By Buyer = By.xpath("//select[@formcontrolname='buyerId']");
	By PO_Type_Name = By.xpath("//input[@formcontrolname='poTypeName']");
	By Save_Button = By.xpath("//button[@type='submit']");
	By Search_Keyword = By.xpath("//input[@placeholder='Search keyword']");
	By Edit_Icon = By.xpath("//a[@title='Edit'][1]");
	By Delete_Icon = By.xpath("(//button[@title='Delete'])[1]");
	By Confirmation = By.xpath("//h2[text()='Are You Sure You Want To Delete?']");
	By Yes_Delete = By.xpath("//button[text()='Yes']");
	By No_Delete = By.xpath("//button[text()='No'][2]");
	By Delete_Successfull_Toaster = By.xpath("//h2[@id='swal2-title']");
	By update_Toaster = By.xpath("//h2[text()='Buyer PO Type Updated Successfully']");
	
	

	public void Click_on_the_Buyer_PO_Types_screen() throws Throwable {
		utilities.webDriverWait(driver, Buyer_PO_Types);
		driver.findElement(Buyer_PO_Types).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Add_button_to_add_the_Buyer_PO_Types_details() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		utilities.MinimumWait(driver);
	}


	public void Enter_the_mandatory_fields_data_in_Buyer_PO_Types() throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		utilities.MinimumWait(driver);
		Robot J = new Robot();
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_DOWN);
		J.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(PO_Type_Name).click();
		Thread.sleep(2000);
		driver.findElement(PO_Type_Name).sendKeys("Cubix");
		Thread.sleep(2000);
		
	}


	public void Click_on_Save_button_in_create_Buyer_PO_Types_screen() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
	}


	public void Click_on_Edit_icon_to_update_the_Buyer_PO_Types_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("Cubix");
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		Thread.sleep(2000);
		
		driver.findElement(PO_Type_Name).click();
		Thread.sleep(2000);
		driver.findElement(PO_Type_Name).clear();
		Thread.sleep(2000);
		driver.findElement(PO_Type_Name).sendKeys("Cubix Set");
		Thread.sleep(2000);
		
		driver.findElement(Save_Button).click();
		Thread.sleep(2000);
		
		driver.findElement(update_Toaster).click();
		String toasterupdate = driver.findElement(update_Toaster).getText();
		System.out.println(toasterupdate);
		
	}


	public void Click_on_delete_icon_to_update_the_Buyer_PO_Types_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("Cubix Set");
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
