package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	By SelectDeliver				= By.xpath("//span[text()='JIVA DESIGNS PVT. LTD.']");
	By DeliverAddress				= By.xpath("//input[@formcontrolname='deliverAddress']");
	By DeliverGST					= By.xpath("//input[@formcontrolname='deliverGstNumber']");
	By Supplier						= By.xpath("//input[@placeholder='Search By Supplier']");
	By Selectsupplier				= By.xpath("//span[text()='Anil']");
	By SupplierAddress				= By.xpath("//input[@formcontrolname='supplierAddress']");
	By SupplierGST					= By.xpath("//input[@formcontrolname='gstNumber']");
	By SupplierPaymentterms			= By.xpath("//input[@formcontrolname='paymentTypeId']");
	By SupDeliveryterms				= By.xpath("//select[@formcontrolname='deliveryTypeId']");
	By Leadtime						= By.xpath("//input[@formcontrolname='leadtime']");
	By FabricDetails				= By.xpath("//h5[text()='Fabric Details']");
	By Process						= By.xpath("//select[@formcontrolname='processTypeId']");
	By selectgriegeprocess			= By.xpath("//select[@formcontrolname='processTypeId']/.//option[text()=' Greige']");
	By FabricType					= By.xpath("//select[@formcontrolname='fabricType']");
	By selectFabricType				= By.xpath("//select[@formcontrolname='fabricType']/.//option[text()=' Woven']");
	By FabricName					= By.xpath("//ng-select[@formcontrolname='fabricName']");
	By SelectFabric					= By.xpath("//span[text()='Raw silk']");
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
	By SelectUOM					= By.xpath("//option[text()=' Meters']");
	By LShortIfAny					= By.xpath("//textarea[@formcontrolname='laddtionalInfo']");
	By Addinfor1					= By.xpath("//textarea[@formcontrolname='addtionalInfo1']");
	By Addinfor2					= By.xpath("//textarea[@formcontrolname='addtionalInfo2']");
	By Addipobutton					= By.xpath("//button[@class='btn btn-md btn-primary float-right ng-star-inserted']");
	By Sno							= By.xpath("(//tr[@class='ng-untouched ng-pristine ng-invalid ng-star-inserted'])[2]/.//td[text()='2']");
	By Deletebutton					= By.xpath("//button[@class='btn btn-outline-danger btn-sm']");
	By Delepopyes					= By.xpath("//button[text()='Yes']");
	By Delepopno					= By.xpath("//div[@class='swal2-actions']/.//button[text()='No'][2]");
	By IPOdropdown					= By.xpath("//ng-select[@formcontrolname='ipoId']");
	By SelectIpo					= By.xpath("//div[@id='abfcdfc8b80d-0']");
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
		driver.findElement(SelectDeliver).click();
	}

	public void Deliver_address_is_displaying_after_selecting_the_deliver_to_details_or_not() throws Throwable {
		utilities.webDriverWait(driver, DeliverAddress);
		driver.findElement(DeliverAddress).click();
		WebElement DelAddress = driver.findElement(DeliverAddress);
				String Address = DelAddress.getAttribute("value");
				System.out.println("Delivery Address:  "  +  Address);
				utilities.MinimumWait(driver);
	}

	public void verify_the_GSTIN_number_is_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, DeliverGST);
		driver.findElement(DeliverGST).click();
		WebElement DelGST = driver.findElement(DeliverGST);
				String GST = DelGST.getAttribute("value");
				System.out.println("GST Number  : "  +  GST);
				utilities.MinimumWait(driver);
		
	}

	public void Enter_supplier_name_and_select_from_the_suggestions() throws Throwable {
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).sendKeys("Anil");
		utilities.MinimumWait(driver);
		driver.findElement(Selectsupplier).click();		
	}

	public void verify_the_supplier_address_after_selecting_the_supplier() throws Throwable {
		utilities.webDriverWait(driver, SupplierAddress);
		driver.findElement(SupplierAddress).click();
		WebElement SupplierAdd = driver.findElement(SupplierAddress);
				String Address = SupplierAdd.getAttribute("value");
				System.out.println("Supplier Address:   "  +   Address);
				utilities.MinimumWait(driver);
		
	}

	public void verify_the_GSTIN_number_is_displaying_after_selecting_the_supplier() throws Throwable {
		utilities.webDriverWait(driver, SupplierGST);
		driver.findElement(SupplierGST).click();
		WebElement GST = driver.findElement(SupplierGST);
				String SupGST = GST.getAttribute("value");
				System.out.println("Supplier GST number:  " +  SupGST);
				utilities.MinimumWait(driver);
		
	}

	public void verify_the_payment_terms_are_displaying_after_selecting_the_supplier() throws Throwable {
		utilities.webDriverWait(driver, SupplierPaymentterms);
//		driver.findElement(SupplierPaymentterms).click();
		WebElement Paymentterms = driver.findElement(SupplierPaymentterms);
		String terms = Paymentterms.getAttribute("value");
		System.out.println("Displaying payment terms:  " + terms);
		utilities.MinimumWait(driver);
		
	}

	public void verify_that_Delivery_terms_are_displaying_after_selecting_the_supplier() throws Throwable {
		utilities.webDriverWait(driver,SupDeliveryterms);
		WebElement deliveryterms = driver.findElement(SupDeliveryterms);
				String Delterms = deliveryterms.getAttribute("value");
				System.out.println("Displaying delivery terms:  "  +   Delterms);
				utilities.MinimumWait(driver);
		
	}

	public void Enter_Lead_time_in_Days() throws Throwable {
		utilities.webDriverWait(driver, Leadtime);
		driver.findElement(Leadtime).sendKeys("3");
		utilities.MinimumWait(driver);
		
		driver.findElement(Leadtime).click();
		utilities.MinimumWait(driver);
		WebElement LEADTIME = driver.findElement(Leadtime);
		String LT = LEADTIME.getAttribute("value");
		System.out.println("Displaying Inserted Leadtime:  " + LT);
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_Fabric_Details_are_displaying_or_not() throws Throwable {
		utilities.webDriverWait(driver, FabricDetails);
		WebElement FabDetails = driver.findElement(FabricDetails);
		String FABRICDETAILS = FabDetails.getAttribute("value");
		System.out.println("Displaying fabric details:  " + FABRICDETAILS);
		utilities.MinimumWait(driver);

	}

	public void Select_Process_from_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Process);
		driver.findElement(Process).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(selectgriegeprocess).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_Fabric_Type() throws Throwable {
		utilities.webDriverWait(driver, FabricType);
		driver.findElement(FabricType).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectFabricType);
		driver.findElement(selectFabricType).click();
		utilities.MinimumWait(driver);
		try {
            Robot robot = new Robot();
		
            robot.delay(2000);
		
            int scrollAmount = 5;
            for (int i = 0; i < scrollAmount; i++) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                robot.delay(500);
            }

        } catch (AWTException e) {
            e.printStackTrace();
        } 
	}

	public void Select_Fabric_Name() throws Throwable {
	
        utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, FabricName);
		driver.findElement(FabricName).click();
		utilities.MinimumWait(driver);
		try {
            Robot robot = new Robot();
		
            robot.delay(2000);
		
            int scrollAmount = 5;
            for (int i = 0; i < scrollAmount; i++) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                robot.delay(500);
            }

        } catch (AWTException e) {
            e.printStackTrace();
        } 
		
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, SelectFabric);
		driver.findElement(SelectFabric).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_that_content_is_prepopulating_after_selecting_the_fabric_name() throws Throwable {
		utilities.webDriverWait(driver, Content);
		driver.findElement(Content).click();
		WebElement content = driver.findElement(Content);
		String CONTENT = content.getAttribute("value");
		System.out.println("Content is prepopulated based on the selection of fabric:  " + CONTENT);
		utilities.MinimumWait(driver);
		
		
	}

	public void verify_that_count_and_construction_is_prepopulated_or_not() throws Throwable {
		 utilities.webDriverWait(driver, CountandConstruction);
		 driver.findElement(CountandConstruction).click();
		 WebElement countandconstruction = driver.findElement(CountandConstruction);
		 String CountConstruction = countandconstruction.getAttribute("value");
		 System.out.println("count and construction is prepopulated based on the selection of fabric:  " +  CountConstruction);
		 utilities.MinimumWait(driver);
		 
		
	}

	public void verify_that_GSM_is_prepopulated_or_not() throws Throwable {
		utilities.webDriverWait(driver, GSM);
		driver.findElement(GSM).click();
		WebElement gsm = driver.findElement(GSM);
		String Gsm = gsm.getAttribute("value");
		System.out.println("GSM is prepopulating based on the selection of fabirc:  " + Gsm);
		utilities.MinimumWait(driver);
		
	}

	public void verify_that_cuttable_width_is_prepopulated_or_not() throws Throwable {
		utilities.webDriverWait(driver, cuttablewidth);
		driver.findElement(cuttablewidth).click();
		WebElement CuttableWidth = driver.findElement(cuttablewidth);
		String Width = CuttableWidth.getAttribute("value");
		System.out.println("Cuttable width is prepopulated based on the selection of fabric:  " + Width);
		utilities.MinimumWait(driver);
		
	}

	public void Select_color_for_the_fabric() throws Throwable {
		utilities.webDriverWait(driver, Color);
		driver.findElement(Color).click();
		WebElement COLOR = driver.findElement(Color);
		String displaycolor = COLOR.getAttribute("value");
		System.out.println("Griege color is prepopulated for the Griege process:  " +  displaycolor);
		utilities.MinimumWait(driver);
		
		
	}

	public void verify_the_qty_required_is_displaying_with_value_based_on_the_selected_process_fabric_and_color() throws Throwable {
		utilities.webDriverWait(driver, QtyRequired);
		
	}

	public void verify_the_qty_available_in_stock_is_displaying_if_qty_is_available() {
		
		
	}

	public void verify_the_residual_shrinkage_is_displaying_with_value_based_on_the_selected_process_fabric_and_color() {
		// TODO Auto-generated method stub
		
	}

	public void verify_that_qty_allowed_is_displaying_with_default_value_or_not() throws Throwable {
		utilities.webDriverWait(driver, QtyAllowed);
		WebElement Quantity = driver.findElement(QtyAllowed);
		String QTYallowed = Quantity.getAttribute("value");
		System.out.println("Displaying default value as:  "  +  QTYallowed);
		utilities.MinimumWait(driver);
		
		driver.findElement(QtyAllowed).clear();
		utilities.MinimumWait(driver);
		driver.findElement(QtyAllowed).sendKeys("5.5");
		utilities.MinimumWait(driver);
		System.out.println("Displaying default value as:  "  +  QTYallowed);
		
	}

	public void verify_that_currency_is_displaying_with_value() throws Throwable {
		utilities.webDriverWait(driver, Currency);
		WebElement Curr = driver.findElement(Currency);
				String CURRENCY = Curr.getAttribute("value");
				System.out.println("Currency is displaying based on the selection of supplier:  " + CURRENCY);
				utilities.MinimumWait(driver);
		
	}

	public void verify_that_rate_is_displaying_with_value_or_not() throws Throwable {
		utilities.webDriverWait(driver, Rate);
		driver.findElement(Rate).click();
		utilities.MinimumWait(driver);
		driver.findElement(Rate).clear();
		utilities.MinimumWait(driver);
		driver.findElement(Rate).sendKeys("8");
		utilities.MinimumWait(driver);
		WebElement rt = driver.findElement(Rate);
		String RATE = rt.getAttribute("Value");
		System.out.println("Displaying the rate: "+ RATE);
		utilities.MinimumWait(driver);
		
	}

	public void verify_that_UOM_is_displayed_or_user_should_select() throws Throwable {
		utilities.webDriverWait(driver, UOM);
		driver.findElement(UOM).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectUOM);
		driver.findElement(SelectUOM).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_data_in_L_Short_If_Any_field() throws Throwable {
		utilities.webDriverWait(driver, LShortIfAny);
		driver.findElement(LShortIfAny).sendKeys("Comments");
		utilities.MinimumWait(driver);
		
		WebElement L = driver.findElement(LShortIfAny);
		String Lshort = L.getAttribute("value");
		System.out.println("Displaying comments:  " + Lshort);
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_data_in_Additional_Information1_field() throws Throwable {
		utilities.webDriverWait(driver, Addinfor1);
		driver.findElement(Addinfor1).sendKeys("Additional Information");
		utilities.MinimumWait(driver);
		
		WebElement Addinformation1 = driver.findElement(Addinfor1);
		String Addinf = Addinformation1.getAttribute("value");
		System.out.println("Displaying comments:  " + Addinf);
		utilities.MinimumWait(driver);	
		
	}

	public void Enter_the_data_in_Additional_Information2_field() throws Throwable {
		utilities.webDriverWait(driver, Addinfor2);
		driver.findElement(Addinfor2).sendKeys("Additional Information 2");
		utilities.MinimumWait(driver);
		
		WebElement Addinformation2 = driver.findElement(Addinfor1);
		String Addinf = Addinformation2.getAttribute("value");
		System.out.println("Displaying comments:  " + Addinf);
		utilities.MinimumWait(driver);	
		
	}

	public void verify_that_Add_IPO_button_is_enable_or_not() throws Throwable {
		utilities.webDriverWait(driver, Addipobutton);
		driver.findElement(Addipobutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Sno);
		driver.findElement(Sno).click();
		WebElement Newrecord = driver.findElement(Sno);
		String NEW = Newrecord.getText();
		System.out.println("Displaying new record:  " + NEW);
		utilities.MinimumWait(driver);
		try {
            Robot robot = new Robot();
		
            robot.delay(2000);
		
            int scrollAmount = 5;
            for (int i = 0; i < scrollAmount; i++) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                robot.delay(500);
            }

        } catch (AWTException e) {
            e.printStackTrace();
        } 
		
	}

	public void click_on_delete_icon_is_able_to_click_or_not() throws Throwable {
		utilities.webDriverWait(driver, Deletebutton);
		driver.findElement(Deletebutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Delepopyes);
		driver.findElement(Delepopyes).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Addipobutton);
		driver.findElement(Addipobutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Deletebutton);
		driver.findElement(Deletebutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Delepopno);
		driver.findElement(Delepopno).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Deletebutton);
		driver.findElement(Deletebutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Delepopyes);
		driver.findElement(Delepopyes).click();
		utilities.MinimumWait(driver);
		
	}

	public void select_the_IPO_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, IPOdropdown);
		driver.findElement(IPOdropdown).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectIpo);
		driver.findElement(SelectIpo).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_due_date_is_displayed_as_current_date() {
		
		
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
