package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ViewTrimSheetWorking_Pages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW 		= new RevisedMUWorkingPages();
	TrimSheetAcceptancePages TSA 	= new TrimSheetAcceptancePages();
	
	By trimReport					= By.xpath("(//span[text()='Reports'])[2]");
	By scrViewTrimSheetWorking		= By.xpath("(//a[text()='View Trim Sheet Working'])[1]");
	By Printform					= By.xpath("//div[@id='displayfbdata']/div[1]/table[1]");
	By gridTrimMUWorking			= By.xpath("//h3[text()='Trim MU Working']");
	By TrimMUWorkingrecords			= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[3]");
	By Jobworkrecords				= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[4]");
	By gridJobWork					= By.xpath("//h3[text()='Job Work']");
	

	public void Navigate_to_View_Trim_Sheet_Working_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, TSA.modTrims);
		driver.findElement(TSA.modTrims).click();
		utilities.webDriverWait(driver, trimReport);
		driver.findElement(trimReport).click();
		utilities.webDriverWait(driver, scrViewTrimSheetWorking);
		driver.findElement(scrViewTrimSheetWorking).click();
	}


	public void Verify_whether_page_is_navigated_to_the_Print_form() throws Throwable {
		utilities.webDriverWait(driver, Printform);
		String PF = driver.findElement(Printform).getText();
		System.out.println("Print the Print Form heading : '"+PF+"'");
	}


	public void Verify_and_print_the_View_Trim_MU_Working_grid_records() {
		
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


	public void Verify_and_print_View_Job_Work_grid_records() {
		
		if (driver.findElement(gridJobWork).isDisplayed()) {
			
			WebElement team = driver.findElement(gridJobWork);
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

}