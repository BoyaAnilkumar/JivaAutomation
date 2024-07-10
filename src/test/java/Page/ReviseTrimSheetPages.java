package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class ReviseTrimSheetPages extends DriverFactory {
	
	Utilities utilities 		= new Utilities();
	RevisedMUWorkingPages RMUW 	= new RevisedMUWorkingPages();
	ViewFabricSheetPages VFS	= new ViewFabricSheetPages();
	NewTrimSheetPages NTS 		= new NewTrimSheetPages();

	By scrRevisedTrimSheet 		= By.xpath("//a[text()=' Revised Trim Sheet ']");
	By Status					= By.xpath("//select[@formcontrolname='staticStatusId']");
	By BulkTrimDeadLine			= By.xpath("//input[@formcontrolname='bulkTrimDeadline']");
	By ReasonForRevision		= By.xpath("//input[@formcontrolname='revisedReason']");
	By TrimManager				= By.xpath("//select[@formcontrolname='trimManagerId']");
	By TrimManagerAssitant		= By.xpath("//p-multiselect[@filterby='fullName']");
	By Teamgrid1				= By.xpath("(//div[@class='card-header'])[2]");
	By Teamgrid2				= By.xpath("(//div[@class='card-header'])[3]");
	By Merrows1					= By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[1]");
	By Merrows2					= By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	By TrimTeamgrid				= By.xpath("(//div[@class='card ng-star-inserted'])[2]"); 
	By navAddReviseTrimSheet	= By.xpath("//h3[text()='Add Revised Trim Sheet']");
	By navRevisedTrimSheet		= By.xpath("//h3[text()='Revised Trim Sheet']");
	By ReasonforRevision		= By.xpath("//input[@formcontrolname='revisedReason']");
	By valmsgRevSuccess			= By.xpath("//h2[text()='Revised Trim Sheet Updated Successfully']");
	By buttCancel				= By.xpath("//a[text()=' Cancel']");

	public void Navigate_to_Revise_Trim_Sheet_screen() throws Throwable  {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, VFS.Merchandising);
		driver.findElement(VFS.Merchandising).click();
		utilities.webDriverWait(driver,NTS.merDataEntry);
		driver.findElement(NTS.merDataEntry).click();
		utilities.webDriverWait(driver,NTS.GenTrimSheet);
		driver.findElement(NTS.GenTrimSheet).click();
		utilities.webDriverWait(driver,scrRevisedTrimSheet);
		driver.findElement(scrRevisedTrimSheet).click();
	}


	public void Select_a_Status_in_the_filter_window() throws Throwable {
		utilities.webDriverWait(driver, Status);
		driver.findElement(Status).click();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		R.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		R.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}


	public void Verify_and_Print_the_BulkTime_DeadLine() throws Throwable {
		utilities.webDriverWait(driver, BulkTrimDeadLine);
		String Bulk = driver.findElement(BulkTrimDeadLine).getAttribute("value");
		System.out.println("Print the Bulk Trim Details : '"+Bulk+"'");
	}


	public void Verify_and_Print_the_Reason_For_Revision() throws Throwable {
		utilities.webDriverWait(driver, ReasonForRevision);
		String reason = driver.findElement(ReasonForRevision).getAttribute("value");
		System.out.println("Print the Reason for Revision entered value : '"+reason+"'");
		if (reason.isEmpty()) {
			System.out.println("It is a New Trim IPO record");
		}else {
			System.out.println("It is a Revised Trim IPO record");
		}
	}


	public void Verify_and_Print_the_Trim_Manager() throws Throwable {
		utilities.webDriverWait(driver, TrimManager);
		WebElement dropdown = driver.findElement(TrimManager);
		Select select = new Select(dropdown);
		WebElement selectedOption = select.getFirstSelectedOption();
		String Manager = selectedOption.getText();
		System.out.println("Print the selected Trim Manager name : '"+ Manager+"'");

			}


	public void Verify_and_Print_the_Trim_Manager_Assistants() throws Throwable {
		utilities.webDriverWait(driver, TrimManagerAssitant);
		String ManagerAssitant = driver.findElement(TrimManagerAssitant).getAttribute("value");
		System.out.println("Print the selected Trim Manager Assistant name : '"+ManagerAssitant+"'");
	}


	public void Verify_and_print_records_data_in_the_Merchant_and_Trim_team_grids() throws Throwable {
		
		if (driver.findElement(Teamgrid1).isDisplayed()) {
			
			WebElement team = driver.findElement(Teamgrid1);
			String gridname = team.getText();
	        String underlineStart = "\033[4m";
	        String underlineEnd = "\033[0m";
	        System.out.println(underlineStart + gridname + underlineEnd+" :- ");
			System.out.println();
			WebElement house = driver.findElement(Merrows1);
		    java.util.List<WebElement> row1 = house.findElements(By.tagName("tr"));
		    int rowcount = row1.size();
		    System.out.print("No. of records under "+gridname+ " grid = " + rowcount);
		    System.out.println();
			String[] grid = {"Actions  Trim Details  Combinations  Supplier Information  Liability Information  Additional Information  Original Trim Qty Details  Latest Trim Qty Details"};
			for (int i = 0; i < grid.length; i++) {
				System.out.println(grid[i].replace("  ", " | ").trim());
			}
			WebElement tablerecords = driver.findElement(Merrows1);
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
	
		Boolean isPresent = driver.findElements(Teamgrid2).size()>0;
		if (isPresent) {	
			 System.out.println("Display element: " + isPresent);	
		        
		        WebElement team = driver.findElement(Teamgrid2);
		        String gridname = team.getText();
		        System.out.println();
		        System.out.println();
		        String underlineStart = "\033[4m";
		        String underlineEnd = "\033[0m";
		        System.out.println(underlineStart + gridname + underlineEnd + " :- ");
		        System.out.println();
		        
		        String[] grid = {"Actions  Trim Details  Combinations  Supplier Information  Liability Information  Additional Information  Original Trim Qty Details  Latest Trim Qty Details"};
		        for (int i = 0; i < grid.length; i++) {
		            System.out.println(grid[i].replace("  ", " | ").trim());
		        }
		        
		        WebElement tablerecords = driver.findElement(By.xpath("Merrows2")); // Replace Merrows2 with the correct XPath
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
		        
		        WebElement house = driver.findElement(By.xpath("Merrows2")); // Replace Merrows2 with the correct XPath
		        java.util.List<WebElement> row1 = house.findElements(By.tagName("tr"));
		        int rowcount = row1.size();
		        System.out.println("No. of records under " + gridname + " grid = " + rowcount);
		    } else {
		        System.out.println("No Data found");
		    }
		

			 
			    
//	}
//	try {
//		
//		WebElement Team2 = driver.findElement(Teamgrid2);
//		if (Team2.isDisplayed()) {
//			
//			WebElement team = driver.findElement(Teamgrid2);
//			String gridname = team.getText();
//			System.out.println();
//			System.out.println();
//	        String underlineStart = "\033[4m";
//	        String underlineEnd = "\033[0m";
//	        System.out.println(underlineStart + gridname + underlineEnd+" :- ");
//			System.out.println();
//			String[] grid = {"Actions  Trim Details  Combinations  Supplier Information  Liability Information  Additional Information  Original Trim Qty Details  Latest Trim Qty Details"};
//			for (int i = 0; i < grid.length; i++) {
//				System.out.println(grid[i].replace("  ", " | ").trim());
//			}
//			WebElement tablerecords = driver.findElement(Merrows2);
//			String record = tablerecords.getText();
//			System.out.println();
//			System.out.println();
//			System.out.println("Display the '"+gridname+ "' records");
//			System.out.println();
//			String[] rows = record.split("\n");
//			for (String row : rows) {
//		     System.out.println(row);
//		     System.out.println();
//		  
//		}
//			WebElement house = driver.findElement(Merrows2);
//		    java.util.List<WebElement> row1 = house.findElements(By.tagName("tr"));
//		    int rowcount = row1.size();
//		    System.out.println("No. of records under "+gridname+ " grid  = " + rowcount);
//	}else {
//		System.out.println("No Data found");
//	}
//		
//	}catch (NoSuchElementException e) {
//			System.out.println("No records found");
//	}
}


	public void Verify_whether_navigated_to_the_Add_Revised_Trim_Sheet_form() throws Throwable {
		utilities.webDriverWait(driver, navAddReviseTrimSheet);
		String AddRevform = driver.findElement(navAddReviseTrimSheet).getText();
		System.out.println("Display the screen name : "+AddRevform);
		
	}


	public void Verify_whether_the_page_is_navigated_to_the_Revised_Trim_Sheet() throws Throwable {
		utilities.webDriverWait(driver, navRevisedTrimSheet);
		String RevTrimSheet = driver.findElement(navRevisedTrimSheet).getText();
		System.out.println("Display the screen name : "+RevTrimSheet);
		
	}


	public void Enter_the_Reason_For_Revision_field(String Reason) throws Throwable {
		utilities.webDriverWait(driver, ReasonforRevision);
		driver.findElement(ReasonforRevision).clear();
		driver.findElement(ReasonforRevision).sendKeys(Reason);
	}


	public void Verify_and_print_the_Revised_Successful_submit_msg() {
		String RSucccessSubmit = driver.findElement(valmsgRevSuccess).getText();
		System.out.println("Print the Revised Successful Submitted msg : '"+RSucccessSubmit+"'");
	}


	public void Click_the_Cancel_button() throws Throwable {
		utilities.webDriverWait(driver, buttCancel);
		driver.findElement(buttCancel).click();
		System.out.println("Clicked on the Cancel button");
		
	}	
		     

}
