package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class SW_YarnSheet_Pen_Pages extends DriverFactory{

	Utilities utilities = new Utilities();

	By YarnSheet_Pending          = By.xpath("//a[text()='Yarn Sheet Pending Report']");
	By Filter_Expansion           = By.xpath("//a[@type='button']");
	By Merchant_field             = By.xpath("//div[text()='Select Merchant']");
	By Merchant_Text_field        = By.xpath("//input[contains(@class,'p-multiselect-filter p-inputtext')]");
	By Merchant_Check_Box         = By.xpath("//div[@class='p-checkbox-box']");
	By Mer_Click_field            = By.xpath("//span[@class='p-multiselect-trigger-icon ng-tns-c92-26 pi pi-chevron-down']");
	By Filter_Status              = By.xpath("//select[@formcontrolname='statusId']");
	By Grid_Data                  = By.xpath("//tbody[@class='p-element p-datatable-tbody']");
	By Export_button              = By.xpath("//button[text()=' Export']");
	By Grid_No_Data_Found         = By.xpath("//td[text()='No Data Found.']");
	
	//Pagination_functionality
    By Pagination_records         = By.xpath("//span[@class='p-element ng-tns-c74-36 p-dropdown-label p-inputtext ng-star-inserted']");
    By Next_Page                  = By.xpath("//button[@class='p-ripple p-element p-paginator-next p-paginator-element p-link']");
	By Before_Page                = By.xpath("//button[@class='p-ripple p-element p-paginator-prev p-paginator-element p-link']");
	By Last_page                  = By.xpath("//button[@class='p-ripple p-element p-paginator-last p-paginator-element p-link ng-star-inserted']");
	By First_Page                 = By.xpath("//button[@class='p-ripple p-element p-paginator-first p-paginator-element p-link ng-star-inserted']");
	
	public void Click_on_the_Yarn_Sheet_Pending_Report() throws Throwable {
		utilities.webDriverWait(driver, YarnSheet_Pending);
		driver.findElement(YarnSheet_Pending).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_the_Filter_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Filter_Expansion);
		driver.findElement(Filter_Expansion).click();
		utilities.MinimumWait(driver);
		
	}


	public void Select_the_in_Filter_Option_Page(String Status) throws Throwable {
		utilities.webDriverWait(driver, Filter_Status);
		driver.findElement(Filter_Status).click();
	    Thread.sleep(1000);    
	    WebElement status = driver.findElement(Filter_Status);
	    Select Sea = new Select(status);

	    boolean StatusExists = false;
	    for (WebElement option : Sea.getOptions()) {
	        if (option.getText().equals(Status)) {
	        	StatusExists = true;
	            break;
	        }
	    }

	    if (StatusExists) {
	    	Sea.selectByVisibleText(Status);
	    } else {
	        System.out.println("Selected Status is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);
		
	}


	public void Select_the_Merchant_in_the_Filter_option_page(String Merchant) throws Throwable {
		driver.findElement(Merchant_field).click();
		Thread.sleep(2000);
		driver.findElement(Merchant_Text_field).sendKeys(Merchant);
		utilities.MediumWait(driver);
		driver.findElement(Merchant_Check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(Mer_Click_field).click();
		utilities.MediumWait(driver);
		
	}


	public void The_Search_related_data_is_displayed_in_the_main_grid() throws Throwable {
		 WebElement OrderData = driver.findElement(Grid_Data);
		  
		    WebElement Data = driver.findElement(Grid_Data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("td"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Grid_Data).size() > 0) {
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


	public void Click_on_the_Export_button() throws Throwable {
		utilities.webDriverWait(driver, Export_button);
		driver.findElement(Export_button).click();
		utilities.MinimumWait(driver);
	}


	public void Verify_the_without_displaying_the_data_in_the_grid_the_Export_button_is_displaying_disabled_state_or_not() throws Throwable {
		utilities.webDriverWait(driver, Grid_No_Data_Found);
		
		utilities.MediumWait(driver);	
		Boolean isPresent = driver.findElements(Grid_No_Data_Found).size()>0;
		if (isPresent) {	
			WebElement buttonElement = driver.findElement(Export_button);
			if (buttonElement.isEnabled()) {
				System.out.println("Button is enabled.");
			

			} else {
				System.out.println("Button is disabled.");
			}
		} else {
			  System.out.println("Display element: " + isPresent);
			    utilities.MediumWait(driver);
			    Robot r = new Robot();
			    r.keyPress(KeyEvent.VK_ENTER);
			    Thread.sleep(2000);	
		}
		
	}
	public void check_whether_it_is_navigating_to_the_after_page_records_when_the_user_clicks_on_Next_page_icon() throws Throwable {
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Next_Page);
		driver.findElement(Next_Page).click();
	
	}
	public void check_whether_it_is_navigating_to_the_before_page_records_when_the_user_clicks_on_before_page_icon() throws Throwable {
		utilities.webDriverWait(driver, Before_Page);
		driver.findElement(Before_Page).click();
		
	}
	
	public void check_whether_it_is_displaying_the_last_page_records_when_the_user_clicks_on_last_page_icon() throws Throwable {
		utilities.webDriverWait(driver, Last_page);
		driver.findElement(Last_page).click();
	}


	public void By_default_five_records_are_displayed() throws Throwable {		
	WebElement Page = driver.findElement(Pagination_records);
    String expectedPage = "5";
	String actualPage = Page.getText().trim();
	if (actualPage.equals(expectedPage)) {
	    System.out.println("The five records are displayed: " + actualPage);
		} else {
		    System.out.println("The five records are not displayed." + actualPage);
		}
		utilities.MediumWait(driver);
			
		}
		
	
	

}
