package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class PODataReportPages extends DriverFactory{
	
	Utilities utilities 		= new Utilities();
	RevisedMUWorkingPages RMUW 	= new RevisedMUWorkingPages();
	ViewFabricSheetPages VFS	= new ViewFabricSheetPages();
	
	By scrPODataRpt			= By.xpath("//a[text()='PO Data Report']");
	By POgrid				= By.xpath("//tr[@role='row']");
	By gridHeaders			= By.xpath("//th[@role='columnheader']");
	By Excelexport			= By.xpath("//button[@id='Grid_excelexport']");
	
	
	
	public void Login_with_the_Production_Manager() {
		driver.findElement(RMUW.txtUN).clear();
		driver.findElement(RMUW.txtUN).sendKeys("Lavanya");
		driver.findElement(RMUW.txtPwd).clear();
		driver.findElement(RMUW.txtPwd).sendKeys("Abcd@123");	
	}
	public void Navigate_to_PO_Data_Report_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, VFS.Merchandising);
		driver.findElement(VFS.Merchandising).click();
		utilities.webDriverWait(driver,VFS.Reports);
		driver.findElement(VFS.Reports).click();
		utilities.webDriverWait(driver,scrPODataRpt);
		driver.findElement(scrPODataRpt).click();
		
	}

	public void Print_the_PO_Data_records() throws Throwable {
		 List<WebElement> GridHeaders = driver.findElements(gridHeaders);
//	        System.out.println(gridHeaders);
	        System.out.print("Grid headers: ");
	        for (WebElement header : GridHeaders) {
	            System.out.print(header.getText() + " | ");
	        }
	        System.out.println();
		List<WebElement> gridRows = driver.findElements(POgrid);
	        int rowCount = gridRows.size();
	        
	        // Store the row count for later use
	        System.out.println("Grid row count: " + rowCount);
	        for (WebElement row : gridRows) {
	            List<WebElement> cells = row.findElements(By.cssSelector("td"));
	            for (WebElement cell : cells) {
	                System.out.print(cell.getText() + " | ");
	            }
	            System.out.println();
	            System.out.println();
	        }
	}
	public void Click_on_the_Excel_sheet_and_download() throws Throwable {
		utilities.webDriverWait(driver,Excelexport);
		driver.findElement(Excelexport).click();
		Thread.sleep(10000);
		System.out.println("Exported the PO Data records sucessfully");
	}

	

}
