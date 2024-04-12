package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class BuyerGarmentSizeBreakup_Pages extends DriverFactory {
	Utilities utilities = new Utilities();
	
	//Add Buyer Garment size breakup
	By Buyer_Garment_Size_Breakup = By.xpath("//a[text()='Buyer Garment Size Breakup ']");
	By Add_Breakup = By.xpath("//button[text()=' Add ']");
	By Buyer = By.xpath("//select[@formcontrolname='buyerId']");
	By Garment_Size = By.xpath("//select[@formcontrolname='garmentSizeTypeId']");
	By Po_Type_Name = By.xpath("//input[@formcontrolname='poType']");
	By size_Breakup1 = By.xpath("(//input[@formcontrolname='sizeName'])[1]");
	By size_Breakup2 = By.xpath("(//input[@formcontrolname='sizeName'])[2]");
	By Base_Size1 = By.xpath("(//input[@formcontrolname='isBaseSize'])[1]");
	By Base_Size2 = By.xpath("(//input[@formcontrolname='isBaseSize'])[2]");
	By save_button = By.xpath("//button[@type='submit']");
	
	//update the buyer garment size breakup by clicking on edit icon
	By Search_Keyword = By.xpath("//input[@placeholder='Search keyword']");
	By Edit_icon = By.xpath("(//a[@title='Edit'])[1]");
	By Active_Checkbox = By.xpath("//input[@formcontrolname='isActive']");
	
	//Delete the buyer garment size breakup by clicking on edit icon
	By delete_icon = By.xpath("//button[@title='Delete']");
	By delete_confirmation = By.xpath("//h2[@id='swal2-title']");
	By yes_delete = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	By no_delete = By.xpath("//button[@class='swal2-cancel swal2-styled']");
	
	public void Click_on_the_Buyer_garment_size_breakup_screen() throws Throwable {
		utilities.webDriverWait(driver, Buyer_Garment_Size_Breakup);
		driver.findElement(Buyer_Garment_Size_Breakup).click();
		utilities.MinimumWait(driver);
		String screen_name = driver.findElement(Buyer_Garment_Size_Breakup).getText();
		System.out.println(screen_name);
		
	}

	public void Click_on_Add_button_to_add_the_Buyer_garment_size_breakup_details() throws Throwable {
		utilities.webDriverWait(driver, Add_Breakup);
		driver.findElement(Add_Breakup).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_mandatory_fields_data_in_Buyer_garment_size_breakup() throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		Thread.sleep(2000);
		Robot buyer = new Robot();
		buyer.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		buyer.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		buyer.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		buyer.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(Garment_Size).click();
		Thread.sleep(2000);
		Robot garmentsize = new Robot();
		garmentsize.keyPress(KeyEvent.VK_DOWN);Thread.sleep(2000);
		garmentsize.keyPress(KeyEvent.VK_DOWN);Thread.sleep(2000);
		garmentsize.keyPress(KeyEvent.VK_DOWN);Thread.sleep(2000);
		garmentsize.keyPress(KeyEvent.VK_DOWN);Thread.sleep(2000);
		garmentsize.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(Po_Type_Name).sendKeys("Sundy");
		Thread.sleep(2000);
		
		driver.findElement(Add_Breakup).click();
		Thread.sleep(2000);
		
		driver.findElement(size_Breakup1).click();
		driver.findElement(size_Breakup1).sendKeys("A1");
		driver.findElement(size_Breakup2).click();
		driver.findElement(size_Breakup2).sendKeys("A2");
		Thread.sleep(2000);
		
		driver.findElement(Base_Size1).click();
		Thread.sleep(2000);
		
	
		
	}

	public void Click_on_Save_button_in_create_Buyer_garment_size_breakup_screen() throws Throwable {
		utilities.webDriverWait(driver, save_button);
		driver.findElement(save_button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_edit_icon_to_update_the_Buyer_garment_size_breakup_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("Ann Taylor");
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Edit_icon);
		driver.findElement(Edit_icon).click();
		Thread.sleep(2000);
		
	}

	public void change_the_data_in_edit_form() throws Throwable {
//		driver.findElement(Add_Breakup).click();
//		Thread.sleep(2000);
//		driver.findElement(size_Breakup2).click();
//		driver.findElement(size_Breakup2).sendKeys("A2");
//		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Base_Size1);
		driver.findElement(Base_Size1).click();
		Thread.sleep(2000);
		driver.findElement(Base_Size2).click();
		Thread.sleep(2000);
		
		
	}

	public void Click_on_delete_icon_to_update_the_Buyer_garment_size_breakup_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("Weissman");
		Thread.sleep(2000);
		
		
		WebElement buttonElement = driver.findElement(delete_icon);
		if (buttonElement.isEnabled()) {
			System.out.println("Button is enabled.");
			driver.findElement(delete_icon).click();
			utilities.MediumWait(driver);
			utilities.webDriverWait(driver,yes_delete );		
			driver.findElement(yes_delete).click();	
	//		driver.findElement(No).click();

		} else {
			driver.findElement(Edit_icon).click();
			utilities.MinimumWait(driver);
			driver.findElement(Active_Checkbox).click();
			driver.findElement(save_button).click();
	}


	}
}
