package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_ViewYarnSheet_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Reports              = By.xpath("(//span[text()='Reports'])[9]");
    By View_Yarn_Sheet      = By.xpath("//a[text()='View Yarn Sheet']");
    By Bulk_Yarn            = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[7]");
    By Sourcing_Manager     = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[8]");
    By Sourcing_Assistants  = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[9]");
    By Yarn_Details_Exp     = By.xpath("//u[text()='Yarn Details']");
    By Yarn_Details_Grid    = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[1]");
    By Garment_Avg_Exp      = By.xpath("//u[text()='Garment Average']");
    By Garment_Avg_Grid     = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
    By Quantity_Grid        = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[3]");
    By View_For_Combo_name  = By.xpath("//button[text()=' View for Print by Combo Name']");
    By View_For_Yarn_Qua    = By.xpath("//button[text()=' View for Print by Yarn Quality']");
    By View_For_Yarn_sheet  = By.xpath("//button[text()=' View for Print by Yarn Sheet']");
    By Print_Button         = By.xpath("//button[text()='Print']");
    By History_Button       = By.xpath("//button[text()=' History ']");
    By Header_names         = By.xpath("(//tr[@class='ng-star-inserted'])[1]");
    By History_Grid         = By.xpath("(//tr[@class='ng-star-inserted'])[2]");
    By Back_Button          = By.xpath("//button[text()=' Back ']");
    
	public void Click_on_the_Reports_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Reports);
		driver.findElement(Reports).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_View_Yarn_Sheet() throws Throwable {
		utilities.webDriverWait(driver, View_Yarn_Sheet);
		driver.findElement(View_Yarn_Sheet).click();
		utilities.MinimumWait(driver);
		
	}

	public void the_Bulk_Yarn_Deadline_should_be_displayed_correctly() throws Throwable {
		utilities.webDriverWait(driver, Bulk_Yarn);
		WebElement BulkYarn = driver.findElement(Bulk_Yarn);
		String BulkYarn_data = BulkYarn.getText(); 
		System.out.print("Display Bulk Yarn Deadline:" + BulkYarn_data);
		utilities.MinimumWait(driver);
		
	}

	public void the_Sourcing_Manager_should_be_displayed() throws Throwable {
		utilities.webDriverWait(driver, Sourcing_Manager);
		WebElement SourcingManager = driver.findElement(Sourcing_Manager);
		String SourcingManager_data = SourcingManager.getText(); 
		System.out.print("Display Sourcing Manager:" + SourcingManager_data);
		utilities.MinimumWait(driver);
		
	}

	public void the_Sourcing_Manager_Assistants_should_be_displayed() throws Throwable {
		utilities.webDriverWait(driver, Sourcing_Assistants);
		WebElement Sou_Assis = driver.findElement(Sourcing_Assistants);
		String Sou_Assis_data = Sou_Assis.getText(); 
		System.out.print("Display Sourcing Manager Assistants:" + Sou_Assis_data);
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Yarn_Details_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Details_Exp);
		driver.findElement(Yarn_Details_Exp).click();
		utilities.MinimumWait(driver);
		
	}

	public void the_Yarn_details_Data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Yarn_Details_Grid);
		  
		    WebElement Data = driver.findElement(Yarn_Details_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Yarn_Details_Grid).size() > 0) {
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

	public void Click_on_the_Garment_Average_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Garment_Avg_Exp);
		driver.findElement(Garment_Avg_Exp).click();
		utilities.MinimumWait(driver);
		
	}

	public void the_Garment_details_are_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Garment_Avg_Grid);
		  
		    WebElement Data = driver.findElement(Garment_Avg_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Garment_Avg_Grid).size() > 0) {
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

	public void Quantity_Requirement_Grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Quantity_Grid);
		  
		    WebElement Data = driver.findElement(Quantity_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Quantity_Grid).size() > 0) {
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

	public void Click_on_the_View_For_Print_by_Combo_Name_button() throws Throwable {
		utilities.webDriverWait(driver, View_For_Combo_name);
		driver.findElement(View_For_Combo_name).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Quantity_Requirements_Grid_Data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Yarn_Details_Grid);
		  
		    WebElement Data = driver.findElement(Yarn_Details_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Yarn_Details_Grid).size() > 0) {
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

	public void Click_on_the_Print_button() throws Throwable {
//		utilities.webDriverWait(driver, Print_Button);
//		driver.findElement(Print_Button).click();
//		utilities.MinimumWait(driver);
	}

	public void Click_on_the_View_For_Print_by_Yarn_Quality_button() throws Throwable {
		utilities.webDriverWait(driver, View_For_Yarn_Qua);
		driver.findElement(View_For_Yarn_Qua).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_View_For_Print_by_Yarn_Sheet_button() throws Throwable {
		utilities.webDriverWait(driver, View_For_Yarn_sheet);
		driver.findElement(View_For_Yarn_sheet).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_History_Button() throws Throwable {
		utilities.webDriverWait(driver, History_Button);
		driver.findElement(History_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void The_History_Grid_Header_names_are_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Header_names);
		  
		    WebElement Data = driver.findElement(Header_names);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("th"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Header_names).size() > 0) {
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

	public void the_History_Grid_Data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(History_Grid);
		  
		    WebElement Data = driver.findElement(History_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(History_Grid).size() > 0) {
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

	public void Click_on_the_Back_Button() throws Throwable {
		utilities.webDriverWait(driver, Back_Button);
		driver.findElement(Back_Button).click();
		utilities.MinimumWait(driver);
		
	}

}
