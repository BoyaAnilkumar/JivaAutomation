package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Yarn_Quality_Input_Approval_Page extends DriverFactory {
	Utilities utilities = new Utilities();
     
	By Sourcing_Data_Entry   = By.xpath("(//span[text()='Data Entry'])[1]");
	By Yarn_Quali_Inp_Appro  = By.xpath("//a[text()='Yarn Quality Input Approval']");
	By Yarn_Qua_Input_Ap_SC  = By.xpath("//h3[text()='Yarn Quality Input Approval']");
	By Header_Section        = By.xpath("//thead[@class='p-datatable-thead']");
	By Table                 = By.xpath("//table[@class='p-datatable-table ng-star-inserted']");
	By Grid                  = By.xpath("//tbody[@class='p-element p-datatable-tbody']");
	By Expansion_Icon        = By.xpath("//i[@class='pi c-pointer pi-chevron-right ng-star-inserted']");
	By Expansion_Grid_name   = By.xpath("//b[text()='Yarn Quality Shrinkage']");
	By Expan_Header_Section  = By.xpath("(//thead[@class='p-datatable-thead'])[2]");
	By Expansion_Grid_Data   = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	By Approve_Icon          = By.xpath("//a[@title='Approve']");
	By Approve_Popup         = By.xpath("//h4[text()='Approve Yarn Quality Input Approval ']");
	By Solution_field        = By.xpath("//textarea[@formcontrolname='solution']");
	By Submit_button         = By.xpath("//button[text()='Submit']");
	By Reject_Icon           = By.xpath("//a[@title='Reject']");
	By Reject_Popup          = By.xpath("//h4[text()='Reject Yarn Quality Input Approval ']");
	
	
	public void Click_on_the_Yarn_Quality_Input_Approval_under_the_Data_Entry_dropdown() throws Throwable {
		driver.findElement(Sourcing_Data_Entry).click();
		utilities.MediumWait(driver);
		driver.findElement(Yarn_Quali_Inp_Appro).click();
		utilities.MediumWait(driver);
	}

	public void The_Yarn_Quality_Input_Approval_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Qua_Input_Ap_SC);
		String Screen_name  = driver.findElement(Yarn_Qua_Input_Ap_SC).getText();
		System.out.println("Display the Yarn Quality Input Approval Screen:" +Screen_name);
		
	}

	public void Verify_the_grid_header_section_names_are_displayed_or_not() throws Throwable {
		WebElement grid = driver.findElement(Header_Section);

		List<WebElement> tableHeaders = grid.findElements(By.tagName("th"));

		// Define expected header values
		//String[] expectedHeaders = {" IPO # ", " PO Number ", "Yarn Details", "In House Date", "Checker Name", "Weight Details", "Checking Related Issues"};

		// Verify table headers
		for (int i = 0; i < tableHeaders.size(); i++) {
		    String columnName = tableHeaders.get(i).getText(); // Get the text of the header column

		    // Check if the column name is null or empty
		    if (columnName == null) {
		        columnName = "null";
		    } else {
		        columnName = columnName.trim();
		    }

		    System.out.println("Displayed header section column name: " + columnName);
  
	        }	       
	}
	public void Verify_the_Sorting_functionality_is_working_or_not() throws Throwable {
		WebElement table = driver.findElement(Header_Section);
		List<WebElement> columnheader = table.findElements(By.xpath("//thead/tr/th/div/p-sorticon"));

		for (WebElement header : columnheader) { 
			header.click();
			utilities.MinimumWait(driver);
			header.click();
			utilities.MinimumWait(driver);		
	}
		
	}

	public void Verify_the_IPO_data_is_displayed_in_the_grid_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Grid);
		  
		    WebElement Data = driver.findElement(Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Grid).size() > 0) {
	        utilities.MediumWait(driver);            
	        String OrderDataText1 = OrderData.getText();
			utilities.MediumWait(driver);	    
			            
	        String[] rows = OrderDataText1.split("\n");
			for (String row : rows) {
		     System.out.println(row);
		        System.out.println();		        
		    }		
		}	    		
	}

	public void Click_on_the_Expansion_icon() throws Throwable {
		utilities.webDriverWait(driver, Expansion_Icon);
		driver.findElement(Expansion_Icon).click();
		utilities.MediumWait(driver);
		
	}

	public void The_Yarn_Quality_Shrinkage_grid_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Expansion_Grid_name);
		String Screen_name  = driver.findElement(Expansion_Grid_name).getText();
		System.out.println("Display the Yarn Quality Shrinkage grid name is displayed:" +Screen_name);
		
	}

	public void The_Expansion_grid_header_section_names_are_displayed_or_not() {
		WebElement grid = driver.findElement(Expan_Header_Section);

		List<WebElement> tableHeaders = grid.findElements(By.tagName("th"));
		for (int i = 0; i < tableHeaders.size(); i++) {
		    String columnName = tableHeaders.get(i).getText(); // Get the text of the header column		 
		    if (columnName == null) {
		        columnName = "null";
		    } else {
		        columnName = columnName.trim();
		    }

		    System.out.println("Displayed Expansion grid header section column name: " + columnName);
  
	        }	       
		
	}

	public void the_Expanison_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Expansion_Grid_Data);
		  
		    WebElement Data = driver.findElement(Expansion_Grid_Data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Expansion_Grid_Data).size() > 0) {
	        utilities.MediumWait(driver);            
	        String OrderDataText1 = OrderData.getText();
			utilities.MediumWait(driver);	    
			            
	        String[] rows = OrderDataText1.split("\n");
			for (String row : rows) {
		     System.out.println(row);
		        System.out.println();
		        
		    }
		
		}	    
		
	}

	public void Click_on_the_Approve_button_in_the_expansion_grid() throws Throwable {
		driver.findElement(Approve_Icon).click();
		utilities.MediumWait(driver);
		
	}

	public void the_Approve_Yarn_Quality_Input_Approval_popup_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Approve_Popup);
		String Screen_name  = driver.findElement(Approve_Popup).getText();
		System.out.println("Display the Approve Yarn Quality Input Approval Popup:" +Screen_name);
		
	}

	public void Enter_the_data_in_the_Solution_field() throws Throwable {
		utilities.webDriverWait(driver, Solution_field);
		driver.findElement(Solution_field).sendKeys("Approve");
		utilities.MediumWait(driver);
		
		
	}

	public void Click_on_the_Submit_button_in_the_Approve_Yarn_Quality_Input_Approval_popup() throws Throwable {
		utilities.webDriverWait(driver, Submit_button);
		driver.findElement(Submit_button).click();
		utilities.MediumWait(driver);
	}

	public void Click_on_the_Reject_button_in_the_expansion_grid() throws Throwable {
		driver.findElement(Reject_Icon).click();
		utilities.MediumWait(driver);
		
	}

	public void the_Reject_Yarn_Quality_Input_Approval_popup_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Reject_Popup);
		String Screen_name  = driver.findElement(Reject_Popup).getText();
		System.out.println("Display the Reject Yarn Quality Input Approval Popup:" +Screen_name);
		
	}

	public void Click_on_the_Submit_button_in_the_Reject_Yarn_Quality_Input_Approval_popup() throws Throwable {
		utilities.webDriverWait(driver, Submit_button);
		driver.findElement(Submit_button).click();
		utilities.MediumWait(driver);
		
	}

	public void Enter_the_Reject_data_in_the_Solution_field() throws Throwable {
		utilities.webDriverWait(driver, Solution_field);
		driver.findElement(Solution_field).sendKeys("Reject");
		utilities.MediumWait(driver);
		
	}

}
