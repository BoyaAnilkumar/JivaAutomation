package Page;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class FabricPricing_Pages extends DriverFactory{
	
	Utilities utilities = new Utilities();
	
	
	By username = By.xpath("//input[@id='userName']");
	By password = By.xpath("//input[@id='userpassword']");
	By Fabric_Sourcing = By.xpath("//span[text()='Fabric Sourcing ']");
	By PDFabric_Pricing = By.xpath("//a[text()='PD Fabric Pricing']");
	By Filter = By.xpath("//button[@class='btn btn-primary btn-sm float-right mb-2']");
	By Season = By.xpath("//select[@formcontrolname='seasonTypeId']");
	By Search_Style = By.xpath("//input[@formcontrolname='buyerStyleNumber']");
	By Select_Style = By.xpath("//div[@class='nav flex-column nav-pills ng-star-inserted']");
	By Fabric1 = By.xpath("(//li[@class='nav-item ng-star-inserted'])[1]");
	By Dis_Style = By.xpath("(//p[@class='mb-0 text-primary'])[1]");
	By Dis_Buyer = By.xpath("(//p[@class='mb-0 text-primary'])[2]");
	By Dis_Season = By.xpath("(//p[@class='mb-0 text-primary'])[3]");
	By Dis_Qty = By.xpath("(//p[@class='mb-0 text-primary'])[4]");
	By Order_Date = By.xpath("//small[text()='Order Date']/..//p[@class='mb-0 text-primary']");
	By Fabric_Cancel = By.xpath("//a[@id='fabric-one-tab19']/..//span[@class='ng-star-inserted']");
	By Fabric_Cancel1 = By.xpath("//a[@id='fabric-one-tab20']/..//span[@class='ng-star-inserted']");
	//Fabric Specification
	By Fabric_Quality = By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[3]");
	By Content = By.xpath("//select[@formcontrolname='content']");
	By Color  = By.xpath("//select[@formcontrolname='colorId']");
	By Count_Construction  = By.xpath("//select[@formcontrolname='countOfConstruction']");
	By GSM  = By.xpath("//select[@formcontrolname='gsm']");
	By Finish = By.xpath("//input[@formcontrolname='finish']");
	By Spel_Req = By.xpath("//input[@formcontrolname='specificRequirement']");
	By Fabric_Quantity= By.xpath("//input[@formcontrolname='fabricQuantity']");
	By Full_Width = By.xpath("//input[@formcontrolname='fullWidth']");
	By Cuttable_Width = By.xpath("//select[@formcontrolname='cuttableWidth']");
	By Use = By.xpath("//select[@formcontrolname='use']");
	
	//Add Pricing Details
	By Add_Pricing = By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
	By Process = By.xpath("//select[@formcontrolname='processId']");
	By Select_Process = By.xpath("(//select[@formcontrolname='processId']/..//option[@class='ng-star-inserted'])[1]");
	By Price = By.xpath("//input[@placeholder='Enter Price']");
	By Fabric_supplier = By.xpath("//select[@formcontrolname='fabricSupplierId']");
	By Select_Supplier = By.xpath("(//select[@formcontrolname='fabricSupplierId']/..//option[@class='ng-star-inserted'])[1]");
	By Remarks = By.xpath("//input[@formcontrolname='remarks']");
	By Total_Price = By.xpath("//input[@formcontrolname='totalPrice']");
	By TotalFabric_Leadtime = By.xpath("//input[@formcontrolname='totalFabricLeadTime']");
	By Price_ValidForDays = By.xpath("//input[@formcontrolname='priceValidforDays']");
	By Delete_button = By.xpath("//button[@class='btn btn-sm btn-danger']");
	//Fabric Call outs
	By Residual_Shrinkage = By.xpath("//input[@formcontrolname='residualShrinkage']");
	By Boing = By.xpath("//input[@placeholder='Enter Boing']");
	By CS = By.xpath("//input[@placeholder='Enter CS']");
	By Color_Fastness = By.xpath("//input[@formcontrolname='colorFastness']");
	By GSM_Variation = By.xpath("//input[@formcontrolname='gsMvariation']");
	By Crinkle_Variation = By.xpath("//input[@formcontrolname='crinkleVariation']");
	By Any_Other_Remarks = By.xpath("//input[@formcontrolname='otherRemarks']");
	By View_For_print = By.xpath("//button[@class='btn btn-md btn-primary btn-active-light-primary mr-2 ng-star-inserted']");
	By Reset = By.xpath("//button[text()=' Reset']");
	By save = By.xpath("//button[text()=' SAVE ']");
	By Submit_PoMerchant = By.xpath("//button[@class='btn btn-md btn-primary px-5 ng-star-inserted']");
	By Cancel_Button = By.xpath("//button[text()='Cancel']");
	By Print_Button = By.xpath("//button[@id='printpagebutton']");
	By ViewPage_Name = By.xpath("//h3[text()='Fabric Detail Sheet']");
  //Nominated Fabric
	By Nom_Fabric = By.xpath("(//li[@class='nav-item ng-star-inserted'])[2]");
	By Download = By.xpath("//i[@class='ti-download']");
	
	
	
	public void User_enters_the_username_and_password() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("Lokesh");
		driver.findElement(password).sendKeys("Abcd@123");
		utilities.MediumWait(driver);
	}
	public void Click_on_the_PD_Fabric_Pricing_under_the_Fabric_Sourcing_Module() throws Throwable {
		utilities.webDriverWait(driver, Fabric_Sourcing );
		 driver.findElement(Fabric_Sourcing).click();
		 utilities.MediumWait(driver);
		 driver.findElement(PDFabric_Pricing).click();	
		
	}
	public void Click_on_the_Filter_icon() throws Throwable {
		utilities.webDriverWait(driver, Filter );
		 driver.findElement(Filter).click();
		
	}
	public void Click_on_the_Season_field() throws Throwable {
		   utilities.webDriverWait(driver, Season);
			driver.findElement(Season).click();
		
	}
	public void Search_The_Style() throws Throwable {
		utilities.webDriverWait(driver, Search_Style);
		driver.findElement(Search_Style).sendKeys("Retro style");
		Thread.sleep(5000);
		WebElement IPOname = driver.findElement(Search_Style);
		String style = IPOname.getAttribute("value");
		System.out.println("Display the entered Style Name " + style);
		
	}
	public void Select_the_Style() throws Throwable {
		utilities.webDriverWait(driver, Select_Style);
		driver.findElement(Select_Style).click();
		
	}
	public void Verify_the_Style_name_is_displayed_or_not() throws Throwable {
		WebElement Data = driver.findElement(Dis_Style);
		String Style = Data.getText();
		String expectedData = "Retro style";
		if (expectedData.equals(Style)) {
			System.out.println("Display Style name is correct." + Style);
		} else {
			System.out.println("Display Style name is incorrect."+ Style);
		}	
		
	}
	public void Verify_the_Buyer_name_is_displayed_or_not() throws Throwable {
		WebElement Data = driver.findElement(Dis_Buyer);
		String Buyer = Data.getText();
		String expectedData = "Spin";
		if (expectedData.equals(Buyer)) {
			System.out.println("Display Buyer name is correct." + Buyer);
		} else {
			System.out.println("Display Buyer name is incorrect."+ Buyer);
		}	
		
	}
	public void Verify_the_Season_name_is_displayed_or_not() throws Throwable {
		WebElement Data = driver.findElement(Dis_Season);
		String Season = Data.getText();
		String expectedData = "Holiday 2022";
		if (expectedData.equals(Season)) {
			System.out.println("Display Season name is correct." + Season);
		} else {
			System.out.println("Display Season name is incorrect."+ Season);
		}	
	}
	public void Verify_the_Qty_value_is_displayed_or_not() {
		WebElement Data = driver.findElement(Dis_Qty);
		String Qty = Data.getText();
		String expectedData = "100";
		if (expectedData.equals(Qty)) {
			System.out.println("Display Qty value is correct." + Qty);
		} else {
			System.out.println("Display Qty value is incorrect."+ Qty);
		}	
		
	}
	public void Verify_the_Order_date_is_displayed_or_not() {
		WebElement Data = driver.findElement(Order_Date);
		String Orderdate = Data.getText();
		String expectedData = "07/12/2023";
		if (expectedData.equals(Orderdate)) {
			System.out.println("Display Order date is correct." + Orderdate);
		} else {
			System.out.println("Display Order date is incorrect."+ Orderdate);
		}	
		
	}
	public void click_on_the_Fabric_cancel_icon() throws Throwable {
		utilities.webDriverWait(driver, Fabric_Cancel1);
		driver.findElement(Fabric_Cancel1).click();
		
	}
	public void Verify_whether_the_Fabric_Quality_field_data_is_prepopulated_or_not() {
	WebElement dropdown = driver.findElement(Fabric_Quality);
     Select select = new Select(dropdown);
	List<WebElement> selectedOptions = select.getAllSelectedOptions();
	if (selectedOptions.size() == 1) {
	    String selectedText = selectedOptions.get(0).getText();
	    String expectedData = selectedText; 
        if (expectedData.equals(selectedText.trim())) {
	        System.out.println("Display the Fabric Quantity: " + selectedText);
	    } 
	}

	}
   public void Verify_whether_the_Content_field_data_is_prepopulated_or_not() {
	WebElement dropdown = driver.findElement(Content);
    Select select = new Select(dropdown);
	List<WebElement> selectedOptions = select.getAllSelectedOptions();
	if (selectedOptions.size() == 1) {
	    String selectedText = selectedOptions.get(0).getText();
	    String expectedData = selectedText;
	    if (expectedData.equals(selectedText.trim())) {
	        System.out.println("Display the Content:" + selectedText);
	}
  }
 }
	public void Verify_whether_the_color_field_data_is_prepopulated_or_not() {
		WebElement dropdown = driver.findElement(Color);
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
	public void Verify_wether_the_Count_Construction_field_data_is_prepopulated_or_not() {
		WebElement dropdown = driver.findElement(Count_Construction);
	    Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText;
             if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the Count Construction: " + selectedText);
		    }
		}
	}
	public void Verify_whether_the_GSM_field_data_is_prepopulated_or_not() {
		WebElement dropdown = driver.findElement(GSM);
	    Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText;

		    if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the GSM: " + selectedText);
		    } 
		}
	}
	public void Verify_whether_the_Finish_field_data_is_prepopulated_or_not() {
		WebElement Data = driver.findElement(Finish);
		String Finish = Data.getAttribute("value");
		System.out.println("Displaying the Finish: " + Finish);
	}
	
	public void Verify_whether_the_Specific_Requirements_field_data_is_prepopulated_or_not() {

	WebElement Data = driver.findElement(Spel_Req);
	String Spl = Data.getAttribute("value");
	System.out.println("Displaying the Special Requirements: " + Spl);
}
	public void Verify_whether_the_Fabric_Quantity_field_data_is_prepopulated_or_not() {
		WebElement Data = driver.findElement(Fabric_Quantity);
		String Fab_Qun = Data.getAttribute("value");
		System.out.println("Displaying the fabric Quantity : " + Fab_Qun);
	}
	
	public void Verify_whether_the_Full_Width_field_data_is_prepopulated_or_not() {
		WebElement Data = driver.findElement(Full_Width);
		String width = Data.getAttribute("value");
		System.out.println("Display full width : " + width);
	}
	public void Verify_wether_the_Cuttable_Width_field_data_is_prepopulated_or_not() {	
		WebElement dropdown = driver.findElement(Cuttable_Width);
	    Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText;

		    if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the Cuttable width: " + selectedText);
		    } 
		}
	}
	public void Verify_whether_the_Use_field_data_is_prepopulated_or_not() {	
		WebElement dropdown = driver.findElement(Use);
	    Select select = new Select(dropdown);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		if (selectedOptions.size() == 1) {
		    String selectedText = selectedOptions.get(0).getText();
		    String expectedData = selectedText;

		    if (expectedData.equals(selectedText.trim())) {
		        System.out.println("Display the Fabric Use: " + selectedText);
		    } 
		}
	}
	
	
	public void Click_on_the_Add_Pricing_button() throws Throwable {
		utilities.webDriverWait(driver, Add_Pricing);
		driver.findElement(Add_Pricing).click();
		
	}
	public void Select_the_Process() throws Throwable {
		utilities.webDriverWait(driver, Process);
		driver.findElement(Process).click();
	    utilities.MediumWait(driver);
		driver.findElement(Select_Process).click();
		
	}
	public void Enter_the_Price() throws Throwable {
		utilities.webDriverWait(driver, Price);
		driver.findElement(Price).sendKeys("50");
		
	}
	public void Select_the_Fabric_Supplier() throws Throwable {
		utilities.webDriverWait(driver, Fabric_supplier);
		driver.findElement(Fabric_supplier).click();
	    utilities.MediumWait(driver);
		driver.findElement(Select_Supplier).click();
		
	}
	public void Enter_the_Remarks_Field() throws Throwable {
		utilities.webDriverWait(driver, Remarks);
		driver.findElement(Remarks).sendKeys("Price");
		
	}
	public void Click_on_the_delete_icon() throws Throwable {
		utilities.webDriverWait(driver, Delete_button);
		driver.findElement(Delete_button).click();	
		
	}
	public void Enter_the_data_in_Total_Price_Field() throws Throwable {
		utilities.webDriverWait(driver, Total_Price);
		driver.findElement(Total_Price).sendKeys("100");
		
	}
	public void Enter_the_data_in_Total_Fabric_Lead_Time() throws Throwable {
		utilities.webDriverWait(driver, TotalFabric_Leadtime);
		driver.findElement(TotalFabric_Leadtime).sendKeys("120");
		
	}
	public void Enter_the_data_in_Price_Valid_For_Days() throws Throwable {
		utilities.webDriverWait(driver, Price_ValidForDays);
		driver.findElement(Price_ValidForDays).sendKeys("4");
		
	}
	public void Enter_the_data_in_Residual_Shrinkage_field() throws Throwable {
		utilities.webDriverWait(driver, Residual_Shrinkage);
		driver.findElement(Residual_Shrinkage).sendKeys("4");
		
	}
	public void Enter_the_data_in_boing_field() throws Throwable {
		utilities.webDriverWait(driver, Boing);
		driver.findElement(Boing).sendKeys("5");
		
	}
	public void Enter_the_data_in_CS_field() throws Throwable {
		utilities.webDriverWait(driver, CS);
		driver.findElement(CS).sendKeys("8");
		 
	}
	public void Enter_the_data_in_Color_Fastness_field() throws Throwable {
		utilities.webDriverWait(driver, Color_Fastness);
		driver.findElement(Color_Fastness).sendKeys("10");
		
	}
	public void Enter_the_data_in_GSM_Variation() throws Throwable {
		utilities.webDriverWait(driver, GSM_Variation);
		driver.findElement(GSM_Variation).sendKeys("6");
		
	}
	public void Enter_the_data_in_Crinkle_Variation_field() throws Throwable {
		utilities.webDriverWait(driver, Crinkle_Variation);
		driver.findElement(Crinkle_Variation).sendKeys("7");
		
	}
	public void Enter_the_data_in_Any_Other_Remarks_field() throws Throwable {
		utilities.webDriverWait(driver, Any_Other_Remarks);
		driver.findElement(Any_Other_Remarks).sendKeys("Other");
		
	}
	public void CLick_on_the_View_For_Print_button() throws Throwable {
		utilities.webDriverWait(driver, View_For_print);
		driver.findElement(View_For_print).click();
		
	}
	public void Click_on_the_Reset_Button() throws Throwable {
		utilities.webDriverWait(driver, Reset);
		driver.findElement(Reset).click();
		
	}
	public void CLick_on_the_Save_Button() throws Throwable {
		utilities.webDriverWait(driver, save);
		driver.findElement(save).click();
		
	}
	public void Click_on_the_Submit_to_Po_Merchant_Team_button() throws Throwable {
		utilities.webDriverWait(driver, Submit_PoMerchant);
		driver.findElement(Submit_PoMerchant).click();
		
	}
	public void Click_on_the_cancel_Button() throws Throwable {
		utilities.webDriverWait(driver, Cancel_Button);
		driver.findElement(Cancel_Button).click();
		
	}
	public void click_on_the_Print_button() throws Throwable {
		utilities.webDriverWait(driver, Print_Button);
		driver.findElement(Print_Button).click();
		
		
	}
	public void Verify_whether_the_View_for_print_page_is_displaying_or_not() {
		WebElement Data = driver.findElement(ViewPage_Name);
		String Orderdate = Data.getText();
		String expectedData = "Fabric Detail Sheet";
		if (expectedData.equals(Orderdate)) {
			System.out.println("Display View page name is correct." + Orderdate);
		} else {
			System.out.println("Display View page name is incorrect."+ Orderdate);
		}	
	}
	public void Click_on_the_Fabric_name_tab() throws Throwable {
		utilities.webDriverWait(driver, Nom_Fabric);
		driver.findElement(Nom_Fabric).click();
		
	}
	public void Click_on_the_download_icon() throws Throwable {
		utilities.webDriverWait(driver,Download );
		driver.findElement(Download).click();
		
	}
	
	}































