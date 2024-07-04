package Page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverFactory;
import util.Utilities;

public class POMasterSheetpage extends DriverFactory{

	Utilities utilities = new Utilities();
	CreatePOforIPO_pages CPOI = new CreatePOforIPO_pages();
	CreatePOForStockPage CPOS = new CreatePOForStockPage();
	
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
	
	public By Applybutton									= By.xpath("//button[@class='btn btn-md btn-primary']");
	public By Resetbutton									= By.xpath("//button[@class='btn btn-md btn-light btn-active-light-primary mr-2']");
	public By Pagination									= By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
	
	By Searchkeyword										= By.xpath("//input[@placeholder='Search PO#']");
	By generatepo											= By.xpath("(//a[@title='Generate PO'])[1]");
	By ipo_grid												= By.xpath("(//td[text()=' Boult IPO 1 '])[1]");
	By FabricName											= By.xpath("//ng-select[@formcontrolname='fabricName']/.//div[@class='ng-input']");
	By Color												= By.xpath("//ng-select[@formcontrolname='poColorId']/.//input[@type='text']");
	By ProcessLoss											= By.xpath("//input[@formcontrolname='processLoss']");
	By Amount												= By.xpath("//td[@class='text-right']/.//span[@class='ng-star-inserted']");
	By Savebutton											= By.xpath("//button[@type='submit']");
	By Printscreen											= By.xpath("//img[@alt='Logo Icon']");
	By cancelbutton											= By.xpath("//button[@id='closepagebutton']");
	By Fabricprocessgrid									= By.xpath("//div[text()=' Fabric Process ']");
	By Fabricprocessfiltericon								= By.xpath("(//button[@type='button']//span)[4]");
	By Filterinput											= By.xpath("//input[@class='p-inputtext p-component p-element ng-star-inserted']");
	By FilterApply											= By.xpath("//span[text()='Apply']");
	By RevisePO												= By.xpath("//a[@class='btn btn-sm btn-warning ng-star-inserted']");
	By processname											= By.xpath("//td[text()='Printing']");
	By Revisedscreenname									= By.xpath("//h3[text()='revised PO for Fabric']");
	By Suppliercode											= By.xpath("//input[@formcontrolname='supplierCode']");
	By IPOdropdown											= By.xpath("//div[@class='p-datatable-wrapper']//table[1]");
	By SupplierName											= By.xpath("//p-autocomplete[@field='supplierName']//span[1]");
	By UOM													= By.xpath("//select[@formcontrolname='uomId']");
	By ScreenName											= By.xpath("//h3[text()='PO Master Sheet']");
	
	
	
	
	
	
	
	
	
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
		
		JavascriptExecutor js = (JavascriptExecutor) driver;   //To scroll the page
		js.executeScript("scrollBy(0, 500)");
		utilities.MinimumWait(driver);
		
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
		
		WebElement dropdownElement1 = driver.findElement(FabricName);
//        Select dropdown1 = new Select(dropdownElement1);
//        WebElement selectedOption1 = dropdown1.getFirstSelectedOption();
//        String defaultSelectedValue1 = selectedOption1.getText();
//        System.out.println("Displaying Fabric Name as:  " +  defaultSelectedValue1);
		driver.findElement(FabricName).click();
		WebElement fabricname = driver.findElement(FabricName);
		String fabric = fabricname.getText();
		System.out.println("Displaying the Fabric Name: "  +  fabric);
		utilities.MinimumWait(driver);
		
		WebElement dropdownElement2 = driver.findElement(CPOI.Content);
        Select dropdown2 = new Select(dropdownElement2);
        WebElement selectedOption2 = dropdown2.getFirstSelectedOption();
        String defaultSelectedValue2 = selectedOption2.getText();
        System.out.println("Displaying Content as:  " +  defaultSelectedValue2);
		utilities.MinimumWait(driver);
		
		
		WebElement dropdownElement3 = driver.findElement(CPOI.CountandConstruction);
        Select dropdown3 = new Select(dropdownElement3);
        WebElement selectedOption3 = dropdown3.getFirstSelectedOption();
        String defaultSelectedValue3 = selectedOption3.getText();
        System.out.println("Displaying Count and Construction as:  " +  defaultSelectedValue3);
		utilities.MinimumWait(driver);
		
		WebElement dropdownElement4 = driver.findElement(CPOI.GSM);
        Select dropdown4 = new Select(dropdownElement4);
        WebElement selectedOption4 = dropdown4.getFirstSelectedOption();
        String defaultSelectedValue4 = selectedOption4.getText();
        System.out.println("Displaying GSM as:  " +  defaultSelectedValue4);
		utilities.MinimumWait(driver);
		
		WebElement dropdownElement5 = driver.findElement(CPOI.cuttablewidth);
        Select dropdown5 = new Select(dropdownElement5);
        WebElement selectedOption5 = dropdown5.getFirstSelectedOption();
        String defaultSelectedValue5 = selectedOption5.getText();
        System.out.println("Displaying cuttablewidth as:  " +  defaultSelectedValue5);
		utilities.MinimumWait(driver);
		
//		WebElement dropdownElement6 = driver.findElement(CPOI.Color);
//        Select dropdown6 = new Select(dropdownElement6);
//        WebElement selectedOption6 = dropdown6.getFirstSelectedOption();
//        String defaultSelectedValue6 = selectedOption6.getText();
//        System.out.println("Displaying Color as:  " +  defaultSelectedValue6);
		
		utilities.webDriverWait(driver, Color);
		driver.findElement(Color).click();
		WebElement defaultcolor = driver.findElement(Color);
		String color = defaultcolor.getAttribute("value");
		System.out.println("Displaying the default color:  " + color);
		utilities.MinimumWait(driver);
				
		
		
	}

	public void verify_the_Quantity_Details_are_displaying_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, CPOI.QtyRequired);
		WebElement QuantyRequired = driver.findElement(CPOI.QtyRequired);
		String quantity = QuantyRequired.getAttribute("value");
		System.out.println("Displaying Quantity Required:  "  +  quantity);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CPOI.QtyAvailableINStock);
		WebElement Stock = driver.findElement(CPOI.QtyAvailableINStock);
		String Stockqty = Stock.getAttribute("value");
		System.out.println("Displaying quatity available in stock as:  " + Stockqty);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CPOI.Residualshrinkage);
		WebElement Residual = driver.findElement(CPOI.Residualshrinkage);
		String residualshrinkage = Residual.getAttribute("value");
		System.out.println("Displaying Residual Shrikange as:  " + residualshrinkage);
		utilities.MinimumWait(driver);
		
		try {
		utilities.webDriverWait(driver, ProcessLoss);
		WebElement process = driver.findElement(ProcessLoss);
		String processloss = process.getAttribute("value");
		System.out.println("Displaying Process Loss:  " + processloss);
		utilities.MinimumWait(driver);
		}
		catch(Exception nosuchelement){
		utilities.webDriverWait(driver, CPOI.QtyAllowed);
		WebElement Qtyallowed = driver.findElement(CPOI.QtyAllowed);
		String Qty = Qtyallowed.getAttribute("value");
		System.out.println("Displaying the Qyt Allowed default value:  " + Qty);
		driver.findElement(CPOI.QtyAllowed).click();
		utilities.MinimumWait(driver);
		driver.findElement(CPOI.QtyAllowed).clear();
		utilities.MinimumWait(driver);
		driver.findElement(CPOI.QtyAllowed).sendKeys("5");
		WebElement Quantity = driver.findElement(CPOI.QtyAllowed);
		String QuantityAllowed = Quantity.getAttribute("value");
		System.out.println("Displaying the Qty Allowed:  " + QuantityAllowed);
		utilities.MinimumWait(driver);
		}
		utilities.webDriverWait(driver,CPOI.Currency);
		WebElement Curr = driver.findElement(CPOI.Currency);
		String currency = Curr.getText();
//		System.out.println("By default the Currency displayed in the field is - "+currency);
		utilities.MaximumLongWait(driver);
		
        WebElement dropdownElement = driver.findElement(CPOI.Currency);
        Select dropdown = new Select(dropdownElement);

        WebElement selectedOption = dropdown.getFirstSelectedOption();
        String defaultSelectedValue = selectedOption.getText();

		System.out.println("By default the Currency displayed in the field is - "+ defaultSelectedValue);
		utilities.MinimumWait(driver);
				
		utilities.webDriverWait(driver, CPOI.Rate);
		driver.findElement(CPOI.Rate).click();
		Thread.sleep(1000);
		driver.findElement(CPOI.Rate).clear();
		Thread.sleep(1000);
		driver.findElement(CPOI.Rate).sendKeys("3");
		utilities.MinimumWait(driver);
		
		Boolean ispresent = driver.findElements(CPOI.UOM).size()>0;
		if(ispresent) {
		utilities.webDriverWait(driver, CPOI.UOM);
		WebElement UOM = driver.findElement(CPOI.UOM);
		String AtUOM = UOM.getText();
		System.out.println("displaying the uom default:  " + AtUOM);
		utilities.MinimumWait(driver);
		}
		else {
			utilities.webDriverWait(driver, UOM);
			WebElement SW_UOM = driver.findElement(UOM);
			String AtUOM = SW_UOM.getAttribute("value");
			System.out.println("displaying the uom default:  " + AtUOM);
			utilities.MinimumWait(driver);
		}
		utilities.webDriverWait(driver, CPOI.LShortIfAny);
		driver.findElement(CPOI.LShortIfAny).sendKeys("When verify the Quantity Details are displaying or not, And click on Add IPO button whether button is working or not");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CPOI.Addinfor1);
		driver.findElement(CPOI.Addinfor1).sendKeys("When verify the Quantity Details are displaying or not, And click on Add IPO button whether button is working or not");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CPOI.Addinfor2);
		driver.findElement(CPOI.Addinfor2).sendKeys("When verify the Quantity Details are displaying or not, And click on Add IPO button whether button is working or not");
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_IPO_Details_are_prepopulating_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, CPOI.IPOdropdown);
		WebElement IPO = driver.findElement(CPOI.IPOdropdown);
		String Iponame = IPO.getText();
		System.out.println("Print Displaying IPO:  " + Iponame);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Amount);
		driver.findElement(Amount).click();
		WebElement amount = driver.findElement(Amount);
		String amountwithrate = amount.getAttribute("value");
		System.out.println("Print amount: " + amountwithrate);
		utilities.MinimumWait(driver);

	}

	public void click_on_Add_IPO_button_whether_button_is_working_or_not() throws Throwable {
		utilities.webDriverWait(driver, CPOI.Addipobutton);
		driver.findElement(CPOI.Addipobutton).click();
		utilities.MinimumWait(driver);
		System.out.println("Clicked on Add IPO button");
		
	}

	public void Delete_the_record_in_IPO_table() throws Throwable {
		utilities.webDriverWait(driver, CPOI.Deletebutton);
		driver.findElement(CPOI.Deletebutton).click();
		utilities.MinimumWait(driver);
		driver.findElement(CPOI.Delepopyes).click();
		utilities.MinimumWait(driver);
		System.out.println("Deleted the recently added");
		
	}

	public void Click_on_save_button_to_generate_po() throws Throwable {
		utilities.webDriverWait(driver, Savebutton);
		driver.findElement(Savebutton).click();
		utilities.MinimumWait(driver);
		
	}

	public void verify_whether_the_user_is_navigated_to_Print_form() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, -700)");
		utilities.webDriverWait(driver, Printscreen);
		driver.findElement(Printscreen).click();
		WebElement icon = driver.findElement(Printscreen);
		File image = icon.getScreenshotAs(OutputType.FILE);
		System.out.println("navigated to Print view form");
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_cancel_to_navigate_back_to_po_master_sheet_screen() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 700)");
		utilities.webDriverWait(driver, cancelbutton);
		driver.findElement(cancelbutton).click();
		System.out.println("Clicked on Cancel button");
		utilities.MinimumWait(driver);
		
	}

	public void click_on_filter_icon_on_grid_and_search_with_the_process_name() throws Throwable {
		utilities.webDriverWait(driver, Fabricprocessgrid);
		driver.findElement(Fabricprocessgrid).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Fabricprocessfiltericon);
		System.out.println("Click on the filter icon");
		driver.findElement(Fabricprocessfiltericon).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Filterinput);
		driver.findElement(Filterinput).click();
		utilities.MinimumWait(driver);
		driver.findElement(Filterinput).sendKeys("Printing");
		utilities.MinimumWait(driver);
		driver.findElement(FilterApply).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_revise_po_icon() throws Throwable {
		//verify the printing process is displaying after applying the filters
		driver.findElement(processname).click();
		WebElement ProcessName = driver.findElement(processname);
		String Process = ProcessName.getText();
		if(Process.equals("Printing")) {
		System.out.println("Displaying the selected process name:  " + Process);
		}else {
		System.out.println("Not Displaying the Selected process");
		}
		
		
		utilities.webDriverWait(driver, RevisePO);
		driver.findElement(RevisePO).click();
		utilities.MinimumWait(driver);

	}

	public void navigated_to_revise_po_screen_and_displaying_the_update_form_or_not() throws Throwable {
		
		utilities.webDriverWait(driver, Revisedscreenname);
		driver.findElement(Revisedscreenname).click();
		WebElement screenname = driver.findElement(Revisedscreenname);
		String Nameofscreen = screenname.getText();
		if(Nameofscreen.equals("revised PO for Fabric")) {
			System.out.println("Displaying the screen name as:  " +  Nameofscreen);
		}else {
			System.out.println("Screen name is not displaying as:  "  + Nameofscreen);
		}
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, CPOI.DeliverTo);
		driver.findElement(CPOI.DeliverTo).click();
		utilities.MinimumWait(driver);
		driver.findElement(CPOI.DeliverTo).clear();
		utilities.MinimumWait(driver);
		driver.findElement(CPOI.DeliverTo).sendKeys("Anie");
		utilities.MinimumWait(driver);
		driver.findElement(CPOI.SelectAnieDeliver).click();
		utilities.MinimumWait(driver);
		System.out.println("Should display deliver to name as: "+ "Anie Textiles");
	
		
		utilities.webDriverWait(driver, SupplierName);
//		driver.findElement(SupplierName).isSelected();
		WebElement supplier = driver.findElement(SupplierName);
		String revisesupplier = supplier.getAttribute("Anil");
		System.out.println("Print the displayed element:  " + revisesupplier);
		utilities.MinimumWait(driver);

		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 500)");
		utilities.webDriverWait(driver, Suppliercode);
		driver.findElement(Suppliercode).click();
		utilities.MinimumWait(driver);
		driver.findElement(Suppliercode).clear();
		utilities.MinimumWait(driver);
		driver.findElement(Suppliercode).sendKeys("AK/SPG");
		utilities.MinimumWait(driver);
		System.out.println("Supplier code is changes as: " + "AK/SPG");
		utilities.MinimumWait(driver);
	        }
	

	public void update_the_data_and_submit_the_revise_po() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 700)");
		
		
		utilities.webDriverWait(driver, IPOdropdown);
		boolean isIPOSelected = driver.findElement(IPOdropdown).isSelected();
		
		WebElement IPO = driver.findElement(IPOdropdown);
		
		if (IPO.isDisplayed()) {
		    String IPOname = IPO.getAttribute("value");
		    System.out.println("Displaying the IPO: " + IPOname);
		} else {
		    System.out.println("IPO element is not displayed");
		}
		// Print whether the element is selected
		System.out.println("Is IPO selected? " + isIPOSelected);
		utilities.MinimumWait(driver);

		
//		utilities.webDriverWait(driver, CPOS.butt_Save);
//		driver.findElement(CPOS.butt_Save).click();
//		utilities.MinimumWait(driver);
		
	}

}
