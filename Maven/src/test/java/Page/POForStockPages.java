package Page;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class POForStockPages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	CreatePOForStockPage CPOS = new CreatePOForStockPage();
	POMasterSheetpage POMS = new POMasterSheetpage();
	
	int afterTotalRowcount=0;
	int beforeTotalRowcount=0;
	
	By modPOStk = By.xpath("//a[text()='PO For Stock']");
	By Fil_Textbox = By.xpath("//input[@role='textbox']");
	By FilterSH = By.xpath("//a[@id='sidebarCollapse']");
	By Fil_Supplier = By.xpath("//p-multiselect[@filterby='supplierName']");
	By Fil_Supp = By.xpath("//div[@class='p-multiselect-filter-container ng-tns-c92-418 ng-star-inserted']//input[@type='text']");
	By Fil_sel_Supplier = By.xpath("//div[text()='Soujanya']");
	By Fil_FabQty = By.xpath("//p-multiselect[@optionlabel='fabricName']");
	By Fil_ent_FabQty = By.xpath("//input[@role='textbox']");
	By Fil_sel_FabQty = By.xpath("//div[text()='Raw silk']");
	By Fil_Sel_Style = By.xpath("//input[@formcontrolname='searchText']");
	By butt_AddDataEntry 	= By.xpath("//button[text()=' Add Data Entry']");
	By navCreatePOStk 		= By.xpath("//h3[text()='Create PO for Stock']");
	static By tab_PO 				= By.xpath("//p-table[@class='p-element']");
	By page_next			= By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/following-sibling::button[1]");
	By butt_Cancel 			= By.xpath("//button[@id='closepagebutton']");
	By navPOforStock		= By.xpath("//div[contains(@class,'page_title_left d-flex')]//h3[1]");
	By butt_POFSCancel		= By.xpath("(//a[@title='Cancel'])[1]");
	By can_popmsg_Cancel	= By.xpath("//img[@class='swal2-image']/following-sibling::h2[1]");
	By can_pop_Yes			= By.xpath("//button[text()='Yes']");
	By can_pop_No			= By.xpath("(//button[text()='No'])[2]");
	By cancel_toastermsg	= By.cssSelector("//div[contains(@class,'swal2-popup swal2-toast')]//h2[1]");
	By status_value			= By.xpath("(//td[text()='Cancelled'])[2]");
	By Status_sort			= By.xpath("(//p-sorticon[@class='p-element'])[5]");
	By butt_RevisedPO		= By.xpath("(//a[@title='Revise PO'])[1]");
	By navRevPOStk			= By.xpath("//div[contains(@class,'page_title_left d-flex')]");
	By navPOForStock		= By.xpath("//h3[text()='PO For Stock']");
	By OriginalQty			= By.xpath("//input[@formcontrolname='actualtotalqtyRequired']");
	By Supplier				= By.xpath("//p-autocomplete[@placeholder='Search By Supplier Name']");
	
	

	public void Navigate_to_PO_For_Stock_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, RMUW.modFabricSourcing);
		driver.findElement(RMUW.modFabricSourcing).click();
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, RMUW.DataEntry);
		driver.findElement(RMUW.DataEntry).click();
		utilities.webDriverWait(driver, CPOS.modGeneratePO);
		driver.findElement(CPOS.modGeneratePO).click();
		utilities.webDriverWait(driver, modPOStk);
		driver.findElement(modPOStk).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_Filter_showhide_button() throws Throwable {
		utilities.webDriverWait(driver, FilterSH);
		driver.findElement(FilterSH).click();	
	}


	public void Enter_the_Style_name_in_Search_By_Style_field() throws Throwable {
		utilities.webDriverWait(driver, Fil_Sel_Style);
		driver.findElement(Fil_Sel_Style).click();
		driver.findElement(Fil_Sel_Style).sendKeys("Style");
		utilities.MinimumWait(driver);
		
//		utilities.webDriverWait(driver, CardHeader);
//		driver.findElement(CardHeader).click();
//		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  //To scroll the page
		js.executeScript("scrollBy(0, 500)");
		
		utilities.webDriverWait(driver, POMS.Pagination);
		WebElement Before = driver.findElement(POMS.Pagination);
		String NumberofRecords = Before.getText();
		System.out.println("Displaying no of records before applying the filter:   " +  NumberofRecords);
		System.out.println();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, POMS.Applybutton);
		driver.findElement(POMS.Applybutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, POMS.Pagination);
		WebElement After = driver.findElement(POMS.Pagination);
		String NumberofRecords1 = After.getText();
		System.out.println("Displaying no of records after applying the filter:   " +  NumberofRecords1);
		System.out.println();
		utilities.MinimumWait(driver);

            System.out.println("Records displaying as per the merchant selection: " + NumberofRecords1);
            System.out.println();
            
            System.out.println("Total No of Records:  " + NumberofRecords);
            System.out.println();
            
        utilities.MinimumWait(driver);
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;  //To Scroll the page
		js1.executeScript("scrollBy(0, -500)");
		
		utilities.webDriverWait(driver, POMS.Resetbutton);
		driver.findElement(POMS.Resetbutton).click();
		utilities.MinimumWait(driver);		
	}

	public void Click_on_the_Add_Data_Entry_button() throws Throwable {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scrollTo(0, 0)");
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, butt_AddDataEntry);
		driver.findElement(butt_AddDataEntry).click();
	}

	public void Verify_whether_the_page_is_navigated_to_the_Create_PO_For_Stock_or_not() throws Throwable {
		utilities.webDriverWait(driver, navCreatePOStk);
		driver.findElement(navCreatePOStk).isDisplayed();
		WebElement C_POStk = driver.findElement(navCreatePOStk);
		String CrePOStk = C_POStk.getText();
		System.out.println("Navigated to " +CrePOStk + " screen");
		
	}

	public void Verify_the_count_of_the_PO_Records_in_the_PO_grid_before_adding_the_PO_record() throws Throwable {
		 utilities.webDriverWait(driver, tab_PO);
		    WebElement table = driver.findElement(tab_PO);
		    // Get the row count on the current page
		    int rowCountOnCurrentPage = table.findElements(By.tagName("tr")).size();
		    // Check if there is pagination
		    WebElement nextPageButton = driver.findElement(page_next);
		    int gridRowCount = rowCountOnCurrentPage;
		    // Loop through pages and get the total row count
		    while (nextPageButton.isEnabled()) {
		        nextPageButton.click();
		        utilities.webDriverWait(driver, tab_PO);
		        table = driver.findElement(tab_PO);
		        rowCountOnCurrentPage = table.findElements(By.tagName("tr")).size();
		        gridRowCount += rowCountOnCurrentPage;
		        // Check if there is another next page
		        nextPageButton = driver.findElement(page_next);
		    }

		    beforeTotalRowcount = gridRowCount -8;
		    System.out.println("Total number of PO Records in the PO grid before adding the PO record: " + beforeTotalRowcount);
	}

	public void Click_on_the_Cancel_button_in_the_Print_Preview_form() throws Throwable {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("scrollTo(0, 500)");
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, butt_Cancel);
		driver.findElement(butt_Cancel).click();
	}

	public void Verify_whether_the_page_is_navigated_to_the_PO_For_Stock_or_not() throws Throwable {
		utilities.webDriverWait(driver, modPOStk);
		driver.findElement(modPOStk).click();
		utilities.webDriverWait(driver, navPOforStock);
		driver.findElement(navPOforStock).isDisplayed();
		WebElement POStk = driver.findElement(navPOforStock);
		String POforStk = POStk.getText();
		System.out.println("Navigated to " +POforStk + " screen");
	}

	public void Verify_the_count_of_the_PO_Records_in_the_PO_grid_after_adding_the_PO_record() throws Throwable {
		driver.navigate().refresh();
		
		utilities.webDriverWait(driver, tab_PO);
	    WebElement table = driver.findElement(tab_PO);
	    // Get the row count on the current page
	    int rowCountOnCurrentPage = table.findElements(By.tagName("tr")).size();
	    // Check if there is pagination
	    WebElement nextPageButton = driver.findElement(page_next);
	    int gridRowCount = rowCountOnCurrentPage;
	    // Loop through pages and get the total row count
	    while (nextPageButton.isEnabled()) {
	        nextPageButton.click();
	        utilities.webDriverWait(driver, tab_PO);
	        table = driver.findElement(tab_PO);
	        rowCountOnCurrentPage = table.findElements(By.tagName("tr")).size();
	        gridRowCount += rowCountOnCurrentPage;
	        // Check if there is another next page
	        nextPageButton = driver.findElement(page_next);
	    }

	    afterTotalRowcount = gridRowCount -8;
	    System.out.println("Total number of PO Records in the PO grid after adding the PO record: " + afterTotalRowcount);

	}

	public void Verify_whether_the_added_PO_record_is_added_to_the_grid() throws Throwable {
//		POForStockPages POFSP = new POForStockPages();
//		POFSP.Verify_the_count_of_the_PO_Records_in_the_PO_grid_after_adding_the_PO_record();
//		POFSP.Verify_the_count_of_the_PO_Records_in_the_PO_grid_before_adding_the_PO_record();
		System.out.println(beforeTotalRowcount);
		System.out.println(afterTotalRowcount);
		
		
		int diff = afterTotalRowcount - beforeTotalRowcount;
		System.out.println("print the difference - "+diff);	
		if (diff==1) {
			System.out.println("Display the PO record has added to the grid");	
		}
		
		
	}

	public void Click_on_the_Cancel_button_for_a_combination_stock_record() throws Throwable {
		utilities.webDriverWait(driver, Status_sort);
		driver.findElement(Status_sort).click();
		driver.findElement(Status_sort).click();
		utilities.webDriverWait(driver, butt_POFSCancel);
		driver.findElement(butt_POFSCancel).click();
		utilities.webDriverWait(driver,can_popmsg_Cancel);
		System.out.println("Displayed cancelled Toaster msg");
		driver.findElement(can_popmsg_Cancel).isDisplayed();
		WebElement Cancelmsg = driver.findElement(can_popmsg_Cancel);
		String popupCanmsg = Cancelmsg.getText();
		System.out.println("Cancel pop-up msg is displayed as - "+popupCanmsg);
	}

	public void Verify_whether_the_Cancel_toaster_msg_is_displayed() throws Throwable {
//		utilities.webDriverWait(driver,can_popmsg_Cancel);
//		System.out.println("Displayed cancelled Toaster msg");
//		driver.findElement(can_popmsg_Cancel).isDisplayed();
//		WebElement Cancelmsg = driver.findElement(can_popmsg_Cancel);
//		String popupCanmsg = Cancelmsg.getText();
//		System.out.println("Cancel pop-up msg is displayed as - "+popupCanmsg);
	}

	public void Verify_whether_the_respective_record_is_not_Cancelled_on_clicking_the_NO_option() throws Throwable {
		utilities.webDriverWait(driver,can_pop_No);
		driver.findElement(can_pop_No).click();
	}

	public void Click_on_Yes_option_in_the_cancel_toaster_msg() throws Throwable {
	
		utilities.webDriverWait(driver,can_pop_Yes);
		driver.findElement(can_pop_Yes).click();
//		 Actions actions = new Actions(driver);
//			utilities.webDriverWait(driver,cancel_toastermsg);
//			driver.findElement(cancel_toastermsg).click();
//			utilities.MediumWait(driver);
//			 
//			WebElement SuccCancelmsg = driver.findElement(cancel_toastermsg);
////			Actions actions = new Actions(driver);
//			driver.findElement(cancel_toastermsg).click();
//			actions.moveToElement(SuccCancelmsg).perform();
//			String DisplaySuccCancelmsg = SuccCancelmsg.getText();
//			utilities.MinimumWait(driver);
//			System.out.println("Display successful cancellation toaster msg as - "+DisplaySuccCancelmsg);
//		 actions.moveToElement(subElement).click().perform();
	}

	public void Verify_whether_the_Successfull_msg_is_displayed_or_not() throws Throwable {
//		 Actions actions = new Actions(driver);
//		utilities.webDriverWait(driver,cancel_toastermsg);
//		driver.findElement(cancel_toastermsg).click();
//		utilities.MediumWait(driver);
//		WebElement SuccCancelmsg = driver.findElement(cancel_toastermsg);
//		actions.moveToElement(SuccCancelmsg).click().perform();
//		Thread.sleep(10000);
//		String DisplaySuccCancelmsg = SuccCancelmsg.getText();
//		System.out.println("Display successful cancellation toaster msg as - "+DisplaySuccCancelmsg);
	}

	public void Verify_whether_the_Status_is_changed_to_Cancelled_state_under_Status_column() throws Throwable  {
		utilities.webDriverWait(driver, status_value);
		driver.findElement(status_value).isDisplayed();
		WebElement status = driver.findElement(status_value);
		String Statusname = status.getText();
		System.out.println("Status Name - "+Statusname);
	}

	public void Click_on_the_Revise_PO_button() throws Throwable {
		utilities.webDriverWait(driver,butt_RevisedPO);
		driver.findElement(butt_RevisedPO).click();
	}

	public void Verify_whether_the_page_is_navigated_to_Revised_PO_For_Stock_form() throws Throwable {
		utilities.webDriverWait(driver,navRevPOStk);
		driver.findElement(navRevPOStk).isDisplayed();
		WebElement Revstk = driver.findElement(navRevPOStk);
		String navRevstk = Revstk.getText();
		System.out.println("Navigated to "+navRevstk);
	}

	public void Update_the_Residual_Shrinkage_value() throws Throwable {
		utilities.webDriverWait(driver, CPOS.Residual);
		driver.findElement(CPOS.Residual).clear();
		driver.findElement(CPOS.Residual).sendKeys("10");
	}

	public void Update_the_Quantity_value() throws Throwable {
		WebElement inputField = driver.findElement(CPOS.Qty);
		String currentValue = inputField.getAttribute("value");
		int intValue = Integer.parseInt(currentValue);
		int newValue = intValue + 100;
		String newValueAsString = String.valueOf(newValue);
		inputField.clear();
		inputField.sendKeys(newValueAsString);
		
		
//		utilities.webDriverWait(driver, CPOS.Qty);
//		driver.findElement(CPOS.Qty).clear();
//		driver.findElement(CPOS.Qty).sendKeys("4000");
		
	}

	public void Click_on_the_Save_button_in_the_Revised_PO_For_Stock_form() throws Throwable {
		utilities.webDriverWait(driver, CPOS.butt_Save);
		driver.findElement(CPOS.butt_Save).click();
	}

	public void Verify_whether_page_is_navigated_to_PO_For_Stock_screen() throws Throwable {
		utilities.webDriverWait(driver, navPOForStock);
		driver.findElement(navPOForStock).isDisplayed();
		WebElement POstk = driver.findElement(navPOForStock);
		String navPOstk = POstk.getText();
		System.out.println("Navigated to "+navPOstk);
	}

	public void Print_the_PO_Details_section_values() throws Throwable {
//		utilities.webDriverWait(driver, CPOS.Ordertype);
		driver.findElement(CPOS.Ordertype).isDisplayed();
		WebElement Order = driver.findElement(CPOS.Ordertype);
		if (Order.isDisplayed()) {
			Select dropdown = new Select(Order);
		    String orderText = dropdown.getFirstSelectedOption().getText();
		    System.out.println("Print the displayed Type of Order value: " + orderText);
		} else {
		    System.out.println("The Order type element is not displayed.");
		}
		
//		utilities.webDriverWait(driver, CPOS.PODate);
		driver.findElement(CPOS.PODate).isDisplayed();
		WebElement Date = driver.findElement(CPOS.PODate);
		String PODate = Date.getAttribute("value");
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;
		date = inputFormat.parse(PODate);
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate = outputFormat.format(date);
		System.out.println("Print the displayed PO Date date - "+formattedDate);
		
//		utilities.webDriverWait(driver, CPOS.POnum);
		driver.findElement(CPOS.POnum).isDisplayed();
		WebElement num = driver.findElement(CPOS.POnum);
		String POnum = num.getAttribute("value");
		System.out.println("Print the displayed PO Number value - "+POnum);
		
//		utilities.webDriverWait(driver, CPOS.Buyer);
//		driver.findElement(CPOS.Buyer).isDisplayed();
//		WebElement buyer = driver.findElement(CPOS.Buyer);
//		String PObuyer = buyer.getText();
//		System.out.println("Print the displayed PO Buyer value - "+PObuyer);
//		
//		utilities.webDriverWait(driver, CPOS.Style);
//		driver.findElement(CPOS.Style).isDisplayed();
//		WebElement Sty = driver.findElement(CPOS.Style);
//		String POSty = Sty.getText();
//		System.out.println("Print the displayed Style name - "+POSty);
		
	}

	public void Update_the_Delevery_To_field_value() throws Throwable {
		utilities.webDriverWait(driver, CPOS.Delivery);
		WebElement deli = driver.findElement(CPOS.Delivery);
		String DeliveryTo = deli.getAttribute("value");
		System.out.println("Display the previous Delivery To name - "+DeliveryTo);
		driver.findElement(CPOS.Delivery).click();
		driver.findElement(CPOS.Delivery).clear();
		driver.findElement(CPOS.Delivery).sendKeys("Ani");
		utilities.webDriverWait(driver, CPOS.sec_Delivery);
		driver.findElement(CPOS.sec_Delivery).click();
		utilities.MinimumWait(driver);
		WebElement deli2 = driver.findElement(CPOS.Delivery);
		String DeliveryTo2 = deli2.getAttribute("value");
		System.out.println("Display the updated Delivery To name - "+DeliveryTo2);
	}

	public void Print_the_Address_and_GSTIn_field_values() throws Throwable {
//		utilities.webDriverWait(driver, CPOS.Dev_Address);
		driver.findElement(CPOS.Dev_Address).isDisplayed();
		WebElement add = driver.findElement(CPOS.Dev_Address);
		String Address = add.getAttribute("value");
		System.out.println("Print the selected Delivery factory address - "+Address);
		
//		utilities.webDriverWait(driver, CPOS.Dev_GST);
		driver.findElement(CPOS.Dev_GST).isDisplayed();
		WebElement gst = driver.findElement(CPOS.Dev_GST);
		String GST = gst.getAttribute("value");
		System.out.println("Print the selected Delivery factory GSTIN number - "+GST);
		
		
	}

	public void Print_Supplier_Details_section_values() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;  //To scroll the page
		js.executeScript("scrollBy(0, 500)");
		
//	utilities.webDriverWait(driver, Supplier);
//		driver.findElement(Supplier).isDisplayed();
//		WebElement supp = driver.findElement(Supplier);
//		if (supp.isDisplayed()) {
//			Select dropdown = new Select(supp);
//		    String Supplier = dropdown.getFirstSelectedOption().getText();
//		    System.out.println("Print the selected Supplier name - "+ Supplier);
//		} else {
//		    System.out.println("The Delivery Term value is not displayed.");
//		}
	

		driver.findElement(Supplier).click();
		WebElement supp = driver.findElement(Supplier);
		String Supplier = supp.getText();
		System.out.println("Print the selected Supplier name - "+Supplier);
		
//		utilities.webDriverWait(driver, CPOS.Sup_Address);
		driver.findElement(CPOS.Sup_Address).isDisplayed();
		WebElement supAdd = driver.findElement(CPOS.Sup_Address);
		String supAddress = supAdd.getAttribute("value");
		System.out.println("Print the selected Supplier Address - "+supAddress);
		
//		utilities.webDriverWait(driver, CPOS.Sup_GST);
		driver.findElement(CPOS.Sup_GST).isDisplayed();
		WebElement supGST = driver.findElement(CPOS.Sup_GST);
		String supGSTIn = supGST.getAttribute("value");
		System.out.println("Print the selected Supplier GSTIN number - "+supGSTIn);
		
//		utilities.webDriverWait(driver, CPOS.PaymentTerm);
		driver.findElement(CPOS.PaymentTerm).isDisplayed();
		WebElement Payment = driver.findElement(CPOS.PaymentTerm);
		String PaymentTerms = Payment.getAttribute("value");
		System.out.println("Print the Payment Terms value displayed - "+PaymentTerms);
		
//		utilities.webDriverWait(driver, CPOS.DeliveryTerm);
		driver.findElement(CPOS.DeliveryTerm).isDisplayed();
		WebElement Delivery = driver.findElement(CPOS.DeliveryTerm);
		if (Delivery.isDisplayed()) {
			Select dropdown = new Select(Delivery);
		    String deliveryterms = dropdown.getFirstSelectedOption().getText();
		    System.out.println("Print the Delivery Term value displayed : " + deliveryterms);
		} else {
		    System.out.println("The Delivery Term value is not displayed.");
		}
				
		
//		utilities.webDriverWait(driver, CPOS.LeadTime);
		driver.findElement(CPOS.LeadTime).isDisplayed();
		WebElement Time = driver.findElement(CPOS.LeadTime);
		String LeadTime = Time.getAttribute("value");
		System.out.println("Print the entered Lead Time - "+LeadTime );
	}

	public void Print_the_Process_name() throws Throwable {
		
//		utilities.webDriverWait(driver, CPOS.Process);
		driver.findElement(CPOS.Process).isDisplayed();
		WebElement process = driver.findElement(CPOS.Process);
		if (process.isDisplayed()) {
			Select dropdown = new Select(process);
		    String processName = dropdown.getFirstSelectedOption().getText();
		    System.out.println("Print the selected Process name : " + processName);
		} else {
		    System.out.println("The Process name is not displayed.");
		}
		
		
		
		
//		utilities.webDriverWait(driver, CPOS.Process);
//		driver.findElement(CPOS.Process).isDisplayed();
//		WebElement process = driver.findElement(CPOS.Process);
//		String processName = process.getAttribute("value");
//		System.out.println("Print the selected Process name - "+processName);

	}

	public void Print_the_Fabric_Type_and_Name() throws Throwable {
		
//		utilities.webDriverWait(driver, CPOS.FabricType);
		driver.findElement(CPOS.FabricType).isDisplayed();
		WebElement fabric = driver.findElement(CPOS.FabricType);
		if (fabric.isDisplayed()) {
			Select dropdown = new Select(fabric);
		    String fabricType = dropdown.getFirstSelectedOption().getText();
		    System.out.println("Print the selected Fabric Type : " + fabricType);
		} else {
		    System.out.println("The Fabric Type is not displayed.");
		}
		
//			
//        utilities.webDriverWait(driver,CPOS.FabricType);
        WebElement fabricTypeElement = driver.findElement(CPOS.FabricType);

        // Click to open the ng-select dropdown
        fabricTypeElement.click();

        // Wait for the dropdown options to appear
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ng-dropdown-panel")));

        // Get the selected option text
        String fabricName = fabricTypeElement.getAttribute("value");
//        		(String) ((JavascriptExecutor) driver)
//        		.executeScript("return arguments[0].selectedItems[0].label;", fabricTypeElement);

        System.out.println("Print the selected Fabric Name - " + fabricName);

		
		
		
		
//		FabricName
//		utilities.webDriverWait(driver, CPOS.FabricType);
//		driver.findElement(CPOS.FabricType).isDisplayed();
//		WebElement fabricqly = driver.findElement(CPOS.FabricType);
//		String fabricName = fabricqly.getText();
//		System.out.println("Print the selected Fabric Name - "+fabricName);
	}

	public void Print_Content_Count_GSM_Cuttable_Width_and_Color_field_values() throws Throwable {
//		utilities.webDriverWait(driver, CPOS.Content);
		driver.findElement(CPOS.Content).isDisplayed();
		WebElement content = driver.findElement(CPOS.Content);
		String FabContent = content.getAttribute("value");
		System.out.println("Print the selected Fabric Content - "+FabContent);
		
//		utilities.webDriverWait(driver, CPOS.Count);
		driver.findElement(CPOS.Count).isDisplayed();
		WebElement count = driver.findElement(CPOS.Count);
		String fabriccount = count.getAttribute("value");
		System.out.println("Print the selected Fabric Count/Construction - "+fabriccount);
		
//		utilities.webDriverWait(driver, CPOS.GSM);
		driver.findElement(CPOS.GSM).isDisplayed();
		WebElement gsm = driver.findElement(CPOS.GSM);
		String fabricGSM = gsm.getAttribute("value");
		System.out.println("Print the selected Fabric GSM- "+fabricGSM);
		
//		utilities.webDriverWait(driver, CPOS.CuttableWdt);
		driver.findElement(CPOS.CuttableWdt).isDisplayed();
		WebElement fab = driver.findElement(CPOS.CuttableWdt);
		String fabCW = fab.getAttribute("value");
		System.out.println("Print the selected Fabric Cuttable Width - "+fabCW);
		
//		utilities.webDriverWait(driver, CPOS.Color);
		driver.findElement(CPOS.Color).isDisplayed();
		WebElement Color = driver.findElement(CPOS.Color);
		String fabricColor= Color.getText();
		System.out.println("Print the selected Fabric Color - "+fabricColor);
	}

	public void Print_Original_and_Revised_Qtys_under_the_Quantity_Details_section() throws Throwable {
//		utilities.webDriverWait(driver, OriginalQty);
		driver.findElement(OriginalQty).isDisplayed();
		WebElement origqty = driver.findElement(OriginalQty);
		String OriginalQty = origqty.getAttribute("value");
		System.out.println("Print the Original Qty Required value - "+OriginalQty);
		
		
//		utilities.webDriverWait(driver, CPOS.QtyReq);
		driver.findElement(CPOS.QtyReq).isDisplayed();
		WebElement revqty = driver.findElement(CPOS.QtyReq);
		String RevisedQty = revqty.getAttribute("value");
		System.out.println("Print the Revised Qty Required value - "+RevisedQty);
	}

	public void Verify_the_Process_Loss_Qty_Allowed_Currency_Rate_and_UOM_field_values() throws Throwable {
//		utilities.webDriverWait(driver, CPOS.ProcessLoss);
		driver.findElement(CPOS.ProcessLoss).isDisplayed();
		WebElement procLoss = driver.findElement(CPOS.ProcessLoss);
		String Processloss = procLoss.getAttribute("value");
		System.out.println("Print the displayed Process Loss value - "+Processloss);
		
//		utilities.webDriverWait(driver, CPOS.QtyAllowed);
		driver.findElement(CPOS.QtyAllowed).isDisplayed();
		WebElement qtyall= driver.findElement(CPOS.QtyAllowed);
		String qtyallowed = qtyall.getAttribute("value");
		System.out.println("Print the displayed +/-Qty Allowed value - "+qtyallowed);
		
//		utilities.webDriverWait(driver, CPOS.Currency);
		driver.findElement(CPOS.Currency).isDisplayed();
		WebElement curr = driver.findElement(CPOS.Currency);
		if (curr.isDisplayed()) {
			Select dropdown = new Select(curr);
		    String currency = dropdown.getFirstSelectedOption().getText();
		    System.out.println("Print the displayed Currency name : " + currency);
		} else {
		    System.out.println("The Currency Name is not displayed.");
		}
				
//		utilities.webDriverWait(driver, CPOS.Currency);
//		driver.findElement(CPOS.Currency).isDisplayed();
//		WebElement curr = driver.findElement(CPOS.Currency);
//		String currency = curr.getAttribute("value");
//		System.out.println("Print the displayed Currency name - "+currency);
		
//		utilities.webDriverWait(driver, CPOS.Rate);
		driver.findElement(CPOS.Rate).isDisplayed();
		WebElement rate = driver.findElement(CPOS.Rate);
		String MURate = rate.getAttribute("value");
		System.out.println("Print the displayed Rate value - "+MURate);
		
		
//		utilities.webDriverWait(driver, CPOS.UOM);
		driver.findElement(CPOS.UOM).isDisplayed();
		WebElement UOM = driver.findElement(CPOS.UOM);
		if (UOM.isDisplayed()) {
			Select dropdown = new Select(UOM);
		    String secUOM = dropdown.getFirstSelectedOption().getText();
		    System.out.println("Print the displayed UOM unit name : " + secUOM);
		} else {
		    System.out.println("The UOM Unit Name is not displayed.");
		}
		
		
		
		
//		utilities.webDriverWait(driver, CPOS.UOM);
//		driver.findElement(CPOS.UOM).isDisplayed();
//		WebElement UOM = driver.findElement(CPOS.UOM);
//		String secUOM = UOM.getAttribute("value");
//		System.out.println("Print the displayed UOM unit name - "+secUOM);
		
		
	}

	public void Click_on_the_Sample_field_under_the_Stock_Details_grid() throws Throwable {
		utilities.webDriverWait(driver, CPOS.Sampling);
		driver.findElement(CPOS.Sampling).click();
	}

}
