package Page;

import static org.junit.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SW_POMasterSheet_Pages extends DriverFactory{
	Utilities utilities = new Utilities();
	
	By Search_Keyword			    = By.xpath("//input[@placeholder='Search PO#']");
	By DeliverTo					= By.xpath("//input[@placeholder='Search By Deliver To']");
	By Payment_Terms				= By.xpath("//input[@formcontrolname='paymentTerms']");
	By Process						= By.xpath("//select[@formcontrolname='processTypeId']");
	By Yarn_Name					= By.xpath("//ng-select[@formcontrolname='yarnName']");
	By Content						= By.xpath("//select[@formcontrolname='content']");
	By Count						= By.xpath("//select[@formcontrolname='countOfConstruction']");
	By Color						= By.xpath("//ng-select[@formcontrolname='poColorId']");
	By UOM							= By.xpath("//select[@formcontrolname='uomId']");
	By Supplier						= By.xpath("//input[@placeholder='Search By Supplier']");
	By Revised_PO					= By.xpath("//a[@title='Revise PO']");
	By Pagetitle					= By.xpath("//h3[text()='Revised PO For Yarn']");
	By Searchkeyword				= By.xpath("//input[@placeholder='Search PO#']");
	By RevisedPO_Form				= By.xpath("//div[@class='main_content_iner overly_inner']");
	By QtyAllowed					= By.xpath("//input[@formcontrolname='qtyAllowd']");
	By Rate							= By.xpath("//input[@formcontrolname='totalqtyRate']");
	By LShortIfAny					= By.xpath("//textarea[@formcontrolname='laddtionalInfo']");
	By Addinfor1					= By.xpath("//textarea[@formcontrolname='addtionalInfo1']");
	By Addinfor2					= By.xpath("//textarea[@formcontrolname='addtionalInfo2']");
	By Total_Amount					= By.xpath("(//td[@class='text-right font-weight-bold'])[2]");
	By Savebutton					= By.xpath("//button[@type='submit']");
	By Printscreen					= By.xpath("//img[@alt='Logo Icon']");
	By cancelbutton					= By.xpath("//button[@id='closepagebutton']");
	By Print_PO						= By.xpath("//a[@title='Print PO']");
	By Print_PO_Form				= By.xpath("//div[@class='main_content_iner overly_inner']");
	By Cancel_Icon					= By.xpath("//a[@title='Cancel']");
	By Cancel_Confirmation			= By.xpath("//h2[text()='Are you sure you want to mark the PO ( J-1 ) as Cancelled']");
	By Cancel_Yes					= By.xpath("//button[text()='Yes']");
	By Cancel_No					= By.xpath("//button[text()='No'][2]");
	By Cancel_Button				= By.xpath("//button[text()=' Cancel']");
	By Filter_Expansion				= By.xpath("//a[@id='sidebarCollapse']");
	By Filter_Header				= By.xpath("//div[@class='card-header']");
	By Merchant_Dropdown			= By.xpath("//div[text()='Select Merchant']");
	By Merchant_Sendkeys			= By.xpath("//input[@role='textbox']");
	By Merchant_Checkbox			= By.xpath("//div[@class='p-checkbox-box']");
	By Buyer_Dropdown				= By.xpath("//div[text()='Select Buyer']");
	By Buyer_Sendkeys				= By.xpath("//input[@role='textbox']");
	By Buyer_Checkbox				= By.xpath("//div[@class='p-checkbox-box']");
	
	By Buyer_field                 = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[2]");
    By Textfield                   = By.xpath("//input[@role='textbox']");
    By check_Box                   = By.xpath("//div[@role='checkbox']");
    By Supplier_field              = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[3]");
    By Yarn_Quality_field          = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[4]");
    By Month_field                 = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[5]");
    By Search_By_IPO               = By.xpath("(//div[contains(@class,'p-element p-multiselect-label-container')]//div)[6]");

    By SortingByColumns			   = By.xpath("//thead");
	
	

	public void Search_with_IPO_in_search_keyword_textbox(String ipo) throws Throwable {
		utilities.webDriverWait(driver, Search_Keyword);
		driver.findElement(Search_Keyword).click();
		Thread.sleep(1000);
		driver.findElement(Search_Keyword).sendKeys(ipo);
		Thread.sleep(1000);
		
		
	}


	public void Enter_Deliver_To_details_and_select_from_the_suggestions(String deliverTo) throws Throwable {
		utilities.webDriverWait(driver, DeliverTo);
		driver.findElement(DeliverTo).click();
		Thread.sleep(1000);
		driver.findElement(DeliverTo).sendKeys(deliverTo);
		utilities.MinimumWait(driver);
		Robot d = new Robot();
		d.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		d.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}


	public void verify_the_payment_terms_by_selecting_the_supplier() throws Throwable {
		utilities.webDriverWait(driver, Payment_Terms);
		String paymentTerms = driver.findElement(Payment_Terms).getAttribute("value");
		System.out.println(paymentTerms);
		
	}


	public void verify_the_Yarn_Details_are_prepopulating_or_not() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;   //To scroll the page
		js.executeScript("scrollBy(0, 500)");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Process);
		WebElement process = driver.findElement(Process);
		String processname = process.getAttribute("value");
		System.out.println("Selected the " + processname + "process");
		
		utilities.webDriverWait(driver, Yarn_Name);
		WebElement Yarn = driver.findElement(Yarn_Name);
		String yarnName = Yarn.getAttribute("value");
		System.out.println("Selected the " + yarnName + "Yarn");
		
		utilities.webDriverWait(driver, Content);
		WebElement cont = driver.findElement(Content);
		String Content_Cont = cont.getAttribute("value");
		System.out.println("Selected the " + Content_Cont );
		
		utilities.webDriverWait(driver, Count);
		WebElement count = driver.findElement(Count);
		String count_count = count.getAttribute("value");
		System.out.println("Selected the " +count_count);
		
		utilities.webDriverWait(driver, Color);
		WebElement color = driver.findElement(Color);
		String colour = color.getText();
		System.out.println("Displayed the " +colour+ "color");
		
	}


	public void Enter_supplier_name_and_select_from_the_suggestions(String supplier) throws Throwable {
		utilities.webDriverWait(driver, Supplier);
		driver.findElement(Supplier).click();
		Thread.sleep(1000);
		driver.findElement(Supplier).sendKeys(supplier);
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		WebElement SW_Supplier = driver.findElement(Supplier);
		String sweater_supplier = SW_Supplier.getAttribute("value");
		System.out.println("Displaying the selected supplier: " + sweater_supplier);
		
	}


	public void Search_with_PO_in_search_keyword_textbox(String po) throws Throwable {
		utilities.webDriverWait(driver, Searchkeyword );
		driver.findElement(Searchkeyword).click();
		Thread.sleep(1000);
		driver.findElement(Searchkeyword).sendKeys(po);
		utilities.MinimumWait(driver);
		
		
	}


	public void click_on_Revised_Po_icon() throws Throwable {
		utilities.webDriverWait(driver, Revised_PO);
		driver.findElement(Revised_PO).click();
		Thread.sleep(1000);
		String actualString = driver.findElement(By.xpath("//h3[text()='Revised PO For Yarn']")).getText();

		String expectedString = "Revised PO For Yarn";

		assertTrue(actualString.contains(expectedString));
		
	}


	public void Print_view_Revised_PO_for_IPO_details() throws Throwable {
//		utilities.webDriverWait(driver, RevisedPO_Form);
//		WebElement FormData = driver.findElement(RevisedPO_Form);
//		String POformdata = FormData.getAttribute("");
//		System.out.println(POformdata);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, -700)");
		utilities.webDriverWait(driver, Printscreen);
		driver.findElement(Printscreen).click();
		WebElement icon = driver.findElement(Printscreen);
		File image = icon.getScreenshotAs(OutputType.FILE);
		System.out.println("navigated to Print view form");
		utilities.MinimumWait(driver);
		
	
		js.executeScript("scrollBy(0, 700)");
		utilities.webDriverWait(driver, cancelbutton);
		driver.findElement(cancelbutton).click();
		System.out.println("Clicked on Cancel button");
		utilities.MinimumWait(driver);
		
		
	}


	public void user_update_the_revised_po_for_ipo(String qtyallowed2, String rate) throws Throwable {
		utilities.webDriverWait(driver, QtyAllowed);
		driver.findElement(QtyAllowed).click();
		Thread.sleep(1000);
		driver.findElement(QtyAllowed).clear();
		Thread.sleep(1000);
		driver.findElement(QtyAllowed).sendKeys(qtyallowed2);
		WebElement QtyAA = driver.findElement(QtyAllowed);
		String QtyA = QtyAA.getAttribute(qtyallowed2);
		System.out.println("Displaying the Qty Allowed value " + QtyA);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Rate);
		driver.findElement(Rate).click();
		Thread.sleep(1000);
		driver.findElement(Rate).clear();
		Thread.sleep(1000);
		driver.findElement(Rate).sendKeys(rate);
		WebElement RatePO = driver.findElement(Rate);
		String PO_Rate = RatePO.getAttribute(rate);
		System.out.println("Displaying the PO Rate: " + PO_Rate);
		utilities.MinimumWait(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
		utilities.webDriverWait(driver, LShortIfAny);
		driver.findElement(LShortIfAny).click();
		driver.findElement(LShortIfAny).clear();
		Thread.sleep(1000);
		driver.findElement(LShortIfAny).sendKeys("Update rate");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Addinfor1);
		driver.findElement(Addinfor1).click();
		driver.findElement(Addinfor1).clear();
		Thread.sleep(1000);
		driver.findElement(Addinfor1).sendKeys("Update qty");
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Addinfor2);
		driver.findElement(Addinfor2).click();
		driver.findElement(Addinfor2).clear();
		Thread.sleep(1000);
		driver.findElement(Addinfor2).sendKeys("Updated rate and qty");
		utilities.MinimumWait(driver);
		
	
		js.executeScript("window.scrollBy(0,250)");
		
		utilities.webDriverWait(driver, Total_Amount);
		driver.findElement(Total_Amount).click();
		Thread.sleep(2000);
		WebElement TotalAmount = driver.findElement(Total_Amount);
		String TAmount = TotalAmount.getText();
		System.out.println("Displaying the Total Amount with new rate: " + TAmount);
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Savebutton);
		driver.findElement(Savebutton).click();
		utilities.MinimumWait(driver);
		
		
	}


	public void Click_on_Print_icon_for_the_po() throws Throwable {
		 utilities.webDriverWait(driver, Print_PO);
		 driver.findElement(Print_PO).click();
		 utilities.MinimumWait(driver);
		 
		 utilities.webDriverWait(driver, Print_PO_Form);
		 WebElement Print_form_Data = driver.findElement(Print_PO_Form);
		 String Printdata = Print_form_Data.getText();
		 
	       String[] rows = Printdata.split("\n");
				for (String row : rows) {
			     System.out.println(row);
			        System.out.println();
			        
			    }
//		 System.out.println("Displaying the Print form data: " + Printdata);
//		 utilities.MinimumWait(driver);
	}


	public void Click_on_Cancel_icon_in_grid() throws Throwable {
		utilities.webDriverWait(driver, Cancel_Icon);
		Boolean ispresent = driver.findElements(Cancel_Icon).size()>0;
		if(ispresent) {
			driver.findElement(Cancel_Icon).click();
			System.out.println("Clicked on cancel icon");
		}else {
			driver.findElement(Revised_PO).click();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,550)");
			utilities.MinimumWait(driver);
			driver.findElement(Cancel_Button).click();
			System.out.println("Clicked on Cancel button ");
		}
	}


	public void user_clicks_on_filter_expansion() throws Throwable {
		utilities.webDriverWait(driver, Filter_Expansion);
		driver.findElement(Filter_Expansion).click();
		utilities.MinimumWait(driver);
		
	}


	public void Click_on_Merchant_dropdown_field_and_select_merchant(String merchant , String buyer) throws Throwable {
		utilities.webDriverWait(driver, Merchant_Dropdown);
		driver.findElement(Merchant_Dropdown).click();
		Thread.sleep(1000);
		driver.findElement(Merchant_Sendkeys).sendKeys(merchant);
		utilities.MinimumWait(driver);
		driver.findElement(Merchant_Checkbox).click();
		Thread.sleep(1000);
		driver.findElement(Filter_Header).click();
		utilities.MinimumWait(driver);
		
		utilities.webDriverWait(driver, Buyer_Dropdown);
		driver.findElement(Buyer_Dropdown).click();
		Thread.sleep(1000);
		driver.findElement(Buyer_Sendkeys).sendKeys(buyer);
		Thread.sleep(1000);
		driver.findElement(Buyer_Checkbox).click();
		Thread.sleep(1000);
		driver.findElement(Filter_Header).click();
		utilities.MinimumWait(driver);
		
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

	public void user_clicks_on_sorting_icon_in_grid_headers() throws Throwable {
		WebElement table = driver.findElement(SortingByColumns);
		List<WebElement> columnheader = table.findElements(By.xpath("thead"));

		for (WebElement header : columnheader) {

			header.click();
			utilities.MinimumWait(driver);
			header.click();
			utilities.MinimumWait(driver);
		}
		
	}


	

	
	

}
