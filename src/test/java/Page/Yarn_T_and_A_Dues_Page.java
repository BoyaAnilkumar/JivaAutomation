package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class Yarn_T_and_A_Dues_Page extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Yarn_sourcing_Reports     = By.xpath("(//span[text()='Reports'])[10]");
	By T_and_A_dropdown          = By.xpath("(//span[text()='T&A'])[4]");
	By yarn_T_and_A_Dues         = By.xpath("(//a[text()='T&A Dues'])[4]");
	By Yarn_Dues_Screen          = By.xpath("//h3[text()='Yarn T&A Dues']");
	By Filter_Expansion          = By.xpath("//a[@class='btn btn-collapse-style btn-sm']");
	By Sourcing_Manager          = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[2]");
	By Sourcing_manager_Textbox  = By.xpath("//input[@role='textbox']");
	By Check_Box                 = By.xpath("//div[@role='checkbox']");
	By filter_click              = By.xpath("(//div[@class='card-header'])[1]");
	By Supplier_field            = By.xpath("//select[@formcontrolname='supplier']");
	By Submission_Tab            = By.xpath("(//a[text()='Submissions Due From Yarn Team'])[1]");
	By Approval_Tab              = By.xpath("(//a[text()='Approvals Due From Merchant'])[1]");
	By OverDue_Submission_grid   = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[1]");
	By Overdue_Approval_grid     = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	
	By Today_Submission_Tab      = By.xpath("(//a[text()='Submissions Due From Yarn Team'])[2]");
	By Today_Approval_Tab        = By.xpath("(//a[text()='Approvals Due From Merchant'])[2]");
	By Today_Submission_grid     = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[3]");
	By Today_Approval_grid       = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[4]");
	
	By Upcoming_Submission_Tab   = By.xpath("(//a[text()='Submissions Due From Yarn Team'])[3]");
	By Upcoming_Approval_Tab     = By.xpath("(//a[text()='Approvals Due From Merchant'])[3]");
	By Upcoming_Submission_grid  = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[5]");
	By Upcoming_Approval_grid    = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[6]");

	public void Click_on_the_Yarn_Sourcing_Reports_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Yarn_sourcing_Reports);
		driver.findElement(Yarn_sourcing_Reports).click();
		
	}

	public void Click_on_the_T_and_A_dues_under_the_T_and_A_dropdown() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_dropdown);
		driver.findElement(T_and_A_dropdown).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, yarn_T_and_A_Dues);
		driver.findElement(yarn_T_and_A_Dues).click();
		
	}

	public void the_Yarn_T_and_A_Dues_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Dues_Screen);
		String Screen_name  = driver.findElement(Yarn_Dues_Screen).getText();
		System.out.println("Display the Yarn T&A Dues Screen:" +Screen_name);
		
	}

	public void User_click_on_the_filter_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Filter_Expansion);
		driver.findElement(Filter_Expansion).click();
		
	}

	public void Select_the_Sourcing_in_the_filters_page(String Manager) throws Throwable {
		driver.findElement(Sourcing_Manager).click();
		Thread.sleep(2000);
		driver.findElement(Sourcing_manager_Textbox).sendKeys(Manager);
		utilities.MediumWait(driver);
		driver.findElement(Check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(filter_click).click();
		utilities.MediumWait(driver);
		
	}

	public void Select_the_yarn_in_the_filter_page(String Supplier) {
		 WebElement supplier = driver.findElement(Supplier_field);	       
	        Select dropdown = new Select(supplier);	        
	        dropdown.selectByVisibleText(Supplier);
		
	}

	public void Verify_the_Submissions_Due_from_yarn_Team_Tab_and_Approvals_Due_from_Merchant_Team_tabs_are_displayed_or_not() {
		WebElement data = driver.findElement(Submission_Tab);
		String Screen_name = data.getText(); 
		System.out.print("Display the Submission dues tab name:" + Screen_name);	
					
		WebElement data1 = driver.findElement(Approval_Tab);
		String textdata = data1.getText(); 
		System.out.print("Display the Approvals dues tab name:" + textdata);	
		
	}

	public void Verify_the_Submissions_Due_from_yarn_Team_Tab_grid_are_displayed_or_not() throws Throwable {
		  WebElement OrderData = driver.findElement(OverDue_Submission_grid);
		  
		    WebElement Data = driver.findElement(OverDue_Submission_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(OverDue_Submission_grid).size() > 0) {
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

	public void Click_on_the_Approvals_Due_from_Merchant_Team_Tab() throws Throwable {
		utilities.webDriverWait(driver, Approval_Tab);
		driver.findElement(Approval_Tab).click();
		
		
	}

	public void Verify_the_Approvals_Due_from_Merchant_Team_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Overdue_Approval_grid);
		  
		    WebElement Data = driver.findElement(Overdue_Approval_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Overdue_Approval_grid).size() > 0) {
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

	public void Verify_the_Today_Submissions_Due_from_yarn_Team_Tab_and_Today_Approvals_Due_from_Merchant_Team_tabs_are_displayed_or_not() {
		WebElement data = driver.findElement(Today_Submission_Tab);
		String Screen_name = data.getText(); 
		System.out.print("Display the Submission dues tab name:" + Screen_name);	
					
		WebElement data1 = driver.findElement(Today_Approval_Tab);
		String textdata = data1.getText(); 
		System.out.print("Display the Approvals dues tab name:" + textdata);	
		
	}

	public void Verify_the_Today_Submissions_Due_from_yarn_Team_Tab_grid_are_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Today_Submission_grid);
		  
		    WebElement Data = driver.findElement(Today_Submission_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Today_Submission_grid).size() > 0) {
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

	public void Click_on_the_Today_Approvals_Due_from_Merchant_Team_Tab() throws Throwable {
		utilities.webDriverWait(driver, Today_Approval_Tab);
		driver.findElement(Today_Approval_Tab).click();
		utilities.MediumWait(driver);	   
		
	}

	public void Verify_the_Today_Approvals_Due_from_Merchant_Team_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Today_Approval_grid);
		  
		    WebElement Data = driver.findElement(Today_Approval_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Today_Approval_grid).size() > 0) {
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

	public void Verify_the_Upcoming_Submissions_Due_from_yarn_Team_Tab_and_Today_Approvals_Due_from_Merchant_Team_tabs_are_displayed_or_not() {
		WebElement data = driver.findElement(Upcoming_Submission_Tab);
		String Screen_name = data.getText(); 
		System.out.print("Display the Submission dues tab name:" + Screen_name);	
					
		WebElement data1 = driver.findElement(Upcoming_Approval_Tab);
		String textdata = data1.getText(); 
		System.out.print("Display the Approvals dues tab name:" + textdata);	
		
	}

	public void Verify_the_Upcoming_Submissions_Due_from_yarn_Team_Tab_grid_are_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Upcoming_Submission_grid);
		  
		    WebElement Data = driver.findElement(Upcoming_Submission_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Upcoming_Submission_grid).size() > 0) {
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

	public void Click_on_the_Upcoming_Approvals_Due_from_Merchant_Team_Tab() throws Throwable {
		utilities.webDriverWait(driver, Upcoming_Approval_Tab);
		driver.findElement(Upcoming_Approval_Tab).click();
		utilities.MediumWait(driver);	   
		
	}

	public void Verify_the_Upcoming_Approvals_Due_from_Merchant_Team_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Upcoming_Approval_grid);
		  
		    WebElement Data = driver.findElement(Upcoming_Approval_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Upcoming_Approval_grid).size() > 0) {
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
	

}
