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
	
	
	
	
	
	
	
}
