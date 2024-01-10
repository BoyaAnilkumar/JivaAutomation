package Page;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.DriverFactory;
import util.Utilities;

public class Statepage extends DriverFactory {

	Utilities utilities = new Utilities();

	
	
	By State = By.xpath("//a[text()='State']");
	By Searchkeyword = By.xpath("//input[@placeholder='Search keyword']");
	By Statename = By.xpath("//span[text()='Andhra Pradesh']");
	By nodatafound 	= By.xpath("//td[text()='No Data Found.']");
	By gridheader = By.xpath("//thead[@class='p-datatable-thead']");
	By Addbutton = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
	By CreateState = By.xpath("//h3[text()='Create State ']");
	By CreateStateElements = By.xpath("//div[@class='main_content_iner overly_inner']");
	By Enterstatename  = By.xpath("//input[@placeholder='Enter State Name ']");
	By Labelstatename = By.xpath("//label[text()='State Name ']");
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
		driver.findElement(Searchkeyword).click();
		utilities.MinimumWait(driver);
		
		WebElement placeholder =  driver.findElement(Searchkeyword);
		String Actualplaceholder = placeholder.getText();
		String Expectedplaceholder = "Search keyword";
		
		if (Expectedplaceholder.equals(Actualplaceholder)) {
			System.out.println("Placeholder is correct "+ Actualplaceholder);
		}else {
			System.out.println("Placeholder is Incorrect ");
		}
	    }		
	

	public void To_verify_whether_Search_is_displaying_the_records_or_not_when_the_user_enters_Invalid_data() throws Throwable {
		
		utilities.webDriverWait(driver, Searchkeyword);
		
		driver.findElement(Searchkeyword).sendKeys("anil");
		utilities.MinimumWait(driver);
		
		
		WebElement Nodata = driver.findElement(nodatafound);
		String actualMessage = Nodata.getText();

        String expectedMessage = "No Data Found.";

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("Text Message is correct "+ actualMessage);
        } else {
            System.out.println("Text Message is Incorrect");
        }
        
        driver.findElement(Searchkeyword).clear();
        utilities.MinimumWait(driver);
		
	}

	public void To_verify_whether_it_is_displaying_the_records_or_not_by_entering_with_the_State_name_Search_criteria() throws Throwable {
		utilities.webDriverWait(driver, Searchkeyword);
		driver.findElement(Searchkeyword).sendKeys("Andhra");
		utilities.MinimumWait(driver);
		
		WebElement StateName = driver.findElement(Statename);
		String ActualStateName = StateName.getText();
		String ExpectedStateName = "Andhra Pradesh";
		if (ExpectedStateName.equals(ActualStateName)) {
			System.out.println("StateName is correct "+ ActualStateName);
		}else {
			System.out.println("StateName is Incorrect ");
		}	
		driver.findElement(Searchkeyword).clear();
		utilities.MediumWait(driver);
	}

	public void To_verify_whether_the_State_Code_Country_IGST_SGST_CGST_Active_and_Action_columns_are_to_be_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, gridheader);
		WebElement header = driver.findElement(gridheader);
		String Actualheaders = header.getText();
		String Expectedheaders = "State, Code, Country, %IGST, %SGST, %CGST, Active, Actions";
		if (Expectedheaders.equals(Actualheaders)) {
			System.out.println("Grid Headers are correct "+ Actualheaders);
		}else {
			System.out.println("Grid Headers are Incorrect ");
		}	
		utilities.MinimumWait(driver);
	}
	
	public void To_verify_whether_the_add_button_is_enable_state_or_not() throws Throwable {
		utilities.webDriverWait(driver, Addbutton);
		WebElement button = driver.findElement(Addbutton);
        assertTrue("Button is not enabled", button.isEnabled());
		
        assertFalse("Button is not disabled", button.isEnabled());
        utilities.MinimumWait(driver);
	}

	public void To_verify_whether_the_user_able_to_view_the_add_button_or_not() throws Throwable {
		utilities.webDriverWait(driver, Addbutton);
		driver.findElement(Addbutton).click();
		utilities.MinimumWait(driver);
		
	}

	
	public void To_verify_whether_the_add_button_is_clickable_or_not() throws Throwable {
		utilities.webDriverWait(driver, CreateState);
		WebElement Cstate = driver.findElement(CreateState);
		String Actualscreen = Cstate.getText();
		String Expectedscreen = "Create State";
		if (Expectedscreen.equals(Actualscreen)) {
			System.out.println("Add button is clickable "+ Actualscreen);
		}else {
			System.out.println("Add button is not clickable ");
		}	
		utilities.MinimumWait(driver);
	
		
	}

	public void To_verify_when_the_user_click_on_the_add_button_the_create_State_form_is_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, CreateState);
		WebElement createState = driver.findElement(CreateState);
		String NavState = createState.getText();
		String Stategrid = "Create State";
		if(Stategrid.equals(NavState)) {
			System.out.println("Navigated to Create State screen "+ NavState);
		}else {
			System.out.println("Not Navigated to Create State screen");
		}
		
	}

	public void To_verify_whether_the_State_name_State_code_Country_code_IGST_SGST_CGST_active_checkbox_cancel_and_Save_buttons() throws Throwable {
		utilities.webDriverWait(driver, CreateStateElements);
		WebElement elements = driver.findElement(CreateStateElements);
		String AddElements = elements.getText();
		System.out.println("Displaying elements in create state screen "+ AddElements);
		
	}

	public void To_verify_whether_the_user_able_to_view_the_State_name_field_or_not() throws Throwable {
		utilities.webDriverWait(driver, Labelstatename);
		WebElement statename = driver.findElement(Labelstatename);
		String state = statename.getText();
		String displaystate = "State Name *";
		if(displaystate.equals(state)) {
			System.out.println("displaying the state name field "+ state);
		}else {
			System.out.println("State name field is not displaying");
		}
		utilities.MinimumWait(driver);
		driver.findElement(Enterstatename).sendKeys("Goa");
		utilities.MinimumWait(driver);
		
	}

	public void To_verify_whether_the_entered_data_is_properly_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Enterstatename);
		WebElement statename = driver.findElement(Enterstatename);
		String vstate = statename.getText();
		String staten = "Goa";
		
		if(vstate.equals(staten)) {
			System.out.println("State name is displaying "+ vstate);
		}else {
			System.out.println("State name is not displaying");
		}
		utilities.MinimumWait(driver);
		
	}

	public void To_verify_whether_the_user_able_to_view_the_State_Code_field_or_not() {
		
		
	}

	public void To_verify_whether_the_user_able_to_enter_the_data_in_state_code_text_field_or_not() {
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
