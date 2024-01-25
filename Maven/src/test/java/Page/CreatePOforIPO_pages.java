package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class CreatePOforIPO_pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	
	By FabricSourcingmodule			= By.xpath("//span[text()='Fabric Sourcing ']");
	By DataEntry 					= By.xpath("(//a[@aria-expanded='false']/..//span[text()='Data Entry'])[4]");
	By GeneratePO 					= By.xpath("(//span[text()='Generate PO'])[1]");
	By CreatePOforIPO				= By.xpath("//li[@class='ng-star-inserted mm-active']/.//a[text()=' Create PO for IPO# ']");
	By screenname					= By.xpath("//h3[@class='f_s_25 f_w_700 dark_text mr_30']");
	By TypeofOrder					= By.xpath("//select[@formcontrolname='typeofPo']");
	By selectpurchaseorder			= By.xpath("//select[@formcontrolname='typeofPo']/.//option[text()=' Purchase Order']");
	By selectjoborder				= By.xpath("//select[@formcontrolname='typeofPo']/.//option[text()=' Job Work Order']");
	By POdate						= By.xpath("//input[@formcontrolname='poDate']");
	By POnumber						= By.xpath("//input[@formcontrolname='poNumber']");
	By DeliverTo					= By.xpath("//input[@placeholder='Search By Deliver To']");
	By DeliverAddress				= By.xpath("//input[@formcontrolname='deliverAddress']");
	By DeliverGST					= By.xpath("//input[@formcontrolname='deliverGstNumber']");
	By Supplier						= By.xpath("//input[@placeholder='Search By Supplier']");
	By SupplierAddress				= By.xpath("//input[@formcontrolname='supplierAddress']");
	By SupplierGST					= By.xpath("//input[@formcontrolname='gstNumber']");
	By SupplierPaymentterms			= By.xpath("//input[@formcontrolname='paymentTypeId']");
	By SupDeliveryterms				= By.xpath("//select[@formcontrolname='deliveryTypeId']");
	By Leadtime						= By.xpath("//input[@formcontrolname='leadtime']");
	By Process						= By.xpath("//select[@formcontrolname='processTypeId']");
	By selectgriegeprocess			= By.xpath("//select[@formcontrolname='processTypeId']/.//option[text()=' Greige']");
	By FabricType					= By.xpath("//select[@formcontrolname='fabricType']");
	By selectFabricType				= By.xpath("//select[@formcontrolname='fabricType']/.//option[text()=' Knit']");
	By FabricName					= By.xpath("//ng-select[@formcontrolname='fabricName']");
	By SelectFabric					= By.xpath("");
	By Content						= By.xpath("//select[@formcontrolname='content']");
	By CountandConstruction			= By.xpath("//select[@formcontrolname='countOfConstruction']");
	By GSM							= By.xpath("//select[@formcontrolname='gsm']");
	By cuttablewidth				= By.xpath("//select[@formcontrolname='cuttableWidth']");
	By Color						= By.xpath("//ng-select[@formcontrolname='poColorId']");
	By QtyRequired					= By.xpath("//input[@formcontrolname='totalqtyRequired']");
	By QtyAvailableINStock			= By.xpath("//input[@formcontrolname='totalqtystock']");
	By Residualshrinkage			= By.xpath("//input[@formcontrolname='residualShrinkage']");
	By QtyAllowed					= By.xpath("//input[@formcontrolname='qtyAllowd']");
	By Currency						= By.xpath("//select[@formcontrolname='currencyType']");
	By Rate							= By.xpath("//input[@formcontrolname='totalqtyRate']");
	By UOM							= By.xpath("//select[@formcontrolname='uom']");
	By LShortIfAny					= By.xpath("//textarea[@formcontrolname='laddtionalInfo']");
	By Addinfor1					= By.xpath("//textarea[@formcontrolname='addtionalInfo1']");
	By Addinfor2					= By.xpath("//textarea[@formcontrolname='addtionalInfo2']");
	By Addipobutton					= By.xpath("//button[@class='btn btn-md btn-primary float-right ng-star-inserted']");
	By Deletebutton					= By.xpath("//button[@class='btn btn-outline-danger btn-sm']");
	By SelectIPO					= By.xpath("//ng-select[@formcontrolname='ipoId']");
	By duedate						= By.xpath("//input[@formcontrolname='dueDate']");
	By qtyrequired					= By.xpath("//input[@formcontrolname='qtyrequired']");
	By qtyusefromstock				= By.xpath("//input[@formcontrolname='qtyUsefromStock']");
	By qtytobebought				= By.xpath("//input[@formcontrolname='qtytobeBought']");
	By gridRate						= By.xpath("(//td[@class='text-right'])[1]");
	By gridamount					= By.xpath("(//td[@class='text-right'])[2]");
	
	
	
	public void Click_on_Fabric_sourcing_module() throws Throwable {
		utilities.webDriverWait(driver, FabricSourcingmodule );
		driver.findElement(FabricSourcingmodule).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_Data_Entry_in_fabric_sourcing_module() throws Throwable {
		utilities.webDriverWait(driver, DataEntry);
		driver.findElement(DataEntry).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_Generate_PO() throws Throwable {
		utilities.webDriverWait(driver, GeneratePO);
		driver.findElement(GeneratePO).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void click_on_Create_PO_for_Fabric() throws Throwable {
		utilities.webDriverWait(driver, CreatePOforIPO);
		driver.findElement(CreatePOforIPO).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Create_PO_for_IPO_screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, screenname);
		driver.findElement(screenname).click();
		WebElement ScreenName = driver.findElement(screenname);
		String Name = ScreenName.getText();
		if(ScreenName.isDisplayed()) {
			System.out.println("Displaying the screen name as:   " + Name);
		}else {
			System.out.println("Screen Name is not displaying as:  " + Name);
		}
	}

	public void Select_Type_of_Order() throws Throwable {
		utilities.webDriverWait(driver, TypeofOrder);
		driver.findElement(TypeofOrder).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(selectpurchaseorder).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_PO_Date_is_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, POdate);
//		driver.findElement(POdate).click();
		WebElement PODATE = driver.findElement(POdate);
		String actualdate = PODATE.getText();

		String expecteddate = "25-01-2024";
		
		if(expecteddate.equals(actualdate)) {
			System.out.println("Displaying current Date:  " +  actualdate);
		}else {
			System.out.println("Current Date is not Displaying");
		}
				
		
	}

	public void Verify_the_PO_Number_us_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, POnumber);
		WebElement PONumber = driver.findElement(POnumber);
		String PON = PONumber.getAttribute("value");
		System.out.println("Displaying PO number:  " + PON);
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Deliver_To_details_and_select_from_the_suggestions() throws Throwable {
		utilities.webDriverWait(driver, DeliverTo);
		driver.findElement(DeliverTo).click();
		driver.findElement(DeliverTo).sendKeys("Jiva DESIGNS");
		utilities.MinimumWait(driver);
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
	}

	public void Deliver_address_is_displaying_after_selecting_the_deliver_to_details_or_not() throws Throwable {
		utilities.webDriverWait(driver, DeliverAddress);
		WebElement DelAddress = driver.findElement(DeliverAddress);
				String Address = DelAddress.getText();
				System.out.println("Delivery Address:  "  +  Address);
				utilities.MinimumWait(driver);
	}

	public void verify_the_GSTIN_number_is_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, DeliverGST);
		WebElement DelGST = driver.findElement(DeliverGST);
				String GST = DelGST.getText();
				System.out.println("GST Number  : "  +  GST);
				utilities.MinimumWait(driver);
		
	}

	public void Enter_supplier_name_and_select_from_the_suggestions() throws Throwable {
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).sendKeys("Anil");
		utilities.MinimumWait(driver);
		
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		
	}

	public void verify_the_supplier_address_after_selecting_the_supplier() throws Throwable {
		utilities.webDriverWait(driver, SupplierAddress);
		WebElement SupplierAdd = driver.findElement(SupplierAddress);
				String Address = SupplierAdd.getText();
				System.out.println("Supplier Address:   "  +   Address);
				utilities.MinimumWait(driver);
		
	}

	public void verify_the_GSTIN_number_is_displaying_after_selecting_the_supplier() throws Throwable {
		utilities.webDriverWait(driver, SupplierGST);
		WebElement GST = driver.findElement(SupplierGST);
				String SupGST = GST.getText();
				System.out.println("Supplier GST number:  " +  SupGST);
				utilities.MinimumWait(driver);
		
	}

	public void verify_the_payment_terms_are_displaying_after_selecting_the_supplier() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_Delivery_terms_are_displaying_after_selecting_the_supplier() {
		// TODO Auto-generated method stub
		
	}

	public void Enter_Lead_time_in_Days() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_Fabric_Details_are_displaying_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void Select_Process_from_dropdown_list() {
		// TODO Auto-generated method stub
		
	}

	public void Select_Fabric_Type() {
		// TODO Auto-generated method stub
		
	}

	public void Select_Fabric_Name() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_content_is_prepopulating_after_selecting_the_fabric_name() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_count_and_construction_is_prepopulated_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_GSM_is_prepopulated_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_cuttable_width_is_prepopulated_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void Select_color_for_the_fabric() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_qty_required_is_displaying_with_value_based_on_the_selected_process_fabric_and_color() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_qty_available_in_stock_is_displaying_if_qty_is_available() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_residual_shrinkage_is_displaying_with_value_based_on_the_selected_process_fabric_and_color() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_qty_allowed_is_displaying_with_default_value_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_currency_is_displaying_with_value() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_rate_is_displaying_with_value_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_UOM_is_displayed_or_user_should_select() {
		// TODO Auto-generated method stub
		
	}

	public void Enter_the_data_in_L_Short_If_Any_field() {
		// TODO Auto-generated method stub
		
	}

	public void Enter_the_data_in_Additional_Information1_field() {
		// TODO Auto-generated method stub
		
	}

	public void Enter_the_data_in_Additional_Information2_field() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_Add_IPO_button_is_enable_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void click_on_delete_icon_is_able_to_click_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void select_the_IPO_from_the_dropdown_list() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_due_date_is_displayed_as_current_date() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_quatity_is_displayed_as_greater_than_zero_in_quantity_field() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_quantity_is_displayed_as_greater_than_zero_in_qty_use_from_stock_field() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_quantity_is_displayed_as_greater_than_zero_in_qty_to_be_bought_field() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_rate_value_is_prepopulated_in_grid_or_not() {
		// TODO Auto-generated method stub
		
	}

	public void verify_the_Amount_is_displayed_after_selecting_the_ipo_in_grid() {
		// TODO Auto-generated method stub
		
	}

	public void click_on_save_button_and_verify_that_save_button_is_enable_after_inserting_the_data_in_mandatory_fields() {
		// TODO Auto-generated method stub
		
	}

}
