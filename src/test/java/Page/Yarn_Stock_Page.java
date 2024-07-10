package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Yarn_Stock_Page extends DriverFactory {
	Utilities utilities = new Utilities();
	
	By Yarn_Stock_Reports     = By.xpath("(//span[text()='Reports'])[11]");
	By Yarn_Stock             = By.xpath("//a[text()=' Yarn Stock ']");
	By Yarn_Stock_Screen      = By.xpath("//h3[text()='Yarn Stock']");
	By Grid                   = By.xpath("//tbody[@class='p-element p-datatable-tbody']");
	By Expansion_Icon         = By.xpath("//i[@class='pi c-pointer pi-chevron-right']");
	By Expansion_Header       = By.xpath("(//thead[@class='p-datatable-thead'])[2]");
	By Expansion_Grid_data    = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	By Search_field           = By.xpath("//input[@placeholder='Search keyword']");

	public void Click_on_the_Yarn_Stock_under_the_Reports_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Stock_Reports);
		driver.findElement(Yarn_Stock_Reports).click();
		utilities.MediumWait(driver);
		driver.findElement(Yarn_Stock).click();
		utilities.MediumWait(driver);
		
	}

	public void The_Yarn_Stock_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Stock_Screen);
		String Screen_name  = driver.findElement(Yarn_Stock_Screen).getText();
		System.out.println("Display the Yarn Stock Screen:" +Screen_name);
		
	}

	public void Verify_the_Stock_data_is_displayed_in_the_grid_or_not() throws Throwable {
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

	public void Click_on_the_Expansion_icon_the_expansion_grid_is_displayed_or_not() throws Throwable {
		 List<WebElement> Exp_elements = driver.findElements(Expansion_Icon);
	        // Iterate over each element
	      for (WebElement Exp_element : Exp_elements) {
	      if (Exp_element.isEnabled()) {
		driver.findElement(Expansion_Icon).click();
		utilities.MediumWait(driver);
				
		WebElement grid = driver.findElement(Expansion_Header);

		List<WebElement> tableHeaders = grid.findElements(By.tagName("th"));	
		for (int i = 0; i < tableHeaders.size(); i++) {
		    String columnName = tableHeaders.get(i).getText(); // Get the text of the header column
		    if (columnName == null) {
		        columnName = "null";
		    } else {
		        columnName = columnName.trim();
		    }

		    System.out.println("Displayed header section column name: " + columnName);
		}
	      	        	       	      
	      
	      WebElement OrderData = driver.findElement(Expansion_Grid_data);
		  
		    WebElement Data = driver.findElement(Expansion_Grid_data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Expansion_Grid_data).size() > 0) {
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
	}

	public void Verify_the_Search_keyword_functionality() throws Throwable {
		utilities.webDriverWait(driver, Search_field);
		driver.findElement(Search_field).sendKeys("Cotton");
		utilities.MediumWait(driver);
		
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

}
