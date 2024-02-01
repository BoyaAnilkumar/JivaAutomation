package Page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class POMasterSheetpage extends DriverFactory{

	Utilities utilities = new Utilities();
	CreatePOforIPO_pages CPOI = new CreatePOforIPO_pages();
	
	By POmasterSheet  										= By.xpath("//a[text()=' PO Master Sheet ']");
	By CardHeader											= By.xpath("//div[@class='card-header']");                             
	By Filterexpansion 										= By.xpath("//a[@id='sidebarCollapse']");
	By Merchant												= By.xpath("//div[text()='Select Merchant']");
	By SelectMerchant										= By.xpath("//input[@role='textbox']");
	By clickoncheckbox										= By.xpath("//div[@class='p-checkbox-box']");
	By Buyer												= By.xpath("//div[text()='Select Buyer']");
	By selectBuyer											= By.xpath("//input[@role='textbox']");
	By Supplier 											= By.xpath("//div[text()='Select Supplier']");
	By selectSupplier										= By.xpath("//input[@role='textbox']");
	By FabricQuality										= By.xpath("//div[text()='Select Fabric']");
	By selectFabricQuality									= By.xpath("//input[@role='textbox']");
	By Month												= By.xpath("//div[text()='Select Month']");
	By selectMonth											= By.xpath("//input[@role='textbox']");
	By SearchByIPO											= By.xpath("//div[text()='Select IPO']");
	By SelectIPO											= By.xpath("//input[@role='textbox']");
	
	By Applybutton											= By.xpath("//button[@class='btn btn-md btn-primary']");
	By Resetbutton											= By.xpath("//button[@class='btn btn-md btn-light btn-active-light-primary mr-2']");
	By Pagination											= By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	
	By Searchkeyword										= By.xpath("//input[@placeholder='Search PO#']");
	By generatepo											= By.xpath("(//a[@title='Generate PO'])[1]");
	By ipo_grid												= By.xpath("(//td[text()=' Boult IPO 1 '])[1]");
	
	
	
	
	
	
	
	
	
	
	public void click_on_PO_Master_Sheet() throws Throwable {
		utilities.webDriverWait(driver, POmasterSheet);
		driver.findElement(POmasterSheet).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void click_on_filter_expansion() throws Throwable {
		utilities.webDriverWait(driver, Filterexpansion);
		driver.findElement(Filterexpansion).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_merchant_dropdown_to_select_the_merchant() throws Throwable {
		utilities.webDriverWait(driver, Merchant);
		driver.findElement(Merchant).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectMerchant);
		driver.findElement(SelectMerchant).sendKeys("lavanya");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CardHeader);
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  //To scroll the page
		js.executeScript("scrollBy(0, 500)");
		
		utilities.webDriverWait(driver, Pagination);
		WebElement Before = driver.findElement(Pagination);
		String NumberofRecords = Before.getText();
		System.out.println("Displaying no of records before applying the filter:   " +  NumberofRecords);
		System.out.println();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Applybutton);
		driver.findElement(Applybutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Pagination);
		WebElement After = driver.findElement(Pagination);
		String NumberofRecords1 = After.getText();
		System.out.println("Displaying no of records after applying the filter:   " +  NumberofRecords1);
		System.out.println();
		utilities.MinimumWait(driver);

            System.out.println("Records displaying as per the merchant selection: " + NumberofRecords1);
            System.out.println();
            
            System.out.println("Total No of Records:  " + NumberofRecords);
            System.out.println();
            
        utilities.MinimumWait(driver);
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;  //To Scroll the page
		js1.executeScript("scrollBy(0, -500)");
		
		utilities.webDriverWait(driver, Resetbutton);
		driver.findElement(Resetbutton).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_buyer_dropdown_to_select_the_buyer() throws Throwable {
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectBuyer);
		driver.findElement(selectBuyer).sendKeys("Amazon");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CardHeader);
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  //To scroll the page
		js.executeScript("scrollBy(0, 500)");
		
		utilities.webDriverWait(driver, Pagination);
		WebElement Before = driver.findElement(Pagination);
		String NumberofRecords = Before.getText();
		System.out.println("Displaying no of records before applying the filter:   " +  NumberofRecords);
		System.out.println();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Applybutton);
		driver.findElement(Applybutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Pagination);
		WebElement After = driver.findElement(Pagination);
		String NumberofRecords1 = After.getText();
		System.out.println("Displaying no of records after applying the filter:   " +  NumberofRecords1);
		System.out.println();
		utilities.MinimumWait(driver);

            System.out.println("Records displaying as per the Buyer selection: " + NumberofRecords1);
            System.out.println();
            
            System.out.println("Total No of Records: " + NumberofRecords);
            System.out.println();
            
        utilities.MinimumWait(driver);
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;  //To Scroll the page
		js1.executeScript("scrollBy(0, -500)");
		
		utilities.webDriverWait(driver, Resetbutton);
		driver.findElement(Resetbutton).click();
		utilities.MinimumWait(driver);

		
	}

	public void click_on_supplier_dropdown_to_select_the_supplier() throws Throwable {
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectSupplier);
		driver.findElement(selectSupplier).sendKeys("Soujanya");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		
		utilities.webDriverWait(driver, Pagination);
		WebElement Before = driver.findElement(Pagination);
		String NumberofRecords = Before.getText();
				System.out.println("Displaying no of records before applying the filter:   " +  NumberofRecords);
				System.out.println();
				utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Applybutton); 
		driver.findElement(Applybutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Pagination);
		WebElement After = driver.findElement(Pagination);
		String NumberofRecords1 = After.getText();
		System.out.println("Displaying no of records after applying the filter:   " +  NumberofRecords1);
		System.out.println();
		utilities.MinimumWait(driver);

            System.out.println("Records displaying as per the supplier selection: " + NumberofRecords1);
            System.out.println();
            
            System.out.println("Total No of Records: " + NumberofRecords);
            System.out.println();
            utilities.MinimumWait(driver);
        
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;  //To Scroll the page
		js1.executeScript("scrollBy(0, -500)");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Resetbutton);
		driver.findElement(Resetbutton).click();
		utilities.MinimumWait(driver);


		
	}

	public void click_on_Fabric_Quality_dropdown_to_select_the_Fabric() throws Throwable {
		utilities.webDriverWait(driver, FabricQuality);
		driver.findElement(FabricQuality).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectFabricQuality);
		driver.findElement(selectFabricQuality).sendKeys("denim");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		
		utilities.webDriverWait(driver, Pagination);
		WebElement Before = driver.findElement(Pagination);
		String NumberofRecords = Before.getText();
				System.out.println("Displaying no of records before applying the filter:   " +  NumberofRecords);
				System.out.println();
				utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Applybutton); 
		driver.findElement(Applybutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Pagination);
		WebElement After = driver.findElement(Pagination);
		String NumberofRecords1 = After.getText();
		System.out.println("Displaying no of records after applying the filter:   " +  NumberofRecords1);
		System.out.println();
		utilities.MinimumWait(driver);

            System.out.println("Displaying records as per the fabric selection: " + NumberofRecords1);
            System.out.println();
            
            System.out.println("Total No of Records: " + NumberofRecords);
            System.out.println();
            utilities.MinimumWait(driver);
        
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;  //To Scroll the page
		js1.executeScript("scrollBy(0, -500)");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Resetbutton);
		driver.findElement(Resetbutton).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_Month_dropdown_to_select_the_month() throws Throwable {
		
		utilities.webDriverWait(driver, Month);
		driver.findElement(Month).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectMonth);
		driver.findElement(selectMonth).sendKeys("Oct");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		
		utilities.webDriverWait(driver, Pagination);
		WebElement Before = driver.findElement(Pagination);
		String NumberofRecords = Before.getText();
				System.out.println("Displaying no of records before applying the filter:   " +  NumberofRecords);
				System.out.println();
				utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Applybutton); 
		driver.findElement(Applybutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Pagination);
		WebElement After = driver.findElement(Pagination);
		String NumberofRecords1 = After.getText();
		System.out.println("Displaying no of records after applying the filter:   " +  NumberofRecords1);
		System.out.println();
		utilities.MinimumWait(driver);

            System.out.println("Displaying Records as per the Month selection: " + NumberofRecords1);
            System.out.println();
            
            System.out.println("Total No of Records: " + NumberofRecords);
            System.out.println();
            utilities.MinimumWait(driver);
        
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;  //To Scroll the page
		js1.executeScript("scrollBy(0, -500)");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Resetbutton);
		driver.findElement(Resetbutton).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_Search_By_IPO_dropdown_to_select_the_IPO() throws Throwable {
		utilities.webDriverWait(driver, SearchByIPO);
		driver.findElement(SearchByIPO).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectIPO);
		driver.findElement(SelectIPO).sendKeys("Boult");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		
		utilities.webDriverWait(driver, Pagination);
		WebElement Before = driver.findElement(Pagination);
		String NumberofRecords = Before.getText();
				System.out.println("Displaying no of records before applying the filter:   " +  NumberofRecords);
				System.out.println();
				utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Applybutton); 
		driver.findElement(Applybutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Pagination);
		WebElement After = driver.findElement(Pagination);
		String NumberofRecords1 = After.getText();
		System.out.println("Displaying no of records after applying the filter:   " +  NumberofRecords1);
		System.out.println();
		utilities.MinimumWait(driver);

            System.out.println("Displaying Records as per the Month selection: " + NumberofRecords1);
            System.out.println();
            
            System.out.println("Total No of Records: " + NumberofRecords);
            System.out.println();
            utilities.MinimumWait(driver);
        
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;  //To Scroll the page
		js1.executeScript("scrollBy(0, -500)");
		utilities.MinimumWait(driver);
		
	}

	public void click_on_Reset_and_Apply_button() throws Throwable {
		
		utilities.webDriverWait(driver, Pagination);
		WebElement Before = driver.findElement(Pagination);
		String NumberofRecords = Before.getText();
				System.out.println("Displaying no of records before applying the filter:   " +  NumberofRecords);
				System.out.println();
				utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Applybutton); 
		driver.findElement(Applybutton).click();
		utilities.MinimumWait(driver);
		
		
		utilities.webDriverWait(driver, Pagination);
		WebElement After = driver.findElement(Pagination);
		String NumberofRecords1 = After.getText();
		System.out.println("Displaying no of records after applying the filter:   " +  NumberofRecords1);
		System.out.println();
		utilities.MinimumWait(driver);

            System.out.println("Displaying Records as per the Month selection: " + NumberofRecords1);
            System.out.println();
            
            System.out.println("Total No of Records: " + NumberofRecords);
            System.out.println();
            utilities.MinimumWait(driver);
        
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;  //To Scroll the page
		js1.executeScript("scrollBy(0, -500)");
		utilities.MinimumWait(driver);
		
	}

	public void Select_all_the_Fields_in_the_filter_and_apply_filters() throws Throwable {
		
		utilities.webDriverWait(driver, Merchant);
		driver.findElement(Merchant).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectMerchant);
		driver.findElement(SelectMerchant).sendKeys("lavanya");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CardHeader);
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectBuyer);
		driver.findElement(selectBuyer).sendKeys("Amazon");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CardHeader);
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectSupplier);
		driver.findElement(selectSupplier).sendKeys("Soujanya");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, FabricQuality);
		driver.findElement(FabricQuality).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectFabricQuality);
		driver.findElement(selectFabricQuality).sendKeys("denim");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Month);
		driver.findElement(Month).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, selectMonth);
		driver.findElement(selectMonth).sendKeys("Oct");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SearchByIPO);
		driver.findElement(SearchByIPO).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, SelectIPO);
		driver.findElement(SelectIPO).sendKeys("Boult");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, clickoncheckbox);
		driver.findElement(clickoncheckbox).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(CardHeader).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Pagination);
		WebElement Before = driver.findElement(Pagination);
		String NumberofRecords = Before.getText();
				System.out.println("Displaying no of records before applying the filter:   " +  NumberofRecords);
				System.out.println();
				utilities.MinimumWait(driver);
				
		driver.findElement(Applybutton).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Pagination);
		WebElement After = driver.findElement(Pagination);
		String NumberofRecords1 = After.getText();
		System.out.println("Displaying no of records after applying the filter:   " +  NumberofRecords1);
		System.out.println();
		utilities.MinimumWait(driver);

            System.out.println("Displaying Records as per the Month selection: " + NumberofRecords1);
            System.out.println();
            
            System.out.println("Total No of Records: " + NumberofRecords);
            System.out.println();
            utilities.MinimumWait(driver);
        
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;  //To Scroll the page
		js1.executeScript("scrollBy(0, -500)");
		utilities.MinimumWait(driver);
		
		
	}

	public void Search_with_IPO_in_search_keyword_textbox() throws Throwable {
		utilities.webDriverWait(driver, Searchkeyword);
		driver.findElement(Searchkeyword).sendKeys("Boult IPO 1");
		
		WebElement iponame = driver.findElement(Searchkeyword);
		String ExpectedIPO = iponame.getAttribute("value");
		System.out.println("Displaying the ipo name:  " + ExpectedIPO);
		utilities.MinimumWait(driver);
		
		WebElement IPOname = driver.findElement(ipo_grid);
		String Actualipo = IPOname.getText();
		if(ExpectedIPO.equals(Actualipo)) {
			System.out.println("Displaying the same ipo which is searched with keyword");
		}else {
			System.out.println("Not Displaying the ipo which is searched with keyword");
		}
	}	

	public void click_on_generate_po_icon() throws Throwable {
		utilities.webDriverWait(driver, generatepo);
		driver.findElement(generatepo).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CPOI.screenname);
		driver.findElement(CPOI.screenname).click();
		utilities.MinimumWait(driver);
	}


	public void Verify_the_PO_details_are_displaying() throws Throwable {
		utilities.webDriverWait(driver, CPOI.TypeofOrder);
		
		WebElement dropdownElement = driver.findElement(CPOI.TypeofOrder);
        Select dropdown = new Select(dropdownElement);
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        String defaultSelectedValue = selectedOption.getText();
        System.out.println("Displaying PO Type Order as:  " +  defaultSelectedValue);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CPOI.POdate);
		WebElement date = driver.findElement(CPOI.POdate);
		String podate = date.getAttribute("value");
		System.out.println("Displaying PO Date as:  "  +  podate);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CPOI.POnumber);
		WebElement number = driver.findElement(CPOI.POnumber);
		String ponumber = number.getAttribute("value");
		System.out.println("Displaying PO Number as:  "  +  ponumber);
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_Fabric_Details_are_prepopulating_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, CPOI.FabricDetails);
		driver.findElement(CPOI.FabricDetails).click();
		WebElement FDetails = driver.findElement(CPOI.FabricDetails);
		String FabDetails = FDetails.getText();
		System.out.println("Displaying the section of:   "  +  FabDetails);
		utilities.MinimumWait(driver);
		
		WebElement dropdownElement = driver.findElement(CPOI.FabricType);
        Select dropdown = new Select(dropdownElement);
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        String defaultSelectedValue = selectedOption.getText();
        System.out.println("Displaying Fabric Type Order as:  " +  defaultSelectedValue);
		utilities.MinimumWait(driver);
		
		WebElement dropdownElement1 = driver.findElement(CPOI.FabricName);
        Select dropdown1 = new Select(dropdownElement1);
        WebElement selectedOption1 = dropdown1.getFirstSelectedOption();
        String defaultSelectedValue1 = selectedOption1.getText();
        System.out.println("Displaying Fabric Name as:  " +  defaultSelectedValue1);
		utilities.MinimumWait(driver);
		
		WebElement dropdownElement2 = driver.findElement(CPOI.Content);
        Select dropdown2 = new Select(dropdownElement2);
        WebElement selectedOption2 = dropdown2.getFirstSelectedOption();
        String defaultSelectedValue2 = selectedOption2.getText();
        System.out.println("Displaying Fabric Type Order as:  " +  defaultSelectedValue2);
		utilities.MinimumWait(driver);
		
		
		WebElement dropdownElement3 = driver.findElement(CPOI.CountandConstruction);
        Select dropdown3 = new Select(dropdownElement3);
        WebElement selectedOption3 = dropdown3.getFirstSelectedOption();
        String defaultSelectedValue3 = selectedOption3.getText();
        System.out.println("Displaying Fabric Type Order as:  " +  defaultSelectedValue3);
		utilities.MinimumWait(driver);
		
		
		
	}

	public void verify_the_Quantity_Details_are_displaying_or_not() {
		
		
	}

	public void verify_the_IPO_Details_are_prepopulating_or_not() {
		
		
	}

	public void click_on_Add_IPO_button_whether_button_is_working_or_not() {
		
		
	}

	public void Delete_the_record_in_IPO_table() {
		
		
	}

	public void Click_on_save_button_to_generate_po() {
		// TODO Auto-generated method stub
		
	}

	public void verify_whether_the_user_is_navigated_to_Print_form() {
		// TODO Auto-generated method stub
		
	}

	public void Click_on_cancel_to_navigate_back_to_po_master_sheet_screen() {
		// TODO Auto-generated method stub
		
	}

}
