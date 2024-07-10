package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class Sw_View_Yarn_Sheet_Working_Pages extends DriverFactory{

	Utilities utilities = new Utilities();
	
    By Yarn_Sourcing_Reports           = By.xpath("(//span[text()='Reports'])[1]");
	By View_Yarn_Sheet_Working         = By.xpath("//a[contains(text(),'View Yarn Sheet Working')]");
	By Search_IPO                      = By.xpath("//input[@placeholder='Enter IPO #']");
	By Quantity_Details_Grid           = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[1]");
	By Expanison_Icon                  = By.xpath("//span[@class='p-button-icon p-button-icon-left pi pi-chevron-right']");
	By Expansion_grid_details          = By.xpath("(//tr[@class='ng-star-inserted'])[5]");
	By Liability_Details_Grid          = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	By MU_Working_Grid                 = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[3]");
	By Status_filter                   = By.xpath("//select[@formcontrolname='statusId']");

	
	public void Click_on_the_Sourcing_Reports_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Sourcing_Reports);
		driver.findElement(Yarn_Sourcing_Reports).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_View_Yarn_Sheet_Working_Screen_Screen() throws Throwable {
		utilities.webDriverWait(driver, View_Yarn_Sheet_Working);
		driver.findElement(View_Yarn_Sheet_Working).click();
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_Buyer_in_Search_By_IPO(String IPO) throws Throwable {
		utilities.webDriverWait(driver, Search_IPO);
		driver.findElement(Search_IPO).sendKeys(IPO);
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Quantity_Requirements_Grid_and_Yarn_details_are_displayed_in_the_grid_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Quantity_Details_Grid);
		  
		    WebElement Data = driver.findElement(Quantity_Details_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Quantity_Details_Grid).size() > 0) {
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

	public void Verify_the_Yarn_Liability_Details_are_displayed_in_the_grid_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Liability_Details_Grid);
		  
		    WebElement Data = driver.findElement(Liability_Details_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Liability_Details_Grid).size() > 0) {
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

	public void Verify_the_Mu_working_grid_is_displayed_with_yarn_process_details_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(MU_Working_Grid);
		  
		    WebElement Data = driver.findElement(MU_Working_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(MU_Working_Grid).size() > 0) {
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

	public void Click_on_the_Expansion_the_Yarn_details_are_displayed_or_not() throws Throwable {
		   List<WebElement> Exp_IconElements = driver.findElements(Expanison_Icon);
	        // Iterate over each element
	        for (WebElement Exp_IconElement : Exp_IconElements) {
	            if (Exp_IconElement.isEnabled()) {
	                // If the element is enabled, perform actions
	                System.out.println("Element is enabled.");
	                WebElement OrderData = driver.findElement(Expansion_grid_details);
	      		  
	    		    WebElement Data = driver.findElement(Expansion_grid_details);
	    		    Thread.sleep(1000);
	    		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
	    		        int Irowcount = rows1.size();
	    	            int Idatarowcount = Irowcount;
	    	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	    	         
	    	        if(driver.findElements(Expansion_grid_details).size() > 0) {
	    	        utilities.MediumWait(driver);            
	    	        String OrderDataText1 = OrderData.getText();
	    			utilities.MediumWait(driver);	    
	    			            
	    	        String[] rows = OrderDataText1.split("\n");
	    			for (String row : rows) {
	    		     System.out.println(row);
	    		        System.out.println();
	    		        
	    		    }
	    		
	    		}	    

	                utilities.MinimumWait(driver); // Optional wait
	            }
	        }
		 
	}
	public void Select_the_status_in_filter_Option_page(String status) throws Throwable {
		utilities.webDriverWait(driver, Status_filter);
		driver.findElement(Status_filter).click();
	    Thread.sleep(1000);    
	    WebElement Status = driver.findElement(Status_filter);
	    Select Status_fil = new Select(Status);

	    boolean statusExists = false;
	    for (WebElement option : Status_fil.getOptions()) {
	        if (option.getText().equals(status)) {
	        	statusExists = true;
	            break;
	        }
	    }

	    if (statusExists) {
	    	Status_fil.selectByVisibleText(status);
	    } else {
	        System.out.println("Status is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);

		
	}


}
