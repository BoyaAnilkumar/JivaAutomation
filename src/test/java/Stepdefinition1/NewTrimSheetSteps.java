package Stepdefinition1;



import Page.NewTrimSheetPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewTrimSheetSteps {
	
	NewTrimSheetPages NTS = new NewTrimSheetPages();
	
	@Then ("^Navigate to New Trim Sheet screen$")
	public void Navigate_to_New_Trim_Sheet_screen() throws Throwable {
		NTS.Navigate_to_New_Trim_Sheet_screen();
	}
	@Then ("Select a Buyer in the filter window {string}")
	public void Select_a_Buyer_in_the_filter_window(String BuyerName) throws Throwable {
		NTS.Select_a_Buyer_in_the_filter_window(BuyerName);
	}
	@Then ("^Select a Season in the filter window$")
	public void Select_a_Season_in_the_filter_window() throws Throwable {
		NTS.Select_a_Season_in_the_filter_window();
	}
	@Given ("Enter an IPO name in the Search by IPO field {string}")
	public void Enter_an_IPO_name_in_the_Search_by_IPO_field(String IPOname) throws Throwable {
		NTS.Enter_an_IPO_name_in_the_Search_by_IPO_field(IPOname);
	}
	@Then ("^Select an IPO$")
	public void Select_an_IPO() throws Throwable {
		NTS.Select_an_IPO();
	}
	@When ("^Click on the Add New Trim Item button$")
	public void Click_on_the_Add_New_Trim_Item_button() throws Throwable {
		NTS.Click_on_the_Add_New_Trim_Item_button();
	}
	@Then ("^Verify whether navigated to the Add New Trim Sheet form$")
	public void Verify_whether_navigated_to_the_Add_New_Trim_Sheet_form() throws Throwable {
		NTS.Verify_whether_navigated_to_the_Add_New_Trim_Sheet_form();
	}
	@Then ("Select a Team{string}from{string}")
	public void Select_a_Team(String Owner, String TrimOwner) throws Throwable{
		NTS.Select_a_Team(Owner, TrimOwner);
	}
	@Then ("Select a Category{string} in the Category field")
	public void Select_a_Category_in_the_Category_field(String Category) throws Throwable {
		NTS.Select_a_Category_in_the_Category_field(Category);
	}
	@Then ("Select an Item{string} in the Item field")
	public void Select_an_Item_in_the_Item_field(String Item) throws Throwable {
		NTS.Select_an_Item_in_the_Item_field(Item);
	}
	@Then ("Select a Color{string} in the Color field")
	public void Select_a_Color_in_the_Color_field(String Color) throws Throwable {
		NTS.Select_a_Color_in_the_Color_field(Color);
	}
	@Then ("^Select a Combination in the Combination field$")
	public void Select_a_Combination_in_the_Combination_field() throws Throwable {
		NTS.Select_a_Combination_in_the_Combination_field();
		
	}
	@Then ("^Select Trim Type$")
	public void Select_Trim_Type() throws Throwable {
		NTS.Select_Trim_Type();
	}
	@Given ("Enter Average{string}")
	public void Enter_Average(String Avg) throws Throwable {
		NTS.Enter_Average(Avg);
	}
	@Given ("^Print the Total Required value$")
	public void Print_the_Total_Required_value() throws Throwable {
		NTS.Print_the_Total_Required_value();
	}
	@Given ("Enter Wastage{string}")
	public void Enter_Wastage(String Wastage) throws Throwable {
		NTS.Enter_Wastage(Wastage);
	}
	@Given ("^Print the Total value$")
	public void Print_the_Total_value() throws Throwable {
		NTS.Print_the_Total_value();
	}
	@Then ("^Verify whether the page is navigated to the New Trim Sheet$")
	public void Verify_whether_the_page_is_navigated_to_the_New_Trim_Sheet() throws Throwable {
		NTS.Verify_whether_the_page_is_navigated_to_the_New_Trim_Sheet();
	}
	@And ("^Click on the Partial Save button$")
	public void Click_on_the_Partial_Save_button() throws Throwable {
		NTS.Click_on_the_Partial_Save_button();
	}
	@Then ("^Verify the partial save msg$")
	public void Verify_the_partial_save_msg() throws Throwable {
		NTS.Verify_the_partial_save_msg();
	}
	@Given ("Enter Bulk Trim Deadline{string}")
	public void Enter_Bulk_Trim_Deadline(String BulkTrimDeadline) throws Throwable {
		NTS.Enter_Bulk_Trim_Deadline(BulkTrimDeadline);
	}
	@Then ("^Select Trim Manager$")
	public void Select_Trim_Manager() throws Throwable {
		NTS.Select_Trim_Manager();
	}
	@And ("^Verify and print the Mandatory validation msg$")
	public void Verify_and_print_the_Mandatory_validation_msg() throws Throwable {
		NTS.Verify_and_print_the_Mandatory_validation_msg();
	}
	@Then ("^Click on the Submit to Trim Team button$")
	public void Click_on_the_Submit_to_Trim_Team_button() throws Throwable {
		NTS.Click_on_the_Submit_to_Trim_Team_button();
	}
	@And ("^Verify and print the Successful submit msg$")
	public void Verify_and_print_the_Successful_submit_msg() {
		NTS.Verify_and_print_the_Successful_submit_msg();
	}
	@Then ("^Verify and Print the IPO name$")
	public void Verify_and_Print_the_IPO_name() throws Throwable {
		NTS.Verify_and_Print_the_IPO_name();
	}
	@Then ("^Verify and Print the Buyer name$")
	public void Verify_and_Print_the_Buyer_name() throws Throwable {
		NTS.Verify_and_Print_the_Buyer_name();
	}
	@Then ("^Verify and Print the Buyer Style name$")
	public void Verify_and_Print_the_Buyer_Style_name() throws Throwable {
		NTS.Verify_and_Print_the_Buyer_Style_name();
	}
	@Then ("^Verify and Print the PO Qty$")
	public void Verify_and_Print_the_PO_Qty() throws Throwable {
		NTS.Verify_and_Print_the_PO_Qty();
	}
	@Then ("^Verify and Print the IPO Qty$")
	public void Verify_and_Print_the_IPO_Qty() throws Throwable {
		NTS.Verify_and_Print_the_IPO_Qty();
	}
	@Then ("^Verify and Print the Date Submitted$")
	public void Verify_and_Print_the_Date_Submitted() throws Throwable {
		NTS.Verify_and_Print_the_Date_Submitted();
	}
	@When ("^Click on the Delete button for an added record$")
	public void Click_on_the_Delete_button_for_an_added_record() throws Throwable {
		NTS.Click_on_the_Delete_button_for_an_added_record();
	}
	@Then ("^Verify the delete popup window and print$")
	public void Verify_the_delete_popup_window_and_print() throws Throwable {
		NTS.Verify_the_delete_popup_window_and_print();
	}
	@Then ("^Click on No option$")
	public void Click_on_No_option() throws Throwable {
		NTS.Click_on_No_option();
	}
	@Then ("^Click on Yes option$")
	public void Click_on_Yes_option() throws Throwable {
		NTS.Click_on_Yes_option();
	}
	@Then ("^Click on the Edit button for the added trim record$")
	public void Click_on_the_Edit_button_for_the_added_trim_record() throws Throwable {
		NTS.Click_on_the_Edit_button_for_the_added_trim_record();
	}
	@Then ("^Verify whether navigated to Update Trim Sheet form$")
	public void Verify_whether_navigated_to_Update_Trim_Sheet_form() throws Throwable {
		NTS.Verify_whether_navigated_to_Update_Trim_Sheet_form();
	}
	@Then ("Edit the Color field{string}")
	public void Edit_the_Color_field(String EColor) throws Throwable {
		NTS.Edit_the_Color_field(EColor);
	}
	@When ("^Click on Cancel button in Trim Sheet$")
	public void Click_on_Cancel_button_in_Trim_Sheet() throws Throwable {
		NTS.Click_on_Cancel_button_in_Trim_Sheet();
	}
	  

}
