package Stepdefinition1;

import Page.New_Yarn_Sheet_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class New_Yarn_Sheet_Steps {
 New_Yarn_Sheet_Page NewYarnSheet = new New_Yarn_Sheet_Page();
 
 
 @Then ("the User enters {string}, and {string}")
 public void User_enters_the(String username,String password) throws Throwable{
	 NewYarnSheet.User_enters_the(username,password);
 }
 @Then ("^Click on the Merchandising Module$")
 public void Click_on_the_Merchandising_Module() throws Throwable {
	 NewYarnSheet.Click_on_the_Merchandising_Module();
 }
 @And ("^Click on Data Entry dropdown$")
 public void Click_on_Data_Entry_dropdown() throws Throwable {
	 NewYarnSheet.Click_on_Data_Entry_dropdown();
 }
 @Then ("^Click on the Generate Yarn Sheet dropdown$")
 public void Click_on_the_Generate_Yarn_Sheet_dropdown() throws Throwable {
	 NewYarnSheet.Click_on_the_Generate_Yarn_Sheet_dropdown();
 }
 @And ("^Click on the New Yarn Sheet Screen$")
 public void  Click_on_the_New_Yarn_Sheet_Screen() throws Throwable {
	 NewYarnSheet.Click_on_the_New_Yarn_Sheet_Screen();
 }
 @And ("^User click on the Style Expansion$")
 public void  User_click_on_the_Style_Expansion() throws Throwable {
	 NewYarnSheet.User_click_on_the_Style_Expansion();
 }
 @And ("^Click on the Filter Icon in Style Expansion$")
 public void  Click_on_the_Filter_Icon_in_Style_Expansion() throws Throwable {
	 NewYarnSheet.Click_on_the_Filter_Icon_in_Style_Expansion();
 }
 @And ("Select the {string} in Filter option page")
 public void Select_the_in_Filter_option_page(String Buyer) throws Throwable{
	 NewYarnSheet.Select_the_in_Filter_option_page(Buyer);
 }
 @Then ("Select {string} in the Filter option page")
 public void Select_in_the_Filter_option_page(String Season) throws Throwable{
	 NewYarnSheet.Select_in_the_Filter_option_page(Season);
 }
 @And ("Enter the Buyer {string} in Search By Buyer Style Or IPO")
 public void Enter_the_Buyer_in_Search_By_Buyer_Style_Or_IPO(String StyleOrIPO) throws Throwable{
	 NewYarnSheet.Enter_the_Buyer_in_Search_By_Buyer_Style_Or_IPO(StyleOrIPO);
 }
 @And ("^click on the Apply button$")
 public void  click_on_the_Apply_button() throws Throwable {
	 NewYarnSheet.click_on_the_Apply_button();
 }
 @And ("^Select the IPO in the Styles List$")
 public void  Select_the_IPO_in_the_Styles_List() throws Throwable {
	 NewYarnSheet.Select_the_IPO_in_the_Styles_List();
 }
 @Then ("^user enter the Username and password$")
 public void  user_enter_the_Username_and_password() throws Throwable {
	 NewYarnSheet.user_enter_the_Username_and_password();
 }
 @And ("^Click on the Add New Yarn Sheet button$")
 public void  Click_on_the_Add_New_Yarn_Sheet_button() throws Throwable {
	 NewYarnSheet.Click_on_the_Add_New_Yarn_Sheet_button();
 }
 @And ("Select the {string}")
 public void Select_the_(String YarnQuality) throws Throwable{
	 NewYarnSheet.Select_the_(YarnQuality);
 }	
 @And ("Select the content{string}")
 public void Select_the_content(String Content) throws Throwable{
	 NewYarnSheet.Select_the_content(Content);
 }	
 @Then ("Select the Count{string}")
 public void Select_the_Count(String count) throws Throwable{
	 NewYarnSheet.Select_the_Count(count);
 }	
 @And ("Select the yarn use {string}")
 public void Select_the_yarn_use(String Use) throws Throwable{
	 NewYarnSheet.Select_the_yarn_use(Use);
 }	
 @And ("^Select the Supplier internal Code$")
 public void  Select_the_Supplier_internal_Code() throws Throwable {
	 NewYarnSheet.Select_the_Supplier_internal_Code();
 }
 @Given ("^enter the data in Finish Special Requirements$")
 public void  enter_the_data_in_Finish_Special_Requirements() throws Throwable {
	 NewYarnSheet.enter_the_data_in_Finish_Special_Requirements();
 }
 @Then ("Select the Colour{string}")
 public void Select_the_Colour(String Color) throws Throwable{
	 NewYarnSheet.Select_the_Colour(Color);
 }	
 @And ("^Select the Combos in the Applicable Combos field$")
 public void  Select_the_Combos_in_the_Applicable_Combos_field() throws Throwable {
	 NewYarnSheet.Select_the_Combos_in_the_Applicable_Combos_field();
 }
 
 @When ("^User enter the data in Additional information field$")
 public void  User_enter_the_data_in_Additional_information_field() throws Throwable {
	 NewYarnSheet.User_enter_the_data_in_Additional_information_field();
 }
 
 @And ("^Enter the Additional percentage$")
 public void  Enter_the_Additional_percentage() throws Throwable {
	 NewYarnSheet.Enter_the_Additional_percentage();
 }
 
 @And ("^Select the PO Type$")
 public void  Select_the_PO_Type() throws Throwable {
	 NewYarnSheet.Select_the_PO_Type();
 }
 
 @Given ("User enter the {string} Average")
 public void  User_enter_the_Average(String BaseSize) throws Throwable {
	 NewYarnSheet.User_enter_the_Average(BaseSize);
 }
 
 @And ("Enter the data in {string} field")
 public void  Enter_the_data_in_field(String percentage) throws Throwable {
	 NewYarnSheet.Enter_the_data_in_field(percentage);
 }
 @And ("^Check the Size Breakups are prepopulated or not$")
 public void  Check_the_Size_Breakups_are_prepopulated_or_not() throws Throwable {
	 NewYarnSheet.Check_the_Size_Breakups_are_prepopulated_or_not();
 }

 @And ("^Enter the Missy Garment size PO Qty$")
 public void  Enter_the_Missy_Garment_size_PO_Qty() throws Throwable {
	 NewYarnSheet.Enter_the_Missy_Garment_size_PO_Qty();
 }
 @And ("^Enter the Pettite garment size PO Qty$")
 public void Enter_the_Pettite_garment_size_PO_Qty() throws Throwable {
	 NewYarnSheet.Enter_the_Pettite_garment_size_PO_Qty();
 }
 @And ("^Enter the Tall Garment size PO Qty$")
 public void  Enter_the_Tall_Garment_size_PO_Qty() throws Throwable {
	 NewYarnSheet.Enter_the_Tall_Garment_size_PO_Qty();
 }
 @And ("^Enter the Women Garment size PO Qty$")
 public void  Enter_the_Women_Garment_size_PO_Qty() throws Throwable {
	 NewYarnSheet.Enter_the_Women_Garment_size_PO_Qty();
 }
 
 @And ("^Check the IPO Qty is prepopulated or not$")
 public void  Check_the_IPO_Qty_is_prepopulated_or_not() throws Throwable {
	 NewYarnSheet.Check_the_IPO_Qty_is_prepopulated_or_not();
 }
 @Then ("^Check the Avg Values are prepopulated or not$")
 public void  Check_the_Avg_Values_are_prepopulated_or_not() throws Throwable {
	 NewYarnSheet.Check_the_Avg_Values_are_prepopulated_or_not();
 }
 @And ("^Verify the Based on the Garment Size type PO Qty is prepopulated in the PO Qty field or not$")
 public void  Verify_the_Based_on_the_Garment_Size_type_PO_Qty_is_prepopulated_in_the_PO_Qty_field_or_not() throws Throwable {
	 NewYarnSheet.Verify_the_Based_on_the_Garment_Size_type_PO_Qty_is_prepopulated_in_the_PO_Qty_field_or_not();
 }
 @And ("^Verify the Based on the Garment Size type IPO Qty is prepopulated in the PO Qty field or not$")
 public void  Verify_the_Based_on_the_Garment_Size_type_IPO_Qty_is_prepopulated_in_the_PO_Qty_field_or_not() throws Throwable {
	 NewYarnSheet.Verify_the_Based_on_the_Garment_Size_type_IPO_Qty_is_prepopulated_in_the_PO_Qty_field_or_not();
 }
 @And ("^The Knitting Avg field data is prepopulated or not$")
 public void  The_Knitting_Avg_field_data_is_prepopulated_or_not() throws Throwable {
	 NewYarnSheet.The_Knitting_Avg_field_data_is_prepopulated_or_not();
 }
 @When ("User enter the Linking Avg data{string}")
 public void  User_enter_the_Linking_Avg_data(String LinkingAvg) throws Throwable {
	 NewYarnSheet.User_enter_the_Linking_Avg_data(LinkingAvg);
 }
 @And ("Enter the data in the Size set field{string}")
 public void  Enter_the_data_in_th_Size_set_field(String Sizeset) throws Throwable {
	 NewYarnSheet.Enter_the_data_in_th_Size_set_field(Sizeset);
 }
 @When ("User enter the data in the Testing field{string}")
 public void  User_enter_the_data_in_the_Testing_field(String Testing) throws Throwable {
	 NewYarnSheet.User_enter_the_data_in_the_Testing_field(Testing);
 }
 @And ("User enter the data in the Sealer field{string}")
 public void  User_enter_the_data_in_the_Sealer_field(String Sealer) throws Throwable {
	 NewYarnSheet.User_enter_the_data_in_the_Sealer_field(Sealer);
 }
 @And ("User enter the data in the TOP field{string}")
 public void  User_enter_the_data_in_the_TOP_field(String TOP) throws Throwable {
	 NewYarnSheet.User_enter_the_data_in_the_TOP_field(TOP);
 }
 @Given ("User enter the data in the ShipmentPlatform Sample{string}")
 public void  User_enter_the_data_in_the_ShipmentPlatform_Sample(String Shipment) throws Throwable {
	 NewYarnSheet.User_enter_the_data_in_the_ShipmentPlatform_Sample(Shipment);
 }
 @Given ("User enter the data in the Photoshoot Meeting Sample{string}")
 public void  User_enter_the_data_in_the_Photoshoot_Meeting_Sample(String Photoshoot) throws Throwable {
	 NewYarnSheet.User_enter_the_data_in_the_Photoshoot_Meeting_Sample(Photoshoot);
 }
 @And ("^The User Select the Garment Average UOM$")
 public void The_User_Select_the_Garment_Average_UOM() throws Throwable{
	 NewYarnSheet.The_User_Select_the_Garment_Average_UOM();
 }
 @And ("^User Select the Required UOM$")
 public void User_Select_the_Required_UOM() throws Throwable{
	 NewYarnSheet.User_Select_the_Required_UOM();
 }
 @And ("^Check the data is prepopulated in the Yarn Required For Production field or not$")
 public void  Check_the_data_is_prepopulated_in_the_Yarn_Required_For_Production_field_or_not() throws Throwable {
	 NewYarnSheet.Check_the_data_is_prepopulated_in_the_Yarn_Required_For_Production_field_or_not();
 }
 @And ("^Check the data is prepopulated in the Yarn Required For Sampling field or not$")
 public void  Check_the_data_is_prepopulated_in_the_Yarn_Required_For_Sampling_field_or_not() throws Throwable {
	 NewYarnSheet.Check_the_data_is_prepopulated_in_the_Yarn_Required_For_Sampling_field_or_not();
 }
 @And ("^Check the data is prepopulated in the Total Yarn Required field or not$")
 public void  Check_the_data_is_prepopulated_in_the_Total_Yarn_Required_field_or_not() throws Throwable {
	 NewYarnSheet.Check_the_data_is_prepopulated_in_the_Total_Yarn_Required_field_or_not();
 }
 @And ("^The User Click on the Submit button$")
 public void  The_User_Click_on_the_Submit_button() throws Throwable {
	 NewYarnSheet.The_User_Click_on_the_Submit_button();
 }
 @When("I click {string} the Isnominated checkbox labeled {string}")
 public void  I_click_the_Isnominated_checkbox_labeled(String action,String label) throws Throwable {
	 NewYarnSheet.I_click_the_Isnominated_checkbox_labeled(action,label);
 }
 @And ("Select the Supplier name {string}")
 public void Select_the_Supplier_name(String Supplier) throws Throwable{
	 NewYarnSheet.Select_the_Supplier_name(Supplier);
 }
 @Then ("^Validation message should be displayed$")
 public void Validation_message_should_be_displayed() throws Throwable {
	 NewYarnSheet.Validation_message_should_be_displayed(); 
 }
 @And ("^Click on the Merchandising Module in the Sweater module$")
 public void Click_on_the_Merchandising_Module_in_the_Sweater_module() throws Throwable {
	 NewYarnSheet.Click_on_the_Merchandising_Module_in_the_Sweater_module(); 
 }
 @And ("^Click on the New Yarn Sheet Screen under the Generate Yarn Sheet dropdown$")
 public void Click_on_the_New_Yarn_Sheet_Screen_under_the_Generate_Yarn_Sheet_dropdown() throws Throwable {
	 NewYarnSheet.Click_on_the_New_Yarn_Sheet_Screen_under_the_Generate_Yarn_Sheet_dropdown(); 
 }
 @Given ("Enter the data in the {string}")
 public void Enter_the_data_in_the (String BulkYarnDeadline) throws Throwable {
	 NewYarnSheet.Enter_the_data_in_the (BulkYarnDeadline); 
 }
 @And ("User Select the Sourcing Manager {string}")
 public void User_Select_the_Sourcing_Manager (String Sourcingmanager) throws Throwable {
	 NewYarnSheet.User_Select_the_Sourcing_Manager(Sourcingmanager); 
 }
 @And ("^Click on the Submit to yarn team button$")
 public void Click_on_the_Submit_to_yarn_team_button() throws Throwable {
	 NewYarnSheet.Click_on_the_Submit_to_yarn_team_button(); 
 }
 @And ("^Click on the Save button in the New Yarn Sheet$")
 public void Click_on_the_Save_button_in_the_New_Yarn_Sheet() throws Throwable {
	 NewYarnSheet.Click_on_the_Save_button_in_the_New_Yarn_Sheet(); 
 }
 @And ("^User Click on the Edit Icon$")
 public void User_Click_on_the_Edit_Icon() throws Throwable {
	 NewYarnSheet.User_Click_on_the_Edit_Icon(); 
 }
 @When ("^The User click on the Save button the validation message is displayed or not$")
 public void The_User_click_on_the_Save_button_the_validation_message_is_displayed_or_not() throws Throwable {
	 NewYarnSheet.The_User_click_on_the_Save_button_the_validation_message_is_displayed_or_not(); 
 }
 @And ("Enter the {string} PO qty")
 public void  Enter_the_PO_qty(String POQty) throws Throwable {
	 NewYarnSheet.Enter_the_PO_qty(POQty);
 }
 @And ("^Check the PO Qty validation is displayed or not$")
 public void Check_the_PO_Qty_validation_is_displayed_or_not() throws Throwable {
	 NewYarnSheet.Check_the_PO_Qty_validation_is_displayed_or_not(); 
 }
 @And ("^Click on the Delete Icon in Yarn details Column$")
 public void Click_on_the_Delete_Icon_in_Yarn_details_Column() throws Throwable{
	 NewYarnSheet.Click_on_the_Delete_Icon_in_Yarn_details_Column();
 }
 @Then ("^the selected style should be displayed$")
 public void the_selected_style_should_be_displayed() throws Throwable{
	 NewYarnSheet.the_selected_style_should_be_displayed();
 }
 @And ("^the selected IPO name should be displayed$")
 public void the_selected_IPO_name_should_be_displayed() throws Throwable{
	 NewYarnSheet.the_selected_IPO_name_should_be_displayed();
 }
 @And ("^the buyer style should be displayed correctly$")
 public void the_buyer_style_should_be_displayed_correctly() throws Throwable{
	 NewYarnSheet.the_buyer_style_should_be_displayed_correctly();
 }
 @And ("^the PO quantity should be displayed$")
 public void the_PO_quantity_should_be_displayed() throws Throwable{
	 NewYarnSheet.the_PO_quantity_should_be_displayed();
 }
 @And ("^the IPO quantity should be displayed$")
 public void the_IPO_quantity_should_be_displayed() throws Throwable{
	 NewYarnSheet.the_IPO_quantity_should_be_displayed();
 }
 @And ("^the date submitted data should be displayed$")
 public void the_date_submitted_data_should_be_displayed() throws Throwable{
	 NewYarnSheet.the_date_submitted_data_should_be_displayed();
 }
 @Then ("^Verify whether the Import popup window is opened when clicked on the Import Yarn Details button$")
 public void Verify_whether_the_Import_popup_window_is_opened_when_clicked_on_the_Import_Yarn_Details_button() throws Throwable{
	 NewYarnSheet.Verify_whether_the_Import_popup_window_is_opened_when_clicked_on_the_Import_Yarn_Details_button();
 }
 @And ("^Select the WithIn_IPO in Import Yarn details popup$")
 public void Select_the_WithIn_IPO_in_Import_Yarn_details_popup() throws Throwable{
	 NewYarnSheet.Select_the_WithIn_IPO_in_Import_Yarn_details_popup();
 }
 @And ("^Verify without Select the Yarn and click on the Import button the validation msg is displayed$")
 public void Verify_without_Select_the_Yarn_and_click_on_the_Import_button_the_validation_msg_is_displayed() throws Throwable{
	 NewYarnSheet.Verify_without_Select_the_Yarn_and_click_on_the_Import_button_the_validation_msg_is_displayed();
 }
 @And ("^Select the Yarn in the Import yarn details Popup$")
 public void Select_the_Yarn_in_the_Import_yarn_details_Popup() throws Throwable{
	 NewYarnSheet.Select_the_Yarn_in_the_Import_yarn_details_Popup();
 }
 @And ("^Click on the Import button in the yarn details Popup$")
 public void Click_on_the_Import_button_in_the_yarn_details_Popup() throws Throwable{
	 NewYarnSheet.Click_on_the_Import_button_in_the_yarn_details_Popup();
 }
 @And ("^Select the Other_IPO in Import Yarn details popup$")
 public void Select_the_Other_IPO_in_Import_Yarn_details_popup() throws Throwable{
	 NewYarnSheet.Select_the_Other_IPO_in_Import_Yarn_details_popup();
 }
 
 @And ("^Select the IPO in the Import yarn details page$")
 public void Select_the_IPO_in_the_Import_yarn_details_page() throws Throwable{
	 NewYarnSheet.Select_the_IPO_in_the_Import_yarn_details_page();
 }
 @And ("^Select the Other IPO Yarn in the Import yarn details Popup$")
 public void Select_the_Other_IPO_Yarn_in_the_Import_yarn_details_Popup() throws Throwable{
	 NewYarnSheet.Select_the_Other_IPO_Yarn_in_the_Import_yarn_details_Popup();
 }
 @And ("^Select the PD YDS in Import Yarn details popup$")
 public void Select_the_PD_YDS_in_Import_Yarn_details_popup() throws Throwable{
	 NewYarnSheet.Select_the_PD_YDS_in_Import_Yarn_details_popup();
 }
 @And ("^Select the PD YDS Yarn in the Import yarn details Popup$")
 public void Select_the_PD_YDS_Yarn_in_the_Import_yarn_details_Popup() throws Throwable{
	 NewYarnSheet.Select_the_PD_YDS_Yarn_in_the_Import_yarn_details_Popup();
 }
 @And ("^Verify the Added Yarn details are displayed in the Yarn details grid$")
 public void Verify_the_Added_Yarn_details_are_displayed_in_the_Yarn_details_grid() throws Throwable{
	 NewYarnSheet.Verify_the_Added_Yarn_details_are_displayed_in_the_Yarn_details_grid();
 }
 @And ("^Verify the Garment Average details are displayed in the Garment Average Grid$")
 public void Verify_the_Garment_Average_details_are_displayed_in_the_Garment_Average_Grid() throws Throwable{
	 NewYarnSheet.Verify_the_Garment_Average_details_are_displayed_in_the_Garment_Average_Grid();
 }
 @And ("^Verify the Quantity details are displayed in the Quantity Requirements grid$")
 public void Verify_the_Quantity_details_are_displayed_in_the_Quantity_Requirements_grid() throws Throwable{
	 NewYarnSheet.Verify_the_Quantity_details_are_displayed_in_the_Quantity_Requirements_grid();
 }
 @And ("^Click on the View For Print Button$")
 public void Click_on_the_View_For_Print_Button() throws Throwable{
	 NewYarnSheet.Click_on_the_View_For_Print_Button();
 }
 @And ("^Verify the IPO details are displayed or not$")
 public void Verify_the_IPO_details_are_displayed_or_not() throws Throwable{
	 NewYarnSheet.Verify_the_IPO_details_are_displayed_or_not();
 }
}
