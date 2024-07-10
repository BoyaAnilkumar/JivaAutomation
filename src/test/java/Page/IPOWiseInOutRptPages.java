package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class IPOWiseInOutRptPages extends DriverFactory {
	
	Utilities utilities = new Utilities();
	RevisedMUWorkingPages RMUW = new RevisedMUWorkingPages();
	DailyInInputpages DIIP = new DailyInInputpages();
	
	By FStReports 			= By.xpath("(//span[text()='Reports'])[2]");
	By modDailyInOut		= By.xpath("(//span[text()='Daily In & Out'])[2]");
	By scrIPOwiseInOutRpt	= By.xpath("//a[contains(text(),'IPO Wise In Out Report')]");
	By Merchantname			= By.xpath("//p-multiselect[@optionlabel='fullName']");
	By MerName				= By.xpath("(//label[text()='Merchant']/following::input)[3]");
	By secMerName			= By.xpath("(//li[contains(@class,'p-ripple p-element')]//div)[1]");
	By Supplier				= By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[3]");
	By Suppname				= By.xpath("(//label[text()='Supplier']/following::input)[3]");
	By secSuppName			= By.xpath("//li[contains(@class,'p-ripple p-element')]");
	By secIPOML				= By.xpath("//div[@id='v-pills-tab']");
	By buttReset			= By.xpath("//button[text()='Reset']");
	By IPOname				= By.xpath("//input[@formcontrolname='searchText']");
	By FabricTablist		= By.xpath("//ul[@id='pills-tab']");
	By infoIPOName			= By.xpath("//small[text()='IPO #']/following-sibling::p");
	By infoMerchant			= By.xpath("//small[text()='Merchant']/following-sibling::p");
	By infoBuyer			= By.xpath("//small[text()='Buyer']/following-sibling::p");
	By procName				= By.xpath("//div[@id='headingOne']");
	By ProcessName			= By.xpath("//a[@aria-controls='headingOne']");
	By rowLocator			= By.xpath("//p-table[@class='p-element']");
//	By rowLocator			= By.xpath("//div[@class='card-body collapse show']");
	By FabIssueMerchant		= By.xpath("//a[@aria-controls='headingThree']");		
	By Merchantdata			= By.xpath("//div[@id='headingThree']/following-sibling::div[1]");
	By FabIssueCutting		= By.xpath("//a[@aria-controls='headingfour']");
	By Cuttingdata			= By.xpath("//div[@id='processfour']");
		
	
	

	public void Navigate_to_IPO_Wise_In_Out_Report() throws Throwable {
		utilities.webDriverWait(driver, RMUW.modWoven);
		driver.findElement(RMUW.modWoven).click();
		utilities.webDriverWait(driver, DIIP.Fabric_Store);
		driver.findElement(DIIP.Fabric_Store).click();
		utilities.webDriverWait(driver,FStReports);
		driver.findElement(FStReports).click();
		utilities.webDriverWait(driver,modDailyInOut);
		driver.findElement(modDailyInOut).click();
		utilities.webDriverWait(driver,scrIPOwiseInOutRpt);
		driver.findElement(scrIPOwiseInOutRpt).click();
		
		
		
	}
	public void Click_on_the_Merchant() throws Throwable {
		utilities.webDriverWait(driver,Merchantname);
		driver.findElement(Merchantname).click();
		utilities.webDriverWait(driver,MerName);
		driver.findElement(MerName).sendKeys("lavan");
		utilities.webDriverWait(driver,secMerName);
		driver.findElement(secMerName).click();
		driver.findElement(Merchantname).click();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);
		
	}
	public void Click_on_Reset() throws Throwable {
		utilities.webDriverWait(driver,buttReset);
		driver.findElement(buttReset).click();
		
	}	

	public void Select_the_Merchant() throws Throwable {
		utilities.webDriverWait(driver,Merchantname);
		driver.findElement(Merchantname).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	public void Click_in_the_Supplier_field(String supplier) throws Throwable {
		utilities.webDriverWait(driver,Supplier);
		driver.findElement(Supplier).click();
		utilities.webDriverWait(driver,Suppname);
		driver.findElement(Suppname).sendKeys(supplier);
		utilities.webDriverWait(driver,secSuppName);
		driver.findElement(secSuppName).click();
		driver.findElement(Supplier).click();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);
	}

	public void Select_the_Supplier() throws Throwable {
		utilities.webDriverWait(driver,Supplier);
		driver.findElement(Supplier).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_5);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}
	public void Select_an_IPO_in_the_Menu_list() throws Throwable {
		
		utilities.webDriverWait(driver, secIPOML);
	    
	    // Click on the secIPOML element
	    driver.findElement(secIPOML).click();
	    
	    // Locate all elements corresponding to the tabs
	    List<WebElement> fabricTabs = driver.findElements(secIPOML);
	    
	    // Print the count of IPOs in the menu list
	    int countTabs = fabricTabs.size();
	    System.out.println("Print the count of IPOs in the Menu list: " + countTabs);
	    
	    // Populate the values list with the text of each tab
	    ArrayList<String> values = new ArrayList<>();
	    for (WebElement tab : fabricTabs) {
	        values.add(tab.getText());
	    }
	    
	    // Print the list of values
//	    System.out.println("Values: " + values);
	    
	    // Select a value by index
	    int index = 0; // Selecting the value at index 2 (third element)
	    if (index >= 0 && index < values.size()) {
	        String selectedValue = values.get(index);
	        WebElement elementToClick = fabricTabs.get(index);
	        System.out.println("Selected value: " + selectedValue);
	        
	        // Perform the click on the selected element
	        elementToClick.click();
	        
	    } else {
	        System.out.println("Index out of bounds");
	    }
		
	}


	public void Enter_the_IPO_name_in_the_Search_by_IPO_field() throws Throwable {
		utilities.webDriverWait(driver,IPOname);
		driver.findElement(IPOname).sendKeys("IPO8");
	}

	public void Verify_the_Fabrics_displayed_in_the_tabs_and_print() throws Throwable {
		utilities.webDriverWait(driver,FabricTablist);
		
		 if (driver.findElement(FabricTablist).isDisplayed()) {
		        // Locate all fabric tabs within the FabricTablist
		        List<WebElement> fabricTabs = driver.findElements(FabricTablist);
		        
		        // Get the count of fabric tabs
		        int countTabs = fabricTabs.size();
		        
		        // Print the count of the tabs
		        System.out.println("Display the count of the tabs: " + countTabs);
		        
		        // Print the names of the fabrics displayed in the tab list
		        System.out.println("Print the Fabric names displayed in the tab list:");
		        for (WebElement tab : fabricTabs) {
		            System.out.println(tab.getText());
		        }
		    } else {
		        System.out.println("Fabric tab list is not displayed.");
		    }
	}

	public void Print_the_IPO_value() throws Throwable {
		utilities.webDriverWait(driver,infoIPOName);
		String IPO = driver.findElement(infoIPOName).getText();
		System.out.println("Print the IPO name displayed in the Information bar : "+IPO);
	}

	public void Print_the_Merchant_name_for_the_IPO() throws Throwable {
		utilities.webDriverWait(driver,infoMerchant);
		String Merchant = driver.findElement(infoMerchant).getText();
		System.out.println("Print the Merchant name displayed in the Information bar : "+Merchant);
	}

	public void Print_the_Buyer_name_for_the_IPO() throws Throwable {
		utilities.webDriverWait(driver,infoBuyer);
		String Buyer = driver.findElement(infoBuyer).getText();
		System.out.println("Print the Buyer name displayed in the Information bar : "+Buyer);
	}

	public void Print_the_Processes_name() throws Throwable {
		utilities.webDriverWait(driver,ProcessName);
		driver.findElement(ProcessName).click();
		List<WebElement> processTabs = driver.findElements(ProcessName);
		for (WebElement tab : processTabs) {
            tab.click();
            Thread.sleep(10000);
            System.out.println("Clicked on - "+tab.getText());
        }
		Thread.sleep(10000);
		
		
	}

	public void Print_the_count_of_the_proceses_displayed_for_the_Fabric() {
		if (driver.findElement(procName).isDisplayed()) {
	       
	        List<WebElement> processTabs = driver.findElements(procName);
	        int countTabs = processTabs.size();
	        System.out.println("Display the count of the Processes : " + countTabs);
	        System.out.println("Print the Process names displayed in the grid :");
	        for (WebElement tab : processTabs) {
	            System.out.println(tab.getText());
	        }
	    } else {
	        System.out.println("Processesd are not listed for the selected Fabric.");
	    }
	}

	public void Click_on_a_process_and_print_the_data() {
		
		if (driver.findElement(procName).isDisplayed()) {
	        
			 List<WebElement> processTabs = driver.findElements(procName);

		        // Use a set to keep track of unique elements
		        Set<String> uniqueElements = new HashSet<>();

		        for (WebElement tab : processTabs) {
		            String processName = tab.getText();
		            // Check if the process name is unique
		            if (!uniqueElements.contains(processName)) {
		                uniqueElements.add(processName);

		                // Print the process name
		                System.out.println("Process Name: " + processName);

		                // Locate the rows within the current process tab
		                List<WebElement> rows = tab.findElements(rowLocator);
		                System.out.println("Rows data under the process:");
		                for (WebElement row : rows) {
		                    System.out.println(row.getText());
		                }
		            }
		        }

		        
		    }else {
		    	 System.out.println();
			        System.out.println("Processes are not listed for the selected Fabric.");
			    }
	        
	    } 

		
//		if (driver.findElement(procName).isDisplayed()) {
//	        
//	        List<WebElement> processTabs = driver.findElements(procName);
//	        
//	        
//	        int countTabs = processTabs.size();
//	        System.out.println();
//	        System.out.println("Display the count of the Processes: " + countTabs);
//	        System.out.println();
//	        System.out.println("Print the Process names displayed in the grid:");
//	        
//	        for (WebElement tab : processTabs) {
//	        	 System.out.println();
//	            System.out.println("Process Name: " + tab.getText());
//	            
//	            // Locate the rows within the current process tab
//	            List<WebElement> rows = tab.findElements(rowLocator);
//	            System.out.println(); 
//	            System.out.println("Rows data under the process:");
//	            for (WebElement row : rows) {
//	            	 System.out.println();
//	                System.out.println(row.getText());
//	            }
//	        }
//	    } else {
//	    	 System.out.println();
//	        System.out.println("Processes are not listed for the selected Fabric.");
//	    }
		
		
//}
	
	public void Print_the_Fabric_Issued_to_Merchant_grid_data() {
			
		if (driver.findElement(FabIssueMerchant).isDisplayed()) {
	        
	        WebElement processname = driver.findElement(FabIssueMerchant);
	        List<WebElement> processTabs = driver.findElements(FabIssueMerchant);
	        int countTabs = processTabs.size();
	        System.out.println("Display the count of the Processes: " + countTabs);
	        
	        System.out.println("Print the Process names displayed in the grid:"+processname.getText());
	        
	        for (WebElement tab : processTabs) {
	            System.out.println("Process Name: " + tab.getText());
	            
	            // Locate the rows within the current process tab
	            List<WebElement> rows = tab.findElements(Merchantdata);
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
//	FabIssueMerchant   Merchantdata
	public void Print_the_Fabric_Issued_to_Cutting_grid_data() {
		if (driver.findElement(FabIssueMerchant).isDisplayed()) {
	
	        WebElement processname = driver.findElement(FabIssueCutting);
	        List<WebElement> processTabs = driver.findElements(FabIssueCutting);
	        int countTabs = processTabs.size();
	        System.out.println("Display the count of the Processes: " + countTabs);
	        
	        System.out.println("Print the Process names displayed in the grid:"+processname.getText());
	        
	        for (WebElement tab : processTabs) {
	            System.out.println("Process Name: " + tab.getText());
	            
	            // Locate the rows within the current process tab
	            List<WebElement> rows = tab.findElements(Cuttingdata);
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
