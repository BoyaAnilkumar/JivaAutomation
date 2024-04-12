package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class FactoryList_Pages extends DriverFactory{
	Utilities utilities = new Utilities();
	
	By Factory_List = By.xpath("//a[text()='Factory List']");
	By Add_button = By.xpath("//button[text()=' Add']");
	By Factory_Name = By.xpath("//input[@formcontrolname='factoryName']");
	By GST_Number = By.xpath("//input[@formcontrolname='gstNumber']");
	By Address = By.xpath("//textarea[@formcontrolname='address']");
	By City = By.xpath("//input[@formcontrolname='city']");
	By State = By.xpath("//p-autocomplete[@placeholder='Search By State Name']");
	By State_Enter = By.xpath("//input[@placeholder='Search By State Name']");
	By Zipcode = By.xpath("//input[@formcontrolname='pinCode']");
	By Country = By.xpath("//select[@formcontrolname='country']");
	By Save_Button = By.xpath("//button[@type='submit']");
	By update_Toaster = By.xpath("//h2[@id='swal2-title']");
	
	//Update the Factory List by clicking on Edit icon
			By Search_Keyword = By.xpath("//input[@placeholder='Search keyword']");
			By Edit_Icon = By.xpath("//button[@title='Edit'][1]");
			
	//Delete the Factory List by clicking on delete icon
			By Delete_Icon = By.xpath("(//button[@title='Delete'])[1]");
			By Confirmation = By.xpath("//h2[text()='Are you sure you want to Deactivate?']");
			By Yes_Delete = By.xpath("//button[text()='Yes']");
			By No_Delete = By.xpath("//button[text()='No'][2]");
			By Delete_Successfull_Toaster = By.xpath("//h2[@id='swal2-title']");

	public void Click_on_the_Factory_List_screen() throws Throwable {
		utilities.webDriverWait(driver, Factory_List);
		driver.findElement(Factory_List).click();
		utilities.MinimumWait(driver);
				
	}

	public void Click_on_Add_button_to_add_the_Factory_List_details() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_mandatory_fields_data_in_Factory_List() throws Throwable {
		utilities.webDriverWait(driver, Factory_Name);
		driver.findElement(Factory_Name).sendKeys("Nayasa");
		String factoryname = driver.findElement(Factory_Name).getAttribute("value");
		System.out.println("Print the Factory name:  "  +  factoryname);
		utilities.MinimumWait(driver);
		
		driver.findElement(GST_Number).click();
		Thread.sleep(2000);
		driver.findElement(GST_Number).sendKeys("42AABCU9603R1ZW");
		Thread.sleep(2000);
		
		driver.findElement(Address).click();
		Thread.sleep(2000);
		driver.findElement(Address).sendKeys("INRHYTHM Towers, 4th Floor– 4A , Plot No: 1023,Gurukul Society, Khanamet");
		Thread.sleep(2000);
		
		driver.findElement(City).click();
		Thread.sleep(2000);
		driver.findElement(City).sendKeys("Hyderabad");
		Thread.sleep(2000);
		
		driver.findElement(State).click();
		Thread.sleep(2000);
		driver.findElement(State_Enter).sendKeys("ts");
		Thread.sleep(2000);
		Robot S = new Robot();
		S.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		S.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(Zipcode).click();
		Thread.sleep(2000);
		driver.findElement(Zipcode).sendKeys("500081");
		Thread.sleep(2000);
		
		String country = driver.findElement(Country).getText();
		System.out.println("print the country name:  " + country);
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Save_button_in_create_Factory_List_screen() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Edit_icon_to_update_the_Factory_List_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("Nayasa");
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		Thread.sleep(2000);
		
		driver.findElement(City).click();
		Thread.sleep(2000);
		driver.findElement(City).clear();
		Thread.sleep(2000);
		driver.findElement(City).sendKeys("Hyderabad");
		Thread.sleep(2000);
		
		driver.findElement(Save_Button).click();
		Thread.sleep(2000);
		
		driver.findElement(update_Toaster).click();
		String toasterupdate = driver.findElement(update_Toaster).getText();
		System.out.println(toasterupdate);
		
	}

	public void Click_on_delete_icon_to_update_the_Factory_List_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(2000);
		driver.findElement(Search_Keyword).sendKeys("Nayasa");
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
