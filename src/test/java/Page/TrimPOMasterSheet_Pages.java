package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class TrimPOMasterSheet_Pages extends DriverFactory {
	
	Utilities utilities 			= new Utilities();
	RevisedMUWorkingPages RMUW 		= new RevisedMUWorkingPages();
	TrimSheetAcceptancePages TSA 	= new TrimSheetAcceptancePages();
	
	By modTrimGeneratePO			= By.xpath("(//span[text()='Generate PO'])[1]");
	By scrTrimPOMasterSheet			= By.xpath("//a[text()=' Trim PO Master Sheet']");
	By Filters						= By.xpath("//a[@id='sidebarCollapse']");
	By Merchant						= By.xpath("//p-multiselect[@optionlabel='fullName']");
	By enterMerchant				= By.xpath("(//p-multiselect[@optionlabel='fullName']//child::input)[3]");
	By secMerchant					= By.xpath("//div[@class='country-item ng-star-inserted']");
	By Buyer						= By.xpath("//p-multiselect[@optionlabel='buyerName']");
	By enterBuyer					= By.xpath("(//p-multiselect[@optionlabel='buyerName']//child::input)[3]");
	By Supplier						= By.xpath("//p-multiselect[@optionlabel='supplierName']");
	By enterSupplier				= By.xpath("(//p-multiselect[@optionlabel='supplierName']//child::input)[3]");
	By ItemName						= By.xpath("//p-multiselect[@optionlabel='itemName']");
	By enterItemName				= By.xpath("(//p-multiselect[@optionlabel='itemName']//child::input)[3]");
	By Month						= By.xpath("//p-multiselect[@optionlabel='value']");
	By enterMonth					= By.xpath("(//p-multiselect[@optionlabel='value']//child::input)[3]");
	By IPO							= By.xpath("//td//div//ng-select[@formcontrolname='ipoId']");
	By IPO1							= By.xpath("(//ng-select[@bindlabel='ipoNumber'])[2]");
	By enterIPO						= By.xpath("(//p-multiselect[@optionlabel='ipoNumber']//child::input)[3]");
	By buttApply					= By.xpath("//button[text()='Apply']");
	By Search_Keyword			    = By.xpath("//input[@placeholder='Search PO#']");
	By FilterTrimDetails			= By.xpath("//div[text()=' Trim Details ']//child::button");
	By filCategory					= By.xpath("//input[@class='p-inputtext p-component p-element ng-star-inserted']");
	By FilterProcess				= By.xpath("//div[text()=' Trim Process ']//child::button");
	By filProcess					= By.xpath("//p-columnfilterformelement//input");
	By filbuttApply					= By.xpath("//span[text()='Apply']");
	By GeneratePO					= By.xpath("//a[@title='Genarate PO']");
	By TypeOrder					= By.xpath("//select[@formcontrolname='typeofPo']");
	By PODate						= By.xpath("//input[@formcontrolname='poDate']");
	By PONumber						= By.xpath("//input[@formcontrolname='poNumber']");
	By DeliverTo					= By.xpath("//p-autocomplete[@field='factoryName']//input[@placeholder='Search By Name']");
	By DeliveryAddress				= By.xpath("//input[@formcontrolname='deliverAddress']");
	By DeliveryGSTIN				= By.xpath("//input[@formcontrolname='deliverGstNumber']");
	By supplierfield				= By.xpath("//input[@placeholder='Search By Supplier Name']");
	By SupplierAddress				= By.xpath("//input[@formcontrolname='supplierAddress']");
	By SupplierGSTIN				= By.xpath("//input[@formcontrolname='gstNumber']");
	By Payment_Terms				= By.xpath("//input[@formcontrolname='paymentTypeId']");
	By DeliveryTerms				= By.xpath("//select[@formcontrolname='deliveryTypeId']");
	By LeadTime						= By.xpath("//input[@formcontrolname='leadTime']");
	By Category						= By.xpath("//select[@formcontrolname='categoryId']");
	By Item							= By.xpath("//select[@formcontrolname='itemId']");
	By Process						= By.xpath("//select[@formcontrolname='processTypeId']");
	By Color						= By.xpath("//ng-select[@formcontrolname='colorId']//div[@class='ng-input']");
	By QtyReq						= By.xpath("//input[@formcontrolname='totalQuantity']");
	By QtyAvailStock				= By.xpath("//input[@formcontrolname='qtyAvailableInStock']");
	By QtyAllowed					= By.xpath("//input[@formcontrolname='qtyAllowed']");
	By Currency						= By.xpath("//select[@formcontrolname='currency']");
	By Rate							= By.xpath("//input[@formcontrolname='rate']");
	By UOM							= By.xpath("//select[@formcontrolname='uom']");
	By LShortIfAny					= By.xpath("//textarea[@formcontrolname='lAddtionalInfo']");
	By Addinfor1					= By.xpath("//textarea[@formcontrolname='addtionalInfo1']");
	By Addinfor2					= By.xpath("//textarea[@formcontrolname='addtionalInfo2']");
	By navTrimPO					= By.xpath("//div[@class='page_title_left d-flex align-items-center']");
	By buttAddIPO					= By.xpath("//button[text()=' Add IPO']");
	By buttDeleteIPO				= By.xpath("//button[@class='btn btn-outline-danger btn-sm']");
	By IPOname						= By.xpath("//ng-select[@bindvalue='ipoId']");
	By DueOnDate					= By.xpath("//input[@formcontrolname='dueDate']");
	By Quantity						= By.xpath("//input[@formcontrolname='qtyrequired']");
	By QtyUseFromStock				= By.xpath("//input[@formcontrolname='qtyUsefromStock']");
	By QtyToBeBought				= By.xpath("//input[@formcontrolname='qtytobeBought']");
	By Totalamt						= By.xpath("//td[@class='text-right font-weight-bold']");
	By TotalQty						= By.xpath("");
	By buttSave						= By.xpath("(//button[@type='submit'])[1]");
	By buttReset					= By.xpath("//button[@class='btn btn-danger btn-md mr-2']");
	By navPrintForm					= By.xpath("(//td[@class='text-right p-2'])[1]");
	By buttCancel					= By.xpath("//button[@id='closepagebutton']");
	By PODetailssortingicon			= By.xpath("//div[text()=' PO Details ']//p-sorticon[@class='p-element']");
	By ApplicableIPOsorticon		= By.xpath("//div[text()=' Applicable IPOs ']//p-sorticon[@class='p-element']");
	By TrimDetailssorticon			= By.xpath("//div[text()=' Trim Details ']//p-sorticon[@class='p-element']");
	By TrimProcesssorticon			= By.xpath("//div[text()=' Trim Process ']//p-sorticon[@class='p-element']");
	By MUDetailssorticon			= By.xpath("//div[text()=' MU Details ']//p-sorticon[@class='p-element']");
	By QtyDetailssorticon			= By.xpath("//div[text()=' Qty Details ']//p-sorticon[@class='p-element']");
	By Statussorticon				= By.xpath("//div[text()=' Status ']//p-sorticon[@class='p-element']");
	By buttRevisePO					= By.xpath("//a[@title='Revise PO']");
	By buttPrint					= By.xpath("//a[@class='btn btn-primary btn-sm']");
	By butCancel					= By.xpath("//a[@title='Cancel']");
	By popupCancel					= By.xpath("//h2");
	By popupYes						= By.xpath("//button[text()='Yes']");
	By popupNo						= By.xpath("(//button[text()='No'])[2]");
	

	public void Navigate_to_Trim_PO_Master_Sheet_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, TSA.modTrims);
		driver.findElement(TSA.modTrims).click();
		utilities.webDriverWait(driver, TSA.TrimDataEntry);
		driver.findElement(TSA.TrimDataEntry).click();
		utilities.webDriverWait(driver, modTrimGeneratePO);
		driver.findElement(modTrimGeneratePO).click();
		utilities.webDriverWait(driver, scrTrimPOMasterSheet);
		driver.findElement(scrTrimPOMasterSheet).click();
		
	}
	public void Click_on_filter_expansion() throws Throwable {
		utilities.webDriverWait(driver, Filters);
		driver.findElement(Filters).click();
	}



	public void Click_on_Merchant_dropdown_field_and_select_merchant(String merchant) throws Throwable {
		utilities.webDriverWait(driver, Merchant);
		driver.findElement(Merchant).click();
		utilities.webDriverWait(driver, enterMerchant);
		driver.findElement(enterMerchant).sendKeys(merchant);
		utilities.webDriverWait(driver, secMerchant);
		driver.findElement(secMerchant).click();
		driver.findElement(Merchant).click();
	}



	public void Click_in_the_Buyer_field_and_select_a_Buyer(String buyer) throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		utilities.webDriverWait(driver, enterBuyer);
		driver.findElement(enterBuyer).sendKeys(buyer);
		utilities.webDriverWait(driver, secMerchant);
		driver.findElement(secMerchant).click();
		driver.findElement(Buyer).click();
	}



	public void Click_in_the_Supplier_field_and_select_a_Supplier(String supplier) throws Throwable {
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).click();
		utilities.webDriverWait(driver, enterSupplier);
		driver.findElement(enterSupplier).sendKeys(supplier);
		utilities.webDriverWait(driver, secMerchant);
		driver.findElement(secMerchant).click();
		driver.findElement(Supplier).click();
	}


	public void Click_in_the_Items_field_and_select_a_Item_Name(String items) throws Throwable {
		utilities.webDriverWait(driver, ItemName);
		driver.findElement(ItemName).click();
		utilities.webDriverWait(driver, enterItemName);
		driver.findElement(enterItemName).sendKeys(items);
		utilities.webDriverWait(driver, secMerchant);
		driver.findElement(secMerchant).click();
		driver.findElement(ItemName).click();
	}



	public void Click_in_the_Month_field_and_select_a_Month(String month) throws Throwable {
		utilities.webDriverWait(driver, Month);
		driver.findElement(Month).click();
		utilities.webDriverWait(driver, enterMonth);
		driver.findElement(enterMonth).sendKeys(month);
		utilities.webDriverWait(driver, secMerchant);
		driver.findElement(secMerchant).click();
		driver.findElement(Month).click();
	}



	public void Click_in_the_IPO_field_and_select_a_IPO(String iPO) throws Throwable {
		utilities.webDriverWait(driver, IPO);
		driver.findElement(IPO).click();
		utilities.webDriverWait(driver, enterIPO);
		driver.findElement(enterIPO).sendKeys(iPO);
		utilities.webDriverWait(driver, secMerchant);
		driver.findElement(secMerchant).click();
		driver.findElement(IPO).click();
	}



	public void Click_on_Filter_Apply_button() throws Throwable {
		utilities.webDriverWait(driver, buttApply);
		driver.findElement(buttApply).click();
	}
	public void Search_with_IPO_in_search_keyword_textbox(String iPO2) throws Throwable {
		 utilities.webDriverWait(driver, Search_Keyword);
		 driver.findElement(Search_Keyword).sendKeys(iPO2);
//		 driver.findElement(Search_Keyword).click();
		
	}
	public void Select_the_Category_value_in_the_filter(String category2) throws Throwable {
		utilities.webDriverWait(driver, FilterTrimDetails);
		driver.findElement(FilterTrimDetails).click();
		utilities.webDriverWait(driver, filCategory);
		driver.findElement(filCategory).sendKeys(category2);
		utilities.webDriverWait(driver, filbuttApply);
		driver.findElement(filbuttApply).click();
		
	}
	public void Select_the_Process_value_in_the_filters(String process) throws Throwable {
		utilities.webDriverWait(driver, FilterProcess);
		driver.findElement(FilterProcess).click();
		utilities.webDriverWait(driver, filProcess);
		driver.findElement(filProcess).sendKeys(process);
		utilities.webDriverWait(driver, filbuttApply);
		driver.findElement(filbuttApply).click();
	}
	public void Click_on_Generate_PO_icon() throws Throwable {
		utilities.webDriverWait(driver, GeneratePO);
		driver.findElement(GeneratePO).click();
	}
	public void Verify_whether_navigated_to_the_Create_PO_for_Trims_screen() throws Throwable {
		utilities.webDriverWait(driver, navTrimPO);
		String TrimPO = driver.findElement(navTrimPO).getText();
		System.out.println("Navigated to : '"+TrimPO+"'");
	}
	public void Verify_the_PO_Details_are_displaying() throws Throwable {
		utilities.webDriverWait(driver, TypeOrder);
		String OrderType = driver.findElement(TypeOrder).getAttribute("value");
		System.out.println("Print the Type of order : '"+OrderType+"'");
		utilities.webDriverWait(driver, PODate);
		String Date = driver.findElement(PODate).getAttribute("value");
		System.out.println("Print the PO Date : '"+Date+"'");
		utilities.webDriverWait(driver, PONumber);
		String PONo = driver.findElement(PONumber).getAttribute("value");
		System.out.println("Print the PO Number : '"+PONo+"'");
	}
	public void Enter_Deliver_Details_and_select_from_the_suggestions_(String deliverTo) throws Throwable {
//		  WebElement dropdownElement = driver.findElement(DeliverTo);
//	      driver.findElement(DeliverTo).sendKeys(deliverTo);  
//	        // Create a Select object for the dropdown
//	        Select dropdown = new Select(dropdownElement);
//	        
//	        // Get the text of the currently selected option
//	        String selectedOptionText = dropdown.getFirstSelectedOption().getText();
//	        System.out.println("Print the Delivery To : '" + selectedOptionText + "'");
	        
		utilities.webDriverWait(driver, DeliverTo);
		driver.findElement(DeliverTo).sendKeys(deliverTo);
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	public void Verify_and_print_the_Delivery_Address_displayed_for_the_selected_Delivery_To() throws Throwable {
		utilities.webDriverWait(driver, DeliveryAddress);
		String DAddress = driver.findElement(DeliveryAddress).getAttribute("value");
		System.out.println("Print the Delivery Address : '"+DAddress+"'");
	}
	public void Verify_and_print_the_GSTIN_number_displayed_for_the_selected_Delivery_To() throws Throwable {
		utilities.webDriverWait(driver, DeliveryGSTIN);
		String DGSTIN = driver.findElement(DeliveryGSTIN).getAttribute("value");
		System.out.println("Print the Delivery GSTIN : '"+DGSTIN+"'");
	}
	public void Enter_supplier_name_and_select_from_the_suggestions(String supplier) throws Throwable {
		utilities.webDriverWait(driver, supplierfield);
		driver.findElement(supplierfield).sendKeys(supplier);
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	public void Verify_and_print_the_Supplier_Address_displayed_for_the_selected_Supplier() throws Throwable {
		utilities.webDriverWait(driver, SupplierAddress);
		String SAddress = driver.findElement(SupplierAddress).getAttribute("value");
		System.out.println("Print the Supplier Address : '"+SAddress+"'");
	}
	public void Verify_and_print_the_GSTIN_number_displayed_for_the_selected_Supplier() throws Throwable {
		utilities.webDriverWait(driver, SupplierGSTIN);
		String SGSTIN = driver.findElement(SupplierGSTIN).getAttribute("value");
		System.out.println("Print the Supplier GSTIN : '"+SGSTIN+"'");
	}
	public void Verify_and_print_the_Payment_Terms_value_for_the_selected_Supplier() throws Throwable {
		utilities.webDriverWait(driver, Payment_Terms);
		String payment = driver.findElement(Payment_Terms).getAttribute("value");
		System.out.println("Print the Payment Term name : '"+payment+"'");
	}
	public void Verify_and_print_the_Delivery_Terms_value_for_the_selected_Supplier() throws Throwable {
		utilities.webDriverWait(driver, DeliveryTerms);
		String deliverTerm = driver.findElement(DeliveryTerms).getAttribute("value");
		System.out.println("Print the Delivery Terms : '"+deliverTerm+"'");
		
	}
	public void Enter_Lead_Time_in_Days(String leadTime) throws Throwable {
		utilities.webDriverWait(driver, LeadTime);
		driver.findElement(LeadTime).sendKeys(leadTime);
		
	}
	public void Verify_and_Print_the_Category_name_displayed_in_the_Category_field() throws Throwable {
		utilities.webDriverWait(driver, Category);
		String categery = driver.findElement(Category).getAttribute("value");
		System.out.println("Print the Category name : '"+categery+"'");
		
	}
	public void Verify_and_Print_the_Item_name_displayed_in_the_Item_field() throws Throwable {
		utilities.webDriverWait(driver, Item);
		String Items = driver.findElement(Item).getAttribute("value");
		System.out.println("Print the Item name : '"+Items+"'");
	}
	public void Verify_and_Print_the_Color_name_displayed_in_the_Color_field() throws Throwable {
		utilities.webDriverWait(driver, Color);
		String colour = driver.findElement(Color).getAttribute("value");
		System.out.println("Print the Color name : '"+colour+"'");
	}
	public void Verify_and_Print_the_Process_name_displayed_in_the_Process_field() throws Throwable {
		utilities.webDriverWait(driver, Process);
		String process = driver.findElement(Process).getAttribute("value");
		System.out.println("Print the Process name : '"+process+"'");
	}
	public void Verify_and_Print_the_Qty_Required_field_value() throws Throwable {
		utilities.webDriverWait(driver, QtyReq);
		String Qty = driver.findElement(QtyReq).getAttribute("value");
		System.out.println("Print the Qty Required : '"+Qty+"'");
	}
	public void Verify_and_Print_the_Qty_Available_In_Stock_field_value() throws Throwable {
		utilities.webDriverWait(driver, QtyAvailStock);
		String QtyStk = driver.findElement(QtyAvailStock).getAttribute("value");
		System.out.println("Print the Qty Available for Stock : '"+QtyStk+"'");
	}
	public void Verify_and_Print_the_Qty_Allowed_field_value() throws Throwable {
		utilities.webDriverWait(driver, QtyAllowed);
		String QtyAllow = driver.findElement(QtyAllowed).getAttribute("value");
		System.out.println("Print the +/-Qty Allowed for Stock : '"+QtyAllow+"'");
	}
	public void Verify_and_Print_the_Currency_name_displayed() throws Throwable {
		utilities.webDriverWait(driver, Currency);
		String Curren = driver.findElement(Currency).getAttribute("value");
		System.out.println("Print the Currency name : '"+Curren+"'");
	}
	public void Enter_Rate_value(String rate) throws Throwable {
		utilities.webDriverWait(driver, Rate);
		driver.findElement(Rate).clear();
		driver.findElement(Rate).sendKeys(rate);
	}
	public void Verify_and_Print_the_UOM_value_displayed() throws Throwable {
		utilities.webDriverWait(driver, UOM);
		String uom = driver.findElement(UOM).getAttribute("value");
		System.out.println("Print the UOM name : '"+uom+"'");
	}
	public void Enter_L_Short_If_Any(String lShort) throws Throwable {
		utilities.webDriverWait(driver, LShortIfAny);
		driver.findElement(LShortIfAny).sendKeys(lShort);
		
	}
	public void Enter_Addl_Information_1(String addInfo1) throws Throwable {
		utilities.webDriverWait(driver, Addinfor1);
		driver.findElement(Addinfor1).sendKeys(addInfo1);
	}
	public void Enter_Addl_Information_2(String addInfo2) throws Throwable {
		utilities.webDriverWait(driver, Addinfor2);
		driver.findElement(Addinfor2).sendKeys(addInfo2);
	}
	public void Click_on_Add_IPO_button() throws Throwable {
		utilities.webDriverWait(driver, buttAddIPO);
		driver.findElement(buttAddIPO).click();
		System.out.println("Another IPO record added successfully");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
	}
	
	public void Delete_the_added_IPO_record() throws Throwable {
		utilities.webDriverWait(driver, buttDeleteIPO);
		driver.findElement(buttDeleteIPO).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='No'])[2]")).click();
		driver.findElement(buttDeleteIPO).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(2000);
		System.out.println("Add IPO details record is successfully deleted");
	}
	public void Verify_and_print_the_IPO_details_under_the_IPO_Details_section() throws Throwable {
		utilities.webDriverWait(driver, IPO);
		String ipo = driver.findElement(IPO).getAttribute("value");
		System.out.println("Print the IPO name '"+ipo+"'");
	}
	public void Click_on_Save_button_to_Generate_PO() throws Throwable {
		utilities.webDriverWait(driver, buttSave);
		driver.findElement(buttSave).click();
		System.out.println("Clicked on the save button");
	}
	public void Verify_whether_the_user_is_navigated_to_Print_form() throws Throwable {
		utilities.webDriverWait(driver, navPrintForm);
		String POPF = driver.findElement(navPrintForm).getText();
		System.out.println("Nvaigated to : '"+POPF+"'"+" Print Form");
	}
	public void Click_on_Cancel_button_in_Print_Form() throws Throwable {
		utilities.webDriverWait(driver, buttCancel);
		driver.findElement(buttCancel).click();
	}
	public void Verify_whether_navigate_back_to_Create_PO_For_Trim_screen() throws Throwable {
		utilities.webDriverWait(driver, navTrimPO);
		String CreatePO = driver.findElement(navTrimPO).getText();
		System.out.println("Nvaigated to : '"+CreatePO+"'");
	}
	public void Verify_the_Reset_button_functionality_on_clicking() throws Throwable {
		utilities.webDriverWait(driver, buttReset);
		driver.findElement(buttReset).click();
		System.out.println("Data cleared in all the fields");		
	}
	public void Click_on_the_Status_sort_icon() throws Throwable {
		utilities.webDriverWait(driver, Statussorticon);
		driver.findElement(Statussorticon).click();
		System.out.println("Clicked on the Status sort icon in the grid");
	}
	public void Verify_and_Print_the_validation_msg() throws Throwable {
//		utilities.webDriverWait(driver, By.xpath("//h2"));
		driver.findElement(By.xpath("//h2")).click();
		String mandatoryMsg = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("Print the validation msg : '"+mandatoryMsg+"'");
	}
	public void Verify_the_Rate_validation_msg() {
		driver.findElement(By.xpath("//h2")).click();
		String mandatoryMsg = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("Print the Rate validation msg : '"+mandatoryMsg+"'");
	}
	public void Verify_the_validation_msg_on_selecting_the_same_IPO() throws Throwable {
		utilities.webDriverWait(driver, IPO1);
		driver.findElement(IPO1).click();
		Thread.sleep(2000);
		WebElement ipo = driver.findElement(IPO1);
		System.out.println(ipo);
		utilities.MediumWait(driver);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='IPO08'",ipo);
		Thread.sleep(1000);
		
//		driver.findElement(IPO1).sendKeys("IPO08");
		utilities.MediumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2")).click();
		String mandatoryMsg = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("Print the IPO validation msg : '"+mandatoryMsg+"'");
	}
	public void Search_with_PO_in_search_keyword_textbox_(String pO) throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		 driver.findElement(Search_Keyword).sendKeys(pO);
	}
	public void Click_on_Revised_PO_icon() throws Throwable {
		utilities.webDriverWait(driver, buttRevisePO);
		driver.findElement(buttRevisePO).click();
	}
	public void user_update_the_revised_po_for_ipo_and_(String qtyAllowed2, String rate2) throws Throwable {
		utilities.webDriverWait(driver, QtyAllowed);
		driver.findElement(QtyAllowed).clear();
		driver.findElement(QtyAllowed).sendKeys(qtyAllowed2);
		utilities.webDriverWait(driver, Rate);
		driver.findElement(Rate).clear();
		driver.findElement(Rate).sendKeys(rate2);
	}
	public void Print_view_Revised_PO_for_IPO_details() throws Throwable {
		utilities.webDriverWait(driver, IPO);
		String ipo = driver.findElement(IPO).getAttribute("value");
		System.out.println("Print the IPO name '"+ipo+"'");
		
		utilities.webDriverWait(driver, DueOnDate);
		String Date = driver.findElement(DueOnDate).getAttribute("value");
		System.out.println("Print the Due Date : '"+Date+"'");
		
		utilities.webDriverWait(driver, Quantity);
		String qty = driver.findElement(Quantity).getAttribute("value");
		System.out.println("Print the Quantity value for the selected IPO : '"+qty+"'");
		
		utilities.webDriverWait(driver, QtyUseFromStock);
		String qtyStk = driver.findElement(QtyUseFromStock).getAttribute("value");
		System.out.println("Print the Quantity Use from Stock value for the selected IPO : '"+qtyStk+"'");
		
		utilities.webDriverWait(driver, QtyToBeBought);
		String qtyBought = driver.findElement(QtyToBeBought).getAttribute("value");
		System.out.println("Print the Quantity to be Brought value for the selected IPO : '"+qtyBought+"'");

		utilities.webDriverWait(driver, Totalamt);
		String totAmt = driver.findElement(Totalamt).getText();
		System.out.println("Print the Total Amount value for the selected IPO : '"+totAmt+"'");
		
	}
	public void Verify_whether_navigated_to_the_Revise_PO_for_Trims_screen() throws Throwable {
		utilities.webDriverWait(driver, navTrimPO);
		String TrimPO = driver.findElement(navTrimPO).getText();
		System.out.println("Navigated to : '"+TrimPO+"'");
	}
	public void Click_on_Print_icon_for_a_PO() throws Throwable {
		utilities.webDriverWait(driver, buttPrint);
		driver.findElement(buttPrint).click();
		
	}
	public void Click_on_Cancel_icon_in_grid() throws Throwable {
		utilities.webDriverWait(driver, butCancel);
		driver.findElement(butCancel).click();
		
	}
	public void Verify_the_Cancel_popup() throws Throwable {
		utilities.webDriverWait(driver, popupCancel);
		String popup = driver.findElement(popupCancel).getText();
		System.out.println("Print the popup window : '"+popup+"'");
	}
	public void Click_on_the_No_option_in_the_Cancel_popup() throws Throwable {
		utilities.webDriverWait(driver, popupNo);
		driver.findElement(popupNo).click();
	}
	public void Click_on_the_Yes_option_in_the_Cancel_popup() throws Throwable {
		utilities.webDriverWait(driver, popupYes);
		driver.findElement(popupYes).click();
		
	}
	public void Verify_the_Cancel_validation_msg() {
		driver.findElement(By.xpath("//h2")).click();
		String validMsg = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("Print the successful Cancel validation msg : '"+validMsg+"'");
	}
	public void Verifying_the_Sorting_functionality_of_grid_headers() throws Throwable {
		utilities.webDriverWait(driver, PODetailssortingicon);
		driver.findElement(PODetailssortingicon).click();
		System.out.println("Clicked on the PO Details sort icon in the grid");
		
		utilities.webDriverWait(driver, ApplicableIPOsorticon);
		driver.findElement(ApplicableIPOsorticon).click();
		System.out.println("Clicked on the Applicable IPO sort icon in the grid");
		
		utilities.webDriverWait(driver, TrimDetailssorticon);
		driver.findElement(TrimDetailssorticon).click();
		System.out.println("Clicked on the Trim Details sort icon in the grid");
		
		utilities.webDriverWait(driver, TrimProcesssorticon);
		driver.findElement(TrimProcesssorticon).click();
		System.out.println("Clicked on the Trim Process sort icon in the grid");
		
		utilities.webDriverWait(driver, MUDetailssorticon);
		driver.findElement(MUDetailssorticon).click();
		System.out.println("Clicked on the MU Details sort icon in the grid");		
		
		utilities.webDriverWait(driver, QtyDetailssorticon);
		driver.findElement(QtyDetailssorticon).click();
		System.out.println("Clicked on the Qty Details sort icon in the grid");		
		
		utilities.webDriverWait(driver, Statussorticon);
		driver.findElement(Statussorticon).click();
		System.out.println("Clicked on the Status sort icon in the grid");
	}
	
	
	
	
	
	



	
}
