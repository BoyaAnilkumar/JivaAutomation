package Page;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Page.RevisedMUWorkingPages;
import Page.TrimSheetAcceptancePages;
import util.DriverFactory;
import util.Utilities;

public class TrimSheetWorking_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW 	= new RevisedMUWorkingPages();
	TrimSheetAcceptancePages TSA = new TrimSheetAcceptancePages();
	
	String Addform;
	
	
	By modGenTrimSheetWorking		= By.xpath("//span[text()='Generate Trim Sheet Working']");
	By scrTrimSheetWorking			= By.xpath("//a[text()='Trims Sheet Working']");
	By gridTrimDetails				= By.xpath("//div[@class='card-header']/..//h3[text()='Trim Details']");
	By TrimDetailsHeaders			= By.xpath("(//thead[@class='p-datatable-thead'])[1]");
	By TrimDetailsRecords			= By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[1]");
	By buttEdit						= By.xpath("(//i[@class='ti-pencil'])[1]");
	By navAddTrimform				= By.xpath("//h3[text()='Add Trim Sheet Working']");
	By infCategory					= By.xpath("//small[text()='Category']/following-sibling::p");
	By infItem						= By.xpath("//small[text()='Item']/following-sibling::p");
	By infColor						= By.xpath("//small[text()='Colour']/following-sibling::p");
	By infTotalReqQty				= By.xpath("//small[text()='Total Req Qty']/following-sibling::p");
	By UOM							= By.xpath("//select[@formcontrolname='uomId']");
	By secUOM						= By.xpath("//select[@formcontrolname='uomId']/..//option[@class='ng-star-inserted']");
	By qtydetails					= By.xpath("//select[@formcontrolname='trimDetailsId']");
	By secqtydetails				= By.xpath("//select[@formcontrolname='trimDetailsId']/..//option[@class='ng-star-inserted']");
	By QtyperUnit					= By.xpath("//input[@formcontrolname='qtyPerUnit']");
	By budRate						= By.xpath("//input[@formcontrolname='trimRatePerUnit']");
	By budconvRate					= By.xpath("//input[@formcontrolname='trimConversionRate']");
	By buttSubmit					= By.xpath("//button[text()=' Submit']");
	By buttCancel					= By.xpath("//button[text()=' Cancel']");
	By navTrimSheetWorking			= By.xpath("(//h3[text()='Trim Sheet Working'])[1]");
	By TrimSheetWorking				= By.xpath("(//h3[text()='Trim Sheet Working'])[2]");
	By TrimMUWorkingrecords 		= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[2]");
	By JobWorkgrid					= By.xpath("//h3[text()='Job Work']");
	By JobWorkrecords				= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[3]");
	By buttEdit1					= By.xpath("(//div[@class='card']//child::p-table)[2]//button");
	By toggleDyeing					= By.xpath("//input[@formcontrolname='isDyeing']");
	By MU							= By.xpath("//input[@formcontrolname='dyeingMUPercentage']");
	By GreigeReq					= By.xpath("//input[@formcontrolname='greigeBaseTrimReq']");
	By greigebudRate				= By.xpath("//input[@formcontrolname='greigeRatePerUnit']");
	By greigebudConvRate			= By.xpath("//input[@formcontrolname='greigeConversionRate']");
	By dyeingbudRate				= By.xpath("//input[@formcontrolname='dyeRatePerUnit']");
	By dyeingbudConvRate			= By.xpath("//input[@formcontrolname='dyeConversionRate']");
	By buttSubmitAuditTeam			= By.xpath("//button[text()=' Submit to Audit Team']");
	By toasterMsg					= By.xpath("//div[@role='alert']//h2");
	//h2[text()='Mandatory Fields Are Required With  Valid Data.']
//	By buttCancel					= By.xpath("(//button[text()=' Cancel'])[1]");
	By buttEditJ					= By.xpath("(//div[@class='card']//child::p-table)[3]//button");
	By jobname						= By.xpath("//input[@formcontrolname='jobWorkName']");
	By component					= By.xpath("//p-multiselect[@optionlabel='itemName']");
	By secComponent					= By.xpath("(//li[@class='p-ripple p-element p-multiselect-item'])[1]");
	By JobbudRate					= By.xpath("//input[@formcontrolname='trimRatePerUnit']");
	By navJobworkform				= By.xpath("//h3[text()='Job Work Details']");
	

	public void Navigate_to_Trim_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, TSA.modTrims);
		driver.findElement(TSA.modTrims).click();
		utilities.webDriverWait(driver, TSA.TrimDataEntry);
		driver.findElement(TSA.TrimDataEntry).click();
		utilities.webDriverWait(driver, modGenTrimSheetWorking);
		driver.findElement(modGenTrimSheetWorking).click();
		utilities.webDriverWait(driver, scrTrimSheetWorking);
		driver.findElement(scrTrimSheetWorking).click();
	}

	public void Verify_and_print_the_Trim_Details_grid_records() {
		if (driver.findElement(gridTrimDetails).isDisplayed()) {
			
			WebElement team = driver.findElement(gridTrimDetails);
			String gridname = team.getText();
	        String underlineStart = "\033[4m";
	        String underlineEnd = "\033[0m";
	        System.out.println(underlineStart + gridname + underlineEnd+" :- ");
			System.out.println();
			WebElement house = driver.findElement(TrimDetailsRecords);
		    java.util.List<WebElement> row1 = house.findElements(By.tagName("tr"));
		    int rowcount = row1.size();
		    System.out.println("No. of records under "+gridname+ " grid = " + rowcount);
		    System.out.println();
			String[] grid = {"Trim Details   Qty   Original Trim Qty Details   Latest Trim Qty Details"};
			for (int i = 0; i < grid.length; i++) {
				System.out.println(grid[i].replace("   ", " | ").trim());
			}
			WebElement tablerecords = driver.findElement(TrimDetailsRecords);
			String record = tablerecords.getText();
			System.out.println();
//			System.out.println();
			System.out.println("Display the '"+gridname+ "' records");
			System.out.println();
			String[] rows = record.split("\n");
			for (String row : rows) {
			 System.out.println(row);
		     System.out.println();
		    
			}
		}
	}

	public void Click_on_the_Edit_button_for_a_Trim() throws Throwable {
		utilities.webDriverWait(driver, buttEdit);
		driver.findElement(buttEdit).click();
		
	}

	public void Verify_whether_the_page_is_navigated_to_the_Add_Trim_Sheet_Working() throws Throwable {
		utilities.webDriverWait(driver, navAddTrimform);
		String Addform = driver.findElement(navAddTrimform).getText();
		System.out.println("Print the navigated page name : "+Addform);
	}

	public void Verify_and_Print_the_Category_name() throws Throwable {
		utilities.webDriverWait(driver, infCategory);
		String category = driver.findElement(infCategory).getText();
		System.out.println("Print the category name : "+category);
	}

	public void Verify_and_Print_the_Item_name() throws Throwable {
		utilities.webDriverWait(driver, infItem);
		String item = driver.findElement(infItem).getText();
		System.out.println("Print the item name : "+item);
	}

	public void Verify_and_Print_the_Color_name() throws Throwable {
		utilities.webDriverWait(driver, infColor);
		String color = driver.findElement(infColor).getText();
		System.out.println("Print the color name : "+color);
	}

	public void Verify_and_Print_the_TotalReqQty_name() throws Throwable {
		utilities.webDriverWait(driver, infTotalReqQty);
		String totQty = driver.findElement(infTotalReqQty).getText();
		System.out.println("Print the Total Req Qty value : "+totQty);
	}

	public void Select_an_UOM_(String uOM) throws Throwable {
		
		utilities.webDriverWait(driver, UOM);
		driver.findElement(UOM).click();
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(secUOM);
		Thread.sleep(5000);
		for (WebElement option : options) {
	        if (option.getText().equals(uOM)) {
	            option.click();
	            break;
	        }
	    }

	}
	

	public void Select_Qty_Details_(String qtyDetails) throws Throwable {
		utilities.webDriverWait(driver, qtydetails);
		driver.findElement(qtydetails).click();
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(secqtydetails);
		Thread.sleep(5000);
		for (WebElement option : options) {
	        if (option.getText().equals(qtyDetails)) {
	            option.click();
	            break;
	        }
	    }
	}

	public void Enter_Qty_per_Unit_value_(String qtyUnit) throws Throwable {
		utilities.webDriverWait(driver, QtyperUnit);
		driver.findElement(QtyperUnit).clear();
		driver.findElement(QtyperUnit).sendKeys(qtyUnit);
	}

	public void Enter_Rate_per_Unit_value_(String rate) throws Throwable {
		utilities.webDriverWait(driver, budRate);
		driver.findElement(budRate).clear();
		driver.findElement(budRate).sendKeys(rate);
	}

	public void Enter_Conversion_Rate_value_(String convRate) throws Throwable {
		utilities.webDriverWait(driver, budconvRate);
		driver.findElement(budconvRate).clear();
		driver.findElement(budconvRate).sendKeys(convRate);
	}

	public void Clicked_on_the_Submit_button() throws Throwable {
		utilities.webDriverWait(driver, buttSubmit);
		driver.findElement(buttSubmit).click();
	}

	public void Verify_whether_navigate_to_Trim_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, navTrimSheetWorking);
		String navTSW = driver.findElement(navTrimSheetWorking).getText();
		System.out.println("Naviagted to  : "+navTSW );
	}

	public void Verify_and_print_the_Trim_Sheet_Working_grid_records() {
		if (driver.findElement(TrimSheetWorking).isDisplayed()) {
			
			WebElement team = driver.findElement(TrimSheetWorking);
			String gridname = team.getText();
	        String underlineStart = "\033[4m";
	        String underlineEnd = "\033[0m";
	        System.out.println(underlineStart + gridname + underlineEnd+" :- ");
			System.out.println();
			WebElement house = driver.findElement(TrimMUWorkingrecords);
		    java.util.List<WebElement> row1 = house.findElements(By.tagName("tr"));
		    int rowcount = row1.size();
		    int norows = rowcount - 3;
		    System.out.println("No. of records under "+gridname+ " grid = " + norows);
		    System.out.println();
			String[] grid = {"Trim Details   Greige / Sale Required Qty   Dyeing Required Qty   Budget"
					+ ""};
			for (int i = 0; i < grid.length; i++) {
				System.out.println(grid[i].replace("   ", " | ").trim());
			}
			WebElement tablerecords = driver.findElement(TrimMUWorkingrecords);
			String record = tablerecords.getText();
			System.out.println();
			System.out.println("Display the '"+gridname+ "' records");
			System.out.println();
			String[] rows = record.split("\n");
			for (String row : rows) {
				System.out.println(row);
				System.out.println();
						    
			}
		}
	}

	public void Verify_and_print_the_Job_Work_grid_records() {
		if (driver.findElement(JobWorkgrid).isDisplayed()) {
			
			WebElement team = driver.findElement(JobWorkgrid);
			String gridname = team.getText();
	        String underlineStart = "\033[4m";
	        String underlineEnd = "\033[0m";
	        System.out.println(underlineStart + gridname + underlineEnd+" :- ");
			System.out.println();
			WebElement house = driver.findElement(JobWorkrecords);
		    java.util.List<WebElement> row1 = house.findElements(By.tagName("tr"));
		    int rowcount = row1.size();
		    int norows = rowcount - 3;
		    System.out.println("No. of records under "+gridname+ " grid = " + norows);
		    System.out.println();
			String[] grid = {"Trim Details   Greige / Sale Required Qty   Dyeing Required Qty   Budget"
					+ ""};
			for (int i = 0; i < grid.length; i++) {
				System.out.println(grid[i].replace("   ", " | ").trim());
			}
			WebElement tablerecords = driver.findElement(JobWorkrecords);
			String record = tablerecords.getText();
			System.out.println();
			System.out.println("Display the '"+gridname+ "' records");
			System.out.println();
			String[] rows = record.split("\n");
			for (String row : rows) {
				System.out.println(row);
				System.out.println();
		    
			}
		}
		
	}
	
	public void Click_on_the_Edit_button_for_another_Trim(String uOM, String qtyDetails, String qtyUnit, String mU, String gRate, String dRate) throws Throwable {
		
		utilities.webDriverWait(driver, buttEdit1);
		List<WebElement> editbuttons = driver.findElements(buttEdit1);
		int numberofButtons = editbuttons.size();
		for (int i=0; i<numberofButtons; i++)
		{
			editbuttons = driver.findElements(buttEdit1);
			if(editbuttons.size()>1) {
				editbuttons.get(i).click();
				Thread.sleep(10000);
				utilities.webDriverWait(driver, navAddTrimform);
				String Addform = driver.findElement(navAddTrimform).getText();
				System.out.println("Print the navigated page name : " +Addform);
				//	selecting the UOM
				utilities.webDriverWait(driver, UOM);
				driver.findElement(UOM).click();
				Thread.sleep(5000);
				List<WebElement> options = driver.findElements(secUOM);
				Thread.sleep(5000);
				for (WebElement option : options) {
		        if (option.getText().equals(uOM)) {
		            option.click();
		            break;
		        }
		    }
			
			//selecting the Qty Details
			utilities.webDriverWait(driver, qtydetails);
			driver.findElement(qtydetails).click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(5000);
			
			//entering the Qty per unit
			utilities.webDriverWait(driver, QtyperUnit);
			driver.findElement(QtyperUnit).clear();
			driver.findElement(QtyperUnit).sendKeys(qtyUnit);
			
			//click on the toggle button
			WebElement element=driver.findElement(toggleDyeing);
			driver.findElement(toggleDyeing).click();
			Thread.sleep(2000);
//			driver.findElement(toggleDyeing).click();
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();", element);
//			System.out.println("Clicked on the dyeing toggle button");
//			
			//enter MU value
			utilities.webDriverWait(driver, MU);
			driver.findElement(MU).clear();
			driver.findElement(MU).sendKeys(mU);
			
			//enter greise rate
			utilities.webDriverWait(driver, greigebudRate);
			driver.findElement(greigebudRate).clear();
			driver.findElement(greigebudRate).sendKeys(gRate);
			
			//enter dyeing rate
			utilities.webDriverWait(driver, dyeingbudRate);
			driver.findElement(dyeingbudRate).clear();
			driver.findElement(dyeingbudRate).sendKeys(dRate);
			
			//click on the submit button
			utilities.webDriverWait(driver, buttSubmit);
			driver.findElement(buttSubmit).click();
			
			//verifying the toaster msg
//			utilities.webDriverWait(driver, toasterMsg);
//			String toaster = driver.findElement(toasterMsg).getText();
//			System.out.println("Display the displayed toaster msg : '"+toaster+"'");
//			
		}else {
			System.out.println("No more edit buttons are displayed are there. ");
		}
		Thread.sleep(5000);
		}
	}

	public void Click_on_the_Dyeing_toggle_button() throws Throwable {
//		utilities.PerformancewebDriverWait(driver, toggleDyeing);
		WebElement element=driver.findElement(toggleDyeing);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		System.out.println("Clicked on the dyeing toggle button");
			
	}

	public void Enter_MU_Working_value_(String mU) throws Throwable {
		utilities.webDriverWait(driver, MU);
		driver.findElement(MU).clear();
		driver.findElement(MU).sendKeys(mU);
		
	}

	public void Enter_Greige_Rate_per_Unit_value(String gRate) throws Throwable {
		utilities.webDriverWait(driver, greigebudRate);
		driver.findElement(greigebudRate).clear();
		driver.findElement(greigebudRate).sendKeys(gRate);
		
	}

	public void Enter_Greige_Conversion_Rate_value_(String gConvRate) throws Throwable {
		utilities.webDriverWait(driver, greigebudConvRate);
		driver.findElement(greigebudConvRate).clear();
		driver.findElement(greigebudConvRate).sendKeys(gConvRate);
		
	}

	public void Enter_Dyeing_Rate_per_Unit_value_(String dRate) throws Throwable {
		utilities.webDriverWait(driver, dyeingbudRate);
		driver.findElement(dyeingbudRate).clear();
		driver.findElement(dyeingbudRate).sendKeys(dRate);
		
	}

	public void Enter_Dyeing_Conversion_Rate_value_(String dConvRate) throws Throwable {
		utilities.webDriverWait(driver, dyeingbudConvRate);
		driver.findElement(dyeingbudConvRate).clear();
		driver.findElement(dyeingbudConvRate).sendKeys(dConvRate);
		
	}

	public void Click_on_Submit_to_Audit_Team_button_in_the_Trim_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, buttSubmitAuditTeam);
		driver.findElement(buttSubmitAuditTeam).click();
	}

	public void Verify_the_toaster_msg() throws Throwable {
//		utilities.webDriverWait(driver, toasterMsg);
		driver.findElement(toasterMsg).click();
		String toaster = driver.findElement(toasterMsg).getText();
		System.out.println("Display the displayed toaster msg : '"+toaster+"'");
	}

	public void Clicked_on_the_Cancel_button() throws Throwable {
		utilities.webDriverWait(driver, buttCancel);
		driver.findElement(buttCancel).click();
		
	}
	
	public void Click_on_the_Edit_button_for_job_work_Trim_(String jobName, String rateperUnit) throws Throwable {
		utilities.webDriverWait(driver, buttEditJ);
		driver.findElement(buttEditJ).click();
//		List<WebElement> editbuttons = driver.findElements(buttEditJ);
//		int numberofButtons = editbuttons.size();
//		for (int i=0; i<numberofButtons; i++)
//		{
//			editbuttons = driver.findElements(buttEditJ);
//			if(editbuttons.size()>1) {
//				editbuttons.get(i).click();
//				Thread.sleep(10000);
				utilities.webDriverWait(driver, navJobworkform);
				String Addform = driver.findElement(navJobworkform).getText();
				System.out.println("Print the navigated page name : " +Addform);
				
				//	enter the jobwork name
				utilities.webDriverWait(driver, jobname);
				driver.findElement(jobname).clear();
				driver.findElement(jobname).sendKeys(jobName);
				
				//select the component
				utilities.webDriverWait(driver, component);
				driver.findElement(component).click();
				utilities.webDriverWait(driver, secComponent);
				driver.findElement(secComponent).click();
				
				//enter the jobwork budget rate
				utilities.webDriverWait(driver, JobbudRate);
				driver.findElement(JobbudRate).clear();
				driver.findElement(JobbudRate).sendKeys(rateperUnit);
				
				utilities.webDriverWait(driver, buttSubmit);
				driver.findElement(buttSubmit).click();
				
			
//			
//		}else {
//			System.out.println("No more edit buttons are displayed in the job work grid");
//		}
//		Thread.sleep(5000);
//		}

		
	}

	

}
//
