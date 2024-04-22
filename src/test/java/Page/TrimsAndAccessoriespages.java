package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class TrimsAndAccessoriespages extends DriverFactory {

	Utilities utilities = new Utilities();
	String category;
	String name_trim;
	String UOM_trim;
	
	
	By Trims_And_Accessories = By.xpath("//a[text()='Trims & Accessories']");
	By Add_Button = By.xpath("//button[text()=' Add']");
	By Category = By.xpath("//select[@formcontrolname='trimCategoryId']");
	By Select_Category = By.xpath("//option[text()=' Job Work']");
	By Name_Trim = By.xpath("//input[@formcontrolname='itemName']");
	By UOM_Trim = By.xpath("//select[@formcontrolname='uom']");
	By Select_UOM = By.xpath("//select[@formcontrolname='uom']/.//option[text()=' Meters']");
	By Grid_Column_Category = By.xpath("//table//tbody[@class='p-element p-datatable-tbody']/tr[@class='ng-star-inserted']/td[1]");
	By Grid_column_Name = By.xpath("//table//tbody[@class='p-element p-datatable-tbody']/tr[@class='ng-star-inserted']/td[2]");
	By Grid_column_UOM = By.xpath("//table//tbody[@class='p-element p-datatable-tbody']/tr[@class='ng-star-inserted']/td[3]");
	By Column_Name_Filter = By.xpath("(//tr/th/div/p-columnfilter)[2]");
	By Column_Name_Filter_Element = By.xpath("//p-columnfilterformelement/input[@class='p-inputtext p-component p-element ng-star-inserted']");
	By Column_Name_Filter_Apply = By.xpath("//div/button/span[text()='Apply']");
	By Column_Name_Filter_Clear = By.xpath("//div/button/span[text()='Clear']");
	By No_Data_Found = By.xpath("//td[text()='No Data Found.']");
	By SortingByColumns = By.xpath("//thead/tr/th/div/p-sorticon");
	By cateogry_validate = By.xpath("//div[@data-validate='Please Select Category']");
	By Name_validate = By.xpath("//div[@data-validate='Name is required']");
	By UOM_validate = By.xpath("//div[@data-validate='UOM is required']");
	By Active = By.xpath("//tbody/tr/td/div/i[@title='Active']");
	By InActive = By.xpath("//tbody/tr/td/div/i[@title='InActive']");
	By Delete_Icon = By.xpath("//tbody/tr/td/button[@title='Delete']");
	By Delete_Confirmation = By.xpath("//h2[text()='Are you sure you want to Deactivate?']");
	By Delete_Yes = By.xpath("//div[@class='swal2-actions']/.//button[text()='Yes']");
	By Delete_No = By.xpath("//div[@class='swal2-actions']/.//button[text()='No'][2]");
	By cancel_trims = By.xpath("//button[text()=' Cancel']");
	By Edit_trims = By.xpath("//button[@title='Edit']");
	By checkbox_isactive = By.xpath("//input[@formcontrolname='isActive']");
	By update_trims = By.xpath("//button[@type='submit']");
	
	
	
	
	
	
	public void Click_on_Trims_and_Accessories_screen() throws Throwable {
		utilities.webDriverWait(driver, Trims_And_Accessories);
		driver.findElement(Trims_And_Accessories).click();
		utilities.MinimumWait(driver);
		
	}



	public void Click_on_Add_button_in_Trims_and_Accessories_Screen() throws Throwable {
		utilities.webDriverWait(driver, Add_Button);
		driver.findElement(Add_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Category_dropdown_and_select_the_option() throws Throwable {
		utilities.webDriverWait(driver, Category);
		driver.findElement(Category).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Select_Category);
		driver.findElement(Select_Category).click();
		Thread.sleep(2000);
		category = driver.findElement(Select_Category).getText();
		System.out.println();
		System.out.println("Trims and Accessories Category:  " + category);
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_Name() throws Throwable {
		utilities.webDriverWait(driver, Name_Trim);
		driver.findElement(Name_Trim).click();
		Thread.sleep(2000);
				driver.findElement(Name_Trim).sendKeys("Netplay Buttons3");
				Thread.sleep(2000);
				name_trim = driver.findElement(Name_Trim).getAttribute("value");
				System.out.println();
				System.out.println("Trim and Accessories Name:   " +  name_trim);
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_UOM_from_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, UOM_Trim);
		driver.findElement(UOM_Trim).click();
		Thread.sleep(2500);
		driver.findElement(Select_UOM).click();
		Thread.sleep(2500);
		UOM_trim = driver.findElement(UOM_Trim).getText();
		System.out.println();
		System.out.println("Trims and Accessories UOM:  " + UOM_trim);
		utilities.MinimumWait(driver);
		
	}

	public void Search_with_keyword_in_search_field_to_validate_the_created_Trims_and_Accessories() throws Throwable {
		utilities.webDriverWait(driver, Grid_column_Name);
		String Name = driver.findElement(Grid_column_Name).getText();
		driver.findElement(Column_Name_Filter).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Column_Name_Filter_Element).sendKeys("CIS");
		utilities.MinimumWait(driver);
		
		driver.findElement(Column_Name_Filter_Apply).click();
		utilities.MinimumWait(driver);
		
		
		String NoDataFound = driver.findElement(No_Data_Found).getText();
		System.out.println("dislpaying the Trim & Accessories name in the grid: " + Name);
		System.out.println();
		if(Name.equals(name_trim)) {
			System.out.println("displaying the Trim & Accessories name as the user filtered:  " + Name);
			System.out.println();
		}else {
			System.out.println("Search data is not available in the :  " + NoDataFound);
			System.out.println();
		}
		
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Grid_column_Name);
		
		driver.findElement(Column_Name_Filter).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(Column_Name_Filter_Clear).click();
		utilities.MediumWait(driver);
		
		driver.findElement(Column_Name_Filter_Element).sendKeys("Netplay Buttons3");
		utilities.MinimumWait(driver);
		
		driver.findElement(Column_Name_Filter_Apply).click();
		utilities.MinimumWait(driver);
		
		String Grid_Name = driver.findElement(Grid_column_Name).getText();
		
		System.out.println("dislpaying the Trim & Accessories name in the grid: " + Grid_Name);
		System.out.println();
		System.out.println();
		if(name_trim.equals(Grid_Name)) {
			System.out.println("displaying the Trim & Accessories name as the user filtered:  " + Grid_Name);
			System.out.println();
		}else {
			System.out.println("Search data is not available in the :  " + NoDataFound);
		}
		
	}



	public void verify_the_validation_text_for_the_mandatory_fields_in_Trims_and_Accessories() throws Throwable {
		utilities.webDriverWait(driver, cateogry_validate);
		WebElement Category_Message = driver.findElement(cateogry_validate);
		String validationmsg = Category_Message.getAttribute("data-validate");
		System.out.println();
		System.out.println("Validation msg for category is:  " + validationmsg);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Name_validate);
		WebElement Name_Message = driver.findElement(Name_validate);
		String Namevalidation = Name_Message.getAttribute("data-validate");
		System.out.println();
		System.out.println("Validation msg for Name is:  " + Namevalidation);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, UOM_validate);
		WebElement UOM_Message = driver.findElement(UOM_validate);
		String UOMValidation = UOM_Message.getAttribute("data-validate");
		System.out.println();
		System.out.println("Validation msg for UOM is:  " + UOMValidation);
		
		utilities.webDriverWait(driver, cancel_trims);
		driver.findElement(cancel_trims).click();
		utilities.MinimumWait(driver);
		
		
	}



	public void click_on_delete_and_check_the_delete_functionality() throws Throwable {
		utilities.webDriverWait(driver, Column_Name_Filter);
		driver.findElement(Column_Name_Filter).click();
		Thread.sleep(2000);
		driver.findElement(Column_Name_Filter_Element).sendKeys("Netplay Buttons3");
		Thread.sleep(2000);
		driver.findElement(Column_Name_Filter_Apply).click();
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Active);
		boolean active = driver.findElement(Active).isDisplayed();
		System.out.println("User is in Active status: " + active) ;
		System.out.println();
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, Delete_Icon);
		driver.findElement(Delete_Icon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Delete_Confirmation);
		String DeleteUser = driver.findElement(Delete_Confirmation).getText();
		System.out.println("*Delete User* " + DeleteUser);
		System.out.println();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Delete_No);
		driver.findElement(Delete_No).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Active);
		boolean active1 = driver.findElement(Active).isDisplayed();
		System.out.println("User is in Active status: " + active1) ;
		System.out.println();
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
		System.out.println();
		utilities.MinimumWait(driver);
		
	}



	public void Click_on_edit_icon_to_update_the_Trim_and_Accessories() throws Throwable {
		utilities.webDriverWait(driver, Column_Name_Filter);
		driver.findElement(Column_Name_Filter).click();
		Thread.sleep(2000);
		driver.findElement(Column_Name_Filter_Element).sendKeys("Netplay Buttons3");
		Thread.sleep(2000);
		driver.findElement(Column_Name_Filter_Apply).click();
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Edit_trims);
		driver.findElement(Edit_trims).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, checkbox_isactive);
		driver.findElement(checkbox_isactive).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, update_trims);
		driver.findElement(update_trims).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Column_Name_Filter);
		driver.findElement(Column_Name_Filter).click();
		Thread.sleep(2000);
		driver.findElement(Column_Name_Filter_Element).sendKeys("Netplay Buttons3");
		Thread.sleep(2000);
		driver.findElement(Column_Name_Filter_Apply).click();
		Thread.sleep(2000);
		
		utilities.webDriverWait(driver, Active);
		boolean active = driver.findElement(Active).isDisplayed();
		System.out.println("User is in Active status: " + active) ;
		System.out.println();
		System.out.println("Trims and Accessories are updated successfully");
		System.out.println();
		utilities.MinimumWait(driver);
		
		
	}
	
	
}
