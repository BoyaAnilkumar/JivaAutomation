package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class DailyInOutReportPages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	DailyInInputpages DIIP = new DailyInInputpages();
	IPOWiseInOutRptPages IWIOR = new IPOWiseInOutRptPages();
	
	By scrDailyInOutRpt			= By.xpath("//a[text()='Daily In Out Report']");
	By date						= By.xpath("//input[@placeholder='select Date']");
	By buttSearch				= By.xpath("//button[text()=' Search']");
	By DailyInHouse				= By.xpath("//b[text()='Daily In House']");
	By Inhousedata				= By.xpath("//table[1]");
	By IssueCutting				= By.xpath("//b[text()='Issued to Cutting']");
	By Cuttingdata				= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[2]");
	By SentSupplier				= By.xpath("//b[text()='Sent/Returned to Supplier']");
	By Supplierdata				= By.xpath("(//table[@class='p-datatable-table ng-star-inserted'])[3]");
	
//	String gridname;

	public void Navigate_to_Daily_In_Out_Report_screen() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, DIIP.Fabric_Store);
		driver.findElement(DIIP.Fabric_Store).click();
		utilities.webDriverWait(driver,IWIOR.FStReports);
		driver.findElement(IWIOR.FStReports).click();
		utilities.webDriverWait(driver,IWIOR.modDailyInOut);
		driver.findElement(IWIOR.modDailyInOut).click();
		utilities.webDriverWait(driver,scrDailyInOutRpt);
		driver.findElement(scrDailyInOutRpt).click();
	}

	public void Click_on_the_Search_button() throws Throwable {
		utilities.webDriverWait(driver,buttSearch);
		driver.findElement(buttSearch).click();
	}

	public void Verify_and_print_the_respective_Date_Daily_In_records_under_the_Daily_In_House_grid() {
		
		if (driver.findElement(DailyInHouse).isDisplayed()) {
			WebElement grid = driver.findElement(DailyInHouse);
			String gridname = grid.getText();
			System.out.println("Print the grid name : "+gridname);
			WebElement house = driver.findElement(Inhousedata);
			java.util.List<WebElement> rows = house.findElements(By.tagName("tr"));
            System.out.println(rows);
            int rowcount = rows.size();
            int datarowcount = rowcount-1;
            System.out.println("No. of data Rows in the " +gridname+ "grid : " + datarowcount);
            for (WebElement row : rows) {
            	System.out.println();
            	System.out.println("Row data : "+row.getText());
            	System.out.println();
            	}
			}else {	
			
				}
		
		}

	

	public void Enter_the_date_for_searching_the_records(String Date) throws Throwable {
		utilities.webDriverWait(driver,date);
		WebElement DailyDate = driver.findElement(date);
		Thread.sleep(1000);
		DailyDate.clear();
		Thread.sleep(10000);
		driver.findElement(date).sendKeys(Date);
	}

	public void Verify_and_print_the_respective_Date_Daily_In_records_under_the_Issued_to_Cutting_grid() {
		if (driver.findElement(IssueCutting).isDisplayed()) {
			WebElement grid = driver.findElement(IssueCutting);
			String gridname = grid.getText();
			System.out.println("Print the grid name : "+gridname);
			WebElement cutting = driver.findElement(Cuttingdata);
			java.util.List<WebElement> rows = cutting.findElements(By.tagName("tr"));
            System.out.println(rows);
            int Irowcount = rows.size();
            int Idatarowcount = Irowcount-1;
            System.out.println("No. of data Rows in the " +gridname+ "grid : " + Idatarowcount);
            for (WebElement row : rows) {
            	System.out.println();
            	System.out.println("Row data : "+row.getText());
            	System.out.println();
            	}
			}else {	
				System.out.println("No Data Found");
			
		}
	}

	public void Verify_and_print_the_respective_Date_Daily_In_records_under_the_Sent_or_Return_to_Supplier_grid() {
		if (driver.findElement(SentSupplier).isDisplayed()) {
			WebElement grid = driver.findElement(SentSupplier);
			String gridname = grid.getText();
			System.out.println("Print the grid name : "+gridname);
			WebElement cutting = driver.findElement(Supplierdata);
			java.util.List<WebElement> rows = cutting.findElements(By.tagName("tr"));
            System.out.println(rows);
            int Irowcount = rows.size();
            int Idatarowcount = Irowcount-1;
            System.out.println("No. of data Rows in the " +gridname+ "grid : " + Idatarowcount);
            for (WebElement row : rows) {
            	System.out.println();
            	System.out.println("Row data : "+row.getText());
            	System.out.println();
            	}
			}else {	
				System.out.println("No Data Found");
			
		}
	}

	

}
