package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class SW_Merchandising_T_and_A_Dues_Page extends DriverFactory{

	Utilities utilities = new Utilities();

	By Merchant_Report           = By.xpath("(//span[text()='Reports'])[9]");
	By T_and_A_dropdown          = By.xpath("(//span[text()='T&A'])[3]");
	By T_and_A_Dues              = By.xpath("(//a[text()='T&A Dues'])[3]");
	By T_and_A_screen            = By.xpath("//h3[text()='Merchandising T&A Dues']");
	By Merchant_field            = By.xpath("//div[text()='Select Merchant']");
	By Merchant_Textfield        = By.xpath("//input[@role='textbox']");
	By Mer_Check_Box             = By.xpath("//div[@class='p-checkbox-box']");
	By Filter_Board              = By.xpath("(//div[@class='card-header'])[1]");
	By Season_field              = By.xpath("//select[@formcontrolname='seasonId']");
	By Month_field               = By.xpath("//select[@formcontrolname='month']");
	By Overdue_Expansion         = By.xpath("//u[text()='Overdue']");
	By Overdue_Merchant_dues     = By.xpath("(//a[text()='Merchandising Dues'])[1]");
	By Overdues_yarndues         = By.xpath("(//a[text()='Yarn Dues'])[1]");
	By Overdue_Merch_grid        = By.xpath("(//div[text()=' Merchandising submissions due '])[1]");
	By Overdue_Merch_grid_data   = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[1]");
	By Yarn_Sub_Due_grid         = By.xpath("(//div[text()=' Submissions due From Yarn Team '])[1]");
	By Merch_Approval_grid_data  = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	By Sub_Due_From_yarn_grid    = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[3]");
	By App_Due_From_yarn_grid    = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[4]");
	By SortingByColumns1          = By.xpath("(//thead[@class='p-datatable-thead'])[1]");
	By SortingByColumns2          = By.xpath("(//thead[@class='p-datatable-thead'])[1]");
	By SortingByColumns3          = By.xpath("(//thead[@class='p-datatable-thead'])[1]");
	By SortingByColumns4          = By.xpath("(//thead[@class='p-datatable-thead'])[1]");
	
	By Today_expansion                 = By.xpath("//u[text()='Today']");
	By Today_Yarn_Dues_tab             = By.xpath("(//a[text()='Yarn Dues'])[2]");
	By Today_Merch_grid                = By.xpath("(//div[text()=' Merchandising submissions due '])[2]");
	By Today_Merch_grid_data           = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[5]");
	By Today_Yarn_Sub_Due_grid         = By.xpath("(//div[text()=' Submissions due From Yarn Team '])[2]");
	By Today_Merch_Approval_grid_data  = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[6]");
	By Today_Sub_Due_From_yarn_grid    = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[7]");
	By Today_App_Due_From_yarn_grid    = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[8]");
	
	By Upcoming_expansion                 = By.xpath("//u[text()='Upcoming']");
	By Upcoming_Yarn_Dues_tab             = By.xpath("(//a[text()='Yarn Dues'])[3]");
	By Upcoming_Merch_grid                = By.xpath("(//div[text()=' Merchandising submissions due '])[3]");
	By Upcoming_Merch_grid_data           = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[9]");
	By Upcoming_Yarn_Sub_Due_grid         = By.xpath("(//div[text()=' Merchandising Approvals due '])[3]");
	By Upcoming_Merch_Approval_grid_data  = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[10]");
	By Upcoming_Sub_Due_From_yarn_grid    = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[11]");
	By Upcoming_App_Due_From_yarn_grid    = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[12]");
	
	public void Click_on_the_Merchandising_Reports_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Merchant_Report);
		driver.findElement(Merchant_Report).click();
		utilities.MinimumWait(driver);	
		
	}

	public void Click_on_the_T_and_A_dues_under_the_T_and_A_dropdown() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_dropdown);
		driver.findElement(T_and_A_dropdown).click();
		utilities.MinimumWait(driver);	
		utilities.webDriverWait(driver, T_and_A_Dues);
		driver.findElement(T_and_A_Dues).click();
		
	}

	public void the_Merchandising_T_and_A_Dues_Screen_is_displayed_or_not() throws Throwable {
		WebElement data = driver.findElement(T_and_A_screen);
		String Screen_name = data.getText(); 
		System.out.print("Display the T and A Dues Screen:" + Screen_name);	
					
		
	}
By Dropdown   = By.xpath("//div[text()='Filter Options']");
	public void Select_the_in_the_Filters_page(String Merchant) throws Throwable {
		driver.findElement(Merchant_field).click();
		Thread.sleep(2000);
		driver.findElement(Merchant_Textfield).sendKeys(Merchant);
		utilities.MediumWait(driver);
		driver.findElement(Mer_Check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(Dropdown).click();
		utilities.MediumWait(driver);
		
	}

	public void Select_the_in_the_filters_page(String Season) throws Throwable {
		utilities.webDriverWait(driver, Season_field);
		driver.findElement(Season_field).click();
	    Thread.sleep(1000);    
	    WebElement season = driver.findElement(Season_field);
	    Select Sea = new Select(season);

	    boolean SeasonExists = false;
	    for (WebElement option : Sea.getOptions()) {
	        if (option.getText().equals(Season)) {
	        	SeasonExists = true;
	            break;
	        }
	    }

	    if (SeasonExists) {
	    	Sea.selectByVisibleText(Season);
	    } else {
	        System.out.println("Selected Season is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);
		
	}

	public void Select_the_in_the_filter_page(String Month) throws Throwable {
		utilities.webDriverWait(driver, Month_field);
		driver.findElement(Month_field).click();
	    Thread.sleep(1000);    
	    WebElement month = driver.findElement(Month_field);
	    Select Month1 = new Select(month);

	    boolean MonthExists = false;
	    for (WebElement option : Month1.getOptions()) {
	        if (option.getText().equals(Month)) {
	        	MonthExists = true;
	            break;
	        }
	    }

	    if (MonthExists) {
	    	Month1.selectByVisibleText(Month);
	    } else {
	        System.out.println("Selected Month is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);
		
	}

	public void Click_on_the_Overdue_expansion() {
		
		
	}

	public void Verify_the_Merchandising_Dues_Tab_and_Yarn_Dues_Tabs_are_displayed_or_not() {
		WebElement data = driver.findElement(Overdue_Merchant_dues);
		String Screen_name = data.getText(); 
		System.out.print("Display the Merchandising dues tab name:" + Screen_name);	
					
		WebElement data1 = driver.findElement(Overdues_yarndues);
		String textdata = data1.getText(); 
		System.out.print("Display the yarn dues tab name:" + textdata);	
					
		
	}

	public void Verify_the_Merchandising_Submissions_Due_and_Merchandising_Approvals_Due_grids_are_displayed_or_not() {
		WebElement data = driver.findElement(Overdue_Merch_grid);
		String Screen_name = data.getText(); 
		System.out.print("Display the Merchandising dues grid name:" + Screen_name);	
					
		WebElement data1 = driver.findElement(Yarn_Sub_Due_grid);
		String textdata = data1.getText(); 
		System.out.print("Display the Submissions Due From Yarn Team grid name:" + textdata);	
		
	}

	public void Verify_the_Merchandising_Submissions_Due_grid_data_is_displayed_or_not() throws Throwable {
		  WebElement OrderData = driver.findElement(Overdue_Merch_grid_data);
		  
		    WebElement Data = driver.findElement(Overdue_Merch_grid_data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Overdue_Merch_grid_data).size() > 0) {
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

	public void Verify_the_Merchandising_Approvals_Due_grid_data_is_displayed_or_not() throws Throwable {
		  WebElement OrderData = driver.findElement(Merch_Approval_grid_data);
		  
		    WebElement Data = driver.findElement(Merch_Approval_grid_data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Merch_Approval_grid_data).size() > 0) {
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

	public void Click_on_the_Yarn_Dues_Tab() throws Throwable {
		utilities.webDriverWait(driver, Overdues_yarndues);
		driver.findElement(Overdues_yarndues).click();
		utilities.MinimumWait(driver);	
		
	}

	public void Verify_the_Submissions_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		  WebElement OrderData = driver.findElement(Sub_Due_From_yarn_grid);
		  
		    WebElement Data = driver.findElement(Sub_Due_From_yarn_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Sub_Due_From_yarn_grid).size() > 0) {
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

	public void Verify_the_Approvals_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		  WebElement OrderData = driver.findElement(App_Due_From_yarn_grid);
		  
		    WebElement Data = driver.findElement(App_Due_From_yarn_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(App_Due_From_yarn_grid).size() > 0) {
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

	public void Click_on_the_Today_expansion() throws Throwable {
		utilities.webDriverWait(driver, Today_expansion);
		driver.findElement(Today_expansion).click();
		utilities.MinimumWait(driver);	
		
	}

	public void Verify_the_Today_Merchandising_Submissions_Due_and_Merchandising_Approvals_Due_grids_are_displayed_or_not() {
		WebElement data = driver.findElement(Today_Merch_grid);
		String Screen_name = data.getText(); 
		System.out.print("Display the Today Merchandising dues grid name:" + Screen_name);	
					
		WebElement data1 = driver.findElement(Today_Yarn_Sub_Due_grid);
		String textdata = data1.getText(); 
		System.out.print("Display the Today Approvals due grid name:" + textdata);	
		
	}

	public void Verify_the_Today_Merchandising_Submissions_Due_grid_data_is_displayed_or_not() throws Throwable {
		  WebElement OrderData = driver.findElement(Today_Merch_grid_data);
		  
		    WebElement Data = driver.findElement(Today_Merch_grid_data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Today_Merch_grid_data).size() > 0) {
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

	public void Verify_the_Today_Merchandising_Approvals_Due_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Today_Merch_Approval_grid_data);
		  
		    WebElement Data = driver.findElement(Today_Merch_Approval_grid_data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Today_Merch_Approval_grid_data).size() > 0) {
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

	public void Click_on_the_Today_Yarn_Dues_Tab() throws Throwable {
		utilities.webDriverWait(driver, Today_Yarn_Dues_tab);
		driver.findElement(Today_Yarn_Dues_tab).click();
		utilities.MinimumWait(driver);	
		
		
	}

	public void Verify_the_Today_Submissions_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Today_Sub_Due_From_yarn_grid);
		  
		    WebElement Data = driver.findElement(Today_Sub_Due_From_yarn_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Today_Sub_Due_From_yarn_grid).size() > 0) {
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

	public void Verify_the_Today_Approvals_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Today_App_Due_From_yarn_grid);
		  
		    WebElement Data = driver.findElement(Today_App_Due_From_yarn_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Today_App_Due_From_yarn_grid).size() > 0) {
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

	public void Click_on_the_Upcoming_expansion() throws Throwable {
		utilities.webDriverWait(driver, Upcoming_expansion);
		driver.findElement(Upcoming_expansion).click();
		utilities.MinimumWait(driver);	
		
	}

	public void Verify_the_Upcoming_Merchandising_Submissions_Due_and_Merchandising_Approvals_Due_grids_are_displayed_or_not() {
		WebElement data = driver.findElement(Upcoming_Merch_grid);
		String Screen_name = data.getText(); 
		System.out.print("Display the Upcoming Merchandising dues grid name:" + Screen_name);	
					
		WebElement data1 = driver.findElement(Upcoming_Yarn_Sub_Due_grid);
		String textdata = data1.getText(); 
		System.out.print("Display the Upcoming Approvals Due grid name:" + textdata);	
		
	}

	public void Verify_the_Upcoming_Merchandising_Submissions_Due_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Upcoming_Merch_grid_data);
		  
		    WebElement Data = driver.findElement(Upcoming_Merch_grid_data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Upcoming_Merch_grid_data).size() > 0) {
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

	public void Verify_the_Upcoming_Merchandising_Approvals_Due_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Upcoming_Merch_Approval_grid_data);
		  
		    WebElement Data = driver.findElement(Upcoming_Merch_Approval_grid_data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Upcoming_Merch_Approval_grid_data).size() > 0) {
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

	public void Click_on_the_Upcoming_Yarn_Dues_Tab() throws Throwable {
		utilities.webDriverWait(driver, Upcoming_Yarn_Dues_tab);
		driver.findElement(Upcoming_Yarn_Dues_tab).click();
		utilities.MinimumWait(driver);	
		
		
	}

	public void Verify_the_Upcoming_Submissions_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Upcoming_Sub_Due_From_yarn_grid);
		  
		    WebElement Data = driver.findElement(Upcoming_Sub_Due_From_yarn_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Upcoming_Sub_Due_From_yarn_grid).size() > 0) {
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

	public void Verify_the_Upcoming_Approvals_Due_From_Yarn_Team_grid_data_is_displayed_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Upcoming_App_Due_From_yarn_grid);
		  
		    WebElement Data = driver.findElement(Upcoming_App_Due_From_yarn_grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Upcoming_App_Due_From_yarn_grid).size() > 0) {
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

	public void Verify_the_Overdue_section_sorting_functionality() throws Throwable {
		utilities.webDriverWait(driver, SortingByColumns1);
		WebElement table = driver.findElement(SortingByColumns1);
		
		List<WebElement> columnheader = table.findElements(By.xpath("p-sorticon"));

		for (WebElement header : columnheader) {

			header.click();
			utilities.MinimumWait(driver);
			header.click();
			utilities.MinimumWait(driver);
		}
	}	
	


}
