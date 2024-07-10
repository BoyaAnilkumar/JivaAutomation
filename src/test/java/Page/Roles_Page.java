package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class Roles_Page extends DriverFactory{

	Utilities utilities = new Utilities();

	By Roles_Screen           = By.xpath("//span[text()='Roles']");
	By Roles_screen_name      = By.xpath("//h3[text()='Roles']");
	By Add_Role_Form_name     = By.xpath("//h3[text()='Add Role']");
	By Name_field             = By.xpath("(//input[@formcontrolname='name'])[1]");
	By Reporting_Role         = By.xpath("//select[@formcontrolname='parentRole']");
	By Description            = By.xpath("//textarea[@formcontrolname='description']");
	By Permissions_name       = By.xpath("//h5[text()='Permissions']");
	By Save_button            = By.xpath("(//button[text()=' Save'])[1]");
	By toaster_msg            = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By Permissions_Req        = By.xpath("//h2[text()='Atleast one permission is required']");
	
	
	public void User_clicks_on_Roles_in_menu() throws Throwable {
		utilities.webDriverWait(driver, Roles_Screen);
		driver.findElement(Roles_Screen).click();
		
	}

	public void Navigates_to_Roles_screen() throws Throwable {
		utilities.webDriverWait(driver, Roles_screen_name);
		String Screen_name  = driver.findElement(Roles_screen_name).getText();
		System.out.println("Display the Roles Screen:" +Screen_name);
		
	}

	public void Verify_the_Add_Role_form_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Add_Role_Form_name);
		String Add_Form_name  = driver.findElement(Add_Role_Form_name).getText();
		System.out.println("Display the Add Role Form:" +Add_Form_name);
		
		
	}

	public void Navigates_to_Roles_screen(String Name) throws Throwable {
		utilities.webDriverWait(driver, Name_field);
		driver.findElement(Name_field).sendKeys(Name);
		
	}

	public void Select_the_Reporting_Role(String Role) throws Throwable {
	
		 WebElement Repo_Role = driver.findElement(Reporting_Role);	       
	        Select dropdown = new Select(Repo_Role);	        
	        dropdown.selectByVisibleText(Role);
		
	}

	public void Enter_the_data_in_the_Description_field() throws Throwable {
		utilities.webDriverWait(driver, Description);
		driver.findElement(Description).sendKeys("Admin Role");
			
		
	}

	public void Verify_the_Permissions_section_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Permissions_name);
		String Add_Form_name  = driver.findElement(Permissions_name).getText();
		System.out.println("Display the Permissions section:" +Add_Form_name);
		
		
	}

	public void Click_on_the_Save_button_in_the_Add_Role_form() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		
	}

	public void Verify_without_enter_the_data_in_mandatory_field_and_click_on_the_save_button_toaster_message_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MinimumWait(driver);
		
		Boolean isPresent = driver.findElements(toaster_msg).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(toaster_msg);
		String test = Data.getText(); 
		String expectedData = "Mandatory Fields Are Required With Valid Data.";
		if (expectedData.equals(test)) {
			System.out.println("Display Toaster msg is correct." + test);
		} else {
			System.out.println("Display Toaster msg is incorrect."+ test);
		}
	}
	}

	public void without_select_any_permission_click_on_save_button_toaster_message_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MinimumWait(driver);
		
		Boolean isPresent = driver.findElements(Permissions_Req).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Permissions_Req);
		String test = Data.getText(); 
		String expectedData = "Atleast one permission is required";
		if (expectedData.equals(test)) {
			System.out.println("Display Toaster msg is correct." + test);
		} else {
			System.out.println("Display Toaster msg is incorrect."+ test);
		}
	}
		
	}

	public void I_select_All_Permissions_for_the_Admin() {
		
		
	}

	

}
