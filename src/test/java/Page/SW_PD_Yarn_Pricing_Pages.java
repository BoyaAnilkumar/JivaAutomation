package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class SW_PD_Yarn_Pricing_Pages extends DriverFactory{

	Utilities utilities = new Utilities();

	By Yarn_Sourcing         = By.xpath("//span[text()='Yarn Sourcing ']");
	By Sourcing_Data_Entry   = By.xpath("(//span[text()='Data Entry'])[1]");
	By PD_Yarn_Pricing       = By.xpath("//a[text()='PD Yarn Pricing ']");
	By Filter_Icon           = By.xpath("//button[@class='btn btn-primary btn-sm float-right mb-2']");
	By Select_Style          = By.xpath("(//a[@role='tab'])[1]");
	By Season_field          = By.xpath("//select[@formcontrolname='seasonTypeId']");
	By Status_field          = By.xpath("//select[@formcontrolname='statusTypeId']");
	By Style_field           = By.xpath("//input[@formcontrolname='buyerStyleNumber']");
	By Dis_Style             = By.xpath("(//p[@class='mb-0 text-primary'])[1]");
	By Dis_Buyer             = By.xpath("(//p[@class='mb-0 text-primary'])[2]");
	By Dis_Season            = By.xpath("(//p[@class='mb-0 text-primary'])[3]");
	By Dis_Qty               = By.xpath("(//p[@class='mb-0 text-primary'])[4]");
	By Order_Date            = By.xpath("//small[text()='Order Date']/..//p[@class='mb-0 text-primary']");
	By Yarn_Quality          = By.xpath("//select[@formcontrolname='fabricQualityId']");
	By Content_field         = By.xpath("//select[@formcontrolname='content']");
	By Spin_Type             = By.xpath("//select[@formcontrolname='spinType']");
	By Color_field           = By.xpath("//select[@formcontrolname='colorId']");
	By Count_field           = By.xpath("//select[@formcontrolname='countOfConstruction']");
	By Finish_field          = By.xpath("//input[@formcontrolname='finish']");
	By Specific_Requirements = By.xpath("//input[@formcontrolname='specificRequirement']");
	By Yarn_Quntity          = By.xpath("//input[@formcontrolname='yarnQuantity']");
	By Use_field             = By.xpath("//select[@formcontrolname='use']");
	By Add_Pricing           = By.xpath("//button[text()=' Add Pricing']");
	By Delete_Icon           = By.xpath("//button[@title='Remove']");
	By Select_Process        = By.xpath("//select[@formcontrolname='processId']");
	By Price_field           = By.xpath("//input[@formcontrolname='price']");
	By Yarn_Supplier         = By.xpath("//select[@formcontrolname='yarnSupplierId']");
	By Process_remarks       = By.xpath("//input[@formcontrolname='remarks']");
	By Total_Price           = By.xpath("//input[@formcontrolname='totalPrice']");
	By Price_Remarks         = By.xpath("//input[@formcontrolname='priceRemarks']");
	By Total_yarn_Lead_Time  = By.xpath("//input[@formcontrolname='totalYarnLeadTime']");
	By Price_valid_Days      = By.xpath("//input[@formcontrolname='priceValidforDays']");
	By Yarn_Call_Outs_Remarks= By.xpath("//input[@formcontrolname='otherRemarks']");
	By Save_Button           = By.xpath("//button[text()=' SAVE ']");
	By Delete_Validation     = By.xpath("//h2[text()='Atleast One Process is  Required']");
	By View_For_Print_button = By.xpath("//button[text()=' View for Print']");
	By Style_Details         = By.xpath("(//td[@colspan='2'])[2]");
	By Print_Button          = By.xpath("//button[text()='Print']");
	By Delete_Yes            = By.xpath("//button[text()='Yes']");
	By Save_validation       = By.xpath("//h2[text()='Yarn Pricing CallOut Added Successfully']");
	By Update                = By.xpath("//h2[text()='Yarn Pricing CallOut Updated Successfully']");
	By Submit_To_PO_Merchant = By.xpath("//button[text()=' Submit to Po Merchant Team ']");
	By Submt_Validation      = By.xpath("//h2[text()='Yarn Status Changed Successfully']");
	
	public void Click_on_the_Yarn_Sourcing_Module() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Sourcing);
		driver.findElement(Yarn_Sourcing).click();
		utilities.MinimumWait(driver);		
		
	}

	public void Click_on_the_Sourcing_Data_Entry_dropdown() throws Throwable {
		utilities.webDriverWait(driver, Sourcing_Data_Entry);
		driver.findElement(Sourcing_Data_Entry).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Click_on_the_PD_Yarn_Pricing_Screen() throws Throwable {
		utilities.webDriverWait(driver, PD_Yarn_Pricing);
		driver.findElement(PD_Yarn_Pricing).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Select_the_season_in_the_Filter_option_page(String Season) throws Throwable {
		utilities.webDriverWait(driver, Season_field);
		driver.findElement(Season_field).click();
	    Thread.sleep(1000);    
	    WebElement season = driver.findElement(Season_field);
	    Select Sea = new Select(season);

	    boolean seasonExists = false;
	    for (WebElement option : Sea.getOptions()) {
	        if (option.getText().equals(Season)) {
	        	seasonExists = true;
	            break;
	        }
	    }

	    if (seasonExists) {
	    	Sea.selectByVisibleText(Season);
	    } else {
	        System.out.println("Selected Season is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);
		
	
		
	}

	public void Select_the_Status_in_filter_Option_page(String Status) throws Throwable {
		utilities.webDriverWait(driver, Status_field);
		driver.findElement(Status_field).click();
	    Thread.sleep(1000);    
	    WebElement status = driver.findElement(Status_field);
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

	public void Enter_the_Buyer_in_Search_By_Style(String Style) throws Throwable {
		utilities.webDriverWait(driver, Style_field);
		driver.findElement(Style_field).sendKeys(Style);
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Selected_Style_Details_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Dis_Style);
		WebElement style = driver.findElement(Dis_Style);
		String Style_data = style.getText(); 
		System.out.print("Display Selected Style:" +Style_data);	
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Dis_Buyer);
		WebElement buyer = driver.findElement(Dis_Buyer);
		String buyer_data = buyer.getText(); 
		System.out.print("Display the Buyer name:" +buyer_data);	
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Dis_Season);
		WebElement season = driver.findElement(Dis_Season);
		String season_data = season.getText(); 
		System.out.print("Display the Season name:" +season_data);	
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Dis_Qty);
		WebElement Qty = driver.findElement(Dis_Qty);
		String Qty_data = Qty.getText(); 
		System.out.print("Display Qty value:" +Qty_data);	
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Order_Date);
		WebElement Date = driver.findElement(Order_Date);
		String DAte_data = Date.getText(); 
		System.out.print("Display Date:" +DAte_data);	
		utilities.MinimumWait(driver);
		
	}

	public void Verify_whether_the_Yarn_Quality_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement dropdown = driver.findElement(Yarn_Quality);
	     Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText; 
	        if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the Yarn Quantity: " + selectedText);
		    } 
		}
	}

	public void Verify_the_Content_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement dropdown = driver.findElement(Content_field);
	    Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText; 
	        if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the Content: " + selectedText);
		    } 
		}
	}

	public void Verify_the_Spin_Type_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement dropdown = driver.findElement(Spin_Type);
	    Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText; 
	        if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the Spin Type: " + selectedText);
		    } 
		}
		
	}

	public void Verify_the_color_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement dropdown = driver.findElement(Color_field);
	     Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText; 
	        if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the Color: " + selectedText);
		    } 
		}
	}

	public void Verify_the_Count_Construction_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement dropdown = driver.findElement(Count_field);
	     Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText; 
	        if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the Count: " + selectedText);
		    } 
		}
		
	}

	public void Verify_the_Finish_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement Data = driver.findElement(Finish_field);
		String Finish = Data.getAttribute("value");
		System.out.println("Displaying the Finish: " + Finish);
	}

	public void Verify_the_Specific_Requirements_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement Data = driver.findElement(Specific_Requirements);
		String Specific = Data.getAttribute("value");
		System.out.println("Display the Specific data: " + Specific);
		
	}

	public void Verify_the_Yarn_Quantity_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement Data = driver.findElement(Yarn_Quntity);
		String Quantity = Data.getAttribute("value");
		System.out.println("Display the Specific data: " + Quantity);
		
	}
	public void Verify_the_Use_field_data_is_prepopulated_or_not() throws Throwable {
		WebElement dropdown = driver.findElement(Use_field);
	     Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText; 
	        if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the Use: " + selectedText);
		    } 
		}
		
	}

	public void Verify_the_first_Process_is_not_selected_and_CLick_on_the_Add_Pricing_button() throws Throwable {
		utilities.webDriverWait(driver, Add_Pricing);
		driver.findElement(Add_Pricing).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_in_the_Pricing_Grid(String Process) throws Throwable {
		utilities.webDriverWait(driver, Select_Process);
		driver.findElement(Select_Process).click();
	    Thread.sleep(1000);    
	    WebElement process = driver.findElement(Select_Process);
	    Select Sea = new Select(process);

	    boolean StatusExists = false;
	    for (WebElement option : Sea.getOptions()) {
	        if (option.getText().equals(Process)) {
	        	StatusExists = true;
	            break;
	        }
	    }

	    if (StatusExists) {
	    	Sea.selectByVisibleText(Process);
	    } else {
	        System.out.println("Selected Process is not displayed in the dropdown list");
	    }

	    utilities.MediumWait(driver);
		
		
	}

	public void Enter_data_in_the_field_the_Pricing_Grid(String Price) throws Throwable {
		utilities.webDriverWait(driver, Price_field);
		driver.findElement(Price_field).sendKeys(Price);
		utilities.MinimumWait(driver);
				
	}

	public void Select_the_Yarn_Supplier() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Supplier);
		driver.findElement(Yarn_Supplier).click();
		utilities.MinimumWait(driver);
		
		  Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_DOWN);
		    r.keyPress(KeyEvent.VK_ENTER);
		    Thread.sleep(2000);
		
	}

	public void Enter_the_data_in_the_Process_Remarks_field() throws Throwable {
		utilities.webDriverWait(driver, Process_remarks);
		driver.findElement(Process_remarks).sendKeys("REmarks");
		utilities.MinimumWait(driver);
				
		
	}

	public void Enter_the_data_in_the_Remarks_field() throws Throwable {
		utilities.webDriverWait(driver, Price_Remarks);
		driver.findElement(Price_Remarks).sendKeys("REmarks");
		utilities.MinimumWait(driver);
	}

	public void enter_the_data_in_the_Total_Yarn_Lead_Time() throws Throwable {
		utilities.webDriverWait(driver, Total_yarn_Lead_Time);
		driver.findElement(Total_yarn_Lead_Time).sendKeys("4");
		utilities.MinimumWait(driver);
	}

	public void Enter_the_data_in_the_Price_Valid_For_Days() throws Throwable {
		utilities.webDriverWait(driver, Price_valid_Days);
		driver.findElement(Price_valid_Days).sendKeys("5");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_Yarn_call_outs_Remarks() throws Throwable {
		utilities.webDriverWait(driver, Yarn_Call_Outs_Remarks);
		driver.findElement(Yarn_Call_Outs_Remarks).sendKeys("REmarks");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_the_data_in_the_total_Price_field(String TotalPrice) throws Throwable {
		utilities.webDriverWait(driver, Total_Price);
		driver.findElement(Total_Price).sendKeys(TotalPrice);
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_without_adding_the_data_click_on_the_Delete_icon_the_validation_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Delete_Icon);
		driver.findElement(Delete_Icon).click();
		utilities.MinimumWait(driver);
		driver.findElement(Delete_Yes).click();
		utilities.MinimumWait(driver);
		Boolean isPresent = driver.findElements(Delete_Validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Delete_Validation);
		String test = Data.getText(); 
		String expectedData = "Mandatory Fields Are Required With Valid Data.";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}

	public void Click_on_the_Save_button_in_the_PD_Yarn_Pricing() throws Throwable {
		utilities.webDriverWait(driver, Save_Button);
		driver.findElement(Save_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Filter_Icon_in_Pricing_Style_Expansion() throws Throwable {
		utilities.webDriverWait(driver, Filter_Icon);
		driver.findElement(Filter_Icon).click();
		utilities.MinimumWait(driver);
		
	}

	public void Select_the_Style_in_the_Styles_List() throws Throwable {
		utilities.webDriverWait(driver, Select_Style);
		driver.findElement(Select_Style).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_View_for_Print_button() throws Throwable {
		utilities.webDriverWait(driver, View_For_Print_button);
		driver.findElement(View_For_Print_button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Verify_the_Select_Style_Details_are_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Style_Details);
		WebElement IPO_qty = driver.findElement(Style_Details);
		String View_Data = IPO_qty.getText(); 
		System.out.print("Display the Style Data:" + View_Data);
		utilities.MinimumWait(driver);
		
		
	}
	public void CLick_on_the_Print_button() throws Throwable {
		utilities.webDriverWait(driver, Print_Button);
		driver.findElement(Print_Button).click();
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_the_Submit_to_Po_Merchant_team_the_validation_msg_is_displayed_or_not() throws Throwable {
		utilities.webDriverWait(driver, Submit_To_PO_Merchant);
		driver.findElement(Submit_To_PO_Merchant).click();
		utilities.MinimumWait(driver);
		Boolean isPresent = driver.findElements(Submt_Validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Submt_Validation);
		String test = Data.getText(); 
		String expectedData = "Yarn Status Changed Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	}

	public void Verify_the_On_Save_validation_is_displayed_or_not() {
		Boolean isPresent = driver.findElements(Submt_Validation).size()>0;
		if (isPresent) {
		WebElement Data = driver.findElement(Submt_Validation);
		String test = Data.getText(); 
		String expectedData = "Yarn Pricing CallOut Added Successfully";
		if (expectedData.equals(test)) {
			System.out.println("Display validation msg is correct." + test);
		} else {
			System.out.println("Display validation msg is incorrect."+ test);
		}
	}
		
	
		
	}

}
