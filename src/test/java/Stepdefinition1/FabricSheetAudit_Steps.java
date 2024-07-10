package Stepdefinition1;

import Pages.Fabricsheetaudit_Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FabricSheetAudit_Steps {
	
	Fabricsheetaudit_Pages Fabricsheetaudit_Pages = new Fabricsheetaudit_Pages();
	
	@Then ("^Click on the Fabric Sheet Audit under the Audit module$")
	 public void Click_on_the_Fabric_Sheet_Audit_under_the_Audit_module() throws Throwable{
		Fabricsheetaudit_Pages.Click_on_the_Fabric_Sheet_Audit_under_the_Audit_module();
	}
	@And ("^Select the IPO in IPO list$")
	public void Select_the_IPO_in_IPO_list() throws Throwable{
		Fabricsheetaudit_Pages.Select_the_IPO_in_IPO_list();
	}
	 @And ("^Search The IPO$")
	 public void Search_The_IPO() throws Throwable{
	 Fabricsheetaudit_Pages.Search_The_IPO();
   }
	@And ("^Select the Status in the Status dropdown list$")
	public void Select_the_Status_in_the_Status_dropdown_list() throws Throwable{
		Fabricsheetaudit_Pages.Select_the_Status_in_the_Status_dropdown_list();
	}
	@And ("^Verify the Last Edited Date is displaying or not$")
	 public void Verify_the_Last_Edited_Date_is_displaying_or_not() throws Throwable{
	 Fabricsheetaudit_Pages.Verify_the_Last_Edited_Date_is_displaying_or_not();
	}
	 @And ("^Verify the Approved Date is displaying or not$")
	 public void Verify_the_Approved_Date_is_displaying_or_not() throws Throwable{
	 Fabricsheetaudit_Pages.Verify_the_Approved_Date_is_displaying_or_not();
	}
	 @And ("^Click on the Costing budget Expansion$")
	 public void Click_on_the_Costing_budget_Expansion() throws Throwable{
	 Fabricsheetaudit_Pages.Click_on_the_Costing_budget_Expansion();
   }
	 @And ("^Verify the Costing budget expansion grid header section is diplsyiang or not$")
	 public void Verify_the_Costing_budget_expansion_grid_header_section_is_diplsyiang_or_not() throws Throwable{
	 Fabricsheetaudit_Pages.Verify_the_Costing_budget_expansion_grid_header_section_is_diplsyiang_or_not();
}
	 @And ("^Click on the Production budget Expansion$")
	 public void Click_on_the_Production_budget_Expansion() throws Throwable{
	 Fabricsheetaudit_Pages.Click_on_the_Production_budget_Expansion();
   }
	 @And ("^Verify the Production budget expansion grid header section is diplsyiang or not$")
	 public void Verify_the_Production_budget_expansion_grid_header_section_is_diplsyiang_or_not() throws Throwable{
	 Fabricsheetaudit_Pages.Verify_the_Production_budget_expansion_grid_header_section_is_diplsyiang_or_not();
   }
	
	 @And ("^Click on the Reject button$")
	 public void Click_on_the_Reject_button() throws Throwable{
	 Fabricsheetaudit_Pages.Click_on_the_Reject_button();
   }
     @And ("^Click on the Approve button$")
	 public void Click_on_the_Approve_button() throws Throwable{
	 Fabricsheetaudit_Pages.Click_on_the_Approve_button();
     }
     @Given ("^Enter the data in Reason field$")
	 public void Enter_the_data_in_Reason_field() throws Throwable{
	 Fabricsheetaudit_Pages.Enter_the_data_in_Reason_field();
     }
    
  
}