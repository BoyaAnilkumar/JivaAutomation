package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_Yarn_Sheet_Audit_Page extends DriverFactory{

	Utilities utilities = new Utilities();
    
	By Audit_Module          = By.xpath("(//span[text()='Audit '])[2]");
	By Audit_DataEntry       = By.xpath("(//span[text()='Data Entry'])[10]");
	By Yarn_Sheet_Audit      = By.xpath("//a[text()='Yarn Sheet Audit']");
	By IPO_data              = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[1]");
	By Style_Data            = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[2]");
	By Buyer_name            = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[3]");
	By Season_name           = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[4]");
	By PO_Qty_Data           = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[5]");
	By Last_Edited           = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[6]");
	By Approved_Date         = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[7]");
	By Costing_Budget_Exp    = By.xpath("(//button[@type='button'])[3]");
	By Costing_Budget_data   = By.xpath("(//td[@class='text-right'])[1]");
	By Costing_YarnBud_Data  = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
	By Costing_FabBud_Data   = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[3]");
	By Upcharge_Buyer        = By.xpath("(//td[@class='text-right'])[3]");
	By Final_Cos_Budget      = By.xpath("(//td[@class='text-right'])[5]");
	By Target_Production     = By.xpath("(//td[@class='text-right'])[7]");
	By Production_Exp        = By.xpath("(//button[@type='button'])[4]");
	By Production_bud_data   = By.xpath("(//td[@class='text-right'])[9]");
	By Prod_Exp_Grid         = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[4]");
	By Approve_Button        = By.xpath("//button[text()=' Approve']");
	By Reason_field          = By.xpath("(//textarea[@placeholder='Enter Reason'])[1]");
	By Submit_Button         = By.xpath("(//button[text()='Submit'])[1]");
	By Reject_Button         = By.xpath("//button[text()=' Reject']");

	

	public void Click_on_the_Data_Entry_dropdown_under_the_Audit_Module() throws Throwable {
		utilities.webDriverWait(driver, Audit_DataEntry);
		driver.findElement(Audit_DataEntry).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Yarn_Sheet_Audit_Screen() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Sheet_Audit);
		driver.findElement(Yarn_Sheet_Audit).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Selected_IPO_details_are_displayed_in_the_Information_bar() {
		WebElement Ipo = driver.findElement(IPO_data);
		String IPO_data = Ipo.getText(); 
		System.out.print("Display the Selected IPO:" + IPO_data);	
		
		WebElement Style = driver.findElement(Style_Data);
		String Style_data = Style.getText(); 
		System.out.print("Display the Selected Style:" + Style_data);	
		
		WebElement Buyer = driver.findElement(Buyer_name);
		String Buyer_data = Buyer.getText(); 
		System.out.print("Display the Selected Buyer:" + Buyer_data);	
		
		WebElement Season = driver.findElement(Season_name);
		String Season_data = Season.getText(); 
		System.out.print("Display the Selected Season:" + Season_data);	
		
		WebElement IPO_Qty = driver.findElement(PO_Qty_Data);
		String IPOqty_data = IPO_Qty.getText(); 
		System.out.print("Display the Selected IPO Qty:" + IPOqty_data);	
		
		WebElement Last_edited = driver.findElement(Last_Edited);
		String Last_Edited_data = Last_edited.getText(); 
		System.out.print("Display the Last Edited:" + Last_Edited_data);	
		
		WebElement data = driver.findElement(Approved_Date);
		String Approved_data = data.getText(); 
		System.out.print("Display the Approved Data:" + Approved_data);	
		
	}

	public void Yarn_Budget_details_and_Fabric_budget_details_are_displayed_in_the_Costing_budget_Expansion_or_not() throws Throwable {
		utilities.webDriverWait(driver, Costing_Budget_Exp);
		driver.findElement(Costing_Budget_Exp).click();
		utilities.MinimumWait(driver);
		
		WebElement data = driver.findElement(Costing_Budget_data);
		String coastingData = data.getText();
		System.out.print("Display the Costing budget Data:" + coastingData);	
		
		  WebElement OrderData = driver.findElement(Costing_YarnBud_Data);
		  
		    WebElement Data = driver.findElement(Costing_YarnBud_Data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Costing_YarnBud_Data).size() > 0) {
	        utilities.MediumWait(driver);            
	        String OrderDataText1 = OrderData.getText();
			utilities.MediumWait(driver);	    
			            
	        String[] rows = OrderDataText1.split("\n");
			for (String row : rows) {
		     System.out.println(row);
		        System.out.println();
		        
		    }
		
		}	    
	        
	        WebElement OrderData1 = driver.findElement(Costing_FabBud_Data);
			  
		    WebElement Data1 = driver.findElement(Costing_FabBud_Data);
		    Thread.sleep(1000);
		    List<WebElement> rows11 = Data.findElements(By.tagName("tr"));
		        int Irowcount1 = rows11.size();
	            int Idatarowcount1 = Irowcount1;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount1);
	         
	        if(driver.findElements(Costing_FabBud_Data).size() > 0) {
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

	public void The_Upcharge_to_buyer_data_is_displayed_in_the_grid() {
		WebElement data = driver.findElement(Upcharge_Buyer);
		String upchargeData = data.getText();
		System.out.print("Display the Upcharge Data:" + upchargeData);	
	}

	public void The_Final_Costing_Budget_data_is_displayed_in_the_grid() {
		WebElement data = driver.findElement(Final_Cos_Budget);
		String Final_data = data.getText();
		System.out.print("Display the Final Costing Budget Data:" + Final_data);	
		
	}

	public void The_Target_Production_Budget_data_is_displayed_in_the_grid() {
		WebElement data = driver.findElement(Target_Production);
		String Target_data = data.getText();
		System.out.print("Display the Target Production Data:" + Target_data);
		
	}

	public void Mu_working_details_are_displayed_in_the_Production_budget_grid() throws Throwable {
		
		WebElement data = driver.findElement(Production_bud_data);
		String Pro_data = data.getText();
		System.out.print("Display the Production budget Data:" + Pro_data);
		
		
		 WebElement OrderData = driver.findElement(Prod_Exp_Grid);
		  
		    WebElement Data = driver.findElement(Prod_Exp_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Prod_Exp_Grid).size() > 0) {
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
	public void Click_on_the_Sweater_Audit_module() throws Throwable {
		utilities.webDriverWait(driver, Audit_Module);
		driver.findElement(Audit_Module).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Production_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Production_Exp);
		driver.findElement(Production_Exp).click();
		utilities.MinimumWait(driver);
		
	}
	
}
