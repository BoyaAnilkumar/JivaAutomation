package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import util.DriverFactory;
import util.Utilities;

public class SW_Merchndising_T_and_A_data_Entry_Page extends DriverFactory {
	Utilities utilities = new Utilities();
	
	
	By Mer_data_entry         = By.xpath("(//span[text()='Data Entry'])[11]");
	By Mer_T_and_A_data_entry = By.xpath("(//a[text()='T&A Data Entry'])[2]");
	By T_and_A_SCreen         = By.xpath("//h3[text()='Merchandising T&A Data Entry']");
	By Month_field            = By.xpath("//select[@formcontrolname='month']");
	By Buying_house           = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[3]");
	By Buyer_Style            = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[2]");
	By Add_button             = By.xpath("//button[text()=' Add']");
	By Date_field             = By.xpath("//input[@class='p-inputtext p-component p-element p-inputmask']");
	By Cancel_button          = By.xpath("(//button[text()=' Cancel'])[1]");
	By Missy_Add_button       = By.xpath("(//button[contains(@class,'btn btn-primary')])[3]");
	By Petite_Add_button      = By.xpath("(//button[contains(@class,'btn btn-primary')])[4]");
	By Tall_Add_button        = By.xpath("(//button[contains(@class,'btn btn-primary')])[5]");
	By Women_Add_button       = By.xpath("(//button[contains(@class,'btn btn-primary')])[6]");
	
	
	
	public void Click_on_the_T_and_A_Data_entry_under_the_Data_Entry_dropdown() throws Throwable {
		
		utilities.webDriverWait(driver, Mer_data_entry);
		driver.findElement(Mer_data_entry).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Mer_T_and_A_data_entry);
		driver.findElement(Mer_T_and_A_data_entry).click();
		utilities.MinimumWait(driver);		
	}

	public void The_Merchandising_T_and_A_Data_Entry_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_SCreen);
		String Screen_name  = driver.findElement(T_and_A_SCreen).getText();
		System.out.println("Display the Merchandising T and A Data Entry Screen:" +Screen_name);				
	}

	public void Select_the_in_the_month_field(String Month) {
		WebElement month= driver.findElement(Month_field);	       
        Select dropdown = new Select(month);	        
        dropdown.selectByVisibleText(Month);		
	}

	public void the_Buying_house_data_should_be_displayed() throws Throwable {
		utilities.webDriverWait(driver, Buying_house);
		WebElement buying_house = driver.findElement(Buying_house);
		String buying_house_data = buying_house.getText(); 
		System.out.print("Display Selected Buyer House name:" + buying_house_data);
		utilities.MinimumWait(driver);		
	}

	public void the_Buyer_Style_should_be_displayed_correctly() throws Throwable {
		utilities.webDriverWait(driver, Buyer_Style);
		WebElement buyer_style = driver.findElement(Buyer_Style);
		String Buyer_Style_data = buyer_style.getText(); 
		System.out.print("Display Selected Buyer Style:" + Buyer_Style_data);
		utilities.MinimumWait(driver);				
	}
	public void Enter_the_data_in_the_Submission_date_fields_and_Approval_Date_fields() throws Throwable {
	     List<WebElement> DateElements = driver.findElements(Date_field);
	        // Iterate over each element
	        for (WebElement DateElement : DateElements) {
	            if (DateElement.isEnabled()) {
	                System.out.println("Element is enabled.");
	                DateElement.clear(); // Clear the input field if needed
	                DateElement.sendKeys("0407");

	                utilities.MinimumWait(driver); // Optional wait
	            }
	        }
		
	}
By text   = By.xpath("//h3[text()='Missy']");
	public void Click_on_the_Missy_Add_button_in_the_T_and_A_data_Entry() throws Throwable {
		//h3[text()='Missy']
		Boolean isPresent = driver.findElements(text).size()>0;
//		Boolean isPresent = driver.findElements(Missy_Add_button).size()>0;
	    if (isPresent) {
            System.out.println("Element is enabled.");
            driver.findElement(Missy_Add_button).click();
            utilities.webDriverWait(driver, Date_field);
            

            List<WebElement> dateElements = driver.findElements(Date_field);	                   
            for (WebElement dateElement : dateElements) {
                if (dateElement.isEnabled()) {
                    dateElement.click();
                    dateElement.sendKeys("0407");
                    utilities.MinimumWait(driver);
                }
            }	                    
            utilities.webDriverWait(driver, Cancel_button);
            
            // Re-locate the cancel button before clicking
            WebElement cancelButton = driver.findElement(Cancel_button);
            cancelButton.click();
            utilities.MinimumWait(driver);
	            }
	        
                
                else {
                	System.out.println("Missy Add button is not displayed");
                }
//            }
//		}
	}

	public void Click_on_the_Petite_Add_button_in_the_T_and_A_data_Entry() throws Throwable {
		
		    Boolean isPresent = driver.findElements(Petite_Add_button).size()>0;
		    if (isPresent) {
		        System.out.println("Element is enabled.");
		       driver.findElement(Petite_Add_button).click();
		        utilities.webDriverWait(driver, Date_field);

	            List<WebElement> dateElements = driver.findElements(Date_field);	                   
	            for (WebElement dateElement : dateElements) {
	                if (dateElement.isEnabled()) {
	                    dateElement.click();
	                    dateElement.sendKeys("0407");
	                    utilities.MinimumWait(driver);
	                }
	            }	                    
	            utilities.webDriverWait(driver, Cancel_button);
	            
	            // Re-locate the cancel button before clicking
	            WebElement cancelButton = driver.findElement(Cancel_button);
	            cancelButton.click();
	            utilities.MinimumWait(driver);
		            }
		        
		     else {
		        System.out.println("Petite Add button is not displayed");
		     }
		
	}

	public void Click_on_the_Tall_Add_button_in_the_T_and_A_data_Entry() throws Throwable {
		Boolean isPresent = driver.findElements(Tall_Add_button).size()>0;
	    if (isPresent) {	
            System.out.println("Element is enabled.");
            driver.findElement(Tall_Add_button).click();
            utilities.webDriverWait(driver, Date_field);
            

            List<WebElement> dateElements = driver.findElements(Date_field);	                   
            for (WebElement dateElement : dateElements) {
                if (dateElement.isEnabled()) {
                    dateElement.click();
                    dateElement.sendKeys("0407");
                    utilities.MinimumWait(driver);
                }
            }	                    
            utilities.webDriverWait(driver, Cancel_button);
            
            // Re-locate the cancel button before clicking
            WebElement cancelButton = driver.findElement(Cancel_button);
            cancelButton.click();
            utilities.MinimumWait(driver);
	            }
	        
                else {
                	
                	System.out.println("Tall Add button is not displayed");
                	utilities.MinimumWait(driver);
                }
            
		
	
		
	}

	public void Click_on_the_Women_Add_button_in_the_T_and_A_data_Entry() throws Throwable {
		Boolean isPresent = driver.findElements(Women_Add_button).size()>0;
	    if (isPresent) {	
            System.out.println("Element is enabled.");
           driver.findElement(Women_Add_button).click();
            utilities.webDriverWait(driver, Date_field);
            

            List<WebElement> dateElements = driver.findElements(Date_field);	                   
            for (WebElement dateElement : dateElements) {
                if (dateElement.isEnabled()) {
                    dateElement.click();
                    dateElement.sendKeys("0407");
                    utilities.MinimumWait(driver);
                }
            }	                    
            utilities.webDriverWait(driver, Cancel_button);
            
            // Re-locate the cancel button before clicking
            WebElement cancelButton = driver.findElement(Cancel_button);
            cancelButton.click();
            utilities.MinimumWait(driver);
	            }
	        
                else {
                	
                	System.out.println("Women Add button is not displayed");
                	utilities.MinimumWait(driver);
                }
            
		
	}
		
	

}
