package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class Fabricsheetaudit_Pages extends DriverFactory{
	
	

	Utilities utilities = new Utilities();
	
	By Audit = By.xpath("(//span[text()='Audit '])[1]");
	By Fabirc_Sheet_Audit = By.xpath("//a[text()='Fabric Sheet Audit']");
	By Select_IPO = By.xpath("//a[text()='IPO00 / TestStyle']");
	By Filter_Slash = By.xpath("//button[@class='btn btn-outline-secondary btn-sm mr-2 mb-2 float-right ng-star-inserted']");
	By Status = By.xpath("//select[@formcontrolname='staticStatusId']");
	By Select_StatusApproved = By.xpath("//option[text()=' Approved']");
	By Select_StatusRejected = By.xpath("//option[text()=' Rejected']");
	By Select_StatusPandingApproval = By.xpath("//option[text()=' Pending Approval']");
	By Search_IPO = By.xpath("//input[@placeholder='Enter IPO #']");
	By Last_EditedDate = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[6]");	
	By Approved_Date = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[7]"); 
	By Costing_Expansion = By.xpath("(//button[@class='p-element p-button-text p-button-rounded p-button-plain p-button p-component p-button-icon-only'])[1]");
	By Cos_Exp_Grid = By.xpath("(//thead[@class='p-datatable-thead'])[2]");
	By Prod_Exp = By.xpath("(//button[@class='p-element p-button-text p-button-rounded p-button-plain p-button p-component p-button-icon-only'])[1]");
	By Pro_Exp_Grid = By.xpath("(//thead[@class='p-datatable-thead'])[3]");
	By Reject = By.xpath("//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2 ng-star-inserted']");
	By Approve = By.xpath("//button[@class='btn btn-md btn-primary btn-active-light-primary ng-star-inserted']");
	By Reason = By.xpath("(//textarea[@placeholder='Enter Reason'])[1]");
	By Cancel = By.xpath("(//button[text()='Cancel'])[1]");
	By Submit = By.xpath("(//button[text()='Submit'])[1]");
	
	
	By Style_Ex = By.xpath("//a[@id='sidebarCollapse']");

	public void Click_on_the_Fabric_Sheet_Audit_under_the_Audit_module() throws Throwable {
		utilities.webDriverWait(driver, Audit );
		 driver.findElement(Audit).click();
		 utilities.MediumWait(driver);
		 driver.findElement(Fabirc_Sheet_Audit).click();	
	}
	public void Select_the_IPO_in_IPO_list() throws Throwable {
		

		 utilities.webDriverWait(driver, Select_IPO); 
		    
		    try {
		        WebElement openbutton = driver.findElement(Select_IPO); 

		        if (openbutton.isDisplayed()) {
		            openbutton.click(); 
		        }
		    } catch (NoSuchElementException e) {
		        
		        driver.findElement(Filter_Slash).click(); 
		    }
		}

	
	public void Search_The_IPO() throws Throwable {
		utilities.webDriverWait(driver, Search_IPO);
		driver.findElement(Search_IPO).sendKeys("IPO -Style-001");
		Thread.sleep(5000);
		WebElement IPOname = driver.findElement(Search_IPO);
		String ipon = IPOname.getAttribute("value");
		System.out.println("Display the entered IPO Name " + ipon);
	}
	public void Select_the_Status_in_the_Status_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Status );
		 driver.findElement(Status).click();
		 utilities.webDriverWait(driver, Select_StatusApproved );
		 driver.findElement(Select_StatusApproved).click();
		 
//		 utilities.webDriverWait(driver, Select_StatusRejected );
//		 driver.findElement(Select_StatusRejected).click();
//		 
//		 utilities.webDriverWait(driver, Select_StatusPandingApproval );
//		 driver.findElement(Select_StatusPandingApproval).click();
	}
	public void Verify_the_Last_Edited_Date_is_displaying_or_not() {
		WebElement Data = driver.findElement(Last_EditedDate);
		String Buyer = Data.getText();
		String expectedData = "Spin";
		if (expectedData.equals(Buyer)) {
			System.out.println("Display Last Edited date is correct." + Buyer);
		} else {
			System.out.println("Display Last Edited Date is incorrect."+ Buyer);
		}	
		
	}
	public void Verify_the_Approved_Date_is_displaying_or_not() throws Throwable {
		WebElement Data = driver.findElement(Approved_Date);
		String Buyer = Data.getText();
		String expectedData = "4 Dec, 23";
		if (expectedData.equals(Buyer)) {
			System.out.println("Display Approved date is correct." + Buyer);
		} else {
			System.out.println("Display approved date is incorrect."+ Buyer);
		}	
		utilities.MediumWait(driver);
		
	}
	public void Click_on_the_Costing_budget_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Costing_Expansion );
		 driver.findElement(Costing_Expansion).click();
		
	}
	public void Verify_the_Costing_budget_expansion_grid_header_section_is_diplsyiang_or_not() {
		WebElement Data = driver.findElement(Cos_Exp_Grid);
		String Gridname = Data.getText();
		String expectedData = "Description Qty Garment Avg Wastage% Rate Conversion Rate Cost In INR";
		if (expectedData.equals(Gridname)) {
			System.out.println("Display grid name is correct." + Gridname);
		} else {
			System.out.println("Display grid name is incorrect."+ Gridname);
		}		
		
	}
	public void Click_on_the_Production_budget_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Prod_Exp );
		 driver.findElement(Prod_Exp).click();
	}
	public void Verify_the_Production_budget_expansion_grid_header_section_is_diplsyiang_or_not() {
		WebElement Data = driver.findElement(Pro_Exp_Grid);
		String Gridname = Data.getText();
		String expectedData = "Fabric Details Qty Garment Avg Wastage% Rate Conversion Rate Cost In INR";
		if (expectedData.equals(Gridname)) {
			System.out.println("Display grid name is correct." + Gridname);
		} else {
			System.out.println("Display grid name is incorrect."+ Gridname);
		}		
	
}
	public void Click_on_the_Reject_button() throws Throwable {
		try {
	        WebElement button = driver.findElement(Reject); 

	        if (button.isDisplayed()) {
	        	button.click();
	        	utilities.MediumWait(driver);
	        	driver.findElement(Reason).sendKeys("Reject");
	        	driver.findElement(Submit).click();
	        }
	    } catch (NoSuchElementException e) {
	        
	        driver.findElement(Style_Ex).click(); 
	    }
	}
	public void Enter_the_data_in_Reason_field() throws Throwable {
		utilities.webDriverWait(driver, Reason);
		driver.findElement(Reason).sendKeys("Reject");
		
	}
	
	public void Click_on_the_Approve_button() throws Throwable {
    
	    try {
	        WebElement button = driver.findElement(Approve); 

	        if (button.isDisplayed()) {
	        	button.click();
	        	utilities.MediumWait(driver);
	        	driver.findElement(Submit).click();
	        }
	    } catch (NoSuchElementException e) {
	        
	        driver.findElement(Style_Ex).click(); 
	    }
}
	
	
	
}
