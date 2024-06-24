package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class SW_StylePODetails_Pages extends DriverFactory{
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);
	String Pastdate = DateTime.now().plusDays(-1).toString("dd-MM-yyyy");
	String tomorrow = DateTime.now().plusDays(1).toString("dd-MM-yyyy");
	Utilities utilities = new Utilities();
	
	By Style_PO_Details     = By.xpath("//a[text()='Style PO Details']");
	By StylePO_ScreenName   = By.xpath("//h3[text()='Style PO Details']");
	By Add_New_PO_Button    = By.xpath("//a[@class='btn btn-primary btn-sm ng-star-inserted']");
	By PO_number            = By.xpath("//input[@formcontrolname='poNumber']");
	By PO_Details           = By.xpath("//select[@formcontrolname='poDetailId']");
	By PO_Qty               = By.xpath("//input[@placeholder='Enter PO Qty']");
	By Shortage_field       = By.xpath("//input[@formcontrolname='shortageAllowed']");
	By Addl_Shipment_field  = By.xpath("//input[@formcontrolname='additionalShipmentAllowed']");
	By Shipment_Priority    = By.xpath("//input[@formcontrolname='shipmentPriority']");
	By Combination          = By.xpath("//ng-select[@formcontrolname='combination']");
	By Select_Combo         = By.xpath("//span[@class='ng-option-label ng-star-inserted']");
	By Garment_Size_Type    = By.xpath("//ng-select[@formcontrolname='buyerGarmentSizeBreakUps']");
	By Select_Garment       = By.xpath("//div[@role='option']");
	By Ex_Factory           = By.xpath("//input[@formcontrolname='exFactoryDate']");
	By Days_Kept            = By.xpath("//input[@formcontrolname='daysInHand']");
	By Exfactory_production = By.xpath("//input[@placeholder='Enter Ex Factory For Production']");
	By Requested_Exfactory  = By.xpath("//input[@formcontrolname='requestedExFactoryDate']");
	By Handover_Date        = By.xpath("//input[@formcontrolname='handOverDate']");
	By Select_Mode          = By.xpath("//select[@formcontrolname='mode']");
	By Comments_field       = By.xpath("//textarea[@placeholder='Enter Comments']");
	By Size_Breakups_POQty  = By.xpath("//input[@placeholder='Enter Qty']");
	By Total_Pcs            = By.xpath("//input[@placeholder='Enter Total Pcs']");
	By Submit_button        = By.xpath("//button[text()=' Submit']");
	By Combos_Data          = By.xpath("(//div[@class='card-body'])[4]");
	By Garments_Data        = By.xpath("(//div[@class='card-body'])[5]");
	By PO_Summary           = By.xpath("(//tbody[@class='p-element p-datatable-tbody'])[1]");
	By PO_Sizes_Data_Grid   = By.xpath("(//div[@class='card ng-star-inserted']//div)[3]");
	By Delete_Icon          = By.xpath("(//button[@title='Delete'])[1]");
	By Yes_button           = By.xpath("//button[text()='Yes']");
	By Edit_Icon            = By.xpath("(//button[@title='Edit'])[1]");
	By Update_PO            = By.xpath("//h3[text()=' Update PO ']");
	By View_Icon            = By.xpath("(//button[@title='View Comments'])[1]");
	By View_Form_name       = By.xpath("//h5[text()='Comments']");
	By View_Data            = By.xpath("(//div[@class='modal-body'])[2]");
	By View_Close           = By.xpath("//button[text()='Close']");
	By Save_Validation      = By.xpath("//h2[text()='Style PO Details Added Successfully']");
	By Update_Validation    = By.xpath("//h2[text()='Style PO Details Updated Successfully']");
	By Toaster              = By.xpath("//h2[text()='Mandatory Fields Are Required With  Valid Data.']");
	By PO_Qty_Validation    = By.xpath("//h2[text()='Po Qty Total Should not be more than PO Qty']");
	By Size_Breakups_Val    = By.xpath("//h2[text()='Po Size Wise Details Total Should not be more than PO Qty']");
	By GO_TO_Up_Button      = By.xpath("//a[@title='Go to Top']");

	public void Click_on_the_Style_PO_Details() throws Throwable {
		utilities.webDriverWait(driver, Style_PO_Details);
		driver.findElement(Style_PO_Details).click();
		utilities.MinimumWait(driver);
		
		WebElement ScreenName = driver.findElement(StylePO_ScreenName);
		String Name = ScreenName.getText();
		System.out.println(Name);
	}
	public void Click_on_the_Add_New_PO_button_in_the_Style_PO_Details_Screen() throws Throwable {
		utilities.webDriverWait(driver, Add_New_PO_Button);
		driver.findElement(Add_New_PO_Button).click();
		utilities.MinimumWait(driver);				
	}
	public void User_enter_the_data_in_the_field_in_the_PO_details_section(String PO) throws Throwable {
		utilities.webDriverWait(driver, PO_number);
		driver.findElement(PO_number).clear();
		driver.findElement(PO_number).sendKeys(PO);
		utilities.MinimumWait(driver);		
		
	}
	public void Select_the_PO_Details() throws Throwable {
		utilities.webDriverWait(driver, PO_Details);
		driver.findElement(PO_Details).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
	}
	public void Enter_the_in_the_PO_Qty_field(String POQty) throws Throwable {
		utilities.webDriverWait(driver, PO_Qty);
		driver.findElement(PO_Qty).clear();
		driver.findElement(PO_Qty).sendKeys(POQty);
		utilities.MinimumWait(driver);	
		
	}
	public void Enter_the_data_in_the_Allowed_field(String Shortage) throws Throwable {
		utilities.webDriverWait(driver, Shortage_field);
		driver.findElement(Shortage_field).clear();
		driver.findElement(Shortage_field).sendKeys(Shortage);
		utilities.MinimumWait(driver);
		
	}
	public void Enter_the_data_in_the_field(String Addl_Shippment) throws Throwable {
		utilities.webDriverWait(driver, Addl_Shipment_field);
		driver.findElement(Addl_Shipment_field).clear();
		driver.findElement(Addl_Shipment_field).sendKeys(Addl_Shippment);
		utilities.MinimumWait(driver);
		
	}
	public void Enter_the_data_in_the_Shippment_Priority_field(String Priority) throws Throwable {
		utilities.webDriverWait(driver, Shipment_Priority);
		driver.findElement(Shipment_Priority).clear();
		driver.findElement(Shipment_Priority).sendKeys(Priority);
		utilities.MinimumWait(driver);
		
	}
	public void Select_the_Garments_in_the_Garment_Size_Type_Selection_field() {
		try {
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    driver.findElement(Garment_Size_Type).click();
		    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Select_Garment));
		    List<WebElement> Combos = driver.findElements(Select_Garment);
		    for (WebElement Combo : Combos) {             
		        if (Combo.isDisplayed()) {   
		            Combo.click();
		        }
		    }
		} catch (Exception e) {
		    System.out.print("Elements are not displayed");
		}

		
	}
	public void Enter_the_data_Kept_In_Hand_field(String Days) throws Throwable {
		utilities.webDriverWait(driver, Days_Kept);
		driver.findElement(Days_Kept).clear();
		driver.findElement(Days_Kept).sendKeys(Days);
		utilities.MinimumWait(driver);
		
	}
	public void Check_the_Ex_Factory_For_Production_field_data_is_preopulated_or_not() throws Throwable {
		utilities.webDriverWait(driver, Exfactory_production );
		WebElement Date  = driver.findElement(Exfactory_production);
		String Text   = Date.getAttribute("value");
		System.out.println("Display the Ex factory Production Date:" +Text);
		
	}
	public void Select_the_Requested_Ex_field(String Factory) throws Throwable {
		utilities.webDriverWait(driver, Requested_Exfactory);
		driver.findElement(Requested_Exfactory).sendKeys(Factory);
		utilities.MinimumWait(driver);
		
	}
	public void Select_the_Handover_Date_in_handover_details_section() throws Throwable {
		utilities.webDriverWait(driver, Handover_Date );
		driver.findElement(Handover_Date).sendKeys(formattedDate);
		utilities.MediumWait(driver);
		System.out.println("Current date: " + formattedDate);
	}
	public void Select_the_in_Handover_details_section(String Mode) throws Throwable {
		driver.findElement(Select_Mode).click();
	    Thread.sleep(1000);    
	    WebElement season = driver.findElement(Select_Mode);
	    Select mode = new Select(season);

	    boolean modeExists = false;
	    for (WebElement option : mode.getOptions()) {
	        if (option.getText().equals(Mode)) {
	        	modeExists = true;
	            break;
	        }
	    }

	    if (modeExists) {
	    	mode.selectByVisibleText(Mode);
	    } else {
	        System.out.println("Selected Mode is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);

		
	}
	public void Enter_the_data_in_the_Comments_section(String Comments) throws Throwable {
		utilities.webDriverWait(driver, Comments_field);
		driver.findElement(Comments_field).sendKeys(Comments);
		utilities.MinimumWait(driver);
		
	}
  
	public void Enter_the_PO_Size_wise_details() {
		 try {
			  List<WebElement> POQtyElements = driver.findElements(Size_Breakups_POQty);
			  WebElement POQtyValue = driver.findElement(PO_Qty);
	          String value = POQtyValue.getAttribute("value");
	          System.out.println("PO Qty Value " + value);
	          int totalPOQty = Integer.parseInt(value);
	  		  int enabledFieldsCount =0;
	  		  
	          for (WebElement POElement : POQtyElements) {
	  	            // Check if the element is enabled
	  	            if (POElement.isEnabled() && POElement.getAttribute("readonly") == null) {
	  	                    enabledFieldsCount++;
	  	              }
	  	       }
	  		  for (WebElement POElement : POQtyElements) {
	  		        // Check if the element is enabled
	  		        if (POElement.isEnabled()) {
	  		        	String readonlyAttribute = POElement.getAttribute("readonly");
	  		            if (readonlyAttribute != null) {
	  		                String dataText = POElement.getAttribute("value");	  		                		
	  		                System.out.println(" PO Qty field is read-only. Displaying data: " + dataText);
	  		            }
	  		            else {
	  		            	int fieldValue = totalPOQty/ enabledFieldsCount;
	  		            	POElement.clear();
	  		                POElement.sendKeys(String.valueOf(fieldValue));
	  		                POElement.click();
	  		                System.out.println("Data is sended to PO Qty field: " + fieldValue);
	  		              
	  		            }         
	  		         }
	 		    }
			}
			catch(Exception e) {
	              System.out.println("Missy garment Size is not displayed");
			}
		
	}
	public void Check_the_Size_wise_Details_PO_Qty_fields_data_is_preppopulated_or_not() throws Throwable {
	
		   try {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Total_Pcs));   
				  driver.findElement(Total_Pcs).click();
		        List<WebElement> TotalPcs = driver.findElements(Total_Pcs);
		        for (WebElement Total : TotalPcs) {             
		            if (Total.isDisplayed()) {  		            	
		                String dataText = Total.getAttribute("value");
		                System.out.println("Display the Total Pcs Data: " + dataText);
		            }
		        }
				}
		        catch(Exception e) {
		        	System.out.print("fields are not displayed");
		        }
				
    }
	public void Select_the_Combos_in_the_Applicable_Combos_field_in_the_Combos_Section() {
		try {
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    driver.findElement(Combination).click(); // Click to open the dropdown
		    
		    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Select_Combo));
		    List<WebElement> Combos = driver.findElements(Select_Combo);
		    
		    // Simulate holding down CTRL key while clicking to select multiple options
		    Actions actions = new Actions(driver);
		    actions.keyDown(Keys.CONTROL);
		    
		    for (WebElement Combo : Combos) {
		        if (Combo.isDisplayed()) {
		            Combo.click(); // Click on each visible option to select it
		        }
		    }
		    
		    actions.keyUp(Keys.CONTROL).build().perform(); // Release CTRL key
		    
		} catch (Exception e) {
		    System.out.print("Elements are not displayed");
		}

		
	}
	public void The_User_Click_on_the_Submit_button_in_the_Style_PO_Details_Screen() throws Throwable {
		utilities.webDriverWait(driver, Submit_button);
		driver.findElement(Submit_button).click();
		utilities.MinimumWait(driver);
		
	}
	public void Verify_the_Selected_IPO_Combinations_and_Garment_size_types_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Combos_Data);
		WebElement Combosdata = driver.findElement(Combos_Data);
		String Combos_data = Combosdata.getText(); 
		System.out.print("Display the Combinations:" + Combos_data);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Garments_Data);
		WebElement Garment = driver.findElement(Garments_Data);
		String GarmentData = Garment.getText(); 
		System.out.print("Display the Garment Size types:" + GarmentData);
		utilities.MinimumWait(driver);
		
	}
	public void Verify_the_Added_PO_Summary_are_displayed_in_the_PO_Summary_grid() throws Throwable {
		 WebElement OrderData = driver.findElement(PO_Summary);
		  
		    WebElement Data = driver.findElement(PO_Summary);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(PO_Summary).size() > 0) {
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
	public void Verify_the_PO_Size_wise_details_are_displayed_in_the_PO_Size_wise_details_Grid() throws Throwable {
		 WebElement OrderData = driver.findElement(PO_Sizes_Data_Grid);
		  
		    WebElement Data = driver.findElement(PO_Sizes_Data_Grid);
		    Thread.sleep(1000);
		    List<WebElement> rows1 = Data.findElements(By.tagName("tr"));
		        int Irowcount = rows1.size();
	            int Idatarowcount = Irowcount;
	            System.out.println("No. of data Rows in the grid : " + Idatarowcount);
	         
	        if(driver.findElements(PO_Sizes_Data_Grid).size() > 0) {
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
	public void Click_on_the_Delete_Icon_in_Actions_Column() throws Throwable {
		utilities.webDriverWait(driver, Delete_Icon);
		driver.findElement(Delete_Icon).click();
		utilities.MinimumWait(driver);
		driver.findElement(Yes_button).click();
		utilities.MinimumWait(driver);
		
	}	
	public void User_Click_on_the_Edit_Icon_in_the_Actions_Column_and_the_update_form_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Edit_Icon);
		driver.findElement(Edit_Icon).click();
		utilities.MinimumWait(driver);
		WebElement Form = driver.findElement(Update_PO);
		String Updateform = Form.getText(); 
		System.out.print("Display the Update form:" + Updateform);
		utilities.MinimumWait(driver);
	}
	public void Click_on_the_View_Icon_the_Comments_Popup_page_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, View_Icon);
		driver.findElement(View_Icon).click();
		utilities.MinimumWait(driver);
		WebElement Form = driver.findElement(View_Form_name);
		String Viewform = Form.getText(); 
		System.out.print("Display the View form:" + Viewform);
		utilities.MinimumWait(driver);
		
	}
	public void Check_the_Comments_Data_is_displayed_or_not_and_Click_on_the_Close_button() throws Throwable {
		WebElement Form = driver.findElement(View_Data);
		String ViewformData = Form.getText(); 
		System.out.print("Display the View Data:" + ViewformData);
		utilities.webDriverWait(driver, View_Close);
		driver.findElement(View_Close).click();
		utilities.MinimumWait(driver);
	}
	public void Verify_the_on_Submit_the_Validation_msg_is_displaying_or_not() {
		WebElement Val_Msg = driver.findElement(Save_Validation);
		String SVM = Val_Msg.getText();
		String expectedMessage = "Style PO Details Added Successfully";
		if (expectedMessage.equals(SVM)) {
			System.out.println("Validation message is correct." + SVM);
		} else {
			System.out.println("Validation message is incorrect."+ SVM);
		}
		
	}
	public void Verify_On_Submit_in_Update_form_the_update_Validation_msg_is_displaying_or_not() {
		WebElement Val_Msg = driver.findElement(Update_Validation);
		String SVM = Val_Msg.getText();
		String expectedMessage = "Style PO Details Updated Successfully";
		if (expectedMessage.equals(SVM)) {
			System.out.println("Validation message is correct." + SVM);
		} else {
			System.out.println("Validation message is incorrect."+ SVM);
		}
		
		
	}
	public void Without_enter_the_data_and_click_on_the_Submit_button_the_toaster_message_is_displayed() throws Throwable {
		utilities.webDriverWait(driver, Submit_button);
		driver.findElement(Submit_button).click();
		utilities.MinimumWait(driver);
		Boolean isPresent = driver.findElements(Toaster).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Toaster);
		String test = Data.getText(); 
		String expectedData = "Mandatory Fields Are Required With Valid Data.";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}
	public void Enter_the_PO_Size_wise_details_Should_not_be_more_than_the(String POSizeQty) throws Throwable {
		  WebDriverWait wait = new WebDriverWait(driver, 10); 
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Size_Breakups_POQty));
	      
	        List<WebElement> LinkingAvgElements = driver.findElements(Size_Breakups_POQty);
	     
	        for (WebElement LinkingAvgElement : LinkingAvgElements) {
	            if (LinkingAvgElement.isEnabled()) {
	              
	                System.out.println("Element is enabled.");
	                LinkingAvgElement.clear(); 
	                LinkingAvgElement.sendKeys(POSizeQty);
	                utilities.MinimumWait(driver); 
	            }
	        }
		
	}
	public void Verify_the_PO_Qty_field_Validation_msg_is_displaying_or_not() {
		Boolean isPresent = driver.findElements(PO_Qty_Validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(PO_Qty_Validation);
		String test = Data.getText(); 
		String expectedData = "Po Qty Total Should not be more than PO Qty";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}
	public void Verify_the_garment_Size_breakups_Qty_and_PO_Qty_field_Validation_msg_is_displaying_or_not() {
		Boolean isPresent = driver.findElements(Size_Breakups_Val).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Size_Breakups_Val);
		String test = Data.getText(); 
		String expectedData = "Po Size Wise Details Total Should not be more than PO Qty";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
		
	}
	
	
	
	
	
	
}
