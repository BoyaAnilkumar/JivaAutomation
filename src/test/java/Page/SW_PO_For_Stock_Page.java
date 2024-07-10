package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_PO_For_Stock_Page extends DriverFactory{

	Utilities utilities = new Utilities();
	
	By Po_For_Stock        = By.xpath("//a[text()=' PO for Stock ']");
	By PO_For_Stock_Screen = By.xpath("//h3[text()='PO for Stock']");
	By Supplier_fil_field  = By.xpath("//div[text()='Select Supplier']");
	By fil_Click           = By.xpath("//div[@class='card-header']");
	By Text_field          = By.xpath("//input[@role='textbox']");
	By Check_Box           = By.xpath("//div[@role='checkbox']");
	By Buyer_field         = By.xpath("//div[text()='Select Buyer']");
	By Yarn_field          = By.xpath("//div[text()='Select Yarm']");
	By Search_by_style     = By.xpath("//input[@placeholder='Enter style']");
	By Grid_Data           = By.xpath("//tbody[@class='p-element p-datatable-tbody']");
	By Revised_Icon        = By.xpath("(//a[@title='Revise PO']//i)[1]");
	By Revised_PO_for_stock  = By.xpath("(//h3[text()='Revised PO For Stock Yarn'])[1]");
	By Type_Of_Order         = By.xpath("//select[@formcontrolname='typeofPo']");
	By PO_Date               = By.xpath("//input[@formcontrolname='poDate']");
	By Po_number             = By.xpath("//input[@formcontrolname='poNumber']");
	By Deliver_To_field      = By.xpath("//input[@placeholder='Search By Deliver To']");
	By Deliver_Address       = By.xpath("//input[@formcontrolname='deliverAddress']");
	By Deliver_GSTIN         = By.xpath("//input[@formcontrolname='deliverGstNumber']");
	By Supplier_field        = By.xpath("//input[@placeholder='Search By Supplier']");
	By Supplier_Address      = By.xpath("//input[@formcontrolname='supplierAddress']");
	By Supplier_GSTIN        = By.xpath("//input[@formcontrolname='gstNumber']");
	By Payment_Terms         = By.xpath("//input[@formcontrolname='paymentTerms']");
	By Delivery_Terms        = By.xpath("//select[@formcontrolname='deliveryTypeId']");
	By Lead_Time             = By.xpath("//input[@formcontrolname='leadtime']");
	By Yarn_Process          = By.xpath("//select[@formcontrolname='processTypeId']");
	By Yarn_color            = By.xpath("//ng-select[@formcontrolname='poColorId']");
	By Yarn_name             = By.xpath("(//ng-select[@bindvalue='yarnId']//div)[1]");
	By Grid_Qty              = By.xpath("//input[@formcontrolname='qtyrequired']");
	By Residual_Shrinkage    = By.xpath("//input[@formcontrolname='residualShrinkage']");
	By Original_Qty_Req      = By.xpath("//input[@formcontrolname='actualtotalqtyRequired']");
	By Revised_Qty_Req       = By.xpath("//input[@formcontrolname='totalqtyRequired']");
	By REvised_Val_Text      = By.xpath("//h2[text()='Revised PO For Stock Saved Successfully']");
	By Cancel_Icon           = By.xpath("//a[@class='btn btn-sm btn-danger ml-1 ng-star-inserted']");
	By Yes_Icon              = By.xpath("//button[text()='Yes']");
	By Cancel_Validation     = By.xpath("//h2[text()='PO For Stock Status Updated SuccessFully']");
	By Type_of_Order1        = By.xpath("//select[@formcontrolname='poTypeId']");
	By Yarn_color1           = By.xpath("(//div[@class='ng-select-container ng-has-value'])[3]");
	By Revised_Qty_field     = By.xpath("//input[@formcontrolname='qtyrequired']");

	public void Click_on_the_PO_For_Stock_Screen() throws Throwable {
		utilities.webDriverWait(driver, Po_For_Stock);
		driver.findElement(Po_For_Stock).click();
		utilities.MinimumWait(driver);	
		
	}

	public void Click_on_the_Create_PO_For_Stock_Screen() {
		WebElement data = driver.findElement(PO_For_Stock_Screen);
		String Screen_name = data.getText(); 
		System.out.print("Display the PO For Stock Screen:" + Screen_name);								
	}

	public void Select_the_in_Filters_page(String Supplier) throws Throwable {
		driver.findElement(Supplier_fil_field).click();
		Thread.sleep(2000);
		driver.findElement(Text_field).sendKeys(Supplier);
		utilities.MediumWait(driver);
		driver.findElement(Check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(fil_Click).click();
		utilities.MediumWait(driver);
		
	}

	public void Select_the_Buyer_in_the_Filters_page(String Buyer) throws Throwable {
		driver.findElement(Buyer_field).click();
		Thread.sleep(2000);
		driver.findElement(Text_field).sendKeys(Buyer);
		utilities.MediumWait(driver);
		driver.findElement(Check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(fil_Click).click();
		utilities.MediumWait(driver);
		
	}

	public void Select_the_yarn_quality_in_filters_page(String Yarn_Quality) throws Throwable {
		driver.findElement(Yarn_field).click();
		Thread.sleep(2000);
		driver.findElement(Text_field).sendKeys(Yarn_Quality);
		utilities.MediumWait(driver);
		driver.findElement(Check_Box).click();
		utilities.MediumWait(driver);
		driver.findElement(fil_Click).click();
		utilities.MediumWait(driver);
		
	}

	public void Enter_the_in_Search_By_Style(String Style_name) throws Throwable {
		driver.findElement(Search_by_style).click();
		Thread.sleep(2000);
		driver.findElement(Search_by_style).sendKeys(Style_name);
		utilities.MediumWait(driver);
		
	}

	public void the_Selected_Style_records_are_displayed_in_the_grid_or_not() throws Throwable {
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

	public void The_Revised_PO_For_Stock_Screen_is_displayed_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, Revised_Icon);
		driver.findElement(Revised_Icon).click();
		utilities.MinimumWait(driver);	
		
		WebElement data = driver.findElement(Revised_PO_for_stock);
		String Screen_name = data.getText(); 
		System.out.print("Display the Revised PO For Stock Screen:" + Screen_name);		
		
	}

	public void The_PO_Details_are_prepopulated_or_not() {
		WebElement Order = driver.findElement(Type_of_Order1);
		String OrderData = Order.getText();
		System.out.print("Display the Type of Order Data:" + OrderData);
		
		
		WebElement data = driver.findElement(PO_Date);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the PO Date Data:" + upchargeData);
		
		
		WebElement num = driver.findElement(Po_number);
		String POnumber = num.getAttribute("value");
		System.out.print("Display the PO number Data:" + POnumber);	
		
	}

	public void Deliver_Details_are_prepopulated_or_not() {
		WebElement Order = driver.findElement(Deliver_To_field);
		String OrderData = Order.getText();
		System.out.print("Display the Type of Order Data:" + OrderData);
		
		WebElement data = driver.findElement(Deliver_Address);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the Deliver_Address Data:" + upchargeData);
		
		WebElement test = driver.findElement(Deliver_GSTIN);
		String Testdata = test.getAttribute("value");
		System.out.print("Display the Deliver_GSTIN Data:" + Testdata);
		
	}

	public void Supplier_details_are_prepopulated_or_not() {
		
		WebElement data = driver.findElement(Supplier_Address);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the Supplier_Address Data:" + upchargeData);
		

		WebElement test = driver.findElement(Supplier_GSTIN);
		String testdata = test.getAttribute("value");
		System.out.print("Display the Supplier_GSTIN Data:" + testdata);
		
		
	}

	public void The_Yarn_details_are_prepopulated_or_not() {
		WebElement Order = driver.findElement(Yarn_Process);
		String OrderData = Order.getText();
		System.out.print("Display the Yarn Process:" + OrderData);
		
		WebElement TeXt = driver.findElement(Yarn_name);
		String yarnname = TeXt.getText();
		System.out.print("Display the Yarn name:" + yarnname);
		
		WebElement test = driver.findElement(Yarn_color1);
		String testdata = test.getText();
		System.out.print("Display the Color name:" + testdata);
		
	}

	public void The_Quantity_details_are_prepopulated_or_not() {
		
		WebElement data = driver.findElement(Original_Qty_Req);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the Original Quantity Required Data:" + upchargeData);
		
		WebElement test = driver.findElement(Revised_Qty_Req);
		String testdata = test.getAttribute("value");
		System.out.print("Display the Revised Qty Required Data:" + testdata);
		
		
		WebElement Residual = driver.findElement(Residual_Shrinkage);
		String ResidualData = Residual.getAttribute("value");
		System.out.print("Display the Residual_Shrinkage Data:" + ResidualData);
		
	}

	public void Stock_details_are_prepopulated_or_not() {
		WebElement data = driver.findElement(Grid_Qty);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the Grid Qty Data:" + upchargeData);	
		
	}

	public void Edit_the_Deliver_details() throws Throwable {
		
		utilities.webDriverWait(driver, Deliver_To_field);
		driver.findElement(Deliver_To_field).clear();
		driver.findElement(Deliver_To_field).sendKeys("jiva");
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
	}


	public void The_Save_Revised_PO_validation_message_is_displayed_or_not() {
		Boolean isPresent = driver.findElements(REvised_Val_Text).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(REvised_Val_Text);
		String test = Data.getText(); 
		String expectedData = "Revised PO For Stock Saved Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}

	public void Click_on_the_Cancel_Po_Icon() throws Throwable {
		utilities.webDriverWait(driver, Cancel_Icon);
		driver.findElement(Cancel_Icon).click();
		utilities.MinimumWait(driver);	
		utilities.webDriverWait(driver, Yes_Icon);
		driver.findElement(Yes_Icon).click();
	}

	public void The_Save_Cancel_PO_validation_message_is_displayed_or_not() {
		Boolean isPresent = driver.findElements(Cancel_Validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Cancel_Validation);
		String test = Data.getText(); 
		String expectedData = "PO For Stock Status Updated SuccessFully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	 }
		
	}

	public void Enter_the_data_in_the_Revised_Quantity_field() throws Throwable {
		utilities.webDriverWait(driver, Revised_Qty_field);
		driver.findElement(Revised_Qty_field).clear();
		driver.findElement(Revised_Qty_field).sendKeys("70");
		utilities.MinimumWait(driver);	
		
	}		
}
