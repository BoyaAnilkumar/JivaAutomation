package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class YarnType_Pages extends DriverFactory{
	Utilities utilities = new Utilities();

	By Yarn_Type = By.xpath("//a[text()='Yarn type ']");
	By Add_button = By.xpath("//button[text()=' Add']");
	By Yarn_Name = By.xpath("//input[@formcontrolname='yarnName']");
	By Content = By.xpath("//input[@formcontrolname='content']");
	By Count = By.xpath("//input[@formcontrolname='count']");
	By Save_Button = By.xpath("//button[@type='submit']");
	By Search_Keyword = By.xpath("//input[@placeholder='Search keyword']");
	By Edit_Icon = By.xpath("//button[@title='Edit'][1]");
	By Delete_Icon = By.xpath("(//button[@title='Delete'])[1]");
	By Confirmation = By.xpath("//h2[text()='Are you sure you want to Deactivate?']");
	By Yes_Delete = By.xpath("//button[text()='Yes']");
	By No_Delete = By.xpath("//button[text()='No'][2]");
	By Delete_Successfull_Toaster = By.xpath("//h2[@id='swal2-title']");
	By supplier_internal = By.xpath("//input[@formcontrolname='supplierCode']");
	
	//NominatedYarnType
	By Nominated  = By.xpath("//input[@formcontrolname='isNominated']");
	By Yarn_Price = By.xpath("//input[@formcontrolname='yarnPrice']");
	By Currency = By.xpath("//select[@formcontrolname='currencyTypeId']");
	By UOM = By.xpath("//select[@formcontrolname='uomId']");
	By upload_File = By.xpath("//input[@type='file']");
	
	
	public void Click_on_the_Yarn_type_screen() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Type);
		driver.findElement(Yarn_Type).click();
		utilities.MinimumWait(driver);
		
	}



	public void Click_on_Add_button_to_add_the_Yarn_type() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		Thread.sleep(2000);
		
	}



	public void Enter_the_mandatory_fields_data_in_Yarn_type() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Name);
		driver.findElement(Yarn_Name).click();
		Thread.sleep(2000);
		driver.findElement(Yarn_Name).sendKeys("MaUthoe");
		Thread.sleep(2000);
		driver.findElement(Content).click();
		Thread.sleep(2000);
		driver.findElement(Content).sendKeys("50%");
		Thread.sleep(2000);
		driver.findElement(Count).click();
		Thread.sleep(2000);
		driver.findElement(Count).sendKeys("25*02/30");
		Thread.sleep(2000);
		
	}



	public void Click_on_Save_button_in_create_Yarn_type_screen() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void user_search_the_yarn_type_in_search_keyword() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("mauthoe");
		Thread.sleep(2000);
		
	}


	public void Click_on_Edit_icon_to_update_the_Yarn_type_details() throws Throwable {
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(supplier_internal).click();
		Thread.sleep(2000);
		driver.findElement(supplier_internal).sendKeys("50");
		Thread.sleep(2000);
		
		driver.findElement(Save_Button).click();
		Thread.sleep(2000);
	}



	public void Click_on_delete_icon_to_update_the_Yarn_type_screen() throws Throwable {
		utilities.webDriverWait(driver, Delete_Icon);
		driver.findElement(Delete_Icon).click();
		Thread.sleep(2000);
		String delete_text = driver.findElement(Confirmation).getText();
		System.out.println(delete_text);
		driver.findElement(Yes_Delete).click();
		Thread.sleep(2000);
		
	}



	public void Click_on_Add_button_to_add_the_Nominated_Yarn_type() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		utilities.MinimumWait(driver);
		
	}



	public void Enter_the_mandatory_field_data_in_Nominated_Yarn_type() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Name);
		driver.findElement(Yarn_Name).click();
		Thread.sleep(2000);
		driver.findElement(Yarn_Name).sendKeys("Goakaj");
		Thread.sleep(2000);
		driver.findElement(Content).click();
		Thread.sleep(2000);
		driver.findElement(Content).sendKeys("15");
		Thread.sleep(2000);
		driver.findElement(supplier_internal).click();
		Thread.sleep(2000);
		driver.findElement(supplier_internal).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(Count).click();
		Thread.sleep(2000);
		driver.findElement(Count).sendKeys("52");
		Thread.sleep(2000);
		driver.findElement(Nominated).click();
		Thread.sleep(2000);
		driver.findElement(Yarn_Price).click();
		driver.findElement(Yarn_Price).sendKeys("2560");
		Thread.sleep(2000);
		driver.findElement(Currency).click();
		Robot C = new Robot();
		C.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		C.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		C.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		C.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(UOM).click();
		C.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		C.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, upload_File);
		driver.findElement(upload_File).click();
		Thread.sleep(2000);
		
	}



	public void user_search_the_nominated_yarn_type_in_search_keyword() {
		// TODO Auto-generated method stub
		
	}



	public void Click_on_Edit_icon_to_update_the_nominated_Yarn_type_details() {
		// TODO Auto-generated method stub
		
	}



	
	
}
