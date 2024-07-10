package Stepdefinition1;

import Pages.IPOWiseInOutRptPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class IPOWiseInOutRptStep {
	
	IPOWiseInOutRptPages IOR = new IPOWiseInOutRptPages();
	
	@Then ("^Navigate to IPO Wise In Out Report$")
	public void Navigate_to_IPO_Wise_In_Out_Report() throws Throwable {
		IOR.Navigate_to_IPO_Wise_In_Out_Report();
	}
	@Then ("^Click on the Merchant$")
	public void Click_on_the_Merchant() throws Throwable {
		IOR.Click_on_the_Merchant();
	}
	@And ("^Select the Merchant$")
	public void Select_the_Merchant() throws Throwable {
		IOR.Select_the_Merchant();
	}
	@Then ("Click in the Supplier field {string}")
	public void Click_in_the_Supplier_field(String supplier) throws Throwable {
		IOR.Click_in_the_Supplier_field(supplier);
	}
    @And ("^Select the Supplier$")
    public void Select_the_Supplier() throws Throwable {
    	IOR.Select_the_Supplier();
    }
    @Then ("^Click on Reset$")
    public void Click_on_Reset() throws Throwable {
    	IOR.Click_on_Reset();
    	System.out.println("Entered Filter data is cleared");
    }
    @Given ("^Enter the IPO name in the Search by IPO field$")
    public void Enter_the_IPO_name_in_the_Search_by_IPO_field() throws Throwable {
    	IOR.Enter_the_IPO_name_in_the_Search_by_IPO_field();
    }
    @And ("^Select an IPO in the Menu list$")
    public void Select_an_IPO_in_the_Menu_list() throws Throwable {
    	IOR.Select_an_IPO_in_the_Menu_list();
    }
    @Then ("^Verify the Fabrics displayed in the tabs and print$")
    public void Verify_the_Fabrics_displayed_in_the_tabs_and_print() throws Throwable {
    	IOR.Verify_the_Fabrics_displayed_in_the_tabs_and_print();
    }
    @Then ("^Print the IPO value$")
    public void Print_the_IPO_value() throws Throwable {
    	IOR.Print_the_IPO_value();
    }
    @Then ("^Print the Merchant name for the IPO$")
    public void Print_the_Merchant_name_for_the_IPO() throws Throwable {
    	IOR.Print_the_Merchant_name_for_the_IPO();
    }
    @Then ("^Print the Buyer name for the IPO$")
    public void Print_the_Buyer_name_for_the_IPO() throws Throwable {
    	IOR.Print_the_Buyer_name_for_the_IPO();
    }
    @Then ("^Print the Processes name$")
    public void Print_the_Processes_name() throws Throwable {
    	IOR.Print_the_Processes_name();
    }
    @Then ("^Print the count of the proceses displayed for the Fabric$")
    public void Print_the_count_of_the_proceses_displayed_for_the_Fabric() {
    	IOR.Print_the_count_of_the_proceses_displayed_for_the_Fabric();
    }
    @Then ("^Click on a process and print the data$")
    public void Click_on_a_process_and_print_the_data() {
    	IOR.Click_on_a_process_and_print_the_data();
    }
    @Then ("^Print the Fabric Issued to Merchant grid data$")
    public void Print_the_Fabric_Issued_to_Merchant_grid_data() {
    	IOR.Print_the_Fabric_Issued_to_Merchant_grid_data();
    }
    @Then ("^Print the Fabric Issued to Cutting grid data$")
    public void Print_the_Fabric_Issued_to_Cutting_grid_data() {
    	IOR.Print_the_Fabric_Issued_to_Cutting_grid_data();
    }
    
    
 
}
