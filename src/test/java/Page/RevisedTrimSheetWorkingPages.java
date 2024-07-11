package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class RevisedTrimSheetWorkingPages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW 	= new RevisedMUWorkingPages();
	TrimSheetAcceptancePages TSA = new TrimSheetAcceptancePages();
	TrimSheetWorking_Pages TSW = new TrimSheetWorking_Pages();
	
	
	By scrReviseTrimSheetWorking 	= By.xpath("//a[contains(text(),'Revised Trims Sheet Working')]");
	By navRevTrimMUWorking			= By.xpath("//div[@class='page_title_box d-flex flex-wrap align-items-center justify-content-between']");
	By gridTrimMUWorking			= By.xpath("//h3[text()='Trim MU Working']");
	By TrimMUWorkingrecords			= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[4]");
	By Jobworkrecords				= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[5]");
	By scrName						= By.xpath("//div[@class='page_title_box d-flex flex-wrap align-items-center justify-content-between']");
	By buttEditTrimMU				= By.xpath("(//div[@class='card']//h3[text()='Trim Sheet Working']//following::tbody)[1]//button");
	By buttEditJobwork				= By.xpath("(//div[@class='card']//child::p-table)[5]//button");
	By buttToggle					= By.xpath("//div[@class='clearfix w-100']/..//input[@formcontrolname='isDyeing']");
//	By buttToggle					= By.xpath("(//div[@class='form-group col-xl-4 col-md-6 col-12']//child::input)[3]");
	By Toggle                       = By.xpath("//input[@formcontrolname='isDyeing']");
	By PageTitle					= By.xpath("//h3[text()='Add Trim Sheet Working']");
	

	public void Navigate_to_Revised_Trim_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, TSA.modTrims);
		driver.findElement(TSA.modTrims).click();
		utilities.webDriverWait(driver, TSA.TrimDataEntry);
		driver.findElement(TSA.TrimDataEntry).click();
		utilities.webDriverWait(driver, TSW.modGenTrimSheetWorking);
		driver.findElement(TSW.modGenTrimSheetWorking).click();
		utilities.webDriverWait(driver, scrReviseTrimSheetWorking);
		driver.findElement(scrReviseTrimSheetWorking).click();
	}

	public void Verify_whether_the_page_is_navigated_to_the_Add_Revised_Trim_Sheet_Working() throws Throwable {
		utilities.webDriverWait(driver, navRevTrimMUWorking);
		String navAddform = driver.findElement(navRevTrimMUWorking).getText();
		System.out.println("Navigated to : '"+navAddform+"'");
		
	}

	public void Verify_and_print_the_Trim_MU_Working_grid_records() {
		if (driver.findElement(gridTrimMUWorking).isDisplayed()) {
			
			WebElement team = driver.findElement(gridTrimMUWorking);
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
			String[] grid = {"Trim Details   Greige / Sale Required Qty   Dyeing Required Qty   Budget"};
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

	public void Verify_and_print_Job_Work_grid_records() {
if (driver.findElement(TSW.JobWorkgrid).isDisplayed()) {
			
			WebElement team = driver.findElement(TSW.JobWorkgrid);
			String gridname = team.getText();
	        String underlineStart = "\033[4m";
	        String underlineEnd = "\033[0m";
	        System.out.println(underlineStart + gridname + underlineEnd+" :- ");
			System.out.println();
			WebElement house = driver.findElement(Jobworkrecords);
		    java.util.List<WebElement> row1 = house.findElements(By.tagName("tr"));
		    int rowcount = row1.size();
		    int norows = rowcount - 3;
		    System.out.println("No. of records under "+gridname+ " grid = " + norows);
		    System.out.println();
			String[] grid = {"Job Details   Name Of The Job   Components   Req Qty Details   Budget"
					+ ""};
			for (int i = 0; i < grid.length; i++) {
				System.out.println(grid[i].replace("   ", " | ").trim());
			}
			WebElement tablerecords = driver.findElement(Jobworkrecords);
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

	public void Verify_whether_navigate_to_Revised_Trim_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, scrName);
		String screenName = driver.findElement(scrName).getText();
		System.out.println("Navigated to : '"+screenName+"'");
		
	}

	public void Click_on_the_Edit_button_for_another_Trim_(String qtyUnit, String mU, String gRate, String dRate) throws Throwable {
		utilities.webDriverWait(driver, buttEditTrimMU);
		List<WebElement> editbuttons = driver.findElements(buttEditTrimMU);
		int numberofButtons = editbuttons.size();
		System.out.println("No. of edit button in the Trim MU Working grid : '"+numberofButtons+"'");
		for (int i=0; i<numberofButtons; i++)
		{
			editbuttons = driver.findElements(TSW.buttEdit1);
			if(editbuttons.size()>1) {
				editbuttons.get(i).click();
				System.out.println("Clicked on the edit button"+editbuttons);
				Thread.sleep(1000);
				utilities.webDriverWait(driver, TSW.navAddTrimform);
				String Addform = driver.findElement(TSW.navAddTrimform).getText();
				System.out.println("Print the navigated page name : " +Addform);
//				//	selecting the UOM
//				utilities.webDriverWait(driver, UOM);
//				driver.findElement(UOM).click();
//				Thread.sleep(5000);
//				List<WebElement> options = driver.findElements(secUOM);
//				Thread.sleep(5000);
//				for (WebElement option : options) {
//		        if (option.getText().equals(uOM)) {
//		            option.click();
//		            break;
//		        }
//		    }
//			
//			//selecting the Qty Details
//			utilities.webDriverWait(driver, qtydetails);
//			driver.findElement(qtydetails).click();
//			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			Thread.sleep(5000);
//			
			//entering the Qty per unit
			utilities.webDriverWait(driver, TSW.QtyperUnit);
			driver.findElement(TSW.QtyperUnit).clear();
			driver.findElement(TSW.QtyperUnit).sendKeys(qtyUnit);
			utilities.MinimumWait(driver);
//			driver.findElement(PageTitle).click();
//			Thread.sleep(1000);
			
			//click on the toggle button
			
//			utilities.webDriverWait(driver, buttToggle);	
//			driver.findElement(buttToggle).click();
//			System.out.println("Clicked on the toggle button");
//			utilities.webDriverWait(driver, buttToggle);
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//		    js.executeScript("arguments[0].click()", buttToggle);
//			driver.findElement(buttToggle).click();
//			utilities.MinimumWait(driver);
//			System.out.println("Clicked on the dyeing toggle button");
//			
			//enter MU value
			utilities.webDriverWait(driver, TSW.MU);
			driver.findElement(TSW.MU).clear();
			driver.findElement(TSW.MU).sendKeys(mU);
			
			//enter greise rate
			utilities.webDriverWait(driver, TSW.greigebudRate);
			driver.findElement(TSW.greigebudRate).clear();
			driver.findElement(TSW.greigebudRate).sendKeys(gRate);
			
			//enter dyeing rate
			utilities.webDriverWait(driver, TSW.dyeingbudRate);
			driver.findElement(TSW.dyeingbudRate).clear();
			driver.findElement(TSW.dyeingbudRate).sendKeys(dRate);
			System.out.println("Entered the Greige and Dyeing budget rates");
			
			//click on the submit button
			utilities.webDriverWait(driver, TSW.buttSubmit);
			driver.findElement(TSW.buttSubmit).click();
			
			//verifying the toaster msg
//			utilities.webDriverWait(driver, TSW.toasterMsg);
//			driver.findElement(TSW.toasterMsg).click();
//			String toaster = driver.findElement(TSW.toasterMsg).getText();
//			System.out.println("Display the displayed toaster msg : '"+toaster+"'");
//			
		}else {
			System.out.println("No more edit buttons are displayed are there. ");
		}
		Thread.sleep(5000);
		}

	}

	public void Click_on_Submit_to_Audit_Team_button_in_the_Revised_Trim_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, TSW.buttSubmitAuditTeam);
		driver.findElement(TSW.buttSubmitAuditTeam).click();
	}

	public void Click_on_the_Edit_button_for_a_job_work_Trim_in_revised_sheet_(String jobName, String rateperUnit) throws Throwable {
		utilities.webDriverWait(driver, buttEditJobwork);
//		driver.findElement(buttEditJobwork).click();
		List<WebElement> editbuttons = driver.findElements(buttEditJobwork);
		int numberofButtons = editbuttons.size();
		System.out.println("No. of edit button in the Trim MU Working grid : '"+numberofButtons+"'");
		for (int i=0; i<numberofButtons; i++)
		{
			System.out.println("Entering into for loop statment");
//			editbuttons = driver.findElements(buttEditJobwork);
			if(editbuttons.size()>=1) {
				editbuttons.get(i).click();
				System.out.println("Clicked on the edit button");
				Thread.sleep(10000);
				utilities.webDriverWait(driver, TSW.navJobworkform);
				String Addform = driver.findElement(TSW.navJobworkform).getText();
				System.out.println("Print the navigated page name : " +Addform);
				
				//	enter the jobwork name
				utilities.webDriverWait(driver, TSW.jobname);
				driver.findElement(TSW.jobname).clear();
				driver.findElement(TSW.jobname).sendKeys(jobName);
				
				//select the component
//				utilities.webDriverWait(driver, TSW.component);
//				driver.findElement(TSW.component).click();
//				utilities.webDriverWait(driver, TSW.secComponent);
//				driver.findElement(TSW.secComponent).click();
				
				//enter the jobwork budget rate
				utilities.webDriverWait(driver, TSW.JobbudRate);
				driver.findElement(TSW.JobbudRate).clear();
				driver.findElement(TSW.JobbudRate).sendKeys(rateperUnit);
				
				utilities.webDriverWait(driver, TSW.buttSubmit);
				driver.findElement(TSW.buttSubmit).click();
				System.out.println("Clicked on the Submit button in the Add form");
			
			}else {
			System.out.println("No more edit buttons are displayed in the job work grid");
		}
		Thread.sleep(5000);
		}

	}

	public void Click_on_the_Edit_button_for_a_Trim_in_revised_sheet() throws Throwable {
		utilities.webDriverWait(driver, buttEditTrimMU);
		List<WebElement> editbuttons = driver.findElements(buttEditTrimMU);
		int numberofButtons = editbuttons.size();
//		System.out.println("No. of edit button in the Trim MU Working grid : '"+numberofButtons+"'");
		
		if(numberofButtons > 0) {
				
			int lastindex = numberofButtons-1;
				editbuttons.get(lastindex).click();
				Thread.sleep(10000);
				utilities.webDriverWait(driver, TSW.navAddTrimform);
				String Addform = driver.findElement(TSW.navAddTrimform).getText();
				System.out.println("Print the navigated page name : " +Addform);
				
				//click on the submit button
				utilities.webDriverWait(driver, TSW.buttSubmit);
				driver.findElement(TSW.buttSubmit).click();
								
				//printing the toaster msg
//				utilities.webDriverWait(driver, toasterMsg);
				String toaster = driver.findElement(TSW.toasterMsg).getText();
				System.out.println("Display the displayed toaster msg : '"+toaster+"'");
				
			}else {
				System.out.println("No more edit buttons are displayed in the job work grid");
			}
			Thread.sleep(5000);

		}
	}
