package Page;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class PDOrders_page extends DriverFactory {
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String formattedDate = dateFormat.format(currentDate);
	String Pastdate = DateTime.now().plusDays(-1).toString("dd-MM-yyyy");
	String tomorrow = DateTime.now().plusDays(1).toString("dd-MM-yyyy");
	
	Utilities utilities = new Utilities();
	
	//Login Details and Select PD Orders
		By username 		= By.xpath("//input[@id='userName']");
		By password 		= By.xpath("//input[@id='userpassword']");
		By SignIn   		= By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn']");
		By Woven 			= By. xpath ("//div[@class='nav_title']//span[text()='Woven / knit']");
		By PD 				= By.xpath("//ul[@class='mm-collapse mm-show']/..//span[text()='PD ']");
		By PDOrders 		= By.xpath("(//a[text()='PD Orders '])[1]");
		
	//Create New PD order
		By AddButton 		= By.xpath("//button[@class='btn btn-primary btn-sm shadow-sm float-right ng-star-inserted']");
		By SrPDmerchant 	= By.xpath("//input[@placeholder='Search By Name/Email/Ph.no']");
		By SelectMerchant 	= By.xpath("//li[text()=' Phani L - [ phani@gmail.com ] - [ 9854785623 ] ']");
		By Buyer 			= By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-invalid']");
	
	//Calendar
		By MonthAndYear 	= By.xpath("//p-calendar[@placeholder='Select Month']");
		By Previousicon 	= By.xpath("//span[@class='p-datepicker-prev-icon pi pi-chevron-left ng-tns-c81-33']");
		By Nexticon 		= By.xpath("(//button[@type='button'])[3]");
		By SelectMonth 		= By.xpath("//span[text()=' Jan ']");
		
		
		By Expectedorderqty = By.xpath("//input[@placeholder='Enter Expected Order Qty']");
		By ApprPerPc 		= By.xpath("//input[@placeholder='Enter Appr. Per Pcs Cost']");
		By Exchangerate 	= By.xpath("//input[@placeholder='Enter Exchange Rate']");
		By costinINR		= By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]");
		By costincurrency	= By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[2]");
		By Activecheckbox 	= By.xpath("//input[@class='form-check-input ng-untouched ng-pristine ng-valid']");
		By Savebutton		= By.xpath("//button[@class='btn btn-md btn-primary px-5 ng-star-inserted']");
		By Cancelbutton		= By.xpath("(//button[@class='btn btn-md btn-danger btn-active-light-primary mr-2'])[1]");
		
	//Update PD Order by clicking on edit icon 
		By Editicon 		= By.xpath("(//a[@class='btn btn-sm btn-info mr-1 ng-star-inserted'])[1]");
		By NavUpdatePD 		= By.xpath("//h3[text()='Update PD Orders ']");
		By EditBuyer		= By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']");
		By Editpreviousicon = By.xpath("//button[@class='p-ripple p-element p-datepicker-prev p-link ng-tns-c81-46 ng-star-inserted']");
		By EditSelectmonth 	= By.xpath("//span[text()=' Feb ']");
		By EditExporderqty 	= By.xpath("//input[@formcontrolname='expectedOrderQty']");
		By EditPerPc		= By.xpath("//input[@formcontrolname='perPcValue']");
		By EditExchrate 	= By.xpath("//input[@formcontrolname='exchangeRate']");
		By Editcheckbox		= By.xpath("//input[@id='flexCheckDefault']");
		
	//Search with keyword in filter
		By SearchKeyword 	= By.xpath("//input[@placeholder='Search keyword']");
		By emptygridtext 	= By.xpath("//td[text()='No Data Found.']");
		
	//Sorting the grid headers
		By tablegrid 		= By.xpath("//thead[@class='p-datatable-thead']");
		By Nextpage			= By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/..//button[text()='2']");
		By DeleteIcon		= By.xpath("(//button[@title='Delete'])[1]");
		By Deletetext 		= By.xpath("//div[@class='swal2-popup swal2-modal swal2-show']/..//h2[text()='Are You Sure You Want To Delete?']");
		By Yesbutton 		= By.xpath("//button[text()='Yes']");
		By Nobutton			= By.xpath("//button[@class='swal2-cancel swal2-styled']");
		
		
		
		
		
		
	public void Login_with_Senior_PD_merchant_credentials_in_Login_page() throws Throwable {
		
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("phanindra");
		driver.findElement(password).sendKeys("Abcd@123");
		driver.findElement(SignIn).click();
		utilities.MediumWait(driver);
	}

	public void Click_on_woven() throws Throwable {
		
		utilities.webDriverWait(driver, Woven);
		driver.findElement(Woven).click();
		
	}

	public void Click_on_PD_Module_to_view_the_menu_in_PD_Module() throws Throwable {
		
		utilities.webDriverWait(driver, PD);
		driver.findElement(PD).click();
		
	}

	public void Select_the_PD_Orders_from_the_menu_of_PD_Module() throws Throwable {
		
		utilities.webDriverWait(driver, PDOrders);
		driver.findElement(PDOrders).click();
		
	}
//Adding New PD Order
	public void Click_on_Add_button() throws Throwable {
	
		utilities.webDriverWait(driver, AddButton);
		driver.findElement(AddButton).click();
		
	}

	public void Enter_Sr_PD_Merchant() throws Throwable {
	
		utilities.webDriverWait(driver, SrPDmerchant);
		driver.findElement(SrPDmerchant).sendKeys("Phani");
		utilities.MinimumWait(driver);
		driver.findElement(SelectMerchant).click();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		
	}

	public void Select_Buyer_from_the_dropdown_list() throws Throwable {
		
		utilities.webDriverWait(driver, Buyer);
		driver.findElement(Buyer).click();
		Robot B = new Robot();
		B.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		
		
	}

	public void Select_Month_and_Year_from_calendar() throws Throwable {
		
		utilities.webDriverWait(driver, MonthAndYear);
		driver.findElement(MonthAndYear).click();
		utilities.MediumWait(driver);
		driver.findElement(Nexticon).click();
		utilities.MinimumWait(driver);
		
		driver.findElement(SelectMonth).click();
		
	}

	public void Enter_Expected_Order_Qty() throws Throwable {
		
		utilities.webDriverWait(driver, Expectedorderqty);
		driver.findElement(Expectedorderqty).sendKeys("5000");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Appr_Per_Pcs_cost() throws Throwable {
		
		utilities.webDriverWait(driver, ApprPerPc);
		driver.findElement(ApprPerPc).sendKeys("20");
		utilities.MinimumWait(driver);
		
	}

	public void Enter_Exchange_Rate() throws Throwable {
		
		utilities.webDriverWait(driver, Exchangerate);
		driver.findElement(Exchangerate).sendKeys("82");
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_Total_Cost_in_INR() throws Throwable {
		
		utilities.webDriverWait(driver, costinINR);
		WebElement TotalcostinINR = driver.findElement(costinINR);
		String costinINR = TotalcostinINR.getAttribute("value");
		System.out.println("Displaying the value: " + costinINR);
		utilities.MinimumWait(driver);
		
	}

	public void verify_the_Total_cost_in_Currency() throws Throwable {
		
		utilities.webDriverWait(driver, costincurrency);
		WebElement TotalcostinCurrency = driver.findElement(costincurrency);
		String costinCurrency = TotalcostinCurrency.getAttribute("value");
		System.out.println("Displaying the value: " + costinCurrency);
		utilities.MinimumWait(driver);
		
	}

	public void click_on_save_button_to_save_the_expected_pd_order() throws Throwable {
		
		utilities.webDriverWait(driver, Savebutton);
		driver.findElement(Savebutton).click();
		utilities.MinimumWait(driver);
		
	}
	

	public void Click_on_Edit_icon() throws Throwable {
		
		utilities.webDriverWait(driver, Editicon);
		driver.findElement(Editicon).click();
		utilities.MinimumWait(driver);
		
	}
	
	public void Verify_whether_the_page_is_navigating_to_the_update_PD_orders_or_not() {
		WebElement UpdatePDorders = driver.findElement(NavUpdatePD);
		String PDorders = UpdatePDorders.getText();
		if(UpdatePDorders.isDisplayed()){
			System.out.println("The screen is navigated to " + PDorders + " screen");
		} else {
			System.out.println("The screen is not navigated to " + PDorders);
		}
		
	}

	public void Change_the_Buyer_by_clicking_on_buyer_dropdown_field() throws Throwable {
		
		utilities.webDriverWait(driver, EditBuyer);
		driver.findElement(EditBuyer).click();
		Robot CB = new Robot();
		CB.keyPress(KeyEvent.VK_3);
		utilities.MinimumWait(driver);
		
	}

	public void Change_Month_and_Year_from_calendar() throws Throwable {
		
		utilities.webDriverWait(driver, MonthAndYear);
		driver.findElement(MonthAndYear).click();
		utilities.MinimumWait(driver);
//		driver.findElement(Editpreviousicon).click();
//		utilities.MinimumWait(driver);
		driver.findElement(EditSelectmonth).click();
		utilities.MinimumWait(driver);
		
	}

	public void Change_expected_order_qty() throws Throwable {
		
		utilities.webDriverWait(driver, EditExporderqty);
		driver.findElement(EditExporderqty).clear();
		utilities.MinimumWait(driver);
		driver.findElement(EditExporderqty).sendKeys("600");
		utilities.MinimumWait(driver);
		
		
	}

	public void Change_Appr_Per_pcs_cost() throws Throwable {
		
		utilities.webDriverWait(driver, EditPerPc);
		driver.findElement(EditPerPc).clear();
		utilities.MinimumWait(driver);
		driver.findElement(EditPerPc).sendKeys("10");
		utilities.MinimumWait(driver);
		
	}

	public void Change_exchange_rate() throws Throwable {
		
		utilities.webDriverWait(driver, EditExchrate);
		driver.findElement(EditExchrate).clear();
		utilities.MinimumWait(driver);
		driver.findElement(EditExchrate).sendKeys("25");
		utilities.MinimumWait(driver);
		
	}

	public void Click_on_Checkbox_to_inactive_the_PD_order() throws Throwable {
	
		utilities.webDriverWait(driver, Editcheckbox);
		driver.findElement(Editcheckbox).click();
		utilities.MinimumWait(driver);
		
	}

	public void click_on_save_button() throws Throwable {
		
		utilities.webDriverWait(driver, Savebutton);
		driver.findElement(Savebutton).click();
		utilities.MinimumWait(driver);
		
		
	}

	public void Enter_Keywords_to_search_in_Search_filter() throws Throwable {
		
		utilities.webDriverWait(driver, SearchKeyword);
		driver.findElement(SearchKeyword).sendKeys("Anil");
		utilities.MinimumWait(driver);
		
//		driver.findElement(emptygridtext).isDisplayed();
		
		WebElement gridtext = driver.findElement(emptygridtext);
		String searchkeyword = gridtext.getAttribute("value");
		System.out.println("Displaying the value: " + searchkeyword);
		utilities.MinimumWait(driver);
		
		driver.findElement(SearchKeyword).clear();
		utilities.MinimumWait(driver);
		driver.navigate().refresh();
		
		utilities.MaximumLongWait(driver);
		
	}

	public void Click_on_Sort_icon_to_verify_that_sorting_is_working_as_per_the_requirement() throws Throwable {
		utilities.webDriverWait(driver, tablegrid);
		WebElement grid = driver.findElement(tablegrid);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement tableHeaderRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("thead")));
//		WebElement tableHeaderRow = grid.findElement(By.tagName("thead"));
        List<WebElement> tableHeaders = tableHeaderRow.findElements(By.tagName("th"));
        
    // Define expected header values
        String[] expectedHeaders = {"Sr Production Manager", " Buyer ", " Month&Year ", " Exp Order Qty ", " Appx Per Pc Cost ", " Exchange Rate ", " Total Cost In INR ", " Total Cost In Currency ", " Active "};
        
     // Verify table headers
        for (int i = 0; i < expectedHeaders.length;) {
          for (WebElement columnHeader : tableHeaders) {
        	String columnName = columnHeader.getText(); 
            Assert.assertEquals(tableHeaders.get(i).getText(), expectedHeaders[i]);
            System.out.println(columnName);
            
          // Click on the header twice
			columnHeader.click();
			utilities.MaximumWait(driver);
			columnHeader.click();
			utilities.MinimumWait(driver);
          }
        
          break;
        }
		
	}

	public void Click_on_next_page_in_the_table_grid() throws Throwable {
		
		utilities.webDriverWait(driver, Nextpage);
		driver.findElement(Nextpage).click();
		utilities.MinimumWait(driver);
		
	}

	public void Delete_the_PD_Order_in_table_grid() throws Throwable {
		
		driver.findElement(SearchKeyword).sendKeys("Alife and Kickin");
		utilities.MinimumWait(driver);
		utilities.webDriverWait(driver, DeleteIcon);
		driver.findElement(DeleteIcon).click();
		utilities.MediumWait(driver);
		driver.findElement(Nobutton).click();
		utilities.MinimumWait(driver);
		
	}
	
	
	

}
