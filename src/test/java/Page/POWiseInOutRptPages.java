package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class POWiseInOutRptPages extends DriverFactory  {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	DailyInInputpages DIIP = new DailyInInputpages();
	IPOWiseInOutRptPages IWIOR = new IPOWiseInOutRptPages();
	
	By scrPOWiseInOutrpt 	= By.xpath("//a[text()='PO Wise In Out Report']");
	By infoPODate			= By.xpath("(//p[contains(@class,'mb-0 text-primary')]//b)[1]");
	By infoPONumber			= By.xpath("(//p[contains(@class,'mb-0 text-primary')]//b)[2]");
	By infoSupplier			= By.xpath("(//p[contains(@class,'mb-0 text-primary')]//b)[3]");
	By infoPOQty			= By.xpath("(//p[contains(@class,'mb-0 text-primary')]//b)[4]");
	By infoInHouseQty		= By.xpath("(//p[contains(@class,'mb-0 text-primary')]//b)[5]");
	By FabIn				= By.xpath("//b[text()='Fabric IN']");
	By FabIndata			= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[1]");
	By FabVendor			= By.xpath("//b[text()='Fabric Returned To Vendor']");
	By FabVendordata		= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[2]");
	

	public void Navigate_to_PO_Wise_In_Out_Report() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, DIIP.Fabric_Store);
		driver.findElement(DIIP.Fabric_Store).click();
		utilities.webDriverWait(driver,IWIOR.FStReports);
		driver.findElement(IWIOR.FStReports).click();
		utilities.webDriverWait(driver,IWIOR.modDailyInOut);
		driver.findElement(IWIOR.modDailyInOut).click();
		utilities.webDriverWait(driver,scrPOWiseInOutrpt);
		driver.findElement(scrPOWiseInOutrpt).click();
	}

	public void Enter_the_PO_number_in_the_Search_by_PO_field(String POname) throws Throwable {
		utilities.webDriverWait(driver,IWIOR.IPOname);
		driver.findElement(IWIOR.IPOname).sendKeys(POname);
	}

	public void Print_the_PO_Date_date_for_the_selected_PO() throws Throwable {
		utilities.webDriverWait(driver,infoPODate);
		String PODate = driver.findElement(infoPODate).getText();
		System.out.println("Print the PO Date displayed in the Information bar : "+PODate);
	}

	public void Print_the_PO_name_for_the_selected_PO() throws Throwable {
		utilities.webDriverWait(driver,infoPONumber);
		String PONo = driver.findElement(infoPONumber).getText();
		System.out.println("Print the PO Number displayed in the Information bar : "+PONo);	
	}

	public void Print_the_Supplier_name_for_the_selected_PO() throws Throwable {
		utilities.webDriverWait(driver,infoSupplier);
		String Supp = driver.findElement(infoSupplier).getText();
		System.out.println("Print the Supplier Name displayed in the Information bar : "+Supp);
	}

	public void Print_the_PO_Qty_for_the_selected_PO() throws Throwable {
		utilities.webDriverWait(driver,infoPOQty);
		String POQty = driver.findElement(infoPOQty).getText();
		System.out.println("Print the PO Qty displayed in the Information bar : "+POQty);
	}

	public void Print_the_In_House_Qty_for_the_selected_PO() throws Throwable {
		utilities.webDriverWait(driver,infoInHouseQty);
		String inhouseQty = driver.findElement(infoInHouseQty).getText();
		System.out.println("Print the In House Qty displayed in the Information bar : "+inhouseQty);
	}

	public void Print_the_Fabric_In_grid_data_in_PO_Wise_In_Out_Report() {
		if (driver.findElement(FabIn).isDisplayed()) {
			
	        WebElement processname = driver.findElement(FabIn);
	        List<WebElement> processTabs = driver.findElements(FabIn);
	        int countTabs = processTabs.size();
	        System.out.println("Display the count of the Processes: " + countTabs);
	        
	        System.out.println("Print the Process names displayed in the grid:"+processname.getText());
	        
	        for (WebElement tab : processTabs) {
	            System.out.println("Process Name: " + tab.getText());
	            
	            // Locate the rows within the current process tab
	            List<WebElement> rows = tab.findElements(FabIndata);
//	            System.out.println(rows);
	            System.out.println("Rows data under the process:");
	            for (WebElement row : rows) {
	                System.out.println("Row data : "+row.getText());
	            }
	        }
	    } else {
	        System.out.println("Processes are not listed for the selected Fabric.");
	    }

	}

	public void Print_the_Fabric_Returned_to_Vendor_grid_data_in_PO_Wise_In_Out_Report() {
		if (driver.findElement(FabVendor).isDisplayed()) {
			
	        WebElement processname = driver.findElement(FabVendor);
	        List<WebElement> processTabs = driver.findElements(FabVendor);
	        int countTabs = processTabs.size();
	        System.out.println("Display the count of the Processes: " + countTabs);
	        
	        System.out.println("Print the Process names displayed in the grid:"+processname.getText());
	        
	        for (WebElement tab : processTabs) {
	            System.out.println("Process Name: " + tab.getText());
	            
	            // Locate the rows within the current process tab
	            List<WebElement> rows = tab.findElements(FabVendordata);
//	            System.out.println(rows);
	            System.out.println("Rows data under the process:");
	            for (WebElement row : rows) {
	                System.out.println("Row data : "+row.getText());
	            }
	        }
	    } else {
	        System.out.println("Processes are not listed for the selected Fabric.");
	    }
	}

}
