package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Yarn_Summary_Report_Page extends DriverFactory{
	
	Utilities utilities = new Utilities();
	By T_and_A_dropdown             = By.xpath("(//span[text()='T&A'])[4]");
     By Yarn_Summary_Report         = By.xpath("//a[text()='Yarn Summary Report']");
     By yarn_Summary_Report_Screen  = By.xpath("//h3[text()='Yarn Summary Report']");
     By Buyer_field                 = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[2]");
     By Textfield                   = By.xpath("//input[@role='textbox']");
     By check_Box                   = By.xpath("//div[@role='checkbox']");
     By Supplier_field              = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[3]");
     By Yarn_Quality_field          = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[4]");
     By Month_field                 = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[5]");
     By Search_By_IPO               = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[6]");
     By Export_button               = By.xpath("//span[text()='Excel Export']");
     By Columns_Dropdown            = By.xpath("//div[@title='Columns']");
     By Select_All_check_box        = By.xpath("(//div[@class='e-checkbox-wrapper e-css']//span)[2]");
     By Ok_button                   = By.xpath("//button[text()='OK']");
     By Grid_Data                   = By.xpath("//table[@id='Grid_content_table']");
	
	public void Click_on_the_Yarn_Summary_Report_under_the_T_and_A_dropdown() throws Throwable {
		utilities.webDriverWait(driver, T_and_A_dropdown);
		driver.findElement(T_and_A_dropdown).click();
		utilities.MediumWait(driver);
		utilities.webDriverWait(driver, Yarn_Summary_Report);
		driver.findElement(Yarn_Summary_Report).click();
		utilities.MediumWait(driver);
		
	}

	public void the_Yarn_Summary_Report_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, yarn_Summary_Report_Screen);
		String Screen_name  = driver.findElement(yarn_Summary_Report_Screen).getText();
		System.out.println("Display the Yarn Summary Report Screen:" +Screen_name);
		
	}

	public void Select_the_Buyer_in_the_field(String Buyer) throws Throwable {
		driver.findElement(Buyer_field).click();
		Thread.sleep(2000);
		driver.findElement(Textfield).sendKeys(Buyer);
		utilities.MediumWait(driver);
		driver.findElement(check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(Buyer_field).click();
		utilities.MediumWait(driver);
		
	}

	public void Select_the_Supplier_in_the_field(String Supplier) throws Throwable {
		driver.findElement(Supplier_field).click();
		Thread.sleep(2000);
		driver.findElement(Textfield).sendKeys(Supplier);
		utilities.MediumWait(driver);
		driver.findElement(check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(Supplier_field).click();
		utilities.MediumWait(driver);
		
	}

	public void User_select_the_in_the_filter_page(String Yarn_Quality) throws Throwable {
		driver.findElement(Yarn_Quality_field).click();
		Thread.sleep(2000);
		driver.findElement(Textfield).sendKeys(Yarn_Quality);
		utilities.MediumWait(driver);
		driver.findElement(check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(Yarn_Quality_field).click();
		utilities.MediumWait(driver);
		
	}

	public void Select_the_Month_in_the_field(String Month) throws Throwable {
		driver.findElement(Month_field).click();
		Thread.sleep(2000);
		driver.findElement(Textfield).sendKeys(Month);
		utilities.MediumWait(driver);
		driver.findElement(check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(Month_field).click();
		utilities.MediumWait(driver);
		
	}

	public void Select_the_in_the_Search_by_IPO_field(String IPO) throws Throwable {
		driver.findElement(Search_By_IPO).click();
		Thread.sleep(2000);
		driver.findElement(Textfield).sendKeys(IPO);
		utilities.MediumWait(driver);
		driver.findElement(check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(Search_By_IPO).click();
		utilities.MediumWait(driver);
		
	}

	public void Click_on_the_Excel_Export_button() throws Throwable {
		utilities.webDriverWait(driver, Export_button);
		driver.findElement(Export_button).click();
		utilities.MediumWait(driver);
		
	}

	public void Click_on_the_Columns_Dropdown() throws Throwable {
		utilities.webDriverWait(driver, Columns_Dropdown);
		driver.findElement(Columns_Dropdown).click();
		utilities.MediumWait(driver);
		
	}

	public void Select_the_Select_All_Option_in_the_column_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Select_All_check_box);
		driver.findElement(Select_All_check_box).click();
		utilities.MediumWait(driver);
		
	}

	public void Click_on_the_Ok_button_in_the_Column_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Ok_button);
		driver.findElement(Ok_button).click();
		utilities.MediumWait(driver);
		
	}

	public void Verify_the_filter_related_data_is_displayed_in_the_grid_or_not() throws Throwable {
		 WebElement OrderData = driver.findElement(Grid_Data);
		  
		    WebElement Data = driver.findElement(Grid_Data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
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
	
	
	

}
