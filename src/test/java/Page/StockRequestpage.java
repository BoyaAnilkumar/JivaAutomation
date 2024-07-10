package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import util.DriverFactory;
import util.Utilities;

public class StockRequestpage extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	DailyInInputpages DIIP = new DailyInInputpages();
	PotentialDebitNotePages PDN = new PotentialDebitNotePages();
	
	By FabStoreDataEntry = By.xpath("(//span[text()='Data Entry'])[4]");
	By StockReq = By.xpath("//a[text()='Fabric Stock Request']");
	By navStkReq = By.xpath("//h3[text()='Fabric Stock Request']");
	By buttAssstkIPO = By.xpath("(//a[@title=' Assign Stock to IPO'])[1]");
	By navAssStkIPO = By.xpath("//h3[text()='Assign Stock to IPO']");
	By buttCancel = By.xpath("//button[@class='btn btn-danger mr-1']");
	By buttSave = By.xpath("//button[@class='btn btn-primary']");
	By valmsgMandatory = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By StkreqNo = By.xpath("//input[@placeholder='Search Stock Req No']");
	By IPO = By.xpath("//input[@formcontrolname='ipoNumber']");
	By FabName = By.xpath("//input[@formcontrolname='fabricName']");
	By Color = By.xpath("//input[@formcontrolname='color']");
	By Process = By.xpath("//input[@formcontrolname='processName']");
	By ReqQty = By.xpath("//input[@formcontrolname='requestQunatity']");
	By Factory = By.xpath("(//div[@class='ng-value-container'])[1]");
	By secFactory = By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[2]");
	By TotStkAvail = By.xpath("//input[@formcontrolname='totalStockAvailable']");
	By QtyAss = By.xpath("//input[@formcontrolname='assignqty']");
	By gridThaan = By.xpath("//h5[text()='Thaan Wise Information']");
	By ComThaan = By.xpath("(//input[@formcontrolname='isCompleteThan'])[2]");
	By PartialThaan = By.xpath("(//input[@formcontrolname='isPartialThan'])[3]");
	By ParThaanName = By.xpath("//input[@formcontrolname='partialThanName']");
	By PartialQty = By.xpath("//input[@formcontrolname='partialQty']");
	By FactoryClearall = By.xpath("//span[@title='Clear all']");
	By FactoryDelete = By.xpath("//span[@class='ng-value-icon left ng-star-inserted']");
	By valmsgAssReq = By.xpath("//h2[text()='Qty Assigned and the Requested Qty should be equal']");
	By valmsgParAct = By.xpath("//h2[text()='Partial Qty should not be more than or equal of Actual Qty of a Thaan']");
	By iconExpansion = By.xpath("//i[@class='pi c-pointer pi-chevron-down']");
	By buttCancelmsg = By.xpath("(//a[@title='Cancel'])[1]");
	By popmsgCancel = By.xpath("//div[@class='swal2-popup swal2-modal swal2-show']");
	By optNo = By.xpath("//button[@class='swal2-cancel swal2-styled']");
	By optYes = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	By buttFilterSH = By.xpath("//a[@id='sidebarCollapse']");
	By sucmsgCancel = By.xpath("//div[contains(@class,'swal2-popup swal2-toast')]");
	

	public void Navigate_to_the_Fabric_Stock_Request_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, PDN.FabricStore);
		driver.findElement(PDN.FabricStore).click();
		utilities.webDriverWait(driver, FabStoreDataEntry);
		driver.findElement(FabStoreDataEntry).click();
		utilities.webDriverWait(driver, StockReq);
		driver.findElement(StockReq).click();
		utilities.webDriverWait(driver, navStkReq);
		driver.findElement(navStkReq).isDisplayed();
		WebElement Stk = driver.findElement(navStkReq);
		String Stkrequest = Stk.getText();
		System.out.println("Page is navigated to - "+Stkrequest);
	}

	public void Verify_whether_the_Assign_Stock_To_IPO_and_Cancel_buttons_are_displayed_under_the_Action_column() throws Throwable {
		
	}

	public void Verify_whethe_the_Assign_Stock_to_IPO_button_is_clickable() throws Throwable {
		utilities.webDriverWait(driver, buttAssstkIPO);
		driver.findElement(buttAssstkIPO).click();
		
	}

	public void Verify_whether_the_page_is_navigated_to_the_Assign_Stock_to_IPO_form() throws Throwable {
		utilities.webDriverWait(driver, navAssStkIPO);
		driver.findElement(navAssStkIPO).isDisplayed();
		WebElement Assign = driver.findElement(navAssStkIPO);
		String AssignStk = Assign.getText();
		System.out.println("Page is navigated to : " + AssignStk);
			
	}

	public void Click_on_the_Cancel_button_in_the_Assign_Stock_to_IPO_form() throws Throwable {
		utilities.webDriverWait(driver, buttCancel);
		driver.findElement(buttCancel).click();
	}

	public void Verify_whether_the_page_is_navigated_to_the_Fabric_Stock_Request_screen() throws Throwable {
		utilities.webDriverWait(driver, navStkReq);
		driver.findElement(navStkReq).isDisplayed();
		WebElement Stock = driver.findElement(navStkReq);
		String StockReq = Stock.getText();
		System.out.println("Page is navigated to : " + StockReq);
	}

	public void Click_on_the_Save_button_in_the_Assign_Stock_to_IPO_form() throws Throwable {
		utilities.webDriverWait(driver, buttSave);
		driver.findElement(buttSave).click();
//		driver.wait(10000);
	}

	public void Verify_whether_the_mandatory_validation_msg_is_displayed_or_not() throws Throwable {
//		utilities.webDriverWait(driver, valmsgMandatory);
		driver.findElement(valmsgMandatory).isDisplayed();
		WebElement mandatory = driver.findElement(valmsgMandatory);
		String mandatorymsg = mandatory.getText();
		System.out.println("Print the displayed mandatory msg : " + mandatorymsg);
	}

	public void Verify_the_Stock_Req_No_field_properties() throws Throwable {
		utilities.webDriverWait(driver, StkreqNo);
		driver.findElement(StkreqNo).isDisplayed();
		WebElement stkReq= driver.findElement(StkreqNo);
		String stkReqNo = stkReq.getAttribute("value");
		System.out.println("Print the displayed Stock Request No.: " + stkReqNo);
	}

	public void Verify_the_IPO_field_data_and_print() throws Throwable {
		utilities.webDriverWait(driver, IPO);
		driver.findElement(IPO).isDisplayed();
		WebElement ipo = driver.findElement(IPO);
		String ipoName = ipo.getAttribute("value");
		System.out.println("Print the displayed IPO number : " + ipoName);
	}

	public void Verify_the_Fabric_Name_field_data_and_print() throws Throwable {
		utilities.webDriverWait(driver, FabName);
		driver.findElement(FabName).isDisplayed();
		WebElement fabric = driver.findElement(FabName);
		String fabricName = fabric.getAttribute("value");
		System.out.println("Print the displayed Fabric Name : " + fabricName);
	}

	public void Verify_the_Color_field_data_and_print() throws Throwable {
		utilities.webDriverWait(driver, Color);
		driver.findElement(Color).isDisplayed();
		WebElement color = driver.findElement(Color);
		String colorName = color.getAttribute("value");
		System.out.println("Print the displayed Color Name : " + colorName );
	}

	public void Verify_the_Process_field_data_and_print() throws Throwable {
		utilities.webDriverWait(driver, Process);
		driver.findElement(Process).isDisplayed();
		WebElement process = driver.findElement(Process);
		String processName = process.getAttribute("value");
		System.out.println("Print the displayed Process Name : " + processName );
	}

	public void Verify_the_Requested_Qty_field_data_and_print() throws Throwable {
		utilities.webDriverWait(driver, ReqQty);
		driver.findElement(ReqQty).isDisplayed();
		WebElement Requeted = driver.findElement(ReqQty);
		String RequetedQty = Requeted.getAttribute("value");
		System.out.println("Print the displayed Requested Qty value : " + RequetedQty);
	}

	public void Verify_whether_the_Total_Stock_Available_and_Qty_Assign_fields_are_displayed_or_not_after_selecting_the_Factory() {
		// TODO Auto-generated method stub
		
	}

	public void Verify_the_Total_Stock_Available_field_data_and_print() throws Throwable {
		utilities.webDriverWait(driver, TotStkAvail);
		driver.findElement(TotStkAvail).isDisplayed();
		WebElement TotStk = driver.findElement(TotStkAvail);
		String TotStkava = TotStk.getAttribute("value");
		System.out.println("Print the displayed Total Stock Available value : " + TotStkava);
	}

	public void Verify_the_Qty_Assign_field_data_and_print() throws Throwable {
		utilities.webDriverWait(driver, QtyAss);
		driver.findElement(QtyAss).isDisplayed();
		WebElement quantity = driver.findElement(QtyAss);
		String quantityAss = quantity.getAttribute("value");
		System.out.println("Print the displayed Qty Assign value : " + quantityAss);
	}

	public void Verify_whether_the_user_is_able_to_select_a_Factory_name_in_the_Factory_field() throws Throwable {
		utilities.webDriverWait(driver, Factory);
		driver.findElement(Factory).click();
		utilities.webDriverWait(driver, secFactory);
		driver.findElement(secFactory).click();
		
	}

	public void Verify_whether_the_user_is_able_to_Delete_the_added_factory() {
		// TODO Auto-generated method stub
		
	}

	public void Verify_whether_the_user_is_able_to_select_multiple_Factory_names_in_the_Factory_field() {
		// TODO Auto-generated method stub
		
	}

	public void Verify_whether_the_user_is_able_to_delete_all_the_added_factories_at_a_time() {
		// TODO Auto-generated method stub
		
	}

	public void Verify_whether_Thaan_Wise_Information_grid_is_displayed_after_selecting_a_Factory() throws Throwable {
		utilities.webDriverWait(driver, gridThaan);
		driver.findElement(gridThaan).isDisplayed();
		WebElement thaan = driver.findElement(gridThaan);
		String thaanInfo = thaan.getText();
		System.out.println("Print the grid name : " + thaanInfo);
	}

	public void Select_the_Complete_Thaan_checkbox_field_and_check_the_Qty_Assign_field_value() throws Throwable {
		utilities.webDriverWait(driver, ComThaan);
		driver.findElement(ComThaan).click();
	}

	public void Select_the_Partial_Thaan_checkbox_field_and_check_whether_the_Thaan_Name_and_Partial_Qty_field_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, PartialThaan);
		driver.findElement(PartialThaan).click();
	}
	public void Enter_the_Partial_Thaan_name() throws Throwable {
		utilities.webDriverWait(driver, ParThaanName);
		driver.findElement(ParThaanName).sendKeys("Pth1");
	}
	public void Enter_the_Partial_Qty_value_more_than_the_Actual_Qty() throws Throwable {
		utilities.webDriverWait(driver, PartialQty);
		driver.findElement(PartialQty).sendKeys("300000");
	}

	public void Verify_whether_Partial_Qty_validationmsg_is_displayed_when_the_user_enters_more_qty_than_the_Actual_Qty() throws Throwable {
//		utilities.webDriverWait(driver, valmsgParAct);
		driver.findElement(valmsgParAct).isDisplayed();
		WebElement Act = driver.findElement(valmsgParAct);
		String Actqty = Act.getText();
		System.out.println("Print the displayed validation msg when the Partial Qty is more than the Actual Qty: " + Actqty);
	}

	public void Verify_whether_the_sum_of_all_the_selected_thaans_are_displayed_in_the_Qty_Assign_field_or_not() throws Throwable {
		utilities.webDriverWait(driver, QtyAss);
		driver.findElement(QtyAss).isDisplayed();
		WebElement qty = driver.findElement(QtyAss);
		String qtyass = qty.getAttribute("value");
		System.out.println("Print the displayed Qty Assign value : " + qtyass);
	}

	public void Select_the_Assign_Qty_more_than_the_Requested_Qty() throws Throwable {
		utilities.webDriverWait(driver, PartialQty);
		driver.findElement(PartialQty).clear();
		driver.findElement(PartialQty).sendKeys("5000");
	}
	

	public void Verify_whether_the_Qty_Assigned_and_the_Requested_Qty_validation_msg_is_displayed_or_not_when_the_Qtys_are_not_equal() throws Throwable {
//		utilities.webDriverWait(driver, valmsgAssReq);
		driver.findElement(valmsgAssReq).isDisplayed();
		WebElement AssReq = driver.findElement(valmsgAssReq);
		String AssReqmsg = AssReq.getText();
		System.out.println("Print the displayed validation msg when the Assigned Qty is more than the Requseted Qty: " + AssReqmsg);
	}

	public void Select_the_Assign_Qty_less_than_the_Requested_Qty() throws Throwable {
		utilities.webDriverWait(driver, PartialQty);
		driver.findElement(PartialQty).clear();
		driver.findElement(PartialQty).sendKeys("500");
	}

	public void Select_the_Assign_Qty_equal_to_the_Requested_Qty_and_enter_valid_data_in_all_the_mandatory_fields() throws Throwable {
		utilities.webDriverWait(driver, PartialQty);
		driver.findElement(PartialQty).clear();
		driver.findElement(PartialQty).sendKeys("4,600.299");
		
	}

	public void Verify_the_successful_toaster_msg() throws Throwable {
//		utilities.webDriverWait(driver, PDN.Successmsg);
		driver.findElement(PDN.Successmsg).click();
		WebElement Success = driver.findElement(PDN.Successmsg);
		String Successmsg = Success.getText();
		System.out.println("Print the Successfull validation msg : " + Successmsg);
	}

	public void Click_on_Filters_showhide_button() throws Throwable {
		utilities.webDriverWait(driver, buttFilterSH);
		driver.findElement(buttFilterSH).click();
	}

	public void Verify_the_expansion_button_display() throws Throwable {
		utilities.webDriverWait(driver, iconExpansion);
		driver.findElement(iconExpansion).click();
		System.out.println("Expansion icon is clickable and should display the grid");

	}

	public void Verify_the_expansion_grid_values() {
		// TODO Auto-generated method stub
		
	}

	public void Click_on_the_Cancel_button_for_a_Stock_record() throws Throwable {
		utilities.webDriverWait(driver, buttCancelmsg);
		driver.findElement(buttCancelmsg).click();
	}

	public void Verify_whether_the_Cancel_popup_window_is_displayed() throws Throwable {
		utilities.webDriverWait(driver, popmsgCancel);
		driver.findElement(popmsgCancel).isDisplayed();
		WebElement Cancel = driver.findElement(popmsgCancel);
		String Cancelmsg = Cancel.getText();
		System.out.println("Print the displayed validation msg on Cancelling : " + Cancelmsg);
	}

	public void Click_on_the_No_option_in_the_Delete_msg() throws Throwable {
		utilities.webDriverWait(driver, optNo);
		driver.findElement(optNo).click();
	}

	public void Click_on_the_Yes_option_in_the_Delete_msg() throws Throwable {
		utilities.webDriverWait(driver, optYes);
		driver.findElement(optYes).click();
		System.out.println("Sucessfully the respective record Status has been changed to 'Stock Requested Cancelled' state");
	}

	public void Verify_the_Successful_Cancelled_msg() {
		// TODO Auto-generated method stub
		
	}

	

	
}
