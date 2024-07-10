package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Users_page extends DriverFactory{

	
	Utilities utilities = new Utilities();
	WebElement User;
	WebElement User_in_grid;
	String username;
	String email;


	
	
	By Security = By.xpath("//span[text()='Security ']");
	By Security_Options = By.xpath("(//ul[@class='mm-collapse mm-show'])[1]");
	By Users = By.xpath("//a[text()='Users']");
	By Users_Screen = By.xpath("//h3[text()='Users']");
	By Add_button = By.xpath("//p-table/div/div/div/span/button[text()=' Add']");
	By Create_Users_Screen = By.xpath("//h3[text()='Create User ']");
	By User_Name = By.xpath("//input[@formcontrolname='userName']");
	By First_Name = By.xpath("//input[@formcontrolname='firstName']");
	By Last_Name = By.xpath("//input[@formcontrolname='lastName']");
	By Email = By.xpath("//input[@formcontrolname='email']");
	By Mobile_Number = By.xpath("//input[@placeholder='Enter Mobile Number']");
	By Alternate_Mobile_Number = By.xpath("//input[@formcontrolname='alternateMobileNumber']");
	By New_Password = By.xpath("//input[@formcontrolname='newPassword']");
	By Confirm_Password = By.xpath("//input[@formcontrolname='confirmPassword']");
	By Roles = By.xpath("//p-autocomplete[@placeholder='Search Role']");
	By enterRole = By.xpath("//input[@placeholder='Search Role']");
	By select_role = By.xpath("//span[text()='Senior PD Merchant']");
	By Reporting_Manager = By.xpath("//p-autocomplete[@placeholder='Search Name']");
	By Enter_Reporting_Manager = By.xpath("//input[@placeholder='Search Name']");
	By Select_Reporting_Manager = By.xpath("//span[text()='Lavanya K']");
	By Department = By.xpath("//p-autocomplete[@placeholder='Search Department']");
	By Enter_Department = By.xpath("//input[@placeholder='Search Department']");
	By Select_Department = By.xpath("//li[contains(@class,'p-ripple p-element')]//span[1]");
	By Factory = By.xpath("//div[text()='Select Factory']");
	By Select_Factory_1 = By.xpath("(//div[@class='p-checkbox-box'])[1]");
	By Select_Factory_2 = By.xpath("(//div[@class='p-checkbox-box'])[2]");
	By Save_button = By.xpath("//button[@type='submit']");
	By Grid_user_column_data = By.xpath("//table//tbody[@class='p-element p-datatable-tbody']/tr[@class='ng-star-inserted']/td[1]");
	By Grid_email_column_data = By.xpath("//table//tbody[@class='p-element p-datatable-tbody']/tr[@class='ng-star-inserted']/td[3]");
	By Grid_Mobilenumber_column_data = By.xpath("//table//tbody[@class='p-element p-datatable-tbody']/tr[@class='ng-star-inserted']/td[4]");
	By Success_Toaster = By.xpath("//h2[text()='User Updated Successfully']");
	By Column_Filter = By.xpath("//tr/th/div/p-columnfilter");
	By Column_Filter_Element = By.xpath("//p-columnfilterformelement/input[@class='p-inputtext p-component p-element ng-star-inserted']");
	By Column_Filter_Apply = By.xpath("//div/button/span[text()='Apply']");
	By Card_Header = By.xpath("//div[@class='card-header']");
	By Table = By.xpath("//div/table");
	By Delete_Icon = By.xpath("//tbody/tr/td/button[@title='Delete']");
	By Delete_Confirmation = By.xpath("//h2[text()='Are you sure you want to Deactivate?']");
	By Delete_Yes = By.xpath("//div[@class='swal2-actions']/.//button[text()='Yes']");
	By Delete_No = By.xpath("//div[@class='swal2-actions']/.//button[text()='No'][2]");
	By Active = By.xpath("//tbody/tr/td/div/i[@title='Active']");
	By InActive = By.xpath("//tbody/tr/td/div/i[@title='InActive']");
	By Edit_icon = By.xpath("//tbody/tr/td/button[@title='Edit']");
	By SortingByColumns = By.xpath("//thead/tr/th/div/p-sorticon");
	By Search = By.xpath("//input[@placeholder='Search keyword']");
	By Next_Page = By.xpath("//span[@class='p-paginator-icon pi pi-angle-right']");
	By Previous_Page = By.xpath("//span[@class='p-paginator-icon pi pi-angle-left']");
	
	
	
	public void I_click_on_security_module() throws Throwable {
		utilities.webDriverWait(driver, Security);
		driver.findElement(Security).click();
		utilities.MinimumWait(driver);
		
	}

	public void Display_Users_and_Roles_in_menu() throws Throwable {
		utilities.webDriverWait(driver, Security_Options);
		String Options = driver.findElement(Security_Options).getText();
		System.out.println("Display Security Module menu-->  " +  " "
		+ Options);
		utilities.MinimumWait(driver);

		
		
	}

	public void I_click_on_Users_in_menu() throws Throwable {
		utilities.webDriverWait(driver, Users);
		driver.findElement(Users).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Navigates_to_Users_screen() throws Throwable {
		utilities.webDriverWait(driver, Users_Screen);
		String users = driver.findElement(Users_Screen).getText();
		System.out.println("Navigated to Users screen-->  " + users);
		utilities.MinimumWait(driver);
		
	}

	public void I_click_on_Add_button() throws Throwable {
		utilities.webDriverWait(driver, Add_button);
		driver.findElement(Add_button).click();
		System.out.println("clicked on Add button to create user");
		utilities.MinimumWait(driver);
		
	}

	public void Navigates_to_Create_User_screen() throws Throwable {
		utilities.webDriverWait(driver, Create_Users_Screen);
		String create_user = driver.findElement(Create_Users_Screen).getText();
		System.out.println("Navigated to Create Users Screen-->  " + create_user);
		utilities.MinimumWait(driver);
		
	}

	public void I_Want_to_enter_UserName() throws Throwable {
		utilities.webDriverWait(driver, User_Name);
		driver.findElement(User_Name).click();
		Thread.sleep(2500);
		driver.findElement(User_Name).sendKeys("anil9885");
		utilities.MinimumWait(driver);
		
	}

	public void I_Want_to_enter_FirstName() throws Throwable {
		utilities.webDriverWait(driver, First_Name);
		driver.findElement(First_Name).click();
		Thread.sleep(3000);
		driver.findElement(First_Name).sendKeys("Arun");
		utilities.MinimumWait(driver);
		
	}

	public void I_Want_to_enter_LastName() throws Throwable {
		utilities.webDriverWait(driver, Last_Name);
		driver.findElement(Last_Name).click();
		Thread.sleep(3000);
		driver.findElement(Last_Name).sendKeys("Gattadi");
		utilities.MinimumWait(driver);
		
	}

	public void I_Want_to_enter_Email() throws Throwable {
		utilities.webDriverWait(driver, Email);
		driver.findElement(Email).click();
		Thread.sleep(3000);
		driver.findElement(Email).sendKeys("arun.g@calibrage.in");
		utilities.MinimumWait(driver);
		
	}

	public void I_Want_to_enter_MobileNumber() throws Throwable {
		utilities.webDriverWait(driver, Mobile_Number);
		driver.findElement(Mobile_Number).click();
		Thread.sleep(3000);
		driver.findElement(Mobile_Number).sendKeys("9885606876");
		utilities.MinimumWait(driver);
		
	}

	public void I_Want_to_enter_AlternateMobileNumber() throws Throwable {
		utilities.webDriverWait(driver, Alternate_Mobile_Number);
		driver.findElement(Alternate_Mobile_Number).click();
		Thread.sleep(3000);
		driver.findElement(Alternate_Mobile_Number).sendKeys("9640111523");
		utilities.MinimumWait(driver);
		
	}

	public void I_Want_to_enter_NewPassword() throws Throwable {
		utilities.webDriverWait(driver, New_Password);
		driver.findElement(New_Password).click();
		Thread.sleep(3000);
		driver.findElement(New_Password).sendKeys("Abcd@123");
		utilities.MinimumWait(driver);
		
	}

	public void I_Want_to_enter_ConfirmPassword() throws Throwable {
		utilities.webDriverWait(driver, Confirm_Password);
		driver.findElement(Confirm_Password).click();
		Thread.sleep(3000);
		driver.findElement(Confirm_Password).sendKeys("Abcd@123");
		utilities.MinimumWait(driver);
		
		
	}

	public void I_Want_to_enter_Roles() throws Throwable {
		utilities.webDriverWait(driver, Roles);
		driver.findElement(Roles).click();
		Thread.sleep(4000);
		utilities.webDriverWait(driver, enterRole);
		driver.findElement(enterRole).sendKeys("Senior PD");
		utilities.MinimumWait(driver);
		driver.findElement(select_role).click();
		utilities.MinimumWait(driver);
		
	}

	public void I_want_to_select_Reporting_Manager() throws Throwable {
		utilities.webDriverWait(driver,Reporting_Manager);
		driver.findElement(Reporting_Manager).click();
		Thread.sleep(2000);
		driver.findElement(Enter_Reporting_Manager).sendKeys("Lav");
		utilities.MinimumWait(driver);
		driver.findElement(Select_Reporting_Manager).click();
		utilities.MinimumWait(driver);
		
	}

	public void I_want_to_select_the_department() throws Throwable {
		utilities.webDriverWait(driver,Department);
		driver.findElement(Department).click();
		Thread.sleep(2000);
		driver.findElement(Enter_Department).sendKeys("Mer");
		utilities.MinimumWait(driver);
		driver.findElement(Select_Department).click();
		utilities.MinimumWait(driver);	
		
	}

	public void I_want_to_select_the_Factory() throws Throwable {
		utilities.webDriverWait(driver, Factory);
		driver.findElement(Factory).click();
		Thread.sleep(2000);
		driver.findElement(Select_Factory_1).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_Factory_2).click();
		utilities.MinimumWait(driver);
		driver.findElement(Factory).click();
		utilities.MediumWait(driver);
	}

	public void Click_on_save_button() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_data_in_mandatory_fields() throws Throwable {
		utilities.webDriverWait(driver, User_Name);
		
		driver.findElement(User_Name).click();
		driver.findElement(User_Name).sendKeys("Arvind12");
		utilities.MediumWait(driver);
		
		
		utilities.webDriverWait(driver, First_Name);
		driver.findElement(First_Name).click();
		driver.findElement(First_Name).sendKeys("Aravindh");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Last_Name);
		driver.findElement(Last_Name).click();
		driver.findElement(Last_Name).sendKeys("Boya");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Email);
		driver.findElement(Email).click();
		driver.findElement(Email).sendKeys("aravind12@gmail.com");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Mobile_Number);
		driver.findElement(Mobile_Number).click();
		driver.findElement(Mobile_Number).sendKeys("9581525849");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, New_Password);
		driver.findElement(New_Password).click();
		driver.findElement(New_Password).sendKeys("Anil@9885");
		utilities.MinimumWait(driver);
		driver.findElement(Confirm_Password).click();
		driver.findElement(Confirm_Password).sendKeys("Anil@9885");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Roles);
		driver.findElement(Roles).click();
		Thread.sleep(4000);
		utilities.webDriverWait(driver, enterRole);
		driver.findElement(enterRole).sendKeys("Senior PD");
		utilities.MinimumWait(driver);
		driver.findElement(select_role).click();
		utilities.MinimumWait(driver);
		driver.findElement(Department).click();
		Thread.sleep(2000);
		driver.findElement(Enter_Department).sendKeys("Design");
		utilities.MinimumWait(driver);
		driver.findElement(Select_Department).click();
		Thread.sleep(2000);
		driver.findElement(Factory).click();
		driver.findElement(Select_Factory_1).click();
		driver.findElement(Card_Header).click();
		utilities.MediumWait(driver);
		driver.findElement(Save_button).click();
		
		username = driver.findElement(User_Name).getAttribute("value");
		System.out.println("username: " + username);
		utilities.MinimumWait(driver);
		
		email = driver.findElement(Email).getAttribute("value");
		System.out.println("Email:  " + email);	
		utilities.MinimumWait(driver);

		
	
		
		
	}

	public void verify_that_created_user_is_displaying_in_grid_with_valid_data() throws Throwable {
		utilities.webDriverWait(driver, Column_Filter);
		driver.findElement(Column_Filter).click();
		utilities.MinimumWait(driver);
		driver.findElement(Column_Filter_Element).sendKeys("Arvind12");
		utilities.MinimumWait(driver);
		driver.findElement(Column_Filter_Apply).click();
		utilities.MediumWait(driver);
		
		User_in_grid = driver.findElement(Grid_user_column_data);
		String Username = User_in_grid.getText();
		System.out.println("Displaying username in add form " + username);
		if(username.equals(Username)) {
			System.out.println("Displaying the same user name--  " +  Username);
		}else {
			System.out.println("Displaying the different username-- " + Username);
		}
		
		String email_grid = driver.findElement(Grid_email_column_data).getText();
		System.out.println("Email which is displaying in grid: " +  email_grid);
		if(email_grid.equals(email)) {
			System.out.println("Displaying the same email id which was inserted in add form:  " + email_grid);
		}else {
			System.out.println("Displaying someother email id rather than the inserted:  " + email);
		}
		
		utilities.MaximumWait(driver);
	}


	public void click_on_Filter_icon_and_filter_with_the_username() throws Throwable {

		utilities.webDriverWait(driver, Column_Filter);
		driver.findElement(Column_Filter).click();
		utilities.MinimumWait(driver);
		driver.findElement(Column_Filter_Element).sendKeys("Arvind12");
		utilities.MinimumWait(driver);
		driver.findElement(Column_Filter_Apply).click();
		utilities.MediumWait(driver);
		
	}

	public void Click_on_Delete_icon_and_delete_the_user() throws Throwable {
		
		utilities.webDriverWait(driver, Delete_Icon);
		driver.findElement(Delete_Icon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Delete_Confirmation);
		String DeleteUser = driver.findElement(Delete_Confirmation).getText();
		System.out.println("*Delete User* " + DeleteUser);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Delete_No);
		driver.findElement(Delete_No).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Active);
		boolean active = driver.findElement(Active).isDisplayed();
		System.out.println("User is in Active status: " + active) ;
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Delete_Icon);
		driver.findElement(Delete_Icon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Delete_Yes);
		driver.findElement(Delete_Yes).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, InActive);
		boolean inactive = driver.findElement(InActive).isDisplayed();
		System.out.println("User is in InActive status: " + inactive) ;
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_edit_icon_to_update_the_data() throws Throwable {
		utilities.webDriverWait(driver, Edit_icon);
		driver.findElement(Edit_icon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, User_Name);
		driver.findElement(User_Name).click();
		driver.findElement(User_Name).clear();
		driver.findElement(User_Name).sendKeys("Arvind122");
		utilities.MediumWait(driver);
		
		
		utilities.webDriverWait(driver, First_Name);
		driver.findElement(First_Name).click();
		driver.findElement(First_Name).clear();
		driver.findElement(First_Name).sendKeys("Aravind");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Last_Name);
		driver.findElement(Last_Name).click();
		driver.findElement(Last_Name).clear();
		driver.findElement(Last_Name).sendKeys("Boya");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Email);
		driver.findElement(Email).click();
		driver.findElement(Email).clear();
		driver.findElement(Email).sendKeys("aravind122@gmail.com");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Mobile_Number);
		driver.findElement(Mobile_Number).click();
		driver.findElement(Mobile_Number).clear();
		driver.findElement(Mobile_Number).sendKeys("9966948533");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		
		
		username = driver.findElement(User_Name).getAttribute("value");
		System.out.println("username: " + username);
		
		
		email = driver.findElement(Email).getAttribute("value");
		System.out.println("Email:  " + email);	

		
		String Mobilenumber = driver.findElement(Mobile_Number).getAttribute("value");
		System.out.println("Mobile Number:" + Mobilenumber);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Column_Filter);
		driver.findElement(Column_Filter).click();
		utilities.MinimumWait(driver);
		driver.findElement(Column_Filter_Element).sendKeys("Arvind122");
		utilities.MinimumWait(driver);
		driver.findElement(Column_Filter_Apply).click();
		utilities.MediumWait(driver);
		
		User_in_grid = driver.findElement(Grid_user_column_data);
		String Username = User_in_grid.getText();
		System.out.println("Displaying username in add form " + username);
		if(username.equals(Username)) {
			System.out.println("Displaying the same user name--  " +  Username);
		}else {
			System.out.println("Displaying the different username-- " + Username);
		}
		
		String email_grid = driver.findElement(Grid_email_column_data).getText();
		System.out.println("Email which is displaying in grid: " +  email_grid);
		if(email_grid.equals(email)) {
			System.out.println("Displaying the same email id which was inserted in add form:  " + email_grid);
		}else {
			System.out.println("Displaying someother email id rather than the inserted:  " + email);
		}
		
		utilities.MaximumWait(driver);
	}

	public void check_the_sorting_functionality_of_grid() throws Throwable {
		
		WebElement table = driver.findElement(SortingByColumns);
		List<WebElement> columnheader = table.findElements(By.xpath("//thead/tr/th/div/p-sorticon"));

		for (WebElement header : columnheader) { 

			header.click();
			utilities.MinimumWait(driver);
			header.click();
			utilities.MinimumWait(driver);
		
	}
		
		utilities.webDriverWait(driver, Next_Page);
		driver.findElement(Next_Page).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Next_Page).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Next_Page).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Previous_Page).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Previous_Page).click();
		utilities.MinimumWait(driver);
		
		 utilities.webDriverWait(driver, Search);
		 driver.findElement(Search).click();
		 driver.findElement(Search).sendKeys("Anilkumar05");
		 utilities.MediumWait(driver);
		 String searchkeyword = driver.findElement(Search).getAttribute("value");
		 System.out.println("searchkeyword:: " + searchkeyword);
		 String Username = driver.findElement(Grid_user_column_data).getText();
		 System.out.println("Username:: " + Username);
		 if(Username.equals(searchkeyword)) {
			 System.out.println("Displaying the same keyword   " + searchkeyword);
		 }else {
			 System.out.println("Not Displaying the same keyword   " + searchkeyword);
		 }
   
    
	}
}
	
	
	
	
	
	
	
	
	
	
	















 
