package Page;

import org.openqa.selenium.By;

import util.DriverFactory;
import util.Utilities;

public class Statepage extends DriverFactory {

	Utilities utilities = new Utilities();
	
	By State = By.xpath("//a[@href='/JivaDesign_Test/Web/state']");
	By Searchkeyword = By.xpath("//input[@placeholder='Search keyword']");
	By Stateheader = By.xpath("//div[text()=' State ']");
	By Codeheader = By.xpath("//div[text()=' Code ']");
	By Countryheader = By.xpath("//div[text()=' Country ']");
	By igstheader = By.xpath("//div[text()=' % IGST ']");
	By sgstheader = By.xpath("//div[text()=' % SGST ']");
	By cgstheader = By.xpath("//div[text()=' % CGST ']");
	By Activeheader = By.xpath("//div[text()=' Active ']");
	By Addbutton = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
	By Enterstatename  = By.xpath("//input[@placeholder='Enter State Name ']");
	By Enterstatecode  = By.xpath("//input[@placeholder='Enter State Code']");
	By CountryName = By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-invalid']");
	By EnterIGST = By.xpath("//input[@placeholder='Enter % IGST']");
	By EnterSGST = By.xpath("//input[@placeholder='Enter % SGST']");
	By EnterCGST = By.xpath("//input[@placeholder='Enter % CGST']");
	By activecheckbox = By.xpath("//input[@id='flexCheckDefault']");
	By Savebutton = By.xpath("//button[@class='btn btn-md btn-primary px-5 ng-star-inserted']");
	
	

	public void Click_on_the_State_screen() throws Throwable {
		utilities.webDriverWait(driver, State);
		driver.findElement(State).click();
		utilities.MinimumWait(driver);
	}

	public void To_verify_whether_Search_is_holding_the_placeholder_or_not() throws Throwable {
		utilities.webDriverWait(driver, Searchkeyword);
		driver.findElement(Searchkeyword).isDisplayed();
		
		
	}

	public void To_verify_whether_Search_is_displaying_the_records_or_not_when_the_user_enters_Invalid_data() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_it_is_displaying_the_records_or_not_by_entering_with_the_State_name_Search_criteria() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_it_is_displaying_the_records_or_not_by_entering_with_the_State_Search_criteria() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_State_Code_Country_IGST_SGST_CGST_Active_and_Action_columns_are_to_be_displayed_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_user_able_to_view_the_add_button_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_add_button_is_enable_state_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_add_button_is_clickable_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_when_the_user_click_on_the_add_button_the_create_State_form_is_displaying_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_State_name_State_code_Country_code_IGST_SGST_CGST_active_checkbox_cancel_and_Save_buttons() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_user_able_to_view_the_State_name_field_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_entered_data_is_properly_displayed_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_user_able_to_view_the_State_Code_field_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_user_able_to_view_the_Country_name_field_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_Country_names_are_retrieved_from_the_Country_name_screen_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_user_able_to_view_the_IGST_field_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_IGST_field_is_enable_state_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_IGST_field_is_text_box_field_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_entered_data_is_properly_displayed_in_IGST_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_user_able_to_view_the_SGST_field_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_SGST_field_is_enable_state_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_SGST_field_is_text_box_field_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_entered_data_is_properly_displayed_in_SGST_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_user_able_to_view_the_CGST_field_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_CGST_field_is_enable_state_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_CGST_field_is_text_box_field_or_not() {
		// TODO Auto-generated method stub
		
	}
	
	public void To_verify_whether_the_CGST_field_is_mandatory_field_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_entered_data_is_properly_displayed_in_CGST_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_user_able_to_view_the_save_button_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_whether_the_save_button_is_enable_state_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void To_verify_when_the_user_click_on_the_save_button_the_State_saved_successfully_msg_is_displaying_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void Verify_that_user_able_to_view_the_Save_Record_in_grid() {
		// TODO Auto-generated method stub
		
	}

	


}
