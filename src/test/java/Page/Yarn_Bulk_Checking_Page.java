package Page;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Yarn_Bulk_Checking_Page extends DriverFactory {
	Utilities utilities = new Utilities();
	
	By Bulk_Checking_Data_Entry    = By.xpath("(//span[text()='Data Entry'] )[13]");
	By Bulk_Checking               = By.xpath("//a[text()=' Bulk Checking ']");
	By Bulk_Checking_Screen        = By.xpath("//h3[text()='Bulk Checking ']");
	By from_date                   = By.xpath("//input[@formcontrolname='fromDate']");
	By To_date_field               = By.xpath("//input[@formcontrolname='toDate']");
	By Textfield                   = By.xpath("//input[@role='textbox']");
	By check_Box                   = By.xpath("//div[@role='checkbox']");
    By Supplier_field              = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[2]");
    By Search_By_IPO               = By.xpath("//input[@formcontrolname='searchText']");
    By Add_Bulk_Checking_Icon      = By.xpath("//button[@title='Add Bulk Checking Data']");
    By Add_form_name               = By.xpath("//h3[text()='Add Bulk Checking Data']");
    By Yarn_Description            = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[1]");
    By PO_Details                  = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[2]");
    By Total_Approved_Qty          = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[3]");
    By Quantity_Received           = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[4]");
    By Bulk_Checking_Section       = By.xpath("(//h5[text()='Bulk Checking'])[1]");
    By Date_field                  = By.xpath("//input[@formcontrolname='date']");
    By Qty_Approved                = By.xpath("//input[@formcontrolname='approvedQTY']");
    By Remarks_field               = By.xpath("(//textarea[@formcontrolname='remarks'])[1]");
    By CanNet_section              = By.xpath("(//h5[text()='Can Net'])[1]");
    By IPO_name                    = By.xpath("(//p[@class='mb-0 text-primary font-weight-bold'])[5]");
    By Qty_Value                   = By.xpath("");
    By Approved_Qty_GSM            = By.xpath("//input[@formcontrolname='approvedQTYWithCorrWidth']");
    By Cannet_Remarks              = By.xpath("(//textarea[@formcontrolname='remarks'])[2]");
    By Current_Garment_Avg         = By.xpath("//input[@class='form-control']");
    By W_Avg                       = By.xpath("//input[@formcontrolname='weightedAverage']");
    By Final_CanNet_Value          = By.xpath("//div[@class='col']");
    By Save_button                 = By.xpath("(//button[text()=' Save'])[1]");
    By Expansion_Icon              = By.xpath("//i[@class='pi c-pointer pi-chevron-right']");
    By Expan_Header_Section        = By.xpath("(//thead[@class='p-datatable-thead'])[2]");
	By Expansion_Grid_Data         = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[2]");
    		
 
	public void Click_on_the_Yarn_Bulk_Checking_under_the_Data_Entry_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Bulk_Checking_Data_Entry);
		driver.findElement(Bulk_Checking_Data_Entry).click();
		utilities.MediumWait(driver);
		driver.findElement(Bulk_Checking).click();
		utilities.MediumWait(driver);				
	}

	public void The_Yarn_Bulk_Checking_Screen_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Bulk_Checking_Screen);
		String Screen_name  = driver.findElement(Bulk_Checking_Screen).getText();
		System.out.println("Display the Bulk Checking Screen:" +Screen_name);		
	}

	public void Enter_the_From_Date_in_the_field(String From_Date) throws Throwable {
		utilities.webDriverWait(driver, from_date);
		driver.findElement(from_date).sendKeys(From_Date);
		utilities.MediumWait(driver);		
	}

	public void Enter_the_To_Date_in_the_field(String To_Date) throws Throwable {
		utilities.webDriverWait(driver, To_date_field);
		driver.findElement(To_date_field).sendKeys(To_Date);
		utilities.MediumWait(driver);		
	}

	public void Select_the_supplier_name_in_the_field(String Supplier) throws Throwable {
		driver.findElement(Supplier_field).click();
		Thread.sleep(2000);
		driver.findElement(Textfield).sendKeys(Supplier);
		utilities.MediumWait(driver);
		driver.findElement(check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(Supplier_field).click();
		utilities.MediumWait(driver);		
	}

	public void Select_the_in_the_Search_by_IPO_or_PO_field(String IPO) throws Throwable {
		driver.findElement(Search_By_IPO).sendKeys(IPO);
		utilities.MediumWait(driver);				
	}

	public void Click_on_the_Add_bulk_Checking_data_Icon_in_the_Actions_Column() throws Throwable {
		utilities.webDriverWait(driver, Add_Bulk_Checking_Icon);
		driver.findElement(Add_Bulk_Checking_Icon).click();
		utilities.MediumWait(driver);		
	}

	public void Verify_the_Add_Bulk_Checking_Data_page_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Add_form_name);
		String Page_name  = driver.findElement(Add_form_name).getText();
		System.out.println("Display the Add Bulk Checking Page:" +Page_name);		
	}

	public void the_Yarn_Description_data_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Description);
		String Page_name  = driver.findElement(Yarn_Description).getText();
		System.out.println("Display the Yarn Description details:" +Page_name);		
	}

	public void The_PO_Details_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, PO_Details);
		String Page_name  = driver.findElement(PO_Details).getText();
		System.out.println("Display the PO details:" +Page_name);		
	}

	public void the_Total_Approved_Qty_value_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Total_Approved_Qty);
		String Page_name  = driver.findElement(Total_Approved_Qty).getText();
		System.out.println("Display the Total Approved Qty value:" +Page_name);		
	}

	public void the_Quantity_Received_value_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Quantity_Received);
		String Page_name  = driver.findElement(Quantity_Received).getText();
		System.out.println("Display the Quantity Received:" +Page_name);				
	}

	public void the_Bulk_Checking_section_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Bulk_Checking_Section);
		String Page_name  = driver.findElement(Bulk_Checking_Section).getText();
		System.out.println("Display the Bulk Checking Section:" +Page_name);				
	}

	public void Verify_the_by_default_current_date_is_displayed_in_the_date_field_or_not() {
		WebElement dateField  = driver.findElement(Date_field);
		String dateFieldValue = dateField.getAttribute("value").trim();
        System.out.println("Date field value: " + dateFieldValue); // Debugging line
        LocalDate currentDate = LocalDate.now();
        String currentDateString = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Current date string: " + currentDateString); // Debugging line
        if (dateFieldValue.equals(currentDateString)) {
            System.out.println("By default Current Date is displayed in the Date field.");
        } else {
            System.out.println("By default Current Date is not displayed in the Date field.");
        }
		
	}

	public void Enter_the_data_in_the_Qty_Approved_field() throws Throwable {
		WebElement QtyElement = driver.findElement(Qty_Approved);
		String Qty = QtyElement.getAttribute("value");
		if (Qty.length() > 10) {		    
		    System.out.println("Error: The length of the Qty Approved exceeds the maximum length of 10 characters.");
		} else {		    
		    System.out.println("The length of Qty Approved is within the allowed limit.");
		}
		utilities.webDriverWait(driver, Qty_Approved);
		driver.findElement(Qty_Approved).sendKeys("4");
		utilities.MediumWait(driver);				
	}

	public void enter_the_data_in_the_Remarks_field() throws Throwable {
		WebElement QtyElement = driver.findElement(Remarks_field);
		String Qty = QtyElement.getAttribute("value");
		if (Qty.length() > 500) {		   
		    System.out.println("Error: The length of the Remarks field exceeds the maximum length of 500 characters.");
		} else {		   
		    System.out.println("The length of Remarks field is within the allowed limit.");
		}
		utilities.webDriverWait(driver, Remarks_field);
		driver.findElement(Remarks_field).sendKeys("4");
		utilities.MediumWait(driver);		
	}

	public void the_Can_Net_Section_is_displayed_and_Enter_the_Can_Net_data() throws Throwable {
		utilities.webDriverWait(driver, CanNet_section);
		Boolean isPresent = driver.findElements(CanNet_section).size()>0;
		if (isPresent) {
		String isPresent1  = driver.findElement(CanNet_section).getText();
		System.out.println("Display the Can Net Section:" +isPresent1);
		 
		String Text  = driver.findElement(IPO_name).getText();
		System.out.println("Display the IPO:" +Text);
			
		WebElement QtyElement = driver.findElement(Approved_Qty_GSM);
		String Qty = QtyElement.getAttribute("value");
		if (Qty.length() > 10) {		    
		    System.out.println("Error: The length of the Approved Qty GSM exceeds the maximum length of 10 characters.");
		} else {		   
		    System.out.println("The length of Approved Qty GSM is within the allowed limit.");
		}
		utilities.webDriverWait(driver, Approved_Qty_GSM);
		driver.findElement(Approved_Qty_GSM).sendKeys("4");
		utilities.MediumWait(driver);
		
		WebElement QtyElement1 = driver.findElement(Cannet_Remarks);
		String Qty1 = QtyElement1.getAttribute("value");
		if (Qty1.length() > 500) {		   
		    System.out.println("Error: The length of the Remarks field exceeds the maximum length of 500 characters.");
		} else {		  
		    System.out.println("The length of Remarks field is within the allowed limit.");
		}
		utilities.webDriverWait(driver, Cannet_Remarks);
		driver.findElement(Cannet_Remarks).sendKeys("Can Net Remarks");
		utilities.MediumWait(driver);		
		
		WebElement Garment = driver.findElement(Current_Garment_Avg);
		String readonlyAttribute = Garment.getAttribute("readonly");
          if (readonlyAttribute != null) {
              String dataText = Garment.getAttribute("value");	  		                		
              System.out.println("Current Garment Avg As Per Yarn Sheet field is read-only. Displaying data: " + dataText);
              
              WebElement weight = driver.findElement(W_Avg);
      		String readonlyAttribute1 = weight.getAttribute("readonly");
                if (readonlyAttribute1 != null) {
                    String dataText1 = weight.getAttribute("value");	  		                		
                    System.out.println("Current Garment Avg As Per Yarn Sheet field is read-only. Displaying data: " + dataText1);
                    
                    String value  = driver.findElement(Final_CanNet_Value).getText();
            		System.out.println("Display the Final can Net:" +value);  
            		
		    }
         } 
    }
	
		else {
			System.out.println("Can Net section is not displayed");
		}
}

	public void Click_on_the_Save_Button_in_the_Add_Bulk_Checking_Data_page() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MediumWait(driver);
		
	}

	public void Click_on_the_Expansion_icon_the_bulk_checking_expansion_grid_data_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Expansion_Icon);
		
		  List<WebElement> Exp_elements = driver.findElements(Expansion_Icon);
	        // Iterate over each element
	      for (WebElement Exp_element : Exp_elements) {
	      if (Exp_element.isEnabled()) {
		driver.findElement(Expansion_Icon).click();
		utilities.MediumWait(driver);
	
		WebElement grid = driver.findElement(Expan_Header_Section);

		List<WebElement> tableHeaders = grid.findElements(By.tagName("th"));
		for (int i = 0; i < tableHeaders.size(); i++) {
		    String columnName = tableHeaders.get(i).getText(); // Get the text of the header column		 
		    if (columnName == null) {
		        columnName = "null";
		    } else {
		        columnName = columnName.trim();
		    }

		    System.out.println("Displayed Expansion grid header section column name: " + columnName);

	        }	       
		
		 WebElement OrderData = driver.findElement(Expansion_Grid_Data);
		  
		    WebElement Data = driver.findElement(Expansion_Grid_Data);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(Expansion_Grid_Data).size() > 0) {
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
}
