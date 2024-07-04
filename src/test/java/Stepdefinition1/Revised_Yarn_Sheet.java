package Stepdefinition1;

import Page.Revised_Yarn_Sheet_Page;
import io.cucumber.java.en.And;

public class Revised_Yarn_Sheet {
	Revised_Yarn_Sheet_Page RevisedYarnSheet = new Revised_Yarn_Sheet_Page();
	
	
	@And ("^Click on the Revised Yarn Sheet Screen$")
	public void Click_on_the_Revised_Yarn_Sheet_Screen() throws Throwable {
		RevisedYarnSheet.Click_on_the_Revised_Yarn_Sheet_Screen();
	}
	@And ("Select the {string} in the Filter option page")
	public void Select_the_in_the_Filter_option_page(String Status)throws Throwable {
	RevisedYarnSheet.Select_the_in_the_Filter_option_page(Status);
   }
	@And ("^Click on the Filter Slash$")
	public void Click_on_the_Filter_Slash() throws Throwable {
		RevisedYarnSheet.Click_on_the_Filter_Slash();
	}
	@And ("Validate whether the Selected IPO {string} is displayed in the IPO list or not")
	public void Validate_whether_the_Selected_IPO_is_displayed_in_the_IPO_list_or_not(String StyleIPO) throws Throwable {
		RevisedYarnSheet.Validate_whether_the_Selected_IPO_is_displayed_in_the_IPO_list_or_not(StyleIPO);
	}
	@And ("^Click on the Revised Yarn Sheet Screen under the Generate Yarn Sheet dropdown$")
	 public void Click_on_the_Revised_Yarn_Sheet_Screen_under_the_Generate_Yarn_Sheet_dropdown() throws Throwable {
		RevisedYarnSheet.Click_on_the_Revised_Yarn_Sheet_Screen_under_the_Generate_Yarn_Sheet_dropdown(); 
	 }
	@And ("^Click on the Save button in the Revised Yarn Sheet$")
	public void Click_on_the_Save_button_in_the_Revised_Yarn_Sheet() throws Throwable {
		RevisedYarnSheet.Click_on_the_Save_button_in_the_Revised_Yarn_Sheet();
	}
	
	@And("Enter Reason for Revision {string}")
	public void Enter_Reason_for_Revision_(String reasonforrevision) throws Throwable {
		RevisedYarnSheet.Enter_Reason_for_Revision_(reasonforrevision);
	}
	
	@And("^Enter Upcharge Amount info$")
	public void Enter_Upcharge_Amount_info() throws Throwable {
		RevisedYarnSheet.Enter_Upcharge_Amount_info();
	}
	
	
	
}
