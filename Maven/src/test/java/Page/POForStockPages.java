package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverFactory;
import util.Utilities;

public class POForStockPages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	CreatePOForStockPage CPOS = new CreatePOForStockPage();
	POMasterSheetpage POMS = new POMasterSheetpage();
	
	int afterTotalRowcount=0;
	int beforeTotalRowcount=0;
	
	By modPOStk 			= By.xpath("//a[text()='PO For Stock']");
	By Fil_Textbox 			= By.xpath("//input[@role='textbox']");
	By FilterSH 			= By.xpath("//a[@id='sidebarCollapse']");
	By Fil_Supplier 		= By.xpath("//p-multiselect[@filterby='supplierName']");
	By Fil_Supp 			= By.xpath("//div[@class='p-multiselect-filter-container ng-tns-c92-418 ng-star-inserted']//input[@type='text']");
	By Fil_sel_Supplier 	= By.xpath("//div[text()='Soujanya']");
	By Fil_FabQty 			= By.xpath("//p-multiselect[@optionlabel='fabricName']");
	By Fil_ent_FabQty 		= By.xpath("//input[@role='textbox']");
	By Fil_sel_FabQty 		= By.xpath("//div[text()='Raw silk']");
	By Fil_Sel_Style 		= By.xpath("//input[@formcontrolname='searchText']");
	By butt_AddDataEntry 	= By.xpath("//button[text()=' Add Data Entry']");
	By navCreatePOStk 		= By.xpath("//h3[text()='Create PO for Stock']");
	static By tab_PO 		= By.xpath("//p-table[@class='p-element']");
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
		 Actions actions = new Actions(driver);
			utilities.webDriverWait(driver,cancel_toastermsg);
			driver.findElement(cancel_toastermsg).click();
			utilities.MediumWait(driver);
			 
			WebElement SuccCancelmsg = driver.findElement(cancel_toastermsg);
//			Actions actions = new Actions(driver);
			driver.findElement(cancel_toastermsg).click();
			actions.moveToElement(SuccCancelmsg).perform();
			String DisplaySuccCancelmsg = SuccCancelmsg.getText();
			utilities.MinimumWait(driver);
			System.out.println("Display successful cancellation toaster msg as - "+DisplaySuccCancelmsg);
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

}
