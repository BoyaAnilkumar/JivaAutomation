package Stepdefinition1;

import org.openqa.selenium.WebDriver;
import Page.PDOrders_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PDOrders_Steps {

	WebDriver driver;
	
	PDOrders_page PDOrderspage = new PDOrders_page();
	
	@Given("^Login with Senior PD merchant credentials in Login page$")
	public void Login_with_Senior_PD_merchant_credentials_in_Login_page() throws Throwable {
		PDOrderspage.Login_with_Senior_PD_merchant_credentials_in_Login_page();
	}
	
	@Then("^Click on Woven$")
	public void Click_on_woven() throws Throwable {
		PDOrderspage.Click_on_woven();
	}
	
	@And("^Click on PD Module to view the menu in PD Module$")
	public void Click_on_PD_Module_to_view_the_menu_in_PD_Module() throws Throwable {
		PDOrderspage.Click_on_PD_Module_to_view_the_menu_in_PD_Module();
	}
	
	@Then("^Select the PD Orders from the menu of PD Module$")
	public void Select_the_PD_Orders_from_the_menu_of_PD_Module() throws Throwable {
		PDOrderspage.Select_the_PD_Orders_from_the_menu_of_PD_Module();
	}
	
	@And("^Click on Add button$")
	public void Click_on_Add_button() throws Throwable {
		PDOrderspage.Click_on_Add_button();
	}
	
	@And("^Enter Sr PD Merchant$")
	public void Enter_Sr_PD_Merchant() throws Throwable {
		PDOrderspage.Enter_Sr_PD_Merchant();
	}
	
	@And("^Select Buyer from the dropdown list$")
	public void Select_Buyer_from_the_dropdown_list() throws Throwable {
		PDOrderspage.Select_Buyer_from_the_dropdown_list();
	}
	
	@And("^Select Month and Year from calendar$")
	public void Select_Month_and_Year_from_calendar() throws Throwable{
		PDOrderspage.Select_Month_and_Year_from_calendar();
	}
	
	@And("^Enter Expected Order Qty$")
	public void Enter_Expected_Order_Qty() throws Throwable {
		PDOrderspage.Enter_Expected_Order_Qty();
		
	}
//	 @Then("I should see the maxlength of the textfield is {int}")
//	    public void iShouldSeeMaxlengthOfTextField(int expectedMaxlength) {
//		 
//	        WebElement textField = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")); // Replace with the actual ID of your textfield
//	        String maxlengthValue = textField.getAttribute("maxlength");
//
//	        if (maxlengthValue != null) {
//	            int actualMaxlength = Integer.parseInt(maxlengthValue);
//	            assertEquals(expectedMaxlength, actualMaxlength);
//	        } else {
//	            // Handle the case where maxlength attribute is not present
//	            throw new AssertionError("The 'maxlength' attribute is not present for the textfield");
//	        }
//	    }
	 
	@And("^Enter Appr Per Pcs cost$")
	public void Enter_Appr_Per_Pcs_cost() throws Throwable {
		PDOrderspage.Enter_Appr_Per_Pcs_cost();
		
	}
	
	@And("^Enter Exchange Rate$")
	public void Enter_Exchange_Rate() throws Throwable {
		PDOrderspage.Enter_Exchange_Rate();
		
	}
	
	@And("^verify the Total Cost in INR$")
	public void verify_the_Total_Cost_in_INR() throws Throwable {
		PDOrderspage.verify_the_Total_Cost_in_INR();
		
	}
	
	@And("^verify the Total cost in Currency$")
	public void verify_the_Total_cost_in_Currency() throws Throwable {
		PDOrderspage.verify_the_Total_cost_in_Currency();
		
	}
	
	@Then("^click on save button to save the expected pd order$")
	public void click_on_save_button_to_save_the_expected_pd_order() throws Throwable {
		PDOrderspage.click_on_save_button_to_save_the_expected_pd_order();
		
	}
	
	//updatePDOrders
	
	@Given("^Click on Edit icon$")
	public void Click_on_Edit_icon() throws Throwable {
		PDOrderspage.Click_on_Edit_icon();
		
	}
	
	@And("^Verify whether the page is navigating to the update PD orders or not$")
	public void Verify_whether_the_page_is_navigating_to_the_update_PD_orders_or_not() {
		PDOrderspage.Verify_whether_the_page_is_navigating_to_the_update_PD_orders_or_not();
		
	}
	
	@Then("^Change the Buyer by clicking on buyer dropdown field$")
	public void Change_the_Buyer_by_clicking_on_buyer_dropdown_field() throws Throwable {
		PDOrderspage.Change_the_Buyer_by_clicking_on_buyer_dropdown_field();
		
	}
	
	@And("^Change Month and Year from calendar$")
	public void Change_Month_and_Year_from_calendar() throws Throwable {
		PDOrderspage.Change_Month_and_Year_from_calendar();
		
	}
	
	@And("^Change expected order qty$")
	public void Change_expected_order_qty() throws Throwable {
		PDOrderspage.Change_expected_order_qty();
		
	}
	
	@And("^Change Appr Per pcs cost$")
	public void Change_Appr_Per_pcs_cost() throws Throwable {
		PDOrderspage.Change_Appr_Per_pcs_cost();
		
	}
	
	@And("^Change exchange rate$")
	public void Change_exchange_rate() throws Throwable {
		PDOrderspage.Change_exchange_rate();
		
	}
	
	@And("^Click on Checkbox to inactive the PD order$")
	public void Click_on_Checkbox_to_inactive_the_PD_order() throws Throwable {
		PDOrderspage.Click_on_Checkbox_to_inactive_the_PD_order();
		
	}
	
	@Then("^click on save button$")
	public void click_on_save_button() throws Throwable {
		PDOrderspage.click_on_save_button();
		
	}
	
	@And("^Enter Keywords to search in Search filter$")
	public void Enter_Keywords_to_search_in_Search_filter() throws Throwable {
		PDOrderspage.Enter_Keywords_to_search_in_Search_filter();
		
	}
	
	@And("^Click on Sort icon to verify that sorting is working as per the requirement$")
	public void Click_on_Sort_icon_to_verify_that_sorting_is_working_as_per_the_requirement() throws Throwable {
		PDOrderspage.Click_on_Sort_icon_to_verify_that_sorting_is_working_as_per_the_requirement();
		
	}
	
	@And("^Click on next page in the table grid$")
	public void Click_on_next_page_in_the_table_grid() throws Throwable {
		PDOrderspage.Click_on_next_page_in_the_table_grid();
		
	}
	
	@And("^Delete the PD Order in table grid$")
	public void Delete_the_PD_Order_in_table_grid() throws Throwable {
		PDOrderspage.Delete_the_PD_Order_in_table_grid();
	}
	
}
