package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ViewTrimSheetscreen_Pages extends DriverFactory {

	Utilities utilities 		= new Utilities();
	RevisedMUWorkingPages RMUW 	= new RevisedMUWorkingPages();
	ViewFabricSheetPages VFS	= new ViewFabricSheetPages();
	
	By MerReport				= By.xpath("(//ul[@class='mm-collapse mm-show'])[2]//span[text()='Reports']");
	By scrViewTrimSheet			= By.xpath("//a[text()=' View Trim Sheet ']");
	By infoBulkDeadline			= By.xpath("(//ul[@class='form-row view-details']//child::p)[1]");
	By infoTrimManager			= By.xpath("(//ul[@class='form-row view-details']//child::p)[2]");
	By infoTrimManagerAss		= By.xpath("(//ul[@class='form-row view-details']//child::p)[3]");
	By TeamResgrid1				= By.xpath("(//div[@class='card-header'])[2]");
	By TeamResgrid2				= By.xpath("(//div[@class='card-header'])[3]");
	By Teamrecords1				= By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[1]");
	By Teamrecords2				= By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	By TeamResposibility2		= By.xpath("//u[text()='Trim Team Responsibility']");
	By buttHistory				= By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right']");
	By Historygrid				= By.xpath("//thead[@class='p-datatable-thead']");
	By Historyrecords			= By.xpath("//tbody[@class='p-element p-datatable-tbody']");
	By buttBack					= By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right']");
	By buttViewItem				= By.xpath("//button[text()=' View for Print by Item ']");
	By buttViewTrimSheet		= By.xpath("//button[text()=' View for Print by Trim Sheet ']");
	By PrintForm				= By.xpath("//div[@class='col-12 mx-0 mt-4']//child::table");
	By PFdetails				= By.xpath("//div[@class='card ng-star-inserted']");
	By navViewTrimSheet			= By.xpath("//div[@class='page_title_left d-flex align-items-center']");
	By buttPFCancel				= By.xpath("//button[@id='closepagebutton']");
	
	public void Navigate_to_View_Trim_Sheet_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, VFS.Merchandising);
		driver.findElement(VFS.Merchandising).click();
		utilities.webDriverWait(driver, MerReport);
		driver.findElement(MerReport).click();
		utilities.webDriverWait(driver, scrViewTrimSheet);
		driver.findElement(scrViewTrimSheet).click();
		
	}

	public void Verify_and_Print_the_Bulk_Trim_Deadline() throws Throwable {
		utilities.webDriverWait(driver, infoBulkDeadline);
		String Bulk = driver.findElement(infoBulkDeadline).getText();
		System.out.println("Print the Bulk Trim Deadline value  : '"+Bulk+"'");
	}

	public void Verify_and_Print_the_Trim_Manager_in_View() throws Throwable {
		utilities.webDriverWait(driver, infoTrimManager);
		String Trimmgr = driver.findElement(infoTrimManager).getText();
		System.out.println("Print the Trim Manager name : '"+Trimmgr+"'");
	}

	public void Verify_and_Print_the_Trim_Manager_Assistants_in_View() throws Throwable {
		utilities.webDriverWait(driver, infoTrimManagerAss);
		String TrimmgrAss = driver.findElement(infoTrimManagerAss).getText();
		System.out.println("Print the Trim Manager Assistant name : '"+TrimmgrAss+"'");
	}

	public void Verify_and_Print_the_Merchant_and_Trim_Team_Responsibility_grid_records() throws Throwable {
		if (driver.findElement(TeamResgrid1).isDisplayed()) {
			WebElement team = driver.findElement(TeamResgrid1);
			String gridname = team.getText();
	        String underlineStart = "\033[4m";
	        String underlineEnd = "\033[0m";
	        System.out.println(underlineStart + gridname + underlineEnd+" :- ");
			System.out.println();
			WebElement house = driver.findElement(Teamrecords1);
		    java.util.List<WebElement> row1 = house.findElements(By.tagName("tr"));
		    int rowcount = row1.size();
		    System.out.print("No. of records under "+gridname+ " grid = " + rowcount);
		    System.out.println();
			String[] grid = {"Trim Details  Combinations  Supplier Information  Liability Information  Additional Information  Original Trim Qty Details  Latest Trim Qty Details"};
			for (int i = 0; i < grid.length; i++) {
				System.out.println(grid[i].replace("  ", " | ").trim());
			}
			WebElement tablerecords = driver.findElement(Teamrecords1);
			String record = tablerecords.getText();
			System.out.println();
			System.out.println();
			System.out.println("Display the '"+gridname+ "' records");
			System.out.println();
			String[] rows = record.split("\n");
			for (String row : rows) {
		     System.out.println(row);
		     System.out.println();
			}
		}else {
			System.out.println("No data found");
		}
		utilities.MinimumWait(driver);
		Boolean isPresent = driver.findElements(TeamResgrid2).size()>0;
		if (isPresent) {	
			 System.out.println("Display element: " + isPresent);
			    WebElement team = driver.findElement(TeamResgrid2);
			    Thread.sleep(2000);
		        driver.findElement(TeamResposibility2).click();
		        Thread.sleep(2000);
		        System.out.println("Clicked on "+team);
		        Thread.sleep(2000);
		        String gridname = team.getText();
		        System.out.println();
		        System.out.println();
		        String underlineStart = "\033[4m";
		        String underlineEnd = "\033[0m";
		        System.out.println(underlineStart + gridname + underlineEnd + " :- ");
		        System.out.println();
		        WebElement house = driver.findElement(Teamrecords2);
			    java.util.List<WebElement> row1 = house.findElements(By.tagName("tr"));
			    int rowcount = row1.size();
			    System.out.print("No. of records under "+gridname+ " grid = " + rowcount);
			    System.out.println();
		        String[] grid = {"Trim Details  Combinations  Supplier Information  Liability Information  Additional Information  Original Trim Qty Details  Latest Trim Qty Details"};
		        for (int i = 0; i < grid.length; i++) {
		            System.out.println(grid[i].replace("  ", " | ").trim());
		        }
		        WebElement tablerecords = driver.findElement(Teamrecords2); // Replace Merrows2 with the correct XPath
		        String record = tablerecords.getText();
		        System.out.println();
		        System.out.println();
		        System.out.println("Display the '" + gridname + "' records");
		        System.out.println();
		        String[] rows = record.split("\n");
		        for (String row : rows) {
		            System.out.println(row);
		            System.out.println();
		        }
		    } else {
		        System.out.println("No Data found");
		    }
	}

	public void Verify_the_History_grid_display() throws Throwable {
		utilities.webDriverWait(driver, Historygrid);
		WebElement Hisgrid = driver.findElement(Historygrid);
//		java.util.List<WebElement> row1 = Hisgrid.findElements(By.tagName("tr"));
//		 int rowcount = row1.size();
//		    System.out.print("No. of records under the history grid : " + rowcount);
//		    System.out.println();
	        String[] grid = {"Version  Date Submitted  Submitted By  Download"};
	        for (int i = 0; i < grid.length; i++) {
	            System.out.println(grid[i].replace("  ", " | ").trim());
	        }
		
	}

	public void Verify_the_records_display_in_the_History_grid() throws Throwable {
		utilities.webDriverWait(driver, Historyrecords);
		WebElement Hisgrid = driver.findElement(Historyrecords);
		java.util.List<WebElement> row1 = Hisgrid.findElements(By.tagName("tr"));
		int rowcount = row1.size();
		System.out.print("No. of records under the history grid : " + rowcount);
		System.out.println();
		WebElement tablerecords = driver.findElement(Historyrecords); // Replace Merrows2 with the correct XPath
        String record = tablerecords.getText();
        System.out.println();
        System.out.println();
//        System.out.println("Display the '" + gridname + "' records");
        System.out.println();
        String[] rows = record.split("\n");
        for (String row : rows) {
            System.out.println(row);
            System.out.println();
        }
		    
	}

	public void Click_on_the_Back_button_and_verify_the_page_navigation() throws Throwable {
		utilities.webDriverWait(driver, buttBack);
		driver.findElement(buttBack).click();
		System.out.println("Navigated to the View Trim Sheet screen");
	}

	public void Click_on_the_History_button_in_the_view_screen() throws Throwable {
		utilities.webDriverWait(driver, buttHistory);
		driver.findElement(buttHistory).click();
		System.out.println("Naviagted to the History form");
		
	}

	public void Click_on_the_View_for_Print_by_Item_button() throws Throwable {
		utilities.webDriverWait(driver, buttViewItem);
		driver.findElement(buttViewItem).click();
	}

	public void Verify_naviagting_to_the_print_form() throws Throwable {
		utilities.webDriverWait(driver, PrintForm);
		String PF = driver.findElement(PrintForm).getText();
		System.out.println("Print the Print Form heading : '"+PF+"'");
	}

	public void Print_the_Print_form_details() throws Throwable {
		utilities.webDriverWait(driver,PFdetails);
		String PFrecords = driver.findElement(PFdetails).getText();
		System.out.println("Print the displayed records data : "+PFrecords);
	}

	public void Verify_the_page_navigation() throws Throwable {
		utilities.webDriverWait(driver, navViewTrimSheet);
		String navPage = driver.findElement(navViewTrimSheet).getText();
		System.out.println("Navigated to : '"+navPage+"'");
	}

	public void Click_on_the_View_For_Print_by_Item_button() throws Throwable {
		utilities.webDriverWait(driver, buttViewTrimSheet);
		driver.findElement(buttViewTrimSheet).click();
	}

	public void Click_on_Cancel_button_in_the_Print_Form() throws Throwable {
		utilities.webDriverWait(driver, buttPFCancel);
		driver.findElement(buttPFCancel).click();
	}

}
