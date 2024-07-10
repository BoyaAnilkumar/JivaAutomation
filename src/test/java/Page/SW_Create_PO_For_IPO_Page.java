package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class SW_Create_PO_For_IPO_Page extends DriverFactory{
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);
	String Pastdate = DateTime.now().plusDays(-1).toString("dd-MM-yyyy");
	String tomorrow = DateTime.now().plusDays(1).toString("dd-MM-yyyy");


	Utilities utilities = new Utilities();
	
	By Yarn_Data_Entry       = By.xpath("(//span[text()='Data Entry'])[12]");
	By SW_Generate_Po        = By.xpath("(//span[text()='Generate PO'])[3]");
	By SW_create_Po_screen   = By.xpath("(//a[text()=' Create PO for IPO# '])[2]");
	By Create_PO_Screen_name = By.xpath("//h3[text()='Create PO for IPO#']");
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
	By Qty_Required          = By.xpath("//input[@formcontrolname='totalqtyRequired']");
	By Qty_Availble_Stock    = By.xpath("//input[@formcontrolname='totalqtystock']");
	By Resiadual_Shrinkage   = By.xpath("//input[@formcontrolname='residualShrinkage']");
	By Process_Loss          = By.xpath("//input[@formcontrolname='processLoss']");
	By Qty_Allowed           = By.xpath("//input[@formcontrolname='qtyAllowd']");
	By Currency              = By.xpath("//select[@formcontrolname='currencyType']");
	By Rate_field            = By.xpath("//input[@formcontrolname='totalqtyRate']");
	By UOM_field             = By.xpath("//select[@formcontrolname='uomId']");
	By L_Short_Info          = By.xpath("//textarea[@formcontrolname='laddtionalInfo']");
	By Addl_Info             = By.xpath("//textarea[@formcontrolname='addtionalInfo1']");
	By Addl_Info2            = By.xpath("//textarea[@formcontrolname='addtionalInfo2']");
	By Select_IPO            = By.xpath("(//ng-select[@formcontrolname='ipoId'])[1]");
	By Due_On_Date           = By.xpath("//input[@formcontrolname='dueDate']");
	By Grid_Qty              = By.xpath("//input[@formcontrolname='qtyrequired']");
	By Grid_Qty_Use          = By.xpath("//input[@formcontrolname='qtyUsefromStock']");
	By Grid_Qty_bought       = By.xpath("//input[@formcontrolname='qtytobeBought']");
	By IPO_Grid_Rate         = By.xpath("(//td[@class='text-right'])[1]");
	By Grid_Amount           = By.xpath("(//td[@class='text-right'])[2]");
	By Currency_Type         = By.xpath("//select[@formcontrolname='currencyType']");
	By Save_button           = By.xpath("(//button[@type='submit'])[1]");
	By Select_Count          = By.xpath("//select[@formcontrolname='countOfConstruction']");
	By Select_UOM            = By.xpath("//select[@formcontrolname='uomId']");
	By Add_IPO               = By.xpath("//button[text()=' Add IPO ']");
	By Select_IPO_Col        = By.xpath("(//ng-select[@formcontrolname='ipoId'])[2]");
	By Same_IPO_Val          = By.xpath("//h2[text()='ipo-3 is Already Selected']");
	By Delete_Icon           = By.xpath("(//button[@class='btn btn-outline-danger btn-sm'])[2]");
	By delete_Yes            = By.xpath("//button[text()='Yes']");
	
	
	public void Click_on_the_Generate_PO_dropdown() throws Throwable {
		utilities.webDriverWait(driver, SW_Generate_Po);
		driver.findElement(SW_Generate_Po).click();
		utilities.MinimumWait(driver);				
	}

	public void Click_on_the_Create_PO_For_IPO_Screen() throws Throwable {
		utilities.webDriverWait(driver, SW_create_Po_screen);
		driver.findElement(SW_create_Po_screen).click();
		utilities.MinimumWait(driver);			
	}

	public void The_Create_PO_For_IPO_Screen_is_displayed_or_not() {
		WebElement data = driver.findElement(Create_PO_Screen_name);
		String Screen_name = data.getText(); 
		System.out.print("Display the Create Po For IPO Screen:" + Screen_name);	
		
	}

	public void Click_on_the_Yarn_Sourcing_Data_Entry_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Data_Entry);
		driver.findElement(Yarn_Data_Entry).click();
		utilities.MinimumWait(driver);		
		
	}

	public void Select_the_of_Order(String Type) throws Throwable {
		driver.findElement(Type_Of_Order).click();
	    Thread.sleep(1000);    
	    WebElement use = driver.findElement(Type_Of_Order);
	    Select Usefield = new Select(use);

	    boolean SeasonExists = false;
	    for (WebElement option : Usefield.getOptions()) {
	        if (option.getText().equals(Type)) {
	        	SeasonExists = true;
	            break;
	        }
	    }

	    if (SeasonExists) {
	    	Usefield.selectByVisibleText(Type);
	    } else {
	        System.out.println("Selected Type of Order is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);		
		
	}

	public void Check_the_Current_date_is_displayed_in_the_PO_Date_field_or_not() {
		WebElement data = driver.findElement(PO_Date);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the PO Date Data:" + upchargeData);	
		
	}

	public void The_PO_number_is_prepopulated_or_not() {
		WebElement data = driver.findElement(Po_number);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the PO number Data:" + upchargeData);	
		
	}

	public void Search_the_and_Select_the_Deliver_in_dropdown_list(String Deliver) throws Throwable {
		utilities.webDriverWait(driver, Deliver_To_field);
		driver.findElement(Deliver_To_field).sendKeys(Deliver);
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
	}

	public void The_Deliver_Address_is_prepopulated_or_not() {
		WebElement data = driver.findElement(Deliver_Address);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the Deliver_Address Data:" + upchargeData);
		
	}

	public void The_Deliver_GSTIN_number_is_prepopulated_or_not() {
		WebElement data = driver.findElement(Deliver_GSTIN);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the Deliver_GSTIN Data:" + upchargeData);
		
	}

	public void Search_the_Select_the_Supplier_in_dropdown_list(String Supplier) throws Throwable {
		utilities.webDriverWait(driver, Supplier_field);
		driver.findElement(Supplier_field).sendKeys(Supplier);
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
	}

	public void The_Supplier_Address_is_prepopulated_or_not() {
		WebElement data = driver.findElement(Supplier_Address);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the Supplier_Address Data:" + upchargeData);
		
	}

	public void The_Supplier_GSTIN_number_is_prepopulated_or_not() {
		WebElement data = driver.findElement(Supplier_GSTIN);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the Supplier_GSTIN Data:" + upchargeData);
		
	}

	public void Payment_Terms_are_prepopulated_or_not() {
		WebElement data = driver.findElement(Payment_Terms);
		String upchargeData = data.getAttribute("value");
		System.out.print("Display the Payment_Terms Data:" + upchargeData);
		
	}

	public void The_Delivery_Terms_are_prepopulated_or_not() throws Throwable {
		utilities.webDriverWait(driver, Delivery_Terms);
		driver.findElement(Delivery_Terms).click();
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
		
	}

	public void Enter_the_data_in_the_Lead_Time_field(String Days) throws Throwable {
		utilities.webDriverWait(driver, Lead_Time);
		driver.findElement(Lead_Time).sendKeys(Days);
		utilities.MinimumWait(driver);	
		
	}

	public void Select_the_Yarn(String Process) throws Throwable {
		driver.findElement(Yarn_Process).click();
	    Thread.sleep(1000);    
	    WebElement use = driver.findElement(Yarn_Process);
	    Select Usefield = new Select(use);

	    boolean SeasonExists = false;
	    for (WebElement option : Usefield.getOptions()) {
	        if (option.getText().equals(Process)) {
	        	SeasonExists = true;
	            break;
	        }
	    }

	    if (SeasonExists) {
	    	Usefield.selectByVisibleText(Process);
	    } else {
	        System.out.println("Selected Process is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);		
		
		
	}

	public void Select_the_in_the_Yarn_details_section(String Color) throws Throwable {
		WebElement buttonElement = driver.findElement(Yarn_color);
		if (buttonElement.isEnabled()) {
			System.out.println("Button is enabled.");
			utilities.webDriverWait(driver, Yarn_color);
			driver.findElement(Yarn_color).click();
			utilities.MinimumWait(driver);	
			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_DOWN);
//			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);		

		} else {
			System.out.println("Color field is displayed disabled state");
		}		
	}

	public void Enter_the_data_in_Qty_Allowed_field() throws Throwable {
		utilities.webDriverWait(driver, Qty_Allowed);
		driver.findElement(Qty_Allowed).clear();
		driver.findElement(Qty_Allowed).sendKeys("3");
		utilities.MinimumWait(driver);	
		
	}

	public void Enter_the_data_in_the_Rate_field() throws Throwable {
		utilities.webDriverWait(driver, Rate_field);
		driver.findElement(Rate_field).sendKeys("2");
		utilities.MinimumWait(driver);	
		
	}

	public void Enter_the_data_in_the_L_Short_If_Any() throws Throwable {
		utilities.webDriverWait(driver, L_Short_Info);
		driver.findElement(L_Short_Info).sendKeys("Deliver");
		utilities.MinimumWait(driver);	
	}

	public void Enter_the_data_in_the_Addl_Information_1() throws Throwable {
		utilities.webDriverWait(driver, Addl_Info);
		driver.findElement(Addl_Info).sendKeys("Information1");
		utilities.MinimumWait(driver);	
	}

	public void Enter_the_data_in_the_Addl_Information_2() throws Throwable {
		utilities.webDriverWait(driver, Addl_Info2);
		driver.findElement(Addl_Info2).sendKeys("Information2");
		utilities.MinimumWait(driver);	
		
	}

	public void Select_the_Due_on_Date() throws Throwable {
	    List<WebElement> baseSizeElements = driver.findElements(Due_On_Date);
        // Iterate over each element
        for (WebElement baseSizeElement : baseSizeElements) {
            if (baseSizeElement.isEnabled()) {
            	driver.findElement(Due_On_Date).sendKeys(formattedDate);
        		utilities.MediumWait(driver);
        		System.out.println("tomorrow: " + formattedDate);

                utilities.MinimumWait(driver); // Optional wait
            }
        }
		
	}

	public void The_Quantity_field_data_is_prepopulated_or_not() throws Throwable {
	    List<WebElement> baseSizeElements = driver.findElements(Grid_Qty);
        // Iterate over each element
        for (WebElement baseSizeElement : baseSizeElements) {
            if (baseSizeElement.isEnabled()) {
            	WebElement data = driver.findElement(Grid_Qty);
        		String upchargeData = data.getAttribute("value");
        		System.out.print("Display the Grid Qty Data:" + upchargeData);	
                utilities.MinimumWait(driver); // Optional wait
            }
        }
	}

	public void The_Qty_Use_From_Stock_field_data_is_prepopulated_or_not() throws Throwable {
	    List<WebElement> baseSizeElements = driver.findElements(Grid_Qty_Use);
        // Iterate over each element
        for (WebElement baseSizeElement : baseSizeElements) {
            if (baseSizeElement.isEnabled()) {
            	WebElement data = driver.findElement(Grid_Qty_Use);
        		String upchargeData = data.getAttribute("value");
        		System.out.print("Display the Qty use from Stock Data:" + upchargeData);	
                utilities.MinimumWait(driver); // Optional wait
            }
        }
	}

	public void The_Qty_To_Be_Bought_field_data_is_prepopulated_or_not() throws Throwable {
	    List<WebElement> baseSizeElements = driver.findElements(Grid_Qty_bought);
        // Iterate over each element
        for (WebElement baseSizeElement : baseSizeElements) {
            if (baseSizeElement.isEnabled()) {
            	WebElement data = driver.findElement(Grid_Qty_bought);
        		String upchargeData = data.getAttribute("value");
        		System.out.print("Display the Qty to be bought Data:" + upchargeData);		
                utilities.MinimumWait(driver); // Optional wait
            }
        }
	}

	public void the_Rate_Column_data_is_displayed_or_not() throws Throwable {
	    List<WebElement> baseSizeElements = driver.findElements(IPO_Grid_Rate);
        // Iterate over each element
        for (WebElement baseSizeElement : baseSizeElements) {
            if (baseSizeElement.isEnabled()) {
        		WebElement data = driver.findElement(IPO_Grid_Rate);
        		String upchargeData = data.getText();
        		System.out.print("Display the grid Rate Data:" + upchargeData);		
                utilities.MinimumWait(driver); // Optional wait
            }
        }
	}

	public void The_Amount_is_displayed_or_not() throws Throwable {
	    List<WebElement> baseSizeElements = driver.findElements(Grid_Amount);
        // Iterate over each element
        for (WebElement baseSizeElement : baseSizeElements) {
            if (baseSizeElement.isEnabled()) {
        		WebElement data = driver.findElement(Grid_Amount);
        		String upchargeData = data.getAttribute("value");
        		System.out.print("Display the Amount Data:" + upchargeData);		
                utilities.MinimumWait(driver); // Optional wait
            }
        }
	}

	public void Select_the_Qty_Required_is_prepopulated_or_not() {
		WebElement data = driver.findElement(Qty_Required);
		String upchargeData = data.getText();
		System.out.print("Display the Qty Required Data:" + upchargeData);	
		
	}

	public void the_Qty_Available_In_Stock_field_data_is_displayed_or_not() {
		WebElement data = driver.findElement(Qty_Availble_Stock);
		String upchargeData = data.getText();
		System.out.print("Display the Qty Availble Stock Data:" + upchargeData);	
		
	}

	public void The_Residual_Shrinkage_is_prepopulated_or_not() {
		WebElement data = driver.findElement(Resiadual_Shrinkage);
		String upchargeData = data.getText();
		System.out.print("Display the Resiadual Shrinkage Data:" + upchargeData);	
		
	}

	public void The_Process_Loss_is_prepopulated_or_not() {
		
		Boolean isPresent = driver.findElements(Process_Loss).size()>0;
		if (isPresent) {	
			WebElement data = driver.findElement(Process_Loss);
			String upchargeData = data.getText();
			System.out.print("Display the Process Loss Data:" + upchargeData);
		} else {
			  System.out.println("Process Loss field is not displayed: " + isPresent);
			
		}
	}

	public void Click_on_the_Save_Button() throws Throwable {
		utilities.webDriverWait(driver, Save_button);
		driver.findElement(Save_button).click();
		utilities.MinimumWait(driver);		
		
	}

	public void User_Select_the_Currency_type() throws Throwable {
		utilities.webDriverWait(driver, Currency_Type);
		driver.findElement(Currency_Type).click();
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
	}
	
	public void Select_the_IPO_in_the_IPO_column() throws Throwable {
		utilities.webDriverWait(driver, Select_IPO);
		driver.findElement(Select_IPO).click();
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
		
	}

	public void Select_the_Count() throws Throwable {
		utilities.webDriverWait(driver, Select_Count);
		driver.findElement(Select_Count).click();
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		
		
	}

	public void Select_the_UOM_in_the_yarn_PO() throws Throwable {
		utilities.webDriverWait(driver, Select_UOM);
		driver.findElement(Select_UOM).click();
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);	
		
	}
	public void Click_on_the_Add_IPO_button() throws Throwable {
		utilities.webDriverWait(driver, Add_IPO);
		driver.findElement(Add_IPO).click();
		utilities.MinimumWait(driver);	
		
	}

	public void Select_the_IPO_in_the_IPO_Column() throws Throwable {
		utilities.webDriverWait(driver, Select_IPO_Col);
		driver.findElement(Select_IPO_Col).click();
		utilities.MinimumWait(driver);	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		Boolean isPresent = driver.findElements(Same_IPO_Val).size()>0;
		if (isPresent) {	
			 System.out.println("Display element: " + isPresent);		   		
			    System.out.print("IPO already selected");
			    driver.findElement(Delete_Icon).click();
			    driver.findElement(delete_Yes).click();
		} else {
			  System.out.println("Display element: " + isPresent);
			
		}
		
	}

}
